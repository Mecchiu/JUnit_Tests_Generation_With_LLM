// FileNameCheck.java
package scenario3;

class FileNameCheck {

    /**
     * Create a function which takes a string representing a file's name, and returns
     * 'Yes' if the file's name is valid, and returns 'No' otherwise.
     * A file's name is considered to be valid if and only if all the following conditions
     * are met:
     * - There should not be more than three digits ('0'-'9') in the file's name.
     * - The file's name contains exactly one dot '.'
     * - The substring before the dot should not be empty, and it starts with a letter from
     * the latin alphabet ('a'-'z' and 'A'-'Z').
     * - The substring after the dot should be one of these: ['txt', 'exe', 'dll']
     * Examples:
     * fileNameCheck("example.txt") # => 'Yes'
     * fileNameCheck("1example.dll") # => 'No' (the name should start with a latin alphabet letter)
     *
     * > fileNameCheck("example.txt")
     * "Yes"
     * > fileNameCheck("1example.dll")
     * "No"
     * > fileNameCheck("s1sdf3.asd")
     * "No"
     * > fileNameCheck("K.dll")
     * "Yes"
     * > fileNameCheck("MY16FILE3.exe")
     * "Yes"
     * > fileNameCheck("His12FILE94.exe")
     * "No"
     * > fileNameCheck("_Y.txt")
     * "No"
     * > fileNameCheck("?aREYA.exe")
     * "No"
     * > fileNameCheck("/this_is_valid.dll")
     * "No"
     * > fileNameCheck("this_is_valid.wow")
     * "No"
     * > fileNameCheck("this_is_valid.txt")
     * "Yes"
     * > fileNameCheck("this_is_valid.txtexe")
     * "No"
     * > fileNameCheck("#this2_i4s_5valid.ten")
     * "No"
     * > fileNameCheck("@this1_is6_valid.exe")
     * "No"
     * > fileNameCheck("this_is_12valid.6exe4.txt")
     * "No"
     * > fileNameCheck("all.exe.txt")
     * "No"
     * > fileNameCheck("I563_No.exe")
     * "Yes"
     * > fileNameCheck("Is3youfault.txt")
     * "Yes"
     * > fileNameCheck("no_one#knows.dll")
     * "Yes"
     * > fileNameCheck("1I563_Yes3.exe")
     * "No"
     * > fileNameCheck("I563_Yes3.txtt")
     * "No"
     * > fileNameCheck("final..txt")
     * "No"
     * > fileNameCheck("final132")
     * "No"
     * > fileNameCheck("_f4indsartal132.")
     * "No"
     * > fileNameCheck(".txt")
     * "No"
     * > fileNameCheck("s.")
     * "No"
     */
    public static String fileNameCheck(String fileName) {
        // Check if the file name contains exactly one dot '.'
        if (fileName.indexOf('.') == -1 || fileName.indexOf('.') != fileName.lastIndexOf('.')) {
            return "No";
        }

        // Split the file name into two parts: before and after the dot
        String[] parts = fileName.split("\\.");
        String beforeDot = parts[0];
        String afterDot = parts[1];

        // Check if the substring before the dot is not empty and starts with a letter from the latin alphabet
        if (beforeDot.isEmpty() || !Character.isLetter(beforeDot.charAt(0))) {
            return "No";
        }

        // Check if the substring after the dot is one of these: ['txt', 'exe', 'dll']
        if (!afterDot.equals("txt") && !afterDot.equals("exe") && !afterDot.equals("dll")) {
            return "No";
        }

        // Check if there are not more than three digits ('0'-'9') in the file name
        int digitCount = 0;
        for (char c : fileName.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount > 3) {
            return "No";
        }

        // If all conditions are met, return 'Yes'
        return "Yes";
    }
}

// FileNameCheckTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains ten unit test cases for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {
    @Test
    void testValidFileName() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("example.txt"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("K.dll"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("MY16FILE3.exe"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("I563_No.exe"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("Is3youfault.txt"));
        assertEquals("Yes", FileNameCheck.fileNameCheck("no_one#knows.dll"));
    }

    @Test
    void testInvalidFileName() {
        assertEquals("No", FileNameCheck.fileNameCheck("1example.dll"));
        assertEquals("No", FileNameCheck.fileNameCheck("s1sdf3.asd"));
        assertEquals("No", FileNameCheck.fileNameCheck("His12FILE94.exe"));
        assertEquals("No", FileNameCheck.fileNameCheck("_Y.txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("?aREYA.exe"));
        assertEquals("No", FileNameCheck.fileNameCheck("/this_is_valid.dll"));
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.wow"));
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_valid.txtexe"));
        assertEquals("No", FileNameCheck.fileNameCheck("#this2_i4s_5valid.ten"));
        assertEquals("No", FileNameCheck.fileNameCheck("@this1_is6_valid.exe"));
        assertEquals("No", FileNameCheck.fileNameCheck("this_is_12valid.6exe4.txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("all.exe.txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("1I563_Yes3.exe"));
        assertEquals("No", FileNameCheck.fileNameCheck("I563_Yes3.txtt"));
        assertEquals("No", FileNameCheck.fileNameCheck("final..txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("final132"));
        assertEquals("No", FileNameCheck.fileNameCheck("_f4indsartal132."));
        assertEquals("No", FileNameCheck.fileNameCheck(".txt"));
        assertEquals("No", FileNameCheck.fileNameCheck("s."));
    }
}