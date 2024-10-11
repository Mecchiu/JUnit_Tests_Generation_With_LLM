// FileEditor_1Test.java
package apbs_mem_gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileEditor_1Test {
    
    @Test
    void testGetCompEnergy_fileNotFound() {
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy("nonexistent_file.txt");
        assertNull(result);
    }
    
    @Test
    void testGetCompEnergy_emptyFile() {
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy("empty_file.txt");
        assertNull(result);
    }
    
    @Test
    void testGetCompEnergy_validFile() {
        FileEditor fileEditor = new FileEditor();
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = fileEditor.getCompEnergy("valid_file.txt");
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testGetCompEnergy_validFileWithEmptyLines() {
        FileEditor fileEditor = new FileEditor();
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = fileEditor.getCompEnergy("valid_file_with_empty_lines.txt");
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testGetCompEnergy_validFileWithPlusSign() {
        FileEditor fileEditor = new FileEditor();
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = fileEditor.getCompEnergy("valid_file_with_plus_sign.txt");
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testGetCompEnergy_validFileWithMinusSign() {
        FileEditor fileEditor = new FileEditor();
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = fileEditor.getCompEnergy("valid_file_with_minus_sign.txt");
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testGetCompEnergy_validFileWithPlusAndMinusSign() {
        FileEditor fileEditor = new FileEditor();
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] result = fileEditor.getCompEnergy("valid_file_with_plus_and_minus_sign.txt");
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testGetCompEnergy_validFileWithInvalidLine() {
        FileEditor fileEditor = new FileEditor();
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0, 0.0};
        double[] result = fileEditor.getCompEnergy("valid_file_with_invalid_line.txt");
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testGetCompEnergy_validFileWithInvalidNumberFormat() {
        FileEditor fileEditor = new FileEditor();
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0, 0.0};
        double[] result = fileEditor.getCompEnergy("valid_file_with_invalid_number_format.txt");
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testGetCompEnergy_validFileWithInvalidExponent() {
        FileEditor fileEditor = new FileEditor();
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0, 0.0};
        double[] result = fileEditor.getCompEnergy("valid_file_with_invalid_exponent.txt");
        assertArrayEquals(expected, result);
    }
}