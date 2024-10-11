import copy
import json
import os
import re

from fix_tests_openai import fix_code
from utils import load_config, get_output_files, save_to_dummy_folder

DEBUG = True


def get_generated_test(response: dict):
    generated_test = []
    for c in response["choices"]:
        gen_code = c["text"]
        #  the code generated the method followed by a "}" to close the class of the prompt
        if (gen_code.count("{") + 1) == gen_code.count("}") and c["finish_reason"] == 'stop':
            # remove the last curly bracket (replace by a blank space)
            index = gen_code.rfind("}")
            gen_code = gen_code[:index] + " " + gen_code[index + 1:]
            generated_test.append(gen_code)

    # if the # of {} is off-by-one, just add one "}" to close the test_prompt class
    test_code = "\n".join(generated_test)
    if (test_code.count("{") + 1) == test_code.count("}"):
        return test_code + "\n}"

    return test_code


def merge_suggestions(config: dict, rq: int, dataset: str, prompt_file: str, max_tokens: int, model: str,
                      scenario: str) -> None:
    """
    Fixes the extra code in the generated tests.
    @param model: model name (ex: OpenAI, CodeGen)
    @param max_tokens: token size
    @param prompt_file:  filename for the scenario (ex: "Scenario1_prompt.json")
    @param rq: research question (ex: "RQ1")
    @param dataset: the name of the dataset (ex: "HumanEvalJava")
    @param config: dictionary of the parsed configuration
    """
    # sets the data output paths
    output_folder, scenario_folder, json_file, csv_file = \
        get_output_files(config, rq, dataset, prompt_file, max_tokens, model)

    # load previously computed response
    with open(json_file, "r") as f:
        previous_responses = json.load(f)

    # creates a new array with responses that are fixed
    filtered_responses = []

    for r in previous_responses:
        i = 1

        for c in r["choices"]:
            new_resp = copy.deepcopy(r)
            gen_code = c["text"]
            # copy the original generated code to position zero such that the heuristics work normally
            new_resp["original_generated_code"] = gen_code
            new_resp["choices"][0]["text"] = gen_code
            new_resp["choices"][0]["finish_reason"] = c["finish_reason"]
            new_resp["choice_no"] = i
            # only keep the first recommendation, that has the merged output with test prompt
            del new_resp["choices"][1:]
            # apply heuristics and assign the new code to the first choice
            new_resp["choices"][0]["text"], applied_heuristics = fix_code(model, gen_code, new_resp)
            r["applied_heuristics"] = ";".join(applied_heuristics)

            filtered_responses.append(new_resp)
            i += 1
            print("\tMODEL", model, "PROMPT", r["prompt_id"],
                  "CLASS:", r["original_code"].split("\n")[0][3:-4],
                  "APPLIED HEURISTICS", r["applied_heuristics"])
            # save to dummy folder
            if DEBUG: save_to_dummy_folder(new_resp["choices"][0]["text"], r, i)

    fixed_json_file = json_file.replace(".json", "_fixed_extracode.json")
    with open(fixed_json_file, "w") as f:
        f.write(json.dumps(filtered_responses, indent=4))
    print("SAVED AT ", fixed_json_file)


def remove_original_code(gen_code: str, r: dict) -> str:
    # strip off the original code if needed (this is a more strict way of creating a customized regex)
    classname = r["original_code"].split("\n")[0][2:-5].strip()
    pattern = r"(\/\/ " + classname + ".java)([\S\s.]*?)(\/\/ " + classname + "[0-9a-zA-Z_]*Test.java)"
    bad_code = re.findall(pattern, gen_code, re.DOTALL)
    if len(bad_code) > 0:
        header_comment, original_code, test_comment = bad_code[0]
        if len(header_comment.strip()) != 0 and len(original_code.strip()) != 0:
            gen_code = gen_code.replace(header_comment, "\n").replace(original_code, "\n").strip()
            r["applied_heuristics"] = "H3"

    return gen_code


def main():
    config = load_config("config.json")
    all_scenarios = ["original", "scenario1", "scenario2", "scenario3", "scenario4"]
    all_tokens = [2000]
    worklist = [
        #("HumanEvalJava", "CodeGen", all_scenarios[:-1], all_tokens),
         ("SF110", "CodeGen", all_scenarios, all_tokens),
    ]

    for dataset, model, scenarios, tokens in worklist:
        # this code only works for CodeGen
        assert model == "CodeGen" and dataset in ["SF110", "HumanEvalJava"] and tokens == [2000]

        for max_tokens in tokens:
            for scenario in scenarios:
                rq = 1 if scenario == "original" else 2
                rq_folder = "RQ1_Test_Generation" if rq == 1 else "RQ2_Prompt_Elements"
                prompt_folder = f"../{rq_folder}/{model}_Data/{dataset}_input/"
                if dataset == "HumanEvalJava":
                    print(f"RQ{rq}. Scenario: {scenario}. Token: {max_tokens}")
                    prompt_file = prompt_folder + f"{scenario}_prompt.json"
                    merge_suggestions(config, rq, dataset, prompt_file, max_tokens, model, scenario)
                elif dataset == "SF110":
                    # finds all json files in prompt_folder
                    prompt_files = [f for f in os.listdir(prompt_folder) if
                                    f.endswith(".json") and ((rq == 1) or (rq == 2 and scenario in f))]
                    for prompt_file in prompt_files:
                        print(f"RQ{rq}\tScenario: {scenario}\tToken: {max_tokens}\tPrompt: {prompt_file}")
                        merge_suggestions(config, rq, dataset, prompt_file, max_tokens, model, scenario)
                else:
                    raise Exception("Unknown dataset")


if __name__ == "__main__":
    main()
