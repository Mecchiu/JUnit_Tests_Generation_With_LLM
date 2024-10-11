package outputformat;
// OutputFormat_9Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isSuppressDeclaration()} method.
*/
class OutputFormat_9Test {
    /**
     * Test case for default value of suppressDeclaration.
     */
    @Test
    void testDefaultSuppressDeclaration() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isSuppressDeclaration(), "Default value of suppressDeclaration should be false");
    }

    /**
     * Test case for setting suppressDeclaration to true.
     */
    @Test
    void testSetSuppressDeclarationTrue() {
        OutputFormat format = new OutputFormat();
        format.setSuppressDeclaration(true);
        assertTrue(format.isSuppressDeclaration(), "suppressDeclaration should be true after setting it to true");
    }

    /**
     * Test case for setting suppressDeclaration to false.
     */
    @Test
    void testSetSuppressDeclarationFalse() {
        OutputFormat format = new OutputFormat();
        format.setSuppressDeclaration(true);
        format.setSuppressDeclaration(false);
        assertFalse(format.isSuppressDeclaration(), "suppressDeclaration should be false after setting it to false");
    }

    /**
     * Test case for suppressDeclaration with createPrettyPrint.
     */
    @Test
    void testPrettyPrintSuppressDeclaration() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isSuppressDeclaration(), "suppressDeclaration should be false in pretty print format");
    }

    /**
     * Test case for suppressDeclaration with createCompactFormat.
     */
    @Test
    void testCompactFormatSuppressDeclaration() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isSuppressDeclaration(), "suppressDeclaration should be false in compact format");
    }

    /**
     * Test case for suppressDeclaration after parsing options.
     */
    @Test
    void testParseOptionsSuppressDeclaration() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-suppressDeclaration"};
        format.parseOptions(args, 0);
        assertTrue(format.isSuppressDeclaration(), "suppressDeclaration should be true after parsing -suppressDeclaration option");
    }

    /**
     * Test case for suppressDeclaration with multiple options.
     */
    @Test
    void testMultipleOptionsSuppressDeclaration() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-indent", "  ", "-suppressDeclaration", "-newlines"};
        format.parseOptions(args, 0);
        assertTrue(format.isSuppressDeclaration(), "suppressDeclaration should be true after parsing multiple options including -suppressDeclaration");
    }

    /**
     * Test case for suppressDeclaration with invalid options.
     */
    @Test
    void testInvalidOptionsSuppressDeclaration() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-invalidOption", "-suppressDeclaration"};
        int index = format.parseOptions(args, 0);
        assertEquals(0, index, "parseOptions should return the index of the first unrecognized option");
        assertFalse(format.isSuppressDeclaration(), "suppressDeclaration should remain false after parsing invalid options");
    }

    /**
     * Test case for suppressDeclaration with no options.
     */
    @Test
    void testNoOptionsSuppressDeclaration() {
        OutputFormat format = new OutputFormat();
        String[] args = {};
        format.parseOptions(args, 0);
        assertFalse(format.isSuppressDeclaration(), "suppressDeclaration should remain false when no options are parsed");
    }

    /**
     * Test case for suppressDeclaration with null options.
     */
    @Test
    void testNullOptionsSuppressDeclaration() {
        OutputFormat format = new OutputFormat();
        format.parseOptions(null, 0);
        assertFalse(format.isSuppressDeclaration(), "suppressDeclaration should remain false when null options are parsed");
    }
}