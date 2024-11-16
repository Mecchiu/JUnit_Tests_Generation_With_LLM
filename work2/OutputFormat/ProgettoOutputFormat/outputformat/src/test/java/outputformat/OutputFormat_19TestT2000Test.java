// OutputFormat_19Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setIndent(String)} method.
*/
class OutputFormat_19Test {
    @Test
    void testSetIndentNull() {
        OutputFormat format = new OutputFormat();
        format.setIndent(null);
        assertNull(format.getIndent(), "Indent should be null when set to null");
    }

    @Test
    void testSetIndentEmptyString() {
        OutputFormat format = new OutputFormat();
        format.setIndent("");
        assertNull(format.getIndent(), "Indent should be null when set to an empty string");
    }

    @Test
    void testSetIndentSpaces() {
        OutputFormat format = new OutputFormat();
        format.setIndent("    ");
        assertEquals("    ", format.getIndent(), "Indent should be set to four spaces");
    }

    @Test
    void testSetIndentTabs() {
        OutputFormat format = new OutputFormat();
        format.setIndent("\t");
        assertEquals("\t", format.getIndent(), "Indent should be set to a tab character");
    }

    @Test
    void testSetIndentMixed() {
        OutputFormat format = new OutputFormat();
        format.setIndent(" \t ");
        assertEquals(" \t ", format.getIndent(), "Indent should be set to mixed spaces and tabs");
    }

    @Test
    void testSetIndentNonWhitespace() {
        OutputFormat format = new OutputFormat();
        format.setIndent("abc");
        assertEquals("abc", format.getIndent(), "Indent should be set to non-whitespace characters");
    }

    @Test
    void testSetIndentStandardIndent() {
        OutputFormat format = new OutputFormat();
        format.setIndent(OutputFormat.STANDARD_INDENT);
        assertEquals(OutputFormat.STANDARD_INDENT, format.getIndent(), "Indent should be set to standard indent");
    }

    @Test
    void testSetIndentSizeZero() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(0);
        assertNull(format.getIndent(), "Indent should be null when indent size is zero");
    }

    @Test
    void testSetIndentSizePositive() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(3);
        assertEquals("   ", format.getIndent(), "Indent should be set to three spaces");
    }

    @Test
    void testSetIndentSizeNegative() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(-1);
        assertNull(format.getIndent(), "Indent should be null when indent size is negative");
    }
}