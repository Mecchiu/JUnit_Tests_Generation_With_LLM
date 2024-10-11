package outputformat;
// OutputFormat_11Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isNewLineAfterDeclaration()} method.
*/
class OutputFormat_11Test {
    /**
     * Test case for default value of newLineAfterDeclaration.
     */
    @Test
    void testDefaultNewLineAfterDeclaration() {
        OutputFormat format = new OutputFormat();
        assertTrue(format.isNewLineAfterDeclaration(), "Default value should be true");
    }

    /**
     * Test case for setting newLineAfterDeclaration to true.
     */
    @Test
    void testSetNewLineAfterDeclarationTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "Value should be true after setting to true");
    }

    /**
     * Test case for setting newLineAfterDeclaration to false.
     */
    @Test
    void testSetNewLineAfterDeclarationFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "Value should be false after setting to false");
    }

    /**
     * Test case for toggling newLineAfterDeclaration from true to false.
     */
    @Test
    void testToggleNewLineAfterDeclarationTrueToFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(true);
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "Value should be false after toggling from true to false");
    }

    /**
     * Test case for toggling newLineAfterDeclaration from false to true.
     */
    @Test
    void testToggleNewLineAfterDeclarationFalseToTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "Value should be true after toggling from false to true");
    }

    /**
     * Test case for newLineAfterDeclaration with pretty print format.
     */
    @Test
    void testPrettyPrintNewLineAfterDeclaration() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertTrue(format.isNewLineAfterDeclaration(), "Pretty print should have newLineAfterDeclaration as true");
    }

    /**
     * Test case for newLineAfterDeclaration with compact format.
     */
    @Test
    void testCompactFormatNewLineAfterDeclaration() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertTrue(format.isNewLineAfterDeclaration(), "Compact format should have newLineAfterDeclaration as true");
    }

    /**
     * Test case for newLineAfterDeclaration after parsing options.
     */
    @Test
    void testParseOptionsNewLineAfterDeclaration() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-newLineAfterDeclaration"};
        format.parseOptions(args, 0);
        assertTrue(format.isNewLineAfterDeclaration(), "Parsing options should set newLineAfterDeclaration to true");
    }

    /**
     * Test case for newLineAfterDeclaration with custom constructor.
     */
    @Test
    void testCustomConstructorNewLineAfterDeclaration() {
        OutputFormat format = new OutputFormat("  ", true, "UTF-8");
        assertTrue(format.isNewLineAfterDeclaration(), "Custom constructor should have newLineAfterDeclaration as true");
    }

    /**
     * Test case for newLineAfterDeclaration with default constructor.
     */
    @Test
    void testDefaultConstructorNewLineAfterDeclaration() {
        OutputFormat format = new OutputFormat();
        assertTrue(format.isNewLineAfterDeclaration(), "Default constructor should have newLineAfterDeclaration as true");
    }
}