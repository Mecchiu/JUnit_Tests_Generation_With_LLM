import json
import os

def extract_class_name(code):
    """Estrae il nome della classe di test dal codice."""
    for line in code.split('\n'):
        if line.strip().startswith('class '):
            return line.split('class ')[1].split('Test')[0] + 'Test'
    return None

def extract_package_name(code):
    """Estrae il nome del package dal codice."""
    for line in code.split('\n'):
        if line.strip().startswith('package '):
            return line.strip().rstrip(';').split('package ')[1]
    return None

def generate_java_file(code, output_dir):
    """Genera un file Java dal codice fornito."""
    class_name = extract_class_name(code)
    package_name = extract_package_name(code)
    
    if not class_name:
        print(f"Impossibile estrarre il nome della classe dal codice: {code[:100]}...")
        return

    if package_name:
        package_path = package_name.replace('.', '/')
        full_path = os.path.join(output_dir, package_path)
        os.makedirs(full_path, exist_ok=True)
        file_path = os.path.join(full_path, f"{class_name}.java")
    else:
        file_path = os.path.join(output_dir, f"{class_name}.java")

    with open(file_path, 'w') as f:
        f.write(code)
    
    print(f"File generato: {file_path}")

def process_json_file(json_file_path, output_dir):
    """Processa il file JSON e genera i file Java corrispondenti."""
    with open(json_file_path, 'r') as f:
        data = json.load(f)
    
    for item in data:
        if 'choices' in item and item['choices']:
            if 'text' in item['choices'][0]:
                code = item['choices'][0]['text']
            elif 'message' in item['choices'][0] and 'content' in item['choices'][0]['message']:
                code = item['choices'][0]['message']['content']
            else:
                print(f"Struttura JSON non riconosciuta: {item}")
                continue
            
            generate_java_file(code, output_dir)

def main():
    # Usa una raw string (r) per il percorso del file JSON
    json_file_path = r'C:\Users\matti\OneDrive\Desktop\JUnit_Tests_Generation_using_LLMs\RQ1_Test_Generation\GPT3.5_Data\SF110_output\10_water-simulator_output_2000_fixed_extracode.json'
    
    # Usa una raw string (r) per il percorso di output
    output_dir = r'C:\Users\matti\OneDrive\Desktop\JavaTestsOutput\GPT3.5\sf110\original\10'
    
    os.makedirs(output_dir, exist_ok=True)
    process_json_file(json_file_path, output_dir)

if __name__ == "__main__":
    main()