package outputformat;
// OutputFormat_4Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#getEncoding()} method.
*/
class OutputFormat_4Test {
    /**
     * Test case for default encoding.
     */
    @Test
    void testDefaultEncoding() {
        OutputFormat format = new OutputFormat();
        assertEquals("UTF-8", format.getEncoding());
    }

    /**
     * Test case for setting encoding to null.
     */
    @Test
    void testSetEncodingNull() {
        OutputFormat format = new OutputFormat();
        format.setEncoding(null);
        assertEquals("UTF-8", format.getEncoding());
    }

    /**
     * Test case for setting encoding to empty string.
     */
    @Test
    void testSetEncodingEmpty() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("");
        assertEquals("", format.getEncoding());
    }

    /**
     * Test case for setting encoding to a valid value.
     */
    @Test
    void testSetEncodingValid() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("ISO-8859-1");
        assertEquals("ISO-8859-1", format.getEncoding());
    }

    /**
     * Test case for setting encoding to a different valid value.
     */
    @Test
    void testSetEncodingValidDifferent() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("UTF-16");
        assertEquals("UTF-16", format.getEncoding());
    }

    /**
     * Test case for setting encoding to a non-standard value.
     */
    @Test
    void testSetEncodingNonStandard() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("ASCII");
        assertEquals("ASCII", format.getEncoding());
    }

    /**
     * Test case for setting encoding to a mixed case value.
     */
    @Test
    void testSetEncodingMixedCase() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("uTf-8");
        assertEquals("uTf-8", format.getEncoding());
    }

    /**
     * Test case for setting encoding to a numeric value.
     */
    @Test
    void testSetEncodingNumeric() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("12345");
        assertEquals("12345", format.getEncoding());
    }

    /**
     * Test case for setting encoding to a special character value.
     */
    @Test
    void testSetEncodingSpecialCharacters() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("!@#$%^&*()");
        assertEquals("!@#$%^&*()", format.getEncoding());
    }

    /**
     * Test case for setting encoding to a long string value.
     */
    @Test
    void testSetEncodingLongString() {
        OutputFormat format = new OutputFormat();
        String longEncoding = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        format.setEncoding(longEncoding);
        assertEquals(longEncoding, format.getEncoding());
    }
}