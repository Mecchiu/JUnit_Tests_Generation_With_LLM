package outputformat;
// OutputFormat_6Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isOmitEncoding()} method.
*/
class OutputFormat_6Test {
    /**
     * Test case for default value of omitEncoding.
     * The default value should be false.
     */
    @Test
    void testDefaultOmitEncoding() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isOmitEncoding(), "Default omitEncoding should be false");
    }

    /**
     * Test case for setting omitEncoding to true.
     */
    @Test
    void testSetOmitEncodingTrue() {
        OutputFormat format = new OutputFormat();
        format.setOmitEncoding(true);
        assertTrue(format.isOmitEncoding(), "omitEncoding should be true after setting it to true");
    }

    /**
     * Test case for setting omitEncoding to false.
     */
    @Test
    void testSetOmitEncodingFalse() {
        OutputFormat format = new OutputFormat();
        format.setOmitEncoding(true);
        format.setOmitEncoding(false);
        assertFalse(format.isOmitEncoding(), "omitEncoding should be false after setting it to false");
    }

    /**
     * Test case for setting omitEncoding multiple times.
     */
    @Test
    void testSetOmitEncodingMultipleTimes() {
        OutputFormat format = new OutputFormat();
        format.setOmitEncoding(true);
        format.setOmitEncoding(false);
        format.setOmitEncoding(true);
        assertTrue(format.isOmitEncoding(), "omitEncoding should be true after setting it to true again");
    }

    /**
     * Test case for omitEncoding with createPrettyPrint.
     * The omitEncoding should remain false.
     */
    @Test
    void testOmitEncodingWithPrettyPrint() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isOmitEncoding(), "omitEncoding should be false with pretty print format");
    }

    /**
     * Test case for omitEncoding with createCompactFormat.
     * The omitEncoding should remain false.
     */
    @Test
    void testOmitEncodingWithCompactFormat() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isOmitEncoding(), "omitEncoding should be false with compact format");
    }

    /**
     * Test case for omitEncoding after parsing options.
     * The omitEncoding should be true if -omitEncoding is passed.
     */
    @Test
    void testOmitEncodingAfterParsingOptions() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-omitEncoding"};
        format.parseOptions(args, 0);
        assertTrue(format.isOmitEncoding(), "omitEncoding should be true after parsing -omitEncoding option");
    }

    /**
     * Test case for omitEncoding after parsing options without -omitEncoding.
     * The omitEncoding should remain false.
     */
    @Test
    void testOmitEncodingAfterParsingOptionsWithoutOmitEncoding() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-indent", "4"};
        format.parseOptions(args, 0);
        assertFalse(format.isOmitEncoding(), "omitEncoding should be false after parsing options without -omitEncoding");
    }

    /**
     * Test case for omitEncoding with invalid options.
     * The omitEncoding should remain false.
     */
    @Test
    void testOmitEncodingWithInvalidOptions() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-invalidOption"};
        format.parseOptions(args, 0);
        assertFalse(format.isOmitEncoding(), "omitEncoding should be false after parsing invalid options");
    }

    /**
     * Test case for omitEncoding with mixed valid and invalid options.
     * The omitEncoding should be true if -omitEncoding is included.
     */
    @Test
    void testOmitEncodingWithMixedOptions() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-omitEncoding", "-invalidOption"};
        format.parseOptions(args, 0);
        assertTrue(format.isOmitEncoding(), "omitEncoding should be true after parsing mixed options with -omitEncoding");
    }
}