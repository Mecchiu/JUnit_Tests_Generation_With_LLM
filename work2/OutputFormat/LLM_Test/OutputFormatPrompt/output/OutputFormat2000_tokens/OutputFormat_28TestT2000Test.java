package outputformat;
// OutputFormat_28Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#parseOptions(String[], int)} method.
*/
class OutputFormat_28Test {
    @Test
    void testParseOptionsSuppressDeclaration() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-suppressDeclaration"};
        int index = format.parseOptions(args, 0);
        assertTrue(format.isSuppressDeclaration());
        assertEquals(1, index);
    }

    @Test
    void testParseOptionsOmitEncoding() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-omitEncoding"};
        int index = format.parseOptions(args, 0);
        assertTrue(format.isOmitEncoding());
        assertEquals(1, index);
    }

    @Test
    void testParseOptionsIndent() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-indent", "    "};
        int index = format.parseOptions(args, 0);
        assertEquals("    ", format.getIndent());
        assertEquals(2, index);
    }

    @Test
    void testParseOptionsIndentSize() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-indentSize", "4"};
        int index = format.parseOptions(args, 0);
        assertEquals("    ", format.getIndent());
        assertEquals(2, index);
    }

    @Test
    void testParseOptionsExpandEmptyElements() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-expandEmpty"};
        int index = format.parseOptions(args, 0);
        assertTrue(format.isExpandEmptyElements());
        assertEquals(1, index);
    }

    @Test
    void testParseOptionsEncoding() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-encoding", "ISO-8859-1"};
        int index = format.parseOptions(args, 0);
        assertEquals("ISO-8859-1", format.getEncoding());
        assertEquals(2, index);
    }

    @Test
    void testParseOptionsNewlines() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-newlines"};
        int index = format.parseOptions(args, 0);
        assertTrue(format.isNewlines());
        assertEquals(1, index);
    }

    @Test
    void testParseOptionsLineSeparator() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-lineSeparator", "\r\n"};
        int index = format.parseOptions(args, 0);
        assertEquals("\r\n", format.getLineSeparator());
        assertEquals(2, index);
    }

    @Test
    void testParseOptionsTrimText() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-trimText"};
        int index = format.parseOptions(args, 0);
        assertTrue(format.isTrimText());
        assertEquals(1, index);
    }

    @Test
    void testParseOptionsPadText() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-padText"};
        int index = format.parseOptions(args, 0);
        assertTrue(format.isPadText());
        assertEquals(1, index);
    }

    @Test
    void testParseOptionsXHTML() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-xhtml"};
        int index = format.parseOptions(args, 0);
        assertTrue(format.isXHTML());
        assertEquals(1, index);
    }

    @Test
    void testParseOptionsUnknownOption() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-unknownOption"};
        int index = format.parseOptions(args, 0);
        assertEquals(0, index);
    }
}