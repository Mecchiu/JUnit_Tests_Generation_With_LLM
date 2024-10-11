package ftpfile;
// FTPFile_13Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#setHardLinkCount(int)} method.
*/
class FTPFile_13Test {
    /**
     * Test case for setting a valid hard link count.
     */
    @Test
    void testSetHardLinkCountValid() {
        FTPFile file = new FTPFile();
        file.setHardLinkCount(5);
        assertEquals(5, file.getHardLinkCount());
    }

    /**
     * Test case for setting a hard link count to zero.
     */
    @Test
    void testSetHardLinkCountZero() {
        FTPFile file = new FTPFile();
        file.setHardLinkCount(0);
        assertEquals(0, file.getHardLinkCount());
    }

    /**
     * Test case for setting a negative hard link count.
     */
    @Test
    void testSetHardLinkCountNegative() {
        FTPFile file = new FTPFile();
        file.setHardLinkCount(-1);
        assertEquals(-1, file.getHardLinkCount());
    }

    /**
     * Test case for setting a large hard link count.
     */
    @Test
    void testSetHardLinkCountLarge() {
        FTPFile file = new FTPFile();
        file.setHardLinkCount(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, file.getHardLinkCount());
    }

    /**
     * Test case for setting a hard link count after initialization.
     */
    @Test
    void testSetHardLinkCountAfterInitialization() {
        FTPFile file = new FTPFile();
        file.setHardLinkCount(3);
        file.setHardLinkCount(7);
        assertEquals(7, file.getHardLinkCount());
    }

    /**
     * Test case for setting a hard link count on an invalid FTPFile.
     */
    @Test
    void testSetHardLinkCountOnInvalidFile() {
        FTPFile file = new FTPFile("invalid");
        file.setHardLinkCount(4);
        assertEquals(4, file.getHardLinkCount());
    }

    /**
     * Test case for setting a hard link count on a directory type file.
     */
    @Test
    void testSetHardLinkCountOnDirectory() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.DIRECTORY_TYPE);
        file.setHardLinkCount(2);
        assertEquals(2, file.getHardLinkCount());
    }

    /**
     * Test case for setting a hard link count on a file type file.
     */
    @Test
    void testSetHardLinkCountOnFile() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.FILE_TYPE);
        file.setHardLinkCount(1);
        assertEquals(1, file.getHardLinkCount());
    }

    /**
     * Test case for setting a hard link count on a symbolic link type file.
     */
    @Test
    void testSetHardLinkCountOnSymbolicLink() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.SYMBOLIC_LINK_TYPE);
        file.setHardLinkCount(0);
        assertEquals(0, file.getHardLinkCount());
    }

    /**
     * Test case for setting a hard link count on an unknown type file.
     */
    @Test
    void testSetHardLinkCountOnUnknownType() {
        FTPFile file = new FTPFile();
        file.setType(FTPFile.UNKNOWN_TYPE);
        file.setHardLinkCount(6);
        assertEquals(6, file.getHardLinkCount());
    }
}