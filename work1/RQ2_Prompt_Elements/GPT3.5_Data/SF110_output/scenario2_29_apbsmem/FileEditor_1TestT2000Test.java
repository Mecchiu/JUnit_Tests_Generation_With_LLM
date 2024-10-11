// FileEditor_1Test.java
package apbs_mem_gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FileEditor}.
 * It contains ten unit test cases for the {@link FileEditor#getCompEnergy(String)} method.
 */
class FileEditor_1Test {

    /**
     * Test case for when the file does not exist.
     */
    @Test
    void testGetCompEnergy_FileNotExist() {
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy("nonexistent_file.txt");
        assertNull(result);
    }

    /**
     * Test case for when the file is empty.
     */
    @Test
    void testGetCompEnergy_FileEmpty() throws IOException {
        File file = File.createTempFile("empty_file", ".txt");
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy(file.getAbsolutePath());
        assertNull(result);
        file.deleteOnExit();
    }

    /**
     * Test case for when the file contains only whitespace.
     */
    @Test
    void testGetCompEnergy_FileWhitespace() throws IOException {
        File file = File.createTempFile("whitespace_file", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("   \n \t  \n");
        writer.close();
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy(file.getAbsolutePath());
        assertNull(result);
        file.deleteOnExit();
    }

    /**
     * Test case for when the file contains invalid data.
     */
    @Test
    void testGetCompEnergy_FileInvalidData() throws IOException {
        File file = File.createTempFile("invalid_data_file", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("invalid data\n");
        writer.close();
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy(file.getAbsolutePath());
        assertNull(result);
        file.deleteOnExit();
    }

    /**
     * Test case for when the file contains valid data with positive exponents.
     */
    @Test
    void testGetCompEnergy_FileValidData_PositiveExponents() throws IOException {
        File file = File.createTempFile("valid_data_file", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("1.2345e+01\n2.3456e+02\n3.4567e+03\n");
        writer.close();
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy(file.getAbsolutePath());
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals(12.345, result[0], 0.001);
        assertEquals(234.56, result[1], 0.001);
        assertEquals(3456.7, result[2], 0.001);
        file.deleteOnExit();
    }

    /**
     * Test case for when the file contains valid data with negative exponents.
     */
    @Test
    void testGetCompEnergy_FileValidData_NegativeExponents() throws IOException {
        File file = File.createTempFile("valid_data_file", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("1.2345e-01\n2.3456e-02\n3.4567e-03\n");
        writer.close();
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy(file.getAbsolutePath());
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals(0.12345, result[0], 0.00001);
        assertEquals(0.023456, result[1], 0.00001);
        assertEquals(0.0034567, result[2], 0.00001);
        file.deleteOnExit();
    }

    /**
     * Test case for when the file contains valid data with mixed exponents.
     */
    @Test
    void testGetCompEnergy_FileValidData_MixedExponents() throws IOException {
        File file = File.createTempFile("valid_data_file", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("1.2345e+01\n2.3456e-02\n3.4567e+03\n");
        writer.close();
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy(file.getAbsolutePath());
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals(12.345, result[0], 0.001);
        assertEquals(0.023456, result[1], 0.00001);
        assertEquals(3456.7, result[2], 0.001);
        file.deleteOnExit();
    }

    /**
     * Test case for when the file contains valid data with mixed exponents and extra whitespace.
     */
    @Test
    void testGetCompEnergy_FileValidData_MixedExponents_ExtraWhitespace() throws IOException {
        File file = File.createTempFile("valid_data_file", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("1.2345e+01 \n 2.3456e-02 \t 3.4567e+03\n");
        writer.close();
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy(file.getAbsolutePath());
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals(12.345, result[0], 0.001);
        assertEquals(0.023456, result[1], 0.00001);
        assertEquals(3456.7, result[2], 0.001);
        file.deleteOnExit();
    }

    /**
     * Test case for when the file contains valid data with mixed exponents and extra text.
     */
    @Test
    void testGetCompEnergy_FileValidData_MixedExponents_ExtraText() throws IOException {
        File file = File.createTempFile("valid_data_file", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("1.2345e+01\nextra text\n2.3456e-02\n3.4567e+03\n");
        writer.close();
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy(file.getAbsolutePath());
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals(12.345, result[0], 0.001);
        assertEquals(0.023456, result[1], 0.00001);
        assertEquals(3456.7, result[2], 0.001);
        file.deleteOnExit();
    }

    /**
     * Test case for when the file contains valid data with mixed exponents and extra text and whitespace.
     */
    @Test
    void testGetCompEnergy_FileValidData_MixedExponents_ExtraTextAndWhitespace() throws IOException {
        File file = File.createTempFile("valid_data_file", ".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("1.2345e+01\n extra text \n2.3456e-02 \t 3.4567e+03\n");
        writer.close();
        FileEditor fileEditor = new FileEditor();
        double[] result = fileEditor.getCompEnergy(file.getAbsolutePath());
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals(12.345, result[0], 0.001);
        assertEquals(0.023456, result[1], 0.00001);
        assertEquals(3456.7, result[2], 0.001);
        file.deleteOnExit();
    }
}