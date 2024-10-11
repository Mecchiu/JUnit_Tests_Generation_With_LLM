// FTPFile_3Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#isFile()} method.
*/
class FTPFile_3Test {
```java
    /**
     * Test case for when the FTPFile is of type FILE_TYPE.
     */
    @Test
    void testIsFileWhenFileType() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.FILE_TYPE);
        assertTrue(file.isFile(), "The file should be recognized as a regular file.");
    }

    /**
     * Test case for when the FTPFile is of type DIRECTORY_TYPE.
     */
    @Test
    void testIsFileWhenDirectoryType() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        assertFalse(file.isFile(), "The file should not be recognized as a regular file.");
    }

    /**
     * Test case for when the FTPFile is of type SYMBOLIC_LINK_TYPE.
     */
    @Test
    void testIsFileWhenSymbolicLinkType() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        assertFalse(file.isFile(), "The file should not be recognized as a regular file.");
    }

    /**
     * Test case for when the FTPFile is of type UNKNOWN_TYPE.
     */
    @Test
    void testIsFileWhenUnknownType() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.UNKNOWN_TYPE);
        assertFalse(file.isFile(), "The file should not be recognized as a regular file.");
    }

    /**
     * Test case for when the FTPFile is initialized with default constructor.
     */
    @Test
    void testIsFileWithDefaultConstructor() {
        FTPFile file = new FTPFile();
        assertFalse(file.isFile(), "The file should not be recognized as a regular file by default.");
    }

    /**
     * Test case for when the FTPFile is initialized with raw listing constructor.
     */
    @Test
    void testIsFileWithRawListingConstructor() {
        FTPFile file = new FTPFile("raw listing");
        assertFalse(file.isFile(), "The file should not be recognized as a regular file when initialized with raw listing.");
    }

    /**
     * Test case for when the FTPFile type is set to an invalid value.
     */
    @Test
    void testIsFileWithInvalidType() {
        FTPFile file = new FTPFile();
        file.setType(999); // Invalid type
        assertFalse(file.isFile(), "The file should not be recognized as a regular file with an invalid type.");
    }

    /**
     * Test case for when the FTPFile type is set to a negative value.
     */
    @Test
    void testIsFileWithNegativeType() {
        FTPFile file = new FTPFile();
        file.setType(-1); // Negative type
        assertFalse(file.isFile(), "The file should not be recognized as a regular file with a negative type.");
    }

    /**
     * Test case for when the FTPFile type is set to zero.
     */
    @Test
    void testIsFileWithZeroType() {
        FTPFile file = new FTPFile();
        file.setType(0); // Zero type
        assertTrue(file.isFile(), "The file should be recognized as a regular file with type zero.");
    }

    /**
     * Test case for when the FTPFile type is set to a large positive value.
     */
    @Test
    void testIsFileWithLargePositiveType() {
        FTPFile file = new FTPFile();
        file.setType(Integer.MAX_VALUE); // Large positive type
        assertFalse(file.isFile(), "The file should not be recognized as a regular file with a large positive type.");
    }
}
```

This test class `FTPFile_3Test` contains ten unit test cases for the `isFile()` method of the `FTPFile` class. Each test case checks a different scenario to ensure that the `isFile()` method behaves as expected.