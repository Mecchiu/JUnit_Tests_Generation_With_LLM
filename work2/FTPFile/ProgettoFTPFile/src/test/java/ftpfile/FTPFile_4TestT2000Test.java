package ftpfile;
// FTPFile_4Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#isSymbolicLink()} method.
*/
class FTPFile_4Test {
    /**
     * Test case for when the FTPFile is a symbolic link.
     */
    @Test
    void testIsSymbolicLinkTrue() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        assertTrue(file.isSymbolicLink(), "The file should be identified as a symbolic link.");
    }

    /**
     * Test case for when the FTPFile is a regular file.
     */
    @Test
    void testIsSymbolicLinkFalseForFile() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.FILE_TYPE);
        assertFalse(file.isSymbolicLink(), "The file should not be identified as a symbolic link.");
    }

    /**
     * Test case for when the FTPFile is a directory.
     */
    @Test
    void testIsSymbolicLinkFalseForDirectory() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        assertFalse(file.isSymbolicLink(), "The directory should not be identified as a symbolic link.");
    }

    /**
     * Test case for when the FTPFile type is unknown.
     */
    @Test
    void testIsSymbolicLinkFalseForUnknown() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.UNKNOWN_TYPE);
        assertFalse(file.isSymbolicLink(), "The unknown type should not be identified as a symbolic link.");
    }

    /**
     * Test case for when the FTPFile is initialized with default constructor.
     */
    @Test
    void testIsSymbolicLinkDefaultConstructor() {
        FTPFile file = new FTPFile();
        assertFalse(file.isSymbolicLink(), "The default constructor should not identify the file as a symbolic link.");
    }

    /**
     * Test case for when the FTPFile is initialized with a raw listing.
     */
    @Test
    void testIsSymbolicLinkRawListingConstructor() {
        FTPFile file = new FTPFile("raw listing");
        assertFalse(file.isSymbolicLink(), "The raw listing constructor should not identify the file as a symbolic link.");
    }

    /**
     * Test case for when the FTPFile type is set to an invalid type.
     */
    @Test
    void testIsSymbolicLinkInvalidType() {
        FTPFile file = new FTPFile();
        file.setType(999); // Invalid type
        assertFalse(file.isSymbolicLink(), "An invalid type should not be identified as a symbolic link.");
    }

    /**
     * Test case for when the FTPFile type is set to a negative type.
     */
    @Test
    void testIsSymbolicLinkNegativeType() {
        FTPFile file = new FTPFile();
        file.setType(-1); // Negative type
        assertFalse(file.isSymbolicLink(), "A negative type should not be identified as a symbolic link.");
    }

    /**
     * Test case for when the FTPFile type is set to zero.
     */
    @Test
    void testIsSymbolicLinkZeroType() {
        FTPFile file = new FTPFile();
        file.setType(0); // Zero type
        assertFalse(file.isSymbolicLink(), "A zero type should not be identified as a symbolic link.");
    }

    /**
     * Test case for when the FTPFile type is set to the maximum integer value.
     */
    @Test
    void testIsSymbolicLinkMaxIntType() {
        FTPFile file = new FTPFile();
        file.setType(Integer.MAX_VALUE); // Max int type
        assertFalse(file.isSymbolicLink(), "The maximum integer type should not be identified as a symbolic link.");
    }
}