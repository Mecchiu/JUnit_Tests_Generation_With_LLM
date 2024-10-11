import subprocess
import os
import time


# accumulates all results
output = []

# 
for llm in ["OpenAI","CodeGen", "GPT3.5"]:
    os.chdir(f"/Users/Documents/Portfolio/GitHub/FAKE/{llm}/HumanEvalJava-Results")

    run_maven = True

    while run_maven:
        try:
            # Run the "mvn test" command and capture the output
            process = subprocess.Popen(['mvn', 'test'], stdout=subprocess.PIPE)
            process_output, process_error = process.communicate(timeout=45)

            # Print the output of the command
            test_results = process_output.decode('utf-8')

            # Check if the command ran successfully
            if process.returncode == 0:
                print('Maven test succeeded')
                run_maven = False
            else:
                print('Maven test failed')
                
                # parse the compilation output        
                lines = test_results.split("\n")
                print("Output # lines ", len(lines))
                start, end = -1, -1
                for i in range(0, len(lines)):
                    line = lines[i]
                    if start == -1 and "COMPILATION ERROR" in line:
                        start = i + 1
                    if start >= 0 and (i > start + 1) and ("-" * 60) in line:
                        end = i + 1
                        break

                run_maven = True if start > 0 else False

                
                
                # collects files that failed compilation
                to_delete = []
                
                # parses all errors
                i = start
                while i != end:
                    line = lines[i]
                    i += 1
                    if line.startswith("[ERROR]"):
                        # [8:] slice the string to disregard the `[ERROR] ` in the beginning
                        file_with_location, error = line[8:].split(" ", 1)
                        # format is /path/to/file:[line,column]
                        file, location = file_with_location.split(":")
                        # disregard the "[" and "]" in [line, column]
                        location = location[1:-1]
                        # flag for deletion
                        to_delete.append(file)
                        # identation in the next means the error has a continuation on the next line
                        # keep adding the message
                        while i != end and lines[i].startswith(" "):
                            error += lines[i]
                            i += 1
                        # escape any tabs by replacing with blank spaces
                        error = error.replace("\t"," ")
                        # append to the output to be saved
                        output.append([llm, file, location, error])

                # delete the problematic test files 
                for f in to_delete:
                    if os.path.exists(f):
                        print("Removing ", f)
                        os.remove(f)
                to_delete.clear()


        except Exception as err:
            print(err)
            run_maven = False
                 


# save the compilation status
import os
import csv 
absFilePath = os.path.abspath(__file__)
os.chdir( os.path.dirname(absFilePath) )
out_file = f"output{time.time()}.csv"

with open(out_file, 'w', newline='', encoding='UTF8',) as csvfile:
    csv_writer = csv.writer(csvfile)
    for row in output:
        csv_writer.writerow(row)


print("SUCCESS: Saved all",len(output),"errors in", out_file)    










