// FileNameCheckTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains ten unit test cases for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {
	// Test case 1
    @Test
    void testFileNameCheck1() {
        String fileName = "test.txt";
        String expResult = "Yes";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expResult, result);
    }
			// Test case 2
    @Test
    void testFileNameCheck2() {
        String fileName = "test.exe";
        String expResult = "Yes";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expResult, result);
    }
			// Test case 3
    @Test
    void testFileNameCheck3() {
        String fileName = "test.dll";
        String expResult = "Yes";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expResult, result);
    }
			// Test case 4
    @Test
    void testFileNameCheck4() {
        String fileName = "test";
        String expResult = "No";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expResult, result);
    }
			// Test case 5
    @Test
    void testFileNameCheck5() {
        String fileName = "test.";
        String expResult = "No";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expResult, result);
    }
			// Test case 6
    @Test
    void testFileNameCheck6() {
        String fileName = ".txt";
        String expResult = "No";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expResult, result);
    }
			// Test case 7
    @Test
    void testFileNameCheck7() {
        String fileName = "test.tx";
        String expResult = "No";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expResult, result);
    }
			// Test case 8
    @Test
    void testFileNameCheck8() {
        String fileName = "test.txte";
        String expResult = "No";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expResult, result);
    }
			// Test case 9
    @Test
    void testFileNameCheck9() {
        String fileName = "test.1txt";
        String expResult = "No";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expResult, result);
    }
			// Test case 10
    @Test
    void testFileNameCheck10() {
        String fileName = "1test.txt";
        String expResult = "No";
        String result = FileNameCheck.fileNameCheck(fileName);
        assertEquals(expResult, result);
    }
}
