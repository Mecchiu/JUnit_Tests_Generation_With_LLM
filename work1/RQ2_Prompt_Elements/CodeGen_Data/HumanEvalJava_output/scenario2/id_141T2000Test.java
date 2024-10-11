// FileNameCheckTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains one unit test case for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {
// FileNameCheck.java
package scenario2;

import java.util.Arrays;

class FileNameCheck {

    /**
     * Create a function which takes a string representing a file's name, and returns
     * 'Yes' if the the file's name is valid, and returns 'No' otherwise.
     * A file's name is considered to be valid if and only if all the following conditions
     * are met:
     * - There should not be more than three digits ('0'-'9') in the file's name.
     * - The file's name contains exactly one dot '.'
     * - The substring before the dot should not be empty, and it starts with a letter from
     * the latin alphabet ('a'-'z' and 'A'-'Z').
     * - The substring after the dot should be one of these: ['txt', 'exe', 'dll']
     */
    public static String fileNameCheck(String fileName) {
        String[] suf = { "txt", "exe", "dll" };
        String[] lst = fileName.split("\\.");
        if (lst.length!= 2) {
            return "No";
        }
        if (!Arrays.asList(suf).contains(lst[1])) {
            return "No";
        }
        if (lst[0].length() == 0) {
            return "No";
        }
        if (!Character.isLetter(lst[0].charAt(0))) {
            return "No";
        }
        int t = 0;
        for (int i = 0; i < lst[0].length(); i++) {
            if (Character.isDigit(lst[0].charAt(i))) {
                t++;
            }
        }
        if (t > 3) {
            return "No";
        }
        return "Yes";
    }
}

// FileNameCheckTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains one unit test case for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {
		
	/**
	 * @see the unit test for this class (FileNameCheck.java)
	 */
	@Test
	void test() {
        assertEquals(
        "Test result: 1. 'txt' is a valid file name", 
        FileNameCheck.fileNameCheck("txt"), "Yes");
		
		assertEquals(
        "Test result: 1. 'exe' is a valid file name", 
        FileNameCheck.fileNameCheck("exe"), "No");
		
		assertEquals(
        "Test result: 1. 'dll' is a valid file name", 
        FileNameCheck.fileNameCheck("dll"), "No");
		
		assertEquals(
        "Test result: 1. 'txt' is a valid file name but 'exe' is not", 
        FileNameCheck.fileNameCheck("txt"), "Yes");
		assertEquals(
        "Test result: 1. 'exe' is a valid file name but 'dll' is not", 
        FileNameCheck.fileNameCheck("exe"), "No");
		assertEquals(
        "Test result: 1. 'exe' does not contain 'a' or 'Z' alphas", 
        FileNameCheck.fileNameCheck("exe"), "No");
		assertEquals(
        "Test result: 1. 'exe' does not contain 'y' alphas", 
        FileNameCheck.fileNameCheck("exe"), "No");
		assertEquals(
        "Test result: 1. 'exe' does not contain 'z' alphas", 
        FileNameCheck.fileNameCheck("exe"), "No");
		assertEquals(
        "Test result: 2. 'txt' is a valid file name but 'exe' does not contain 'y' alphas", 
        FileNameCheck.fileNameCheck("txt"), "No");
		assertEquals(
        "Test result: 2. 'exe' does not contain 'z' alphas", 
        FileNameCheck.fileNameCheck("exe"), "No");
		
		assertEquals(
        "Test result: 1. 'txt' is a valid file name and 'exe' does not contain 'z' alphas", 
        FileNameCheck.fileNameCheck("txt"), "Yes");
		assertEquals(
        "Test result: 1. 'exe' does not contain 'y' alphas and 'z' alphas", 
        FileNameCheck.fileNameCheck("exe"), "No");
		assertEquals(
        "Test result: 1. 'exe' does not contain 'y' alphas and 'z' alphas", 
        FileNameCheck.fileNameCheck("exe"), "No");
		assertEquals(
        "Test result: 2. 'txt' is a valid file name and 'exe' contains 'z' alphas", 
        FileNameCheck.fileNameCheck("txt"), "Yes");
		assertEquals(
        "Test result: 2. 'exe' contains 'y' alphas and 'z' alphas", 
        FileNameCheck.fileNameCheck("exe"), "Yes");
		
		assertEquals(
        "Test result: 1. 'exe' is a valid file name", 
        FileNameCheck.fileNameCheck("exe"), "Yes");
	}
		
}