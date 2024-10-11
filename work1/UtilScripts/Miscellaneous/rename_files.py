import os
import re

# Define the regular expression pattern to match the class name
class_name_pattern = re.compile(r"class\s+(\w+)")
directory = "../../results/OpenAI/HumanEvalJava-Results/src/main/java/original"
to_rename = []
# Iterate over all the files in the current directory
for filename in os.listdir(directory):
    # Check if the file is a Java file
    if filename.endswith(".java"):
        # Open the file and read its contents
        with open(os.path.join(directory,filename), "r") as f:
            contents = f.read()
        
        # Search for the class name using the regular expression
        match = class_name_pattern.search(contents)
        if match:
            class_name = match.group(1)
            
            # Rename the file to the class name
            
            to_rename.append( (filename, class_name + ".java",) )


print(to_rename)

for f in to_rename:
    print("Renamed=",*f)
    os.rename(os.path.join(directory, f[0]), f[1])
    