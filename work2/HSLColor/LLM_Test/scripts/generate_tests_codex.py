import argparse
import csv
import time
import openai

from utils import load_config, get_prompts, get_output_files, save_generated_code, save_response, get_mock_response, os

# Code Generation Configuration Parameters
OPENAI_MODEL = "gpt-4o"
OPENAI_TEMPERATURE = 0
OPENAI_TOP_P = 1
OPENAI_FREQUENCY_PENALTY = 0
OPENAI_PRESENCE_PENALTY = 0


def generate_code(prompt, max_tokens, is_fix=False):
    """
    Returns a response object from OpenAI enriched with the prompt metadata.
    @param max_tokens: what is the token size limit used
    @param is_fix: True if we are generating code for a previous prompt that had an error
    @param prompt: the prompt object
    """
    start_time = time.time()
    response = openai.ChatCompletion.create(
        model=OPENAI_MODEL,
        messages=[
            {"role": "system", "content": "You are an AI code generator."},
            {"role": "user", "content": prompt["original_code"] + "\n" + prompt["test_prompt"].strip()}
        ],
        temperature=OPENAI_TEMPERATURE,
        max_tokens=max_tokens,
        top_p=OPENAI_TOP_P,
        frequency_penalty=OPENAI_FREQUENCY_PENALTY,
        presence_penalty=OPENAI_PRESENCE_PENALTY,
    )
    time_taken = time.time() - start_time
    response["time_taken"] = time_taken
    if is_fix:
        response["prompt_id"] = prompt["prompt_id"]
    else:
        response["prompt_id"] = prompt["id"]
    response["original_code"] = prompt["original_code"]
    response["test_prompt"] = prompt["test_prompt"]

    if time_taken <= 60:
        time.sleep(60 - time_taken + 5)  # wait 5 seconds more to avoid rate limit
    return response


def generate_tests(config: dict, prompts: list, max_tokens: int, output_path: str) -> None:
    """
    Genera i test per il dataset HSLColor.
    @param config: dictionary of the parsed configuration
    @param prompts: una lista di prompt analizzati
    @param max_tokens: numero massimo di token per la generazione
    @param output_path: percorso della directory di output
    """
    # Imposta i percorsi di output dei dati
    scenario_folder = os.path.join(output_path, f"HSLColor{max_tokens}_tokens")
    os.makedirs(scenario_folder, exist_ok=True)
    response_file = os.path.join(scenario_folder, "responses.json")
    csv_file = os.path.join(scenario_folder, "responses.csv")

    # Apre il file di output in modalità scrittura (sovrascrive i risultati precedenti)
    with open(response_file, "w") as json_file, open(csv_file, "w") as csv_out:
        csv_file = csv.writer(csv_out, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
        csv_file.writerow(
            ["ID", "PROMPT_ID", "DURATION", "FINISH_REASON", "ORIGINAL_CODE", "TEST_PROMPT", "GENERATED_TEST"])
        json_file.write("[\n")
        for prompt in prompts:
            print("PROMPT", prompt["id"])
            try:
                # Interroga OpenAI per generare il test unitario
                response = generate_code(prompt, max_tokens)
                # Salva il test generato in un file
                print("SAVING", prompt["id"], "at", scenario_folder)
                save_generated_code(prompt, response, max_tokens, scenario_folder)
                # Salva i metadati della risposta in CSV e JSON
                save_response(json_file, csv_file, prompt, prompts, response)
                print("Duration: ", response['time_taken'],
                      "Finish Reason:", response["choices"][0]["finish_reason"],
                      "\n" + "-" * 30)

            except Exception as e:
                print("ERROR", e)
                mock_response = get_mock_response(prompt, str(e))
                time.sleep(60)  # Un po' di attesa per assicurarsi di non superare il limite di frequenza
                save_response(json_file, csv_file, prompt, prompts, mock_response)

        json_file.write("]")

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("-t", "--tokens", type=int, choices=[x * 1000 for x in range(1, 5)],
                        help="limite di token (es: 1000)", required=True)
    parser.add_argument("-p", "--prompts", type=str,
                        help="percorso del file JSON con i prompt", required=True)
    parser.add_argument("-d", "--directory", type=str,
                        help="directory di output")

    args = parser.parse_args()

    config = load_config("config.json")
    print(args)
    # Ottiene la lista dei prompt analizzati dal file JSON
    prompts = get_prompts(config, args.prompts)

    print("Generazione di test unitari per", len(prompts), "prompt nel dataset HSLColor")
    # Genera i test unitari
    generate_tests(config, prompts, args.tokens, args.directory)

if __name__ == "__main__":
    main()

# QUICK SCRIPT TO GENERATE SAMPLE USAGES
# for token in [x * 1000 for x in range(1, 5)]:
#     for prompt_file in ["original_prompt.json", "scenario1_prompt.json", "scenario2_prompt.json", "scenario3_prompt.json"]:
#         print(f"python3 generate_tests_HSLColor.py -t 2000 -p /percorso/ai/prompt/HSLColor.json")