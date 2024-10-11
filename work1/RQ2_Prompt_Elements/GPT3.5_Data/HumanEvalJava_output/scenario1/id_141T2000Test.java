// Here's the source code for the FileNameCheckTest class:

package scenario1;

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
    void testInvalidExtension() {
        String fileName = "file1.pdf";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testInvalidFileName() {
        String fileName = "1file.txt";
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
    void testInvalidFileNameLength() {
        String fileName = "file1234.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testInvalidFileNameCharacters() {
        String fileName = "file#.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testInvalidFileNameDigits() {
        String fileName = "file12345.txt";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testInvalidFileNameExtension() {
        String fileName = "file1.exe1";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testInvalidFileNameExtensionLength() {
        String fileName = "file1.longextension";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }

    @Test
    void testInvalidFileNameExtensionCharacters() {
        String fileName = "file1.tx#";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals("No", result);
    }
}