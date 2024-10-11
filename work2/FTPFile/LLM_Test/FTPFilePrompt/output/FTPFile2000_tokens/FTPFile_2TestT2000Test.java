// FTPFile_2Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#isDirectory()} method.
*/
class FTPFile_2Test {
```java
    /**
     * Test case for checking if the FTPFile is a directory.
     * It should return true if the type is DIRECTORY_TYPE.
     */
    @Test
    void testIsDirectoryTrue() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        assertTrue(file.isDirectory());
    }

    /**
     * Test case for checking if the FTPFile is not a directory.
     * It should return false if the type is not DIRECTORY_TYPE.
     */
    @Test
    void testIsDirectoryFalse() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.FILE_TYPE);
        assertFalse(file.isDirectory());
    }

    /**
     * Test case for checking if the FTPFile is not a directory.
     * It should return false if the type is SYMBOLIC_LINK_TYPE.
     */
    @Test
    void testIsDirectorySymbolicLink() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        assertFalse(file.isDirectory());
    }

    /**
     * Test case for checking if the FTPFile is not a directory.
     * It should return false if the type is UNKNOWN_TYPE.
     */
    @Test
    void testIsDirectoryUnknownType() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.UNKNOWN_TYPE);
        assertFalse(file.isDirectory());
    }

    /**
     * Test case for checking if the FTPFile is a directory.
     * It should return true if the type is set to DIRECTORY_TYPE after being set to another type.
     */
    @Test
    void testIsDirectoryAfterChange() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.FILE_TYPE);
        file.setType(FTPFile.DIRECTORY_TYPE);
        assertTrue(file.isDirectory());
    }

    /**
     * Test case for checking if the FTPFile is not a directory.
     * It should return false if the type is set to FILE_TYPE after being set to DIRECTORY_TYPE.
     */
    @Test
    void testIsDirectoryAfterChangeToFile() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setType(FTPFile.FILE_TYPE);
        assertFalse(file.isDirectory());
    }

    /**
     * Test case for checking if the FTPFile is not a directory.
     * It should return false if the type is set to SYMBOLIC_LINK_TYPE after being set to DIRECTORY_TYPE.
     */
    @Test
    void testIsDirectoryAfterChangeToSymbolicLink() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        assertFalse(file.isDirectory());
    }

    /**
     * Test case for checking if the FTPFile is not a directory.
     * It should return false if the type is set to UNKNOWN_TYPE after being set to DIRECTORY_TYPE.
     */
    @Test
    void testIsDirectoryAfterChangeToUnknown() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setType(FTPFile.UNKNOWN_TYPE);
        assertFalse(file.isDirectory());
    }

    /**
     * Test case for checking if the FTPFile is a directory.
     * It should return true if the type is set to DIRECTORY_TYPE after being set to UNKNOWN_TYPE.
     */
    @Test
    void testIsDirectoryAfterChangeFromUnknown() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.UNKNOWN_TYPE);
        file.setType(FTPFile.DIRECTORY_TYPE);
        assertTrue(file.isDirectory());
    }

    /**
     * Test case for checking if the FTPFile is a directory.
     * It should return true if the type is set to DIRECTORY_TYPE after being set to SYMBOLIC_LINK_TYPE.
     */
    @Test
    void testIsDirectoryAfterChangeFromSymbolicLink() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setType(FTPFile.DIRECTORY_TYPE);
        assertTrue(file.isDirectory());
    }
}
```

This test class `FTPFile_2Test` contains ten unit test cases for the `isDirectory()` method of the `FTPFile` class. Each test case checks different scenarios to ensure that the method behaves as expected.