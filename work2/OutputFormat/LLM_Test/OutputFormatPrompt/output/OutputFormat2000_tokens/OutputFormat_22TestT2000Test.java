// OutputFormat_22Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isXHTML()} method.
*/
class OutputFormat_22Test {
```java
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
     * Test case for isXHTML with createPrettyPrint.
     * The default value should be false.
     */
    @Test
    void testCreatePrettyPrintIsXHTML() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isXHTML(), "isXHTML should be false in createPrettyPrint");
    }

    /**
     * Test case for isXHTML with createCompactFormat.
     * The default value should be false.
     */
    @Test
    void testCreateCompactFormatIsXHTML() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isXHTML(), "isXHTML should be false in createCompactFormat");
    }

    /**
     * Test case for isXHTML after parsing options with -xhtml.
     */
    @Test
    void testParseOptionsXHTML() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-xhtml"};
        format.parseOptions(args, 0);
        assertTrue(format.isXHTML(), "isXHTML should be true after parsing -xhtml option");
    }

    /**
     * Test case for isXHTML after parsing options without -xhtml.
     */
    @Test
    void testParseOptionsWithoutXHTML() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-indent", "  "};
        format.parseOptions(args, 0);
        assertFalse(format.isXHTML(), "isXHTML should be false after parsing options without -xhtml");
    }

    /**
     * Test case for isXHTML after parsing options with multiple settings.
     */
    @Test
    void testParseOptionsMultipleSettings() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-indent", "  ", "-xhtml", "-newlines"};
        format.parseOptions(args, 0);
        assertTrue(format.isXHTML(), "isXHTML should be true after parsing options with -xhtml");
    }

    /**
     * Test case for isXHTML after parsing options with invalid setting.
     */
    @Test
    void testParseOptionsInvalidSetting() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-invalidOption"};
        format.parseOptions(args, 0);
        assertFalse(format.isXHTML(), "isXHTML should be false after parsing options with invalid setting");
    }
}
```