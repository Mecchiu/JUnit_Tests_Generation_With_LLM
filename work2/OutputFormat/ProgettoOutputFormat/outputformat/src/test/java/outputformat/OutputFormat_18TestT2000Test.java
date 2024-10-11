package outputformat;
// OutputFormat_18Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#getIndent()} method.
*/
class OutputFormat_18Test {
    /**
     * Test case for default constructor.
     * It should return null as the default indent is no spaces.
     */
    @Test
    void testGetIndentDefault() {
        OutputFormat format = new OutputFormat();
        assertNull(format.getIndent(), "Default indent should be null");
    }

    /**
     * Test case for constructor with indent parameter.
     * It should return the same indent string that was set.
     */
    @Test
    void testGetIndentWithParameter() {
        String indent = "    "; // 4 spaces
        OutputFormat format = new OutputFormat(indent);
        assertEquals(indent, format.getIndent(), "Indent should match the one set in constructor");
    }

    /**
     * Test case for constructor with indent and newlines parameters.
     * It should return the same indent string that was set.
     */
    @Test
    void testGetIndentWithIndentAndNewlines() {
        String indent = "\t"; // tab character
        OutputFormat format = new OutputFormat(indent, true);
        assertEquals(indent, format.getIndent(), "Indent should match the one set in constructor");
    }

    /**
     * Test case for constructor with indent, newlines, and encoding parameters.
     * It should return the same indent string that was set.
     */
    @Test
    void testGetIndentWithAllParameters() {
        String indent = "  "; // 2 spaces
        OutputFormat format = new OutputFormat(indent, true, "UTF-8");
        assertEquals(indent, format.getIndent(), "Indent should match the one set in constructor");
    }

    /**
     * Test case for setIndent method with a non-empty string.
     * It should return the same indent string that was set.
     */
    @Test
    void testSetIndentNonEmpty() {
        OutputFormat format = new OutputFormat();
        String indent = "  "; // 2 spaces
        format.setIndent(indent);
        assertEquals(indent, format.getIndent(), "Indent should match the one set by setIndent");
    }

    /**
     * Test case for setIndent method with an empty string.
     * It should return null as the indent.
     */
    @Test
    void testSetIndentEmpty() {
        OutputFormat format = new OutputFormat();
        format.setIndent("");
        assertNull(format.getIndent(), "Indent should be null when set to an empty string");
    }

    /**
     * Test case for setIndent method with null.
     * It should return null as the indent.
     */
    @Test
    void testSetIndentNull() {
        OutputFormat format = new OutputFormat();
        format.setIndent(null);
        assertNull(format.getIndent(), "Indent should be null when set to null");
    }

    /**
     * Test case for setIndentSize method.
     * It should return an indent string with the specified number of spaces.
     */
    @Test
    void testSetIndentSize() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(3);
        assertEquals("   ", format.getIndent(), "Indent should be 3 spaces");
    }

    /**
     * Test case for setIndent method after using setIndentSize.
     * It should override the indent set by setIndentSize.
     */
    @Test
    void testSetIndentAfterIndentSize() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(4);
        format.setIndent("  "); // 2 spaces
        assertEquals("  ", format.getIndent(), "Indent should be overridden to 2 spaces");
    }

    /**
     * Test case for setIndentSize method after using setIndent.
     * It should override the indent set by setIndent.
     */
    @Test
    void testSetIndentSizeAfterIndent() {
        OutputFormat format = new OutputFormat();
        format.setIndent("  "); // 2 spaces
        format.setIndentSize(5);
        assertEquals("     ", format.getIndent(), "Indent should be overridden to 5 spaces");
    }
}