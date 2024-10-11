import os
def createJob(scenario_path):
    with open("../scripts/generate_tests_SF110_RQ2.sh", "w") as f:
        f.write("#!/bin/bash"+"\n")

        f.write("#$ -M x@y.edu   # Email address for job notification"+"\n")
        f.write("#$ -m abe            # Send mail when job begins, ends and aborts"+"\n")
        f.write("#$ -pe smp 1     # Specify parallel environment and legal core size"+"\n")
        f.write("#$ -q long          # Specify queue"+"\n")
        f.write("#$ -N  RQ2_SF110_openai_3"+"\n")
    
    for token in [4000]:
        for project in os.listdir(scenario_path):
            if project.endswith(".csv"):
                continue

            if "scenario5" in project:
                with open("../scripts/generate_tests_SF110_RQ2.sh", "a") as f:
                    f.write(f"python generate_tests_openai.py -t {token} -d SF110 -q RQ2 -p \"RQ2_Prompt_Elements/OpenAI_Data/SF110_input/{project}\"\n")


createJob("../RQ2_Prompt_Elements/OpenAI_Data/%s_input"%("SF110"))
