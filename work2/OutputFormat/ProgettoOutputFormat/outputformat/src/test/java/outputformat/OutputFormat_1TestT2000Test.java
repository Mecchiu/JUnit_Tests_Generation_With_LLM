package outputformat;
// OutputFormat_1Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setLineSeparator(String)} method.
*/
class OutputFormat_1Test {
    @Test
    void testSetLineSeparatorWithNull() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator(null);
        assertNull(format.getLineSeparator());
    }

    @Test
    void testSetLineSeparatorWithEmptyString() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("");
        assertEquals("", format.getLineSeparator());
    }

    @Test
    void testSetLineSeparatorWithNewLine() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("\n");
        assertEquals("\n", format.getLineSeparator());
    }

    @Test
    void testSetLineSeparatorWithCarriageReturn() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("\r");
        assertEquals("\r", format.getLineSeparator());
    }

    @Test
    void testSetLineSeparatorWithCarriageReturnNewLine() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("\r\n");
        assertEquals("\r\n", format.getLineSeparator());
    }

    @Test
    void testSetLineSeparatorWithCustomSeparator() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("custom-separator");
        assertEquals("custom-separator", format.getLineSeparator());
    }

    @Test
    void testSetLineSeparatorWithWhitespace() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator(" ");
        assertEquals(" ", format.getLineSeparator());
    }

    @Test
    void testSetLineSeparatorWithTab() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("\t");
        assertEquals("\t", format.getLineSeparator());
    }

    @Test
    void testSetLineSeparatorWithMultipleCharacters() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("abc");
        assertEquals("abc", format.getLineSeparator());
    }

    @Test
    void testSetLineSeparatorWithSystemLineSeparator() {
        OutputFormat format = new OutputFormat();
        String systemLineSeparator = System.getProperty("line.separator");
        format.setLineSeparator(systemLineSeparator);
        assertEquals(systemLineSeparator, format.getLineSeparator());
    }
}