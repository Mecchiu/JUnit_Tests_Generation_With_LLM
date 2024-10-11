package outputformat;
// OutputFormat_29Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#createPrettyPrint()} method.
*/
class OutputFormat_29Test {
    @Test
    void testCreatePrettyPrintIndentSize() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertEquals("  ", format.getIndent(), "Indent size should be 2 spaces");
    }

    @Test
    void testCreatePrettyPrintNewlines() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertTrue(format.isNewlines(), "Newlines should be enabled");
    }

    @Test
    void testCreatePrettyPrintTrimText() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertTrue(format.isTrimText(), "Trim text should be enabled");
    }

    @Test
    void testCreatePrettyPrintPadText() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertTrue(format.isPadText(), "Pad text should be enabled");
    }

    @Test
    void testCreatePrettyPrintXHTML() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isXHTML(), "XHTML should be disabled");
    }

    @Test
    void testCreatePrettyPrintOmitEncoding() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isOmitEncoding(), "Omit encoding should be disabled");
    }

    @Test
    void testCreatePrettyPrintSuppressDeclaration() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isSuppressDeclaration(), "Suppress declaration should be disabled");
    }

    @Test
    void testCreatePrettyPrintExpandEmptyElements() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isExpandEmptyElements(), "Expand empty elements should be disabled");
    }

    @Test
    void testCreatePrettyPrintLineSeparator() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertEquals("\n", format.getLineSeparator(), "Line separator should be newline");
    }

    @Test
    void testCreatePrettyPrintAttributeQuoteCharacter() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertEquals('"', format.getAttributeQuoteCharacter(), "Attribute quote character should be double quote");
    }
}