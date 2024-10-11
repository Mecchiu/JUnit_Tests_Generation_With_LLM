import os
import xml.etree.ElementTree as ET

def calculate_test_success_rate(report_dir='target/surefire-reports'):
    total_tests = 0
    passed_tests = 0

    # Itera attraverso tutti i file XML nella directory specificata
    for file_name in os.listdir(report_dir):
        if file_name.endswith('.xml'):
            file_path = os.path.join(report_dir, file_name)
            
            # Parso il file XML
            tree = ET.parse(file_path)
            root = tree.getroot()
            
            # Estrai le informazioni sul numero di test, falliti, errori e ignorati
            tests = int(root.attrib.get('tests', 0))
            failures = int(root.attrib.get('failures', 0))
            errors = int(root.attrib.get('errors', 0))
            skipped = int(root.attrib.get('skipped', 0))
            
            # Calcola il numero di test passati
            passed = tests - (failures + errors + skipped)
            
            total_tests += tests
            passed_tests += passed

    # Calcola la percentuale di test passati
    if total_tests == 0:
        print("Nessun test trovato nei report di Surefire.")
    else:
        success_rate = (passed_tests / total_tests) * 100
        print(f"Numero totale di test eseguiti: {total_tests}")
        print(f"Numero di test passati: {passed_tests}")
        print(f"Percentuale di test passati: {success_rate:.2f}%")

# Esegui la funzione per calcolare la percentuale di correttezza dei test
calculate_test_success_rate()
