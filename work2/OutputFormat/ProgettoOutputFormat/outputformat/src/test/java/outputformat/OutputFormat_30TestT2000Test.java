package outputformat;
// OutputFormat_30Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#createCompactFormat()} method.
*/
class OutputFormat_30Test {
    /**
     * Test case for verifying the default settings of the compact format.
     */
    @Test
    void testCreateCompactFormatDefaults() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertNull(format.getIndent(), "Indent should be null for compact format");
        assertFalse(format.isNewlines(), "Newlines should be false for compact format");
        assertTrue(format.isTrimText(), "TrimText should be true for compact format");
    }

    /**
     * Test case for ensuring the compact format does not use XHTML.
     */
    @Test
    void testCreateCompactFormatXHTML() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isXHTML(), "XHTML should be false for compact format");
    }

    /**
     * Test case for ensuring the compact format does not pad text.
     */
    @Test
    void testCreateCompactFormatPadText() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isPadText(), "PadText should be false for compact format");
    }

    /**
     * Test case for ensuring the compact format does not expand empty elements.
     */
    @Test
    void testCreateCompactFormatExpandEmptyElements() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isExpandEmptyElements(), "ExpandEmptyElements should be false for compact format");
    }

    /**
     * Test case for ensuring the compact format uses the default encoding.
     */
    @Test
    void testCreateCompactFormatEncoding() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertEquals("UTF-8", format.getEncoding(), "Encoding should be UTF-8 for compact format");
    }

    /**
     * Test case for ensuring the compact format does not suppress the XML declaration.
     */
    @Test
    void testCreateCompactFormatSuppressDeclaration() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isSuppressDeclaration(), "SuppressDeclaration should be false for compact format");
    }

    /**
     * Test case for ensuring the compact format does not omit encoding in the XML declaration.
     */
    @Test
    void testCreateCompactFormatOmitEncoding() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isOmitEncoding(), "OmitEncoding should be false for compact format");
    }

    /**
     * Test case for ensuring the compact format uses the default line separator.
     */
    @Test
    void testCreateCompactFormatLineSeparator() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertEquals("\n", format.getLineSeparator(), "LineSeparator should be \\n for compact format");
    }

    /**
     * Test case for ensuring the compact format uses the default attribute quote character.
     */
    @Test
    void testCreateCompactFormatAttributeQuoteCharacter() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertEquals('"', format.getAttributeQuoteCharacter(), "AttributeQuoteCharacter should be \" for compact format");
    }

    /**
     * Test case for ensuring the compact format does not set newLineAfterNTags.
     */
    @Test
    void testCreateCompactFormatNewLineAfterNTags() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertEquals(0, format.getNewLineAfterNTags(), "NewLineAfterNTags should be 0 for compact format");
    }
}