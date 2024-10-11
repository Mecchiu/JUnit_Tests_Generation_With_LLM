import json
import os
import uuid
import glob

import openai


def load_config(config_file: str) -> dict:
    """
    Loads the JSON configuration and sets the OpenAI API key.
    @param config_file:  Path to the JSON configuration file.
    @returns config: dictionary of the parsed configuration
    """
    with open(config_file) as json_file:
        config = json.load(json_file)
    # sets the OpenAI key
    openai.api_key = config["OPEN_AI_KEY"]
    return config


def get_prompts(config: dict, prompt_file: str) -> list:
    """
    Returns a list of prompts used for test generation.
    @param config: analysis configuration
    @param prompt_file:  path to the JSON file containing prompts (ex: "RQ1_Test_Generation/OpenAI_Data/HumanEvalJava_input/original_prompt.json")
    @return: a list of parsed prompts
    """
    scenario_path = os.path.join(config["BASE_DIRECTORY"], prompt_file)
    with open(scenario_path, 'r', encoding='utf-8') as scenario_file:
        prompts = json.load(scenario_file)
    return prompts


def get_output_files(config: dict, dataset: str, prompt_file: str, max_tokens: int) -> tuple:
    """
    Compute the paths to the output folder and response file.

    @param dataset: the dataset associated with the prompt file
    @param max_tokens: maximum number of tokens
    @param config: analysis configuration
    @param prompt_file:  path to the JSON file containing prompts (ex: "RQ1_Test_Generation/OpenAI_Data/HumanEvalJava_input/original_prompt.json")
    @param model: the model used for generation (ex: OpenAI, CodeGen)
    @return: a tuple:
    - output_folder: <BASE_DIR>/<RQ_FOLDER>/OpenAI_Data/<DATASET>_output/"
    - scenario_folder: output_folder/<SCENARIO>
    - json_file = list of JSON files in output_folder
    - csv_file = output_folder/<SCENARIO>_output_<max_tokens>.csv
    """
    # prompt files are typically named <label>_prompt.json, extract the label part
    scenario_name = os.path.basename(prompt_file).split("_prompt")[0]
    rq_folder = "CalcolatricePrompt"
    output_folder = os.path.join(config["BASE_DIRECTORY"], rq_folder, f"output\\", scenario_name, f"Calcolatrice_2000_tokens\\")
    scenario_folder = os.path.join(output_folder, scenario_name)
    json_files = glob.glob(os.path.join(output_folder, "Calcolatrice*.json"))
    #for json_file in json_files:
    #    csv_file = json_file.replace(".json", ".csv")
    return output_folder, scenario_folder, json_files


def save_generated_code(prompt: dict, response: dict, max_tokens: int, output_folder: str, isGPT3=False) -> None:
    """
    Saves the generated Unit Test on a separate file in the output folder.
    @param max_tokens:
    @param prompt: prompt used for test generation.
    @param response: the response returned by OpenAI
    @param output_folder: where to save the Unit Test.
    The file will be named as {response['prompt_id']}Test.xyz (xyz extension is based on the original language of the sample).
    This assumes that the prompt_id is the path to the class under test.
    """
    try:
        # Get the original sample filename and extension
        original_filename, extension = os.path.splitext(response['prompt_id'])
        original_filename = os.path.basename(original_filename)
        filename = f"{original_filename}T{max_tokens}Test{extension}"

        # Create the output folder if needed
        if not os.path.exists(output_folder):
            os.makedirs(output_folder)

        with open(os.path.join(output_folder, filename), "w") as gen_file:
            # For GPT-3 or any other, use the new response format
            gen_file.write(prompt["test_prompt"] + "\n" + response['choices'][0]["message"]["content"])
            
    except Exception as e:
        print(f"Failed to save generated code: {e}")



def save_response(json_file, csv_file, prompt: dict, prompts: list, response: dict) -> None:
    """
    Saves a response into an open JSON file and a CSV file.
    @param csv_file: an open writable file where to save the results in CSV format
    @param json_file: an open writable file where to save the results in JSON format
    @param prompt: the prompt object to be saved
    @param prompts: the list of all prompts (used to check when to stop adding commas)
    @param response: the JSON response object from OpenAI GPT-4/3.5 API to be serialized into the file
    """
    try:
        # Save response to JSON file
        json.dump(response, json_file, indent=4)
        json_file.write("\n")

        if prompt != prompts[-1]:
            json_file.write(",")

        # Save response to CSV file
        csv_file.writerow(
            [response['id'], response['prompt_id'], response['time_taken'],
             response["choices"][0]["finish_reason"],
             response["original_code"],
             response['test_prompt'],
             response['choices'][0]["message"]["content"]  # Accessing the chat response content for GPT-4
             ])
    except Exception as e:
        print(f"Failed to save response: {e}")


def get_mock_response(prompt: dict, error_msg: str) -> dict:
    """
    Creates a mock response object to be used to record runtime errors
    @param prompt: the prompt object
    @param error_msg: error message to be captured in this mock response
    @return: a mock response object with the same structure as the actual response
    """
    return dict(
        choices=[{
            "finish_reason": "ERROR - " + error_msg,
            "text": ""
        }],
        id=str(uuid.uuid4()),  # generates a dummy ID
        prompt_id=prompt["id"],
        original_code=prompt["original_code"],
        test_prompt=prompt["test_prompt"],
        time_taken=-1,  # dummy
    )


def save_to_dummy_folder(new_code: str, r: dict, suffix: int = 0) -> None:
    """
    Saves the generated code to the dummy_output folder
    @param suffix: a suffix to distinguish between multiple generated code to this function
    @param new_code: code to be saved
    @param r: the response dictionary
    """
    filename = r["prompt_id"][1:].replace("/", "_")
    if suffix > 0: filename = filename.replace(".java",f"_{suffix}.java")
    with open(f"./dummy_output/{filename}" , "w", encoding='utf-8') as f:
        f.write(new_code)
