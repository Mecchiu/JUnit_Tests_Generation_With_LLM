package outputformat;
// OutputFormat_22Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isXHTML()} method.
*/
class OutputFormat_22Test {
    /**
     * Test case for default value of isXHTML().
     * The default value should be false.
     */
    @Test
    void testDefaultIsXHTML() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isXHTML(), "Default value of isXHTML should be false");
    }

    /**
     * Test case for setting isXHTML to true.
     */
    @Test
    void testSetXHTMLTrue() {
        OutputFormat format = new OutputFormat();
        format.setXHTML(true);
        assertTrue(format.isXHTML(), "isXHTML should be true after setting it to true");
    }

    /**
     * Test case for setting isXHTML to false.
     */
    @Test
    void testSetXHTMLFalse() {
        OutputFormat format = new OutputFormat();
        format.setXHTML(true);
        format.setXHTML(false);
        assertFalse(format.isXHTML(), "isXHTML should be false after setting it to false");
    }

    /**
     * Test case for setting isXHTML multiple times.
     */
    @Test
    void testSetXHTMLMultipleTimes() {
        OutputFormat format = new OutputFormat();
        format.setXHTML(true);
        format.setXHTML(false);
        format.setXHTML(true);
        assertTrue(format.isXHTML(), "isXHTML should be true after setting it to true again");
    }

    /**
     * Test case for isXHTML with pretty print format.
     * The default pretty print format should have isXHTML as false.
     */
    @Test
    void testPrettyPrintIsXHTML() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isXHTML(), "Pretty print format should have isXHTML as false");
    }

    /**
     * Test case for isXHTML with compact format.
     * The default compact format should have isXHTML as false.
     */
    @Test
    void testCompactFormatIsXHTML() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isXHTML(), "Compact format should have isXHTML as false");
    }

    /**
     * Test case for isXHTML after parsing options.
     * The option "-xhtml" should set isXHTML to true.
     */
    @Test
    void testParseOptionsSetXHTML() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-xhtml"};
        format.parseOptions(args, 0);
        assertTrue(format.isXHTML(), "isXHTML should be true after parsing '-xhtml' option");
    }

    /**
     * Test case for isXHTML after parsing options without "-xhtml".
     * The isXHTML should remain false if "-xhtml" is not present.
     */
    @Test
    void testParseOptionsWithoutXHTML() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-indent", "4"};
        format.parseOptions(args, 0);
        assertFalse(format.isXHTML(), "isXHTML should remain false if '-xhtml' is not present");
    }

    /**
     * Test case for isXHTML after parsing options with multiple arguments.
     * The option "-xhtml" should set isXHTML to true even if other options are present.
     */
    @Test
    void testParseOptionsWithMultipleArguments() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-indent", "4", "-xhtml", "-newlines"};
        format.parseOptions(args, 0);
        assertTrue(format.isXHTML(), "isXHTML should be true after parsing '-xhtml' option with other options");
    }

    /**
     * Test case for isXHTML after parsing options with invalid arguments.
     * The isXHTML should remain false if invalid arguments are present.
     */
    @Test
    void testParseOptionsWithInvalidArguments() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-invalidOption"};
        format.parseOptions(args, 0);
        assertFalse(format.isXHTML(), "isXHTML should remain false if invalid arguments are present");
    }
}