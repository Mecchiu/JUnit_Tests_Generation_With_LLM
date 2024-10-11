// FTPFile_19Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#setLink(String)} method.
*/
class FTPFile_19Test {
```java
    /**
     * Test case for setting a valid symbolic link.
     */
    @Test
    void testSetLinkValid() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink("targetFile");
        assertEquals("targetFile", file.getLink());
    }

    /**
     * Test case for setting a symbolic link on a non-symbolic link file type.
     */
    @Test
    void testSetLinkOnNonSymbolicLinkType() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.FILE_TYPE);
        file.setLink("targetFile");
        assertNull(file.getLink());
    }

    /**
     * Test case for setting a null link.
     */
    @Test
    void testSetLinkNull() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink(null);
        assertNull(file.getLink());
    }

    /**
     * Test case for setting an empty string as a link.
     */
    @Test
    void testSetLinkEmptyString() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink("");
        assertEquals("", file.getLink());
    }

    /**
     * Test case for setting a link with special characters.
     */
    @Test
    void testSetLinkSpecialCharacters() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink("target@#$.file");
        assertEquals("target@#$.file", file.getLink());
    }

    /**
     * Test case for setting a link with spaces.
     */
    @Test
    void testSetLinkWithSpaces() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink("target file");
        assertEquals("target file", file.getLink());
    }

    /**
     * Test case for setting a link with a long path.
     */
    @Test
    void testSetLinkLongPath() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        String longPath = "a".repeat(255);
        file.setLink(longPath);
        assertEquals(longPath, file.getLink());
    }

    /**
     * Test case for setting a link after changing the file type.
     */
    @Test
    void testSetLinkAfterTypeChange() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.FILE_TYPE);
        file.setLink("initialLink");
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink("newLink");
        assertEquals("newLink", file.getLink());
    }

    /**
     * Test case for setting a link on an invalid FTPFile.
     */
    @Test
    void testSetLinkOnInvalidFile() {
        FTPFile file = new FTPFile("invalid");
        file.setLink("targetFile");
        assertNull(file.getLink());
    }

    /**
     * Test case for setting a link and verifying it does not affect other properties.
     */
    @Test
    void testSetLinkDoesNotAffectOtherProperties() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setName("fileName");
        file.setSize(1024);
        file.setLink("targetFile");
        assertEquals("fileName", file.getName());
        assertEquals(1024, file.getSize());
        assertEquals("targetFile", file.getLink());
    }
}
```

This test class `FTPFile_19Test` contains ten unit test cases for the `setLink` method of the `FTPFile` class. Each test case checks different scenarios for setting a symbolic link, including valid and invalid cases, and ensures that the method behaves as expected.