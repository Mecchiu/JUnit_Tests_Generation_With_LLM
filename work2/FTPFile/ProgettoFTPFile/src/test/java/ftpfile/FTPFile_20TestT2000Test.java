package ftpfile;
// FTPFile_20Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#getLink()} method.
*/
class FTPFile_20Test {
    /**
     * Test case for {@link FTPFile#getLink()} when the FTPFile is a symbolic link.
     */
    @Test
    void testGetLinkWhenSymbolicLink() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink("targetFile");
        assertEquals("targetFile", file.getLink());
    }

    /**
     * Test case for {@link FTPFile#getLink()} when the FTPFile is not a symbolic link.
     */
    @Test
    void testGetLinkWhenNotSymbolicLink() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.FILE_TYPE);
        assertNull(file.getLink());
    }

    /**
     * Test case for {@link FTPFile#getLink()} when the FTPFile is a directory.
     */
    @Test
    void testGetLinkWhenDirectory() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        assertNull(file.getLink());
    }

    /**
     * Test case for {@link FTPFile#getLink()} when the FTPFile type is unknown.
     */
    @Test
    void testGetLinkWhenUnknownType() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.UNKNOWN_TYPE);
        assertNull(file.getLink());
    }

    /**
     * Test case for {@link FTPFile#getLink()} when the FTPFile is a symbolic link with an empty target.
     */
    @Test
    void testGetLinkWhenSymbolicLinkWithEmptyTarget() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink("");
        assertEquals("", file.getLink());
    }

    /**
     * Test case for {@link FTPFile#getLink()} when the FTPFile is a symbolic link with a null target.
     */
    @Test
    void testGetLinkWhenSymbolicLinkWithNullTarget() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink(null);
        assertNull(file.getLink());
    }

    /**
     * Test case for {@link FTPFile#getLink()} when the FTPFile is a symbolic link with a complex target.
     */
    @Test
    void testGetLinkWhenSymbolicLinkWithComplexTarget() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink("/path/to/targetFile");
        assertEquals("/path/to/targetFile", file.getLink());
    }

    /**
     * Test case for {@link FTPFile#getLink()} when the FTPFile is a symbolic link and the link is set multiple times.
     */
    @Test
    void testGetLinkWhenSymbolicLinkSetMultipleTimes() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink("firstTarget");
        file.setLink("secondTarget");
        assertEquals("secondTarget", file.getLink());
    }

    /**
     * Test case for {@link FTPFile#getLink()} when the FTPFile is a symbolic link and the link is set to null after being set.
     */
    @Test
    void testGetLinkWhenSymbolicLinkSetToNullAfterBeingSet() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink("targetFile");
        file.setLink(null);
        assertNull(file.getLink());
    }

    /**
     * Test case for {@link FTPFile#getLink()} when the FTPFile is a symbolic link and the link is set to an empty string after being set.
     */
    @Test
    void testGetLinkWhenSymbolicLinkSetToEmptyAfterBeingSet() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setLink("targetFile");
        file.setLink("");
        assertEquals("", file.getLink());
    }
}