package apbs_mem_gui;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FileEditor_1Test {

    @Test
    void testGetCompEnergy_PositiveExponent() {
        // Test case for positive exponent
        FileEditor fileEditor = new FileEditor();
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = fileEditor.getCompEnergy("test_file.txt");
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetCompEnergy_NegativeExponent() {
        // Test case for negative exponent
        FileEditor fileEditor = new FileEditor();
        double[] expected = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6};
        double[] result = fileEditor.getCompEnergy("test_file.txt");
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetCompEnergy_EmptyFile() {
        // Test case for empty file
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy("empty_file.txt");
        assertNull(result);
    }

    @Test
    void testGetCompEnergy_NonexistentFile() {
        // Test case for nonexistent file
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy("nonexistent_file.txt");
        assertNull(result);
    }

    @Test
    void testGetCompEnergy_InvalidData() {
        // Test case for file with invalid data
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy("invalid_data.txt");
        assertNull(result);
    }

    @Test
    void testGetCompEnergy_MixedExponents() {
        // Test case for file with mixed positive and negative exponents
        FileEditor fileEditor = new FileEditor();
        double[] expected = {1.0, 0.1, 2.0, 0.2, 3.0, 0.3};
        double[] result = fileEditor.getCompEnergy("mixed_exponents.txt");
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetCompEnergy_SingleValue() {
        // Test case for file with a single value
        FileEditor fileEditor = new FileEditor();
        double[] expected = {42.0, 0.42, 420.0, 4.2, 4200.0, 42.0};
        double[] result = fileEditor.getCompEnergy("single_value.txt");
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetCompEnergy_ZeroValues() {
        // Test case for file with all zero values
        FileEditor fileEditor = new FileEditor();
        double[] expected = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        double[] result = fileEditor.getCompEnergy("zero_values.txt");
        assertArrayEquals(expected, result);
    }

    @Test
    void testGetCompEnergy_LargeValues() {
        // Test case for file with large values
        FileEditor fileEditor = new FileEditor();
        double[] expected = {1000000.0, 10000.0, 1000000000.0, 100000.0, 1000000000000.0, 1000000.0};
        double[] result = fileEditor.getCompEnergy("large_values.txt");
        assertArrayEquals(expected, result);
    }
}
