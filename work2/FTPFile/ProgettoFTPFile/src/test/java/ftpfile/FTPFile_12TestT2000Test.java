package ftpfile;
// FTPFile_12Test.java


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFile}.
* It contains ten unit test cases for the {@link FTPFile#getSize()} method.
*/
class FTPFile_12Test {
    /**
     * Test case for verifying the default size of a newly created FTPFile.
     */
    @Test
    void testDefaultSize() {
        FTPFile file = new FTPFile();
        assertEquals(-1, file.getSize(), "Default size should be -1");
    }

    /**
     * Test case for setting and getting the size of an FTPFile.
     */
    @Test
    void testSetAndGetSize() {
        FTPFile file = new FTPFile();
        long expectedSize = 1024L;
        file.setSize(expectedSize);
        assertEquals(expectedSize, file.getSize(), "Size should match the set value");
    }

    /**
     * Test case for setting the size to zero.
     */
    @Test
    void testSetSizeToZero() {
        FTPFile file = new FTPFile();
        file.setSize(0L);
        assertEquals(0L, file.getSize(), "Size should be zero");
    }

    /**
     * Test case for setting the size to a negative value.
     */
    @Test
    void testSetNegativeSize() {
        FTPFile file = new FTPFile();
        long negativeSize = -500L;
        file.setSize(negativeSize);
        assertEquals(negativeSize, file.getSize(), "Size should match the negative value set");
    }

    /**
     * Test case for setting the size to a large value.
     */
    @Test
    void testSetLargeSize() {
        FTPFile file = new FTPFile();
        long largeSize = Long.MAX_VALUE;
        file.setSize(largeSize);
        assertEquals(largeSize, file.getSize(), "Size should match the large value set");
    }

    /**
     * Test case for setting the size to a small positive value.
     */
    @Test
    void testSetSmallPositiveSize() {
        FTPFile file = new FTPFile();
        long smallSize = 1L;
        file.setSize(smallSize);
        assertEquals(smallSize, file.getSize(), "Size should match the small positive value set");
    }

    /**
     * Test case for setting the size multiple times.
     */
    @Test
    void testSetSizeMultipleTimes() {
        FTPFile file = new FTPFile();
        file.setSize(100L);
        assertEquals(100L, file.getSize(), "Size should be 100");
        file.setSize(200L);
        assertEquals(200L, file.getSize(), "Size should be updated to 200");
    }

    /**
     * Test case for setting the size to a typical file size.
     */
    @Test
    void testSetTypicalFileSize() {
        FTPFile file = new FTPFile();
        long typicalSize = 4096L;
        file.setSize(typicalSize);
        assertEquals(typicalSize, file.getSize(), "Size should match the typical file size set");
    }

    /**
     * Test case for setting the size to a value and then resetting it to default.
     */
    @Test
    void testResetSizeToDefault() {
        FTPFile file = new FTPFile();
        file.setSize(500L);
        assertEquals(500L, file.getSize(), "Size should be 500");
        file.setSize(-1L);
        assertEquals(-1L, file.getSize(), "Size should be reset to default -1");
    }

    /**
     * Test case for setting the size to a boundary value.
     */
    @Test
    void testSetBoundarySize() {
        FTPFile file = new FTPFile();
        long boundarySize = Long.MIN_VALUE;
        file.setSize(boundarySize);
        assertEquals(boundarySize, file.getSize(), "Size should match the boundary value set");
    }
}