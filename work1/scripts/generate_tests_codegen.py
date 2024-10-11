import argparse
import csv
import time
import json
from transformers import AutoTokenizer, AutoModelForCausalLM
import torch
torch.cuda.empty_cache()

from utils import (
    load_config,
    get_prompts,
    get_output_files,
    save_generated_code,
    save_response,
    get_mock_response,
)

# Code Generation Configuration Parameters
CODEGEN_MODEL = "Salesforce/codegen-350M-multi"
CODEGEN_TEMPERATURE = 1e-5
CODEGEN_TOP_P = 1
CODEGEN_DO_SAMPLE = True
CODEGEN_EARLY_STOPPING = True
CODEGEN_TOTAL_OUTPUT = 10
CODEGEN_MAX_TOKENS = 2048


STOP_TOKENS = "<|endoftext|>"


def setup_model(device: str):
    tokenizer = AutoTokenizer.from_pretrained(CODEGEN_MODEL)
    model = AutoModelForCausalLM.from_pretrained(CODEGEN_MODEL)
    tokenizer.pad_token = tokenizer.eos_token
    model.config.pad_token_id = model.config.eos_token_id
    model.config.attention_mask = True  # Aggiunta questa riga
    model = model.to(device)
    return tokenizer, model


def generate_code(prompt, max_tokens, tokenizer, model, device, is_fix=False):
    start_time = time.time()
    response = get_mock_response(prompt, "No Error")
    prompt_code = prompt["original_code"] + "\n" + prompt["test_prompt"].strip() + "\n\t\t"
    inputs = tokenizer(prompt_code, return_tensors="pt").to(device)
    x = inputs['input_ids']
    x = x.expand(CODEGEN_TOTAL_OUTPUT, -1)
    prompt_token_size = x.shape[1]
    generated_token = model.generate(
        x,
        max_new_tokens=CODEGEN_MAX_TOKENS - prompt_token_size,
        do_sample=CODEGEN_DO_SAMPLE,
    )
    response["choices"] =[]
    for i in range(CODEGEN_TOTAL_OUTPUT):
        response["choices"].append({})
        output = generated_token[i].cpu().squeeze()
        response["choices"][i]["text"] = tokenizer.decode(output[prompt_token_size:], skip_special_tokens=True)
        if STOP_TOKENS in response["choices"][i]["text"]:
            response["choices"][i]["text"] = response["choices"][i]["text"].split(STOP_TOKENS)[0]
            response["choices"][i]["finish_reason"] = "stop"
        else:
            response["choices"][i]["finish_reason"] = "length"
    response["usage"] = {"prompt_tokens": prompt_token_size}

    time_taken = time.time() - start_time
    response["time_taken"] = time_taken
    if is_fix:
        response["prompt_id"] = prompt["prompt_id"]
    else:
        response["prompt_id"] = prompt["id"]
    return response

def save_response(json_file, csv_file, prompt, prompts, response):
    json_file.write(json.dumps(response, indent=2))
    if prompt != prompts[-1]:
        json_file.write(",\n")
    else:
        json_file.write("\n")
    
    csv_file.writerow(
        [
            response["prompt_id"],
            prompt["id"],
            response["time_taken"],
            response["choices"][0]["finish_reason"],
            prompt["original_code"],
            prompt["test_prompt"],
            response["choices"][0]["text"],
        ]
    )


def generate_tests(
    config: dict,
    rq: int,
    dataset: str,
    prompt_file: str,
    prompts: list,
    max_tokens: int,
    tokenizer, model, device
) -> None:
    """
    Generates tests for the given scenario.
    @param config: dictionary of the parsed configuration
    @param rq: research question
    @param dataset: the dataset associated with the prompt file
    @param prompts: a list of parsed prompts
    @param prompt_file: filename for the scenario (ex: "Scenario1_prompt.json")
    @param max_tokens: maximum number of tokens for generation
    """

    # sets the data output paths
    output_folder, scenario_folder, response_file, csv_file = get_output_files(
        config, rq, dataset, prompt_file, max_tokens, "CodeGen"
    )
    # opens output file in write mode (overwrite prior results)
    with open(response_file, "w") as json_file, open(csv_file, "w") as csv_out:
        csv_file = csv.writer(
            csv_out, delimiter=",", quotechar='"', quoting=csv.QUOTE_MINIMAL
        )
        csv_file.writerow(
            [
                "ID",
                "PROMPT_ID",
                "DURATION",
                "FINISH_REASON",
                "ORIGINAL_CODE",
                "TEST_PROMPT",
                "GENERATED_TEST",
            ]
        )
        json_file.write("[\n")
        for prompt in prompts:
            print("PROMPT", prompt["id"])
            try:
                
                response = generate_code(prompt, max_tokens, tokenizer, model, device)
                # save the generated test in a file
                print("SAVING", prompt["id"], "at", scenario_folder)
                save_generated_code(prompt, response, max_tokens, scenario_folder)
                # save the response's metadata in CSV and JSON
                save_response(json_file, csv_file, prompt, prompts, response)
                print(
                    "Duration: ",
                    response["time_taken"],
                    "Finish Reason:",
                    response["choices"][0]["finish_reason"],
                    "\n" + "-" * 30,
                )

            except Exception as e:
                print("ERROR", e)
                mock_response = get_mock_response(prompt, str(e))
                save_response(json_file, csv_file, prompt, prompts, mock_response)

        json_file.write("]")


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument(
        "-t",
        "--tokens",
        type=int,
        choices=[x * 1000 for x in range(1, 5)],
        help="token limit (ex: 1000)",
        required=True,
    )
    parser.add_argument(
        "-p",
        "--prompts",
        type=str,
        help="path to the JSON file with prompts",
        required=True,
    )
    parser.add_argument(
        "-dataset",
        "--dataset",
        type=str,
        choices=("SF110", "GitHub", "HumanEvalJava", "HumanEvalPython"),
        help="The dataset being used",
        required=True,
    )
    parser.add_argument(
        "-q",
        "--question",
        type=str,
        choices=("RQ1", "RQ2"),
        help="The research question (this will dictate where the file will be saved)",
        required=True,
    )

    args = parser.parse_args()

    config = load_config("config.json")
    print(args)
    # get list of parsed prompts from the JSON file
    prompts = get_prompts(config, args.prompts)

    print("Generating unit tests for", len(prompts), "prompts in", args.dataset)
    # generate unit tests
    question = int(args.question.replace("RQ", ""))
    device = "cuda" if torch.cuda.is_available() else "cpu"
    print(device)
    tokenizer, model =  setup_model(device)

    generate_tests(config, question, args.dataset, args.prompts, prompts, args.tokens, tokenizer, model, device)


if __name__ == "__main__":
    main()
