import subprocess
import os
import time


projects = []

scenario = "original"
token = "2000"

for project in os.listdir("../../RQ1_Test_Generation/GPT3.5_Data/%s_input" % ("SF110")):
    if project.endswith(".csv"):
        continue
    if "prompt" in project:
        projects.append("_".join(project.split("_")[1:3]))

# ignore_projects = ["23_", "40_", "57_", "79_", "84_", "86_"]

source_folder = "/Users/Research/GPT3.5/SF110-Results"
subfolders = [f.path for f in os.scandir(source_folder) if f.is_dir()]

for subfolder in subfolders:
    projectName = subfolder.split("/")[-1]
    

    if projectName not in projects:
        continue
    is_continue = False
    #for ignore_project in ignore_projects:
    #    if ignore_project in projectName:
    #        is_continue = True
    #        break
    if is_continue:
        continue

    print(f"./SF110-20130704-src/{projectName}")
    


    print("Running ant test for ", projectName)
    os.chdir(subfolder)

    run_ant = True

    run_count = 0

    while run_ant:
        run_count += 1
        # if run_count > 10:
        #     break
        try:
            # Run the "mvn test" command and capture the output
            process = subprocess.Popen(["ant"], stdout=subprocess.PIPE)
            output, error = process.communicate(timeout=600)

            # Print the output of the command
            test_results = output.decode("utf-8")

            # Check if the command ran successfully
            if process.returncode == 0:
                print("ant test succeeded")
                run_ant = False
            else:
                print("ant test failed")
                # parse the compilation output
                # test_results = test_results.replace("\n  ","")

                lines = test_results.split("\n")
                print("Output # lines ", len(lines))

                start, end = -1, -1
                for i in range(0, len(lines)):
                    line = lines[i]
                    if start == -1 and "compile-tests:" in line:
                        start = i 
                    if start >= 0 and (i > start + 1) and "[javac]" in line:
                        end = i + 1

                run_ant = True if start > 0 else False
                # collects files that failed compilation
                to_delete = []
                output = []
                for i in range(start, end):
                    line = lines[i]
                    if "error:" in line:
                        parts = line.split()
                        file = parts[1].split(":")[0]
                        if "_Test.java" not in file:
                            continue
                        location = parts[1].split(":")[1][1:-1]
                        error = " ".join(parts[2:])
                        # print(error)
                        for j in range(i + 1, end):
                            # print(lines[j])
                            if "[javac]" not in lines[j]:
                                break
                            # print("Parsing 1: ", lines[j])
                            if "[javac]" in lines[j] and ("error:" in lines[j] or "errors" in lines[j] or "warning" in lines[j] or "1 error" in lines[j]):
                                break
                            # print("Parsing 2: ", lines[j])
                            
                            if "[javac]"  in lines[j]:
                                current_error = lines[j].split("[javac]")[1].strip()
                                if "^" in current_error:
                                    continue
                                if len(current_error) > 0:
                                    error = error + " " + current_error
                            # print("Parsing 3: ", lines[j])

                        # if "error: cannot find symbol" in error and i+3 < len(lines) and i+4 < len(lines):
                        #     if "[javac]" in lines[i + 3] and "[javac]" in lines[i + 4]:
                        #         error_symbol = lines[i + 3].split("[javac]")[1].strip()
                        #         error_location = lines[i + 4].split("[javac]")[1].strip()
                        #         error = error + " " + error_symbol + " " + error_location

                        to_delete.append(file)
                        output.append("\t".join([file, location, error]))

                # save the compilation status
                with open(
                    f"output_{run_count}_{projectName}_{scenario}_{token}.csv", "w"
                ) as f:
                    f.write("\n".join(output))

                # delete the problematic test files
                for f in to_delete:
                    if os.path.exists(f):
                        print("Removing ", f)
                        os.remove(f)
        except subprocess.TimeoutExpired:
            print("ant test timed out")
            run_ant = False
