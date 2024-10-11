package outputformat;
// OutputFormat_5Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setEncoding(String)} method.
*/
class OutputFormat_5Test {
    /**
     * Test case for setting a valid encoding.
     */
    @Test
    void testSetEncodingValid() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("ISO-8859-1");
        assertEquals("ISO-8859-1", format.getEncoding());
    }

    /**
     * Test case for setting a null encoding.
     * The encoding should remain unchanged.
     */
    @Test
    void testSetEncodingNull() {
        OutputFormat format = new OutputFormat();
        String initialEncoding = format.getEncoding();
        format.setEncoding(null);
        assertEquals(initialEncoding, format.getEncoding());
    }

    /**
     * Test case for setting an empty string as encoding.
     * The encoding should remain unchanged.
     */
    @Test
    void testSetEncodingEmptyString() {
        OutputFormat format = new OutputFormat();
        String initialEncoding = format.getEncoding();
        format.setEncoding("");
        assertEquals(initialEncoding, format.getEncoding());
    }

    /**
     * Test case for setting a valid encoding after setting a null encoding.
     */
    @Test
    void testSetEncodingAfterNull() {
        OutputFormat format = new OutputFormat();
        format.setEncoding(null);
        format.setEncoding("UTF-16");
        assertEquals("UTF-16", format.getEncoding());
    }

    /**
     * Test case for setting a valid encoding after setting an empty string.
     */
    @Test
    void testSetEncodingAfterEmptyString() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("");
        format.setEncoding("UTF-16");
        assertEquals("UTF-16", format.getEncoding());
    }

    /**
     * Test case for setting a valid encoding multiple times.
     */
    @Test
    void testSetEncodingMultipleTimes() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("ISO-8859-1");
        assertEquals("ISO-8859-1", format.getEncoding());
        format.setEncoding("UTF-16");
        assertEquals("UTF-16", format.getEncoding());
    }

    /**
     * Test case for setting a valid encoding with special characters.
     */
    @Test
    void testSetEncodingSpecialCharacters() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("UTF-8@123");
        assertEquals("UTF-8@123", format.getEncoding());
    }

    /**
     * Test case for setting a valid encoding with numbers.
     */
    @Test
    void testSetEncodingWithNumbers() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("UTF-8-2021");
        assertEquals("UTF-8-2021", format.getEncoding());
    }

    /**
     * Test case for setting a valid encoding with mixed case.
     */
    @Test
    void testSetEncodingMixedCase() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("uTf-8");
        assertEquals("uTf-8", format.getEncoding());
    }

    /**
     * Test case for setting a valid encoding with spaces.
     */
    @Test
    void testSetEncodingWithSpaces() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("UTF 8");
        assertEquals("UTF 8", format.getEncoding());
    }
}