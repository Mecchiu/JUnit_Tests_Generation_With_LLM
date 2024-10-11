# Scripts

- `generate_tests_*.py`:
Generates test cases using an LLM (Codex, ChatGPT3.5, or CodeGen). It produces a JSON containing the results metadata as well as all the generated test files in separate `.java` files. 
The token size and scenario under analysis are specified as program arguments.
- `fix_tests_openai.py`: It inspects the JSON outputs and apply heuristics to remove extra code and/or common patterns of syntax errors. It works for OpenAI models (ie Codex, ChatGPT3.5)
- `fix_tests_codegen.py`: It process the JSON outputs to create one prompt-output per generated suggestion. This is because CodeGen has a different configuration (we ask for 1 unit test and 10 suggestions for it).
- `*_job.sh`: shell scripts to run the job on a computing server.

# Configuration
- `example_config.json`: File used for configuring the script `test_file_generation.py`: 
	- `API_KEY`: You OpenAI API developer key.
	- `BASE_DIRECTORY`: Full/relative path to the **OpenAI_Data** folder that contains the HumanEval dataset decomposed into 3 scenarios. For example: `/Users/abcd/Documents/study_repo/RQ1_Prompt_Elements/OpenAI_Data/`.


