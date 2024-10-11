import os
import re

# Define the regular expression pattern to match the class name
class_name_pattern = re.compile(r"separateClassLoader = true")
directory = "../../results/OpenAI/HumanEvalJava-Results/src/test/java/original"
to_rename = []
# Iterate over all the files in the current directory
for filename in os.listdir(directory):
    # Check if the file is a Java file
    if filename.endswith("ESTest.java"):
        # Open the file and read its contents
        with open(os.path.join(directory,filename), "r") as f:
            contents = f.read()

        # Search for the class name using the regular expression
        match = class_name_pattern.search(contents)
        
        if match:
            pass
            contents = contents.replace(f"separateClassLoader = true", f"separateClassLoader = false")
            with open(os.path.join(directory, filename), "w") as f:
                f.write(contents)
            
        else:
            print(filename)
