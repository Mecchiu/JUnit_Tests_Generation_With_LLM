import json
import os
import re

import javalang
from javalang.parser import JavaSyntaxError
from javalang.tokenizer import LexerError

from utils import load_config, get_output_files, save_to_dummy_folder

MAX_INTEGER = 2147483647
MIN_INTEGER = -2147483648
DEBUG = True


def get_classname(code: str) -> str:
    """
    Gets the name of the CUT from the test prompt.
    @param code: the test prompt or the original code (it assumes it starts with `// classname.java`)
    @return: the classname of the CUT or the unit test to be generated
    """
    return code.split("\n")[0][3:-5].strip()


def get_full_code(code: str, response: dict) -> str:
    """
    Gets the full code from the response (including the test prompt).

    @param code: generated code.
    @param response: the original response from the model
    @return: full code
    """
    test_prompt = response["test_prompt"].strip()
    test_classname = get_classname(test_prompt)
    test_annotation_idx = code.find("@Test")
    # unit test is smaller than prompt, so no need to check prompt is there, it won't
    if len(code) > len(test_prompt):
        # code does not contain the test prompt and the test prompt class
        # should appear before the first @Test annotation
        test_prompt_idx = code.find(test_prompt)
        if test_prompt_idx > 0 and test_prompt_idx < test_annotation_idx:
            return code
        prompt_class_idx = code.find(f"class {test_classname}")
        # the test prompt class should appear before the first @Test annotation
        if prompt_class_idx > 0 and prompt_class_idx < test_annotation_idx:
            return code
    # if we reach here, the code needs to be pre-pended with the test prompt
    return (test_prompt + "\n\t\t" + code).strip()


def heuristic_1(code: str, cut_classname: str) -> tuple[str, bool]:
    """
    Removes the extra code from the generated tests.
    @param cut_classname: the simple name of the class under test
    @param code: generated code.
    @return: a tuple (str, bool).
        [0] = code without the extra code; [1] = true if this heuristic was applied
    """

    # notice that if the file had an error, it won't have the @Test annotation,
    # so we use the class name instead because it should be there from the prompt,
    # which has `class ClassName...Test{}`
    ignore_line_before = code.index("@Test") if "@Test" in code else code.index(f"class {cut_classname}")
    # removes the extra code
    eof_tokens = [f"\n\n// {cut_classname}", "\n```\n\n##", "</code>"]
    applied_heuristic = False
    for e in eof_tokens:
        index = code.index(e) if e in code else None
        if index and index > ignore_line_before:
            code = code[:index]
            applied_heuristic = True
    return code, applied_heuristic


def heuristic_2(code: str) -> tuple[str, bool]:
    """
    Captures the code between the triple backticks.
    @param code: generated code.
    @return: code between the triple backticks
    """
    applied_heuristic = False
    pattern = r"[\S\s.]*?\`\`\`([\S\s.]*?)\`\`\`[\S\s.]*?"
    good_code = re.findall(pattern, code, re.DOTALL)
    if len(good_code) > 0:
        code = good_code[0]
        applied_heuristic = True
    return code, applied_heuristic


def heuristic_3(code: str, cut_classname: str) -> tuple[str, bool]:
    """
    Remove the code that is not part of the test.
    @param cut_classname: simple name of the class under test.
    @param code: generated code.
    @return: code that is part of the test
    """
    applied_heuristic = False
    # a more strict pattern that only matches the test class name
    pattern = r"(\/\/ " + cut_classname + ".java[\S\s.]*?)(\/\/ " + cut_classname + "[0-9a-zA-Z_]*Test.java)"
    bad_code = re.findall(pattern, code, re.DOTALL)
    if len(bad_code) > 0:
        bad_code = bad_code[0][0]
        if len(bad_code.strip()) != 0:
            code = code.replace(bad_code, "\n").strip()
            applied_heuristic = True
    return code, applied_heuristic


def heuristic_4_and_5(code: str, package: str, test_classname: str) -> tuple[str, bool, bool]:
    """
    Fixes package declaration (i.e., add/replace/remove if needed).
    @param test_classname: the simple name of the generated test class
    @param code: generated code.
    @param package: the package where the CUT is
    @return: the code with the package (if needed), and two booleans (H4, H5) to indicate what heuristic was applied.
    (code, H4, H5)
    """
    applied_heuristic_h4, applied_heuristic_h5 = False, False
    package_regex = r"package\s+([a-z][a-z0-9_\.]*)\s*;"

    # search only in the beginning of the file (before the test class)
    m = re.search(package_regex, code[:code.index(f"class {test_classname}")], re.IGNORECASE)
    missing = True
    if m:
        missing = False
        actual_package = m.group(1)
        if package and actual_package != package:
            applied_heuristic_h4 = True
            code = code[:m.start()] + f"package {package};\n" + code[m.end():]
    # test should be in a package, but package declaration is missing
    # thus, apply H5 here
    if package and missing:
        code = f"package {package};\n" + code
        applied_heuristic_h5 = True
    if not package and not missing:
        # remove the package declaration
        code = code[:m.start()] + code[m.end():]
        applied_heuristic_h5 = True
    return code, applied_heuristic_h4, applied_heuristic_h5


def heuristic_6(code: str) -> tuple[str, bool]:
    """
        Fixes 'integer number too large' type of compilation errors
        @param code: generated code.
        @return: the code that replaces the large integer by Integer.parseInt(n) (if needed),
        and one boolean to indicate whether the heuristic was applied: (code, applied_heuristic).
    """
    # uses javalang to find all number constants in the code
    try:
        tokens = javalang.tokenizer.tokenize(code)
        previous_line, previous_end, new_code, last_val = 1, 0, "", None
        applied_heuristic = False
        for token in tokens:
            line, column = token.position
            if line != previous_line:
                new_code += "\n"
                new_code += " " * (column - 1)
            else:
                new_code += " " * (column - previous_end)

            if isinstance(token, javalang.tokenizer.DecimalInteger):
                num_value = int(token.value[:-1]) if "L" in token.value.upper() else int(token.value)
                if num_value > MAX_INTEGER or (last_val == '-' and -1 * num_value < MIN_INTEGER):
                    if "L" in token.value.upper():
                        replacement = 'Long.parseLong("%s")' % token.value[:-1]
                    else:
                        replacement = 'Integer.parseInt("%s")' % token.value
                    new_code += replacement
                    applied_heuristic = True
                else:
                    new_code += token.value
            else:
                new_code += token.value
            previous_line = line
            previous_end = column + len(token.value)
            last_val = token.value

        return new_code if applied_heuristic else code, applied_heuristic
    except:
        return code, False


def heuristic_7(code: str) -> tuple[str, bool]:
    """
        Fixes 'incomplete statements' type of compilation errors.
        Try to fix incomplete code by iteratively deleting lines and adding curly brackets.
        @param code: generated code.
        @return: the code that replaces the large integer by Integer.parseInt(n) (if needed),
        and one boolean to indicate whether the heuristic was applied: (code, applied_heuristic).
    """
    # if the code is valid, return it
    cu = parse_code(code)
    if cu: return code, False
    # otherwise, try to fix it
    new_code = code
    num_lines = new_code.count("\n")
    # test prompt is length of 10, so we try to fix the code by removing lines until we reach 10
    while num_lines > 10:
        # append two curly brackets
        cu = parse_code(new_code + "\n}\n}")
        if cu: return new_code + "\n}\n}", True

        # append one curly bracket
        cu = parse_code(new_code + "\n}")
        if cu: return new_code + "\n}", True

        # remove the last line
        new_code = new_code[:new_code.rfind("\n")]
        num_lines -= 1

        # append two curly brackets
        cu = parse_code(new_code + "\n}\n}")
        if cu: return new_code + "\n}\n}", True
        # append one curly bracket
        cu = parse_code(new_code + "\n}")
        if cu: return new_code + "\n}", True

    # if we reach here, the code is still unfixable
    return code, False


def fix_code(code: str, response: dict) -> str:
    """
    Removes the extra code from the generated tests.
    @param code: generated code.
    @param response: the original response from the model
    @return: code without the extra code
    """

    cu_original = parse_code(response["original_code"])
    package_name = cu_original.package.name if cu_original.package else None
    test_classname = get_classname(response["test_prompt"])
    cut_classname = cu_original.types[0].name
    # track what heuristic(s) were applied, if any
    applied_heuristics = [False for _ in range(0, 7)]
    
    # pre-pend the code with the test prompt
    full_code = get_full_code(code, response)
    # H1: removes the extra code (after the unit test)
    full_code, applied_heuristics[0] = heuristic_1(full_code, cut_classname)
    # H3: remove the original code from the CUT
    full_code, applied_heuristics[2] = heuristic_3(full_code, cut_classname)
    # H4: replaces the package name with the scenario name
    # H5: adds the package name if it is missing (or remove it, if it is not needed)
    full_code, applied_heuristics[3], applied_heuristics[4] = heuristic_4_and_5(full_code, package_name, test_classname)
    # H6: fixes 'integer number too large' type of compilation errors
    full_code, applied_heuristics[5] = heuristic_6(full_code)

    # H7: fixes incomplete code by iteratively deleting statements and adding curly brackets
    if response["choices"][0]["finish_reason"] == "length" or full_code.count("{") != full_code.count("}"):
        full_code, applied_heuristics[6] = heuristic_7(full_code)

    applied_heuristics = [f"H{i + 1}" for i in range(0, 7) if applied_heuristics[i]]

    return (full_code, applied_heuristics)


def get_generated_test(response: dict):
    """
    Gets the generated test from the response.
    @param response: response from the model
    @return: generated test
    """
    return response["choices"][0]["text"]



def run_analysis(config: dict, dataset: str, prompt_file: str, max_tokens: int) -> None:
    """
    Fixes the extra code in the generated tests.
    @param max_tokens: token size
    @param prompt_file:  filename for the scenario (ex: "Scenario1_prompt.json")
    @param rq: research question (ex: "RQ1")
    @param dataset: the name of the dataset (ex: "HumanEvalJava")
    @param config: dictionary of the parsed configuration
    """
    # sets the data output paths
    output_folder, scenario_folder, json_files = get_output_files(
        config, dataset, prompt_file, max_tokens
    )

    for json_file in json_files:
        # load previously computed response
        with open(json_file, "r") as f:
            previous_responses = json.load(f)

        # creates a new array with responses that are fixed
        filtered_responses = []
        for r in previous_responses:
            old_code = get_generated_test(r)
            if old_code:
                new_code, applied_heuristics = fix_code(old_code, r)
            else:
                new_code, applied_heuristics = (f"{r['test_prompt']}\n\t/* {r['choices'][0]['finish_reason']} */\n}}", [])
            r["original_generated_code"] = old_code if old_code else ""
            r["applied_heuristics"] = ";".join(applied_heuristics)

            r["choices"][0]["text"] = new_code

            # save to dummy folder
            if DEBUG: save_to_dummy_folder(new_code, r)

            r["choices"][0]["text"] = new_code
            print("\tMODEL", "OpenAI", "PROMPT", r["prompt_id"],
                "CLASS:", r["original_code"].split("\n")[0][3:-4],
                "APPLIED HEURISTICS", r["applied_heuristics"])

            filtered_responses.append(r)

        fixed_json_file = json_file.replace(".json", "_fixed_extracode.json")
        with open(fixed_json_file, "w") as f:
            f.write(json.dumps(filtered_responses, indent=4))
        print("SAVED AT ", fixed_json_file)


def run_humaneval(config: dict, dataset: str, max_tokens: int, model: str, rq_folder, scenario):
    prompt_file = (
        f"{rq_folder}/CalcolatricePrompt/input/{scenario}_prompt.json"
    )
    print(f"Scenario: {scenario}. Token: {max_tokens}")
    run_analysis(
        config, dataset, prompt_file, max_tokens
    )


def parse_code(code) -> bool:
    try:
        return javalang.parse.parse(code)  # code is compilable
    except (JavaSyntaxError, LexerError, TypeError, RecursionError) as e:
        return None


def main():
    config = load_config("config.json")
    all_scenarios = ["original", "scenario1", "scenario2", "secnario3"]
    all_tokens = [2000]

    worklist = [
        # Codex
        # ("HumanEvalJava", "OpenAI", all_scenarios, all_tokens),
        # ("SF110", "OpenAI", all_scenarios, all_tokens),
        # ChatGPT 3.5
        # ("HumanEvalJava", "GPT3.5", all_scenarios, all_tokens[:-1]),
        ("HumanEvalJava", "OpenAI", all_scenarios, all_tokens),
    ]

    for dataset, model, scenarios, tokens in worklist:
        for max_tokens in tokens:
            for scenario in scenarios:
                rq_folder = "LLM_Test"
                if dataset == "HumanEvalJava":
                    run_humaneval(config, dataset, max_tokens, model, rq_folder, scenario)
                else:
                    raise Exception("Unknown")


if __name__ == "__main__":
    main()
