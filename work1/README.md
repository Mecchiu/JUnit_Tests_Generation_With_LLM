This project contains the source code for the paper 'Using Large Language Models to Generate JUnit Tests: An Empirical Study'.

## Abstract
A code generation model generates code by taking a prompt from
a code comment, existing code, or a combination of both. Although
code generation models (e.g., GitHub Copilot) are increasingly be-
ing adopted in practice, it is unclear whether they can successfully
be used for unit test generation without fine-tuning. We investigated how well three generative models (Codex, GPT-3.5-Turbo,
and StarCoder) can generate test cases to fill this gap. We used two
benchmarks (HumanEval and Evosuite SF110) to investigate the
effect of context generation on the unit test generation process. We
evaluated the models based on compilation rates, test correctness,
coverage, and test smells. We found that the Codex model achieved
above 80% coverage for the HumanEval dataset, but no model had
more than 2% coverage for the EvoSuite SF110 benchmark. The
generated tests also suffered from test smells, such as Duplicated
Asserts and Empty Tests.

## Project Structure

- `JavaContextRetriever`: utility Java to generate prompts/contexts/JUnit test templates according to the scenarios described in the paper.
- `EvoSuiteBenchmark`: **SF110** from the Evosuite Benchmark.
- `HumanEvalJava`: sample classes from the multi-lingual version of the HumanEval dataset.
- `scripts`: Contains the scripts to generate JUnit tests for different models. 
- `UtilScripts`: Contains the scripts to analyze the generated tests.
- `RQ1_Prompt_Elements`: data and code for RQ1.
- `RQ2_Open_Source_Projects`: data and code for RQ2.
- `TestSmellDetector`: TsDetect source code (with custom modifications to tailor to our project).

## Results
- `RESULTS-HumanEvalJava.xlsx`: Results for the HumanEval dataset.
- `RESULTS-SF110.xlsx`: Results for the EvoSuite SF110 benchmark.