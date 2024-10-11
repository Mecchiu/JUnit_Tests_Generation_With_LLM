#!/bin/bash

#$ -M x@y.edu   # Email address for job notification
#$ -m abe            # Send mail when job begins, ends and aborts
#$ -pe smp 1     # Specify parallel environment and legal core size
#$ -q long           # Specify queue
#$ -N  RQ2_GPT3_s1_3
python generate_tests_gpt.py -t 2000 -d HumanEvalJava -q RQ2 -p "RQ2_Prompt_Elements/GPT3.5_Data/HumanEvalJava_input/scenario1_prompt.json"
python generate_tests_gpt.py -t 2000 -d HumanEvalJava -q RQ2 -p "RQ2_Prompt_Elements/GPT3.5_Data/HumanEvalJava_input/scenario2_prompt.json"
python generate_tests_gpt.py -t 2000 -d HumanEvalJava -q RQ2 -p "RQ2_Prompt_Elements/GPT3.5_Data/HumanEvalJava_input/scenario3_prompt.json"