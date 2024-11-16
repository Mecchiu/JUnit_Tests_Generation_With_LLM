// OutputFormat_30Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#createCompactFormat()} method.
*/
class OutputFormat_30Test {
    @Test
    void testCreateCompactFormat_defaultIndent() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertNull(format.getIndent(), "Indent should be null for compact format");
    }

    @Test
    void testCreateCompactFormat_noNewlines() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isNewlines(), "Newlines should be false for compact format");
    }

    @Test
    void testCreateCompactFormat_trimText() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertTrue(format.isTrimText(), "TrimText should be true for compact format");
    }

    @Test
    void testCreateCompactFormat_padText() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isPadText(), "PadText should be false for compact format");
    }

    @Test
    void testCreateCompactFormat_defaultEncoding() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertEquals("UTF-8", format.getEncoding(), "Default encoding should be UTF-8");
    }

    @Test
    void testCreateCompactFormat_omitEncoding() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isOmitEncoding(), "OmitEncoding should be false for compact format");
    }

    @Test
    void testCreateCompactFormat_suppressDeclaration() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isSuppressDeclaration(), "SuppressDeclaration should be false for compact format");
    }

    @Test
    void testCreateCompactFormat_expandEmptyElements() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isExpandEmptyElements(), "ExpandEmptyElements should be false for compact format");
    }

    @Test
    void testCreateCompactFormat_defaultLineSeparator() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertEquals("\n", format.getLineSeparator(), "Default line separator should be \\n");
    }

    @Test
    void testCreateCompactFormat_defaultAttributeQuoteCharacter() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertEquals('"', format.getAttributeQuoteCharacter(), "Default attribute quote character should be \"");
    }
}
