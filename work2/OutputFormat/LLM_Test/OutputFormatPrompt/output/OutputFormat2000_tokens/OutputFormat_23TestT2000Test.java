package outputformat;
// OutputFormat_23Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setXHTML(boolean)} method.
*/
class OutputFormat_23Test {
    /**
     * Test case for setting XHTML to true.
     */
    @Test
    void testSetXHTMLTrue() {
        OutputFormat format = new OutputFormat();
        format.setXHTML(true);
        assertTrue(format.isXHTML(), "XHTML should be set to true");
    }

    /**
     * Test case for setting XHTML to false.
     */
    @Test
    void testSetXHTMLFalse() {
        OutputFormat format = new OutputFormat();
        format.setXHTML(false);
        assertFalse(format.isXHTML(), "XHTML should be set to false");
    }

    /**
     * Test case for default XHTML value.
     */
    @Test
    void testDefaultXHTMLValue() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isXHTML(), "Default XHTML value should be false");
    }

    /**
     * Test case for toggling XHTML value.
     */
    @Test
    void testToggleXHTMLValue() {
        OutputFormat format = new OutputFormat();
        format.setXHTML(true);
        assertTrue(format.isXHTML(), "XHTML should be set to true");
        format.setXHTML(false);
        assertFalse(format.isXHTML(), "XHTML should be set to false");
    }

    /**
     * Test case for setting XHTML multiple times.
     */
    @Test
    void testSetXHTMLMultipleTimes() {
        OutputFormat format = new OutputFormat();
        format.setXHTML(true);
        format.setXHTML(true);
        assertTrue(format.isXHTML(), "XHTML should remain true");
        format.setXHTML(false);
        format.setXHTML(false);
        assertFalse(format.isXHTML(), "XHTML should remain false");
    }

    /**
     * Test case for setting XHTML after other properties.
     */
    @Test
    void testSetXHTMLAfterOtherProperties() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(4);
        format.setNewlines(true);
        format.setXHTML(true);
        assertTrue(format.isXHTML(), "XHTML should be set to true");
    }

    /**
     * Test case for setting XHTML before other properties.
     */
    @Test
    void testSetXHTMLBeforeOtherProperties() {
        OutputFormat format = new OutputFormat();
        format.setXHTML(true);
        format.setIndentSize(4);
        format.setNewlines(true);
        assertTrue(format.isXHTML(), "XHTML should remain true");
    }

    /**
     * Test case for setting XHTML with compact format.
     */
    @Test
    void testSetXHTMLWithCompactFormat() {
        OutputFormat format = OutputFormat.createCompactFormat();
        format.setXHTML(true);
        assertTrue(format.isXHTML(), "XHTML should be set to true");
    }

    /**
     * Test case for setting XHTML with pretty print format.
     */
    @Test
    void testSetXHTMLWithPrettyPrintFormat() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setXHTML(true);
        assertTrue(format.isXHTML(), "XHTML should be set to true");
    }

    /**
     * Test case for setting XHTML with null indent.
     */
    @Test
    void testSetXHTMLWithNullIndent() {
        OutputFormat format = new OutputFormat(null);
        format.setXHTML(true);
        assertTrue(format.isXHTML(), "XHTML should be set to true");
    }
}