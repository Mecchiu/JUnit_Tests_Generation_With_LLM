// Here's the source code for the test class of FileNameCheck

package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileNameCheckTest {

    @Test
    void testValidFileName() {
        String fileName = "file1.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("Yes", result);
    }

    @Test
    void testInvalidFileName() {
        String fileName = "file1.pdf";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testEmptyFileName() {
        String fileName = "";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testFileNameWithoutExtension() {
        String fileName = "file1";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testFileNameWithMultipleDots() {
        String fileName = "file1.txt.pdf";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testFileNameWithInvalidFirstChar() {
        String fileName = "1file.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testFileNameWithTooManyDigits() {
        String fileName = "file1234.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testFileNameWithUpperCaseExtension() {
        String fileName = "file1.TXT";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("Yes", result);
    }

    @Test
    void testFileNameWithLowerCaseExtension() {
        String fileName = "file1.dll";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("Yes", result);
    }

    @Test
    void testFileNameWithUpperCaseName() {
        String fileName = "FILE1.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("Yes", result);
    }
}