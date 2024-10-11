package ftpfile;
// FTPFile_11Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#setSize(long)} method.
*/
class FTPFile_11Test {
    /**
     * Test case for setting the size of the FTPFile.
     * It verifies that the size is correctly set and retrieved.
     */
    @Test
    void testSetSize() {
        FTPFile file = new FTPFile();
        long size = 1024L;
        file.setSize(size);
        assertEquals(size, file.getSize(), "The size should be set correctly.");
    }

    /**
     * Test case for setting the size of the FTPFile to zero.
     * It verifies that the size is correctly set and retrieved.
     */
    @Test
    void testSetSizeZero() {
        FTPFile file = new FTPFile();
        long size = 0L;
        file.setSize(size);
        assertEquals(size, file.getSize(), "The size should be set to zero.");
    }

    /**
     * Test case for setting the size of the FTPFile to a negative value.
     * It verifies that the size is correctly set and retrieved.
     */
    @Test
    void testSetSizeNegative() {
        FTPFile file = new FTPFile();
        long size = -1L;
        file.setSize(size);
        assertEquals(size, file.getSize(), "The size should be set to a negative value.");
    }

    /**
     * Test case for setting the size of the FTPFile to a large value.
     * It verifies that the size is correctly set and retrieved.
     */
    @Test
    void testSetSizeLarge() {
        FTPFile file = new FTPFile();
        long size = Long.MAX_VALUE;
        file.setSize(size);
        assertEquals(size, file.getSize(), "The size should be set to a large value.");
    }

    /**
     * Test case for setting the size of the FTPFile multiple times.
     * It verifies that the size is correctly updated and retrieved.
     */
    @Test
    void testSetSizeMultipleTimes() {
        FTPFile file = new FTPFile();
        long size1 = 512L;
        long size2 = 2048L;
        file.setSize(size1);
        assertEquals(size1, file.getSize(), "The size should be set to the first value.");
        file.setSize(size2);
        assertEquals(size2, file.getSize(), "The size should be updated to the second value.");
    }

    /**
     * Test case for setting the size of the FTPFile to the same value multiple times.
     * It verifies that the size remains unchanged.
     */
    @Test
    void testSetSizeSameValue() {
        FTPFile file = new FTPFile();
        long size = 1024L;
        file.setSize(size);
        file.setSize(size);
        assertEquals(size, file.getSize(), "The size should remain unchanged.");
    }

    /**
     * Test case for setting the size of the FTPFile to a very small value.
     * It verifies that the size is correctly set and retrieved.
     */
    @Test
    void testSetSizeVerySmall() {
        FTPFile file = new FTPFile();
        long size = 1L;
        file.setSize(size);
        assertEquals(size, file.getSize(), "The size should be set to a very small value.");
    }

    /**
     * Test case for setting the size of the FTPFile to a very large value.
     * It verifies that the size is correctly set and retrieved.
     */
    @Test
    void testSetSizeVeryLarge() {
        FTPFile file = new FTPFile();
        long size = Long.MAX_VALUE - 1;
        file.setSize(size);
        assertEquals(size, file.getSize(), "The size should be set to a very large value.");
    }

    /**
     * Test case for setting the size of the FTPFile to a typical value.
     * It verifies that the size is correctly set and retrieved.
     */
    @Test
    void testSetSizeTypical() {
        FTPFile file = new FTPFile();
        long size = 4096L;
        file.setSize(size);
        assertEquals(size, file.getSize(), "The size should be set to a typical value.");
    }

    /**
     * Test case for setting the size of the FTPFile to a random value.
     * It verifies that the size is correctly set and retrieved.
     */
    @Test
    void testSetSizeRandom() {
        FTPFile file = new FTPFile();
        long size = 123456789L;
        file.setSize(size);
        assertEquals(size, file.getSize(), "The size should be set to a random value.");
    }
}