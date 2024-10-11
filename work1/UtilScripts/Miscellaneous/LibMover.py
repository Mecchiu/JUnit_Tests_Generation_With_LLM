import os
import shutil

source_folder = "/Users/Downloads/SF110-20130704-src"
destination_folder = "/Users/Research/OpenAI/SF110-Results"

subfolders = [f.path for f in os.scandir(source_folder) if f.is_dir()]

for projectFolder in subfolders:
    current_target_folder = projectFolder.split("/")[-1] + "/test-lib"
    if os.path.exists(os.path.join(source_folder, current_target_folder)):
        print(projectFolder, "has lib folder")

        if not os.path.exists(os.path.join(destination_folder, current_target_folder)):
            os.makedirs(os.path.join(destination_folder, current_target_folder))

        for file_name in os.listdir(os.path.join(source_folder, current_target_folder)):
            source = os.path.join(source_folder, current_target_folder, file_name)
            destination = os.path.join(
                destination_folder, current_target_folder, file_name
            )
            print(source, destination)
            if os.path.isfile(source):
                shutil.copy(source, destination)
                print("Copied:", file_name)
