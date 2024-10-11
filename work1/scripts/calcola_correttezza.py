import os
import xml.etree.ElementTree as ET

def parse_surefire_report(xml_file):
    """
    Parse a single Surefire XML report and extract test results.
    """
    tree = ET.parse(xml_file)
    root = tree.getroot()

    tests = int(root.attrib.get('tests', 0))
    failures = int(root.attrib.get('failures', 0))
    errors = int(root.attrib.get('errors', 0))
    skipped = int(root.attrib.get('skipped', 0))

    passed = tests - failures - errors - skipped

    # Check correctness status
    if passed == tests and tests > 0:
        correctness = "correct"  # All tests passed
    elif passed > 0:
        correctness = "somewhat_correct"  # At least one test passed
    else:
        correctness = "incorrect"  # No tests passed

    return correctness

def calculate_correctness(directory):
    """
    Calculate the correctness of tests by reading all Surefire XML reports in the directory.
    """
    total_tests = 0
    correct_tests = 0
    somewhat_correct_tests = 0
    incorrect_tests = 0

    # Loop through all files in the specified directory
    for filename in os.listdir(directory):
        if filename.endswith(".xml") and "scenario2" in filename:
            file_path = os.path.join(directory, filename)
            correctness = parse_surefire_report(file_path)
            total_tests += 1

            if correctness == "correct":
                correct_tests += 1
            elif correctness == "somewhat_correct":
                somewhat_correct_tests += 1
            else:
                incorrect_tests += 1

    # Calculate rates
    if total_tests == 0:
        print("No tests found in the reports.")
        return

    correct_rate = (correct_tests / total_tests) * 100
    somewhat_correct_rate = (somewhat_correct_tests / total_tests) * 100
    incorrect_rate = (incorrect_tests / total_tests) * 100

    print(f"Total Tests: {total_tests}")
    print(f"Correct Tests (100% pass): {correct_tests} ({correct_rate:.2f}%)")
    print(f"Somewhat Correct Tests (at least one pass): {somewhat_correct_tests} ({somewhat_correct_rate:.2f}%)")
    print(f"Incorrect Tests (no pass): {incorrect_tests} ({incorrect_rate:.2f}%)")

# Directory containing the Surefire XML reports
surefire_reports_dir = 'C:\\Users\\matti\\OneDrive\\Desktop\\JUnit_Tests_Generation_using_LLMs\HumanEvalJava\\target\\surefire-reports'  # Replace with your path
calculate_correctness(surefire_reports_dir)



