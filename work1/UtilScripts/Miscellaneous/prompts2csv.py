import csv
import json
import re
import os



def main(scenario_path):
    prompts = []
    with open(scenario_path, 'r') as scenario_file:
        prompts =  json.load(scenario_file)


    regex = r"It contains ten unit test cases for the {@link ([a-zA-Z0-9_]+)#(.+)}"

    for p in prompts:
        test_prompt = p["test_prompt"]
        matches = re.search(regex, test_prompt, re.MULTILINE)
        p["classname"] = matches.group(1)
        p["method_signature"] = matches.group(2)
        # print(p)


    # with open(scenario_path.replace(".json","extra.json"), 'w') as scenario_file:
    #     scenario_file.write(json.dumps(prompts, indent=4))

    with open(scenario_path.replace(".json",".csv"), "w") as csv_out:
        csv_file = csv.writer(csv_out, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
        csv_file.writerow(["id", "method_signature", "classname"])
        for p in prompts:
            print(p)
            csv_file.writerow([p["id"],p["method_signature"], p["classname"]])


if __name__ == "__main__":

    # RQ1 folder
    rq1_folder = "../RQ1_Test_Generation/OpenAI_Data/%s_input/%s_prompt.json"
    main(rq1_folder % ("HumanEvalJava", "original"))


    projectList =  ["5_templateit","71_ext4j","103_sweethome3d","14_omjstate","69_lhamacaw","82_ipcalculator","12_dsachat","86_at-robots2-j","2_a4j","17_inspirento","7_sfmis","32_httpanalyzer","29_apbsmem","10_water-simulator","56_jhandballmoves","81_javathena","39_diffi","57_hft-bomberman","91_classviewer","43_lilith","34_sbmlreader2","33_javaviewcontrol","47_dvd-homevideo","67_gae-app-manager","41_follow","23_jwbf","79_twfbplayer","73_fim1","94_jclo","31_xisemele","64_jtailgui","93_quickserver","68_biblestudy","100_jgaap","4_rif","60_sugar","52_lagoon","6_jnfe","24_saxpath","96_heal","59_mygrid","40_glengineer","42_asphodel","11_imsmart","74_fixsuite","75_openhre","8_gfarcegestionfa","63_objectexplorer","22_byuic","25_jni-inchi","84_ifx-framework","19_jmca","49_diebierse"]

    for p in projectList:
        main(rq1_folder % ("SF110", p))

    # RQ2 folder
    rq2_folder = "../RQ2_Prompt_Elements/OpenAI_Data/%s_input/%s_prompt.json"
    for i in range(1,4):
        main(rq2_folder % ("HumanEvalJava", f"scenario{i}"))

