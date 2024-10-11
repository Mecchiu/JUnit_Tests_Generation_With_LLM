package outputformat;
// OutputFormat_0Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#getLineSeparator()} method.
*/
class OutputFormat_0Test {
    /**
     * Test case for default line separator.
     */
    @Test
    void testDefaultLineSeparator() {
        OutputFormat format = new OutputFormat();
        assertEquals("\n", format.getLineSeparator(), "Default line separator should be \\n");
    }

    /**
     * Test case for setting line separator to Windows style.
     */
    @Test
    void testSetLineSeparatorWindows() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("\r\n");
        assertEquals("\r\n", format.getLineSeparator(), "Line separator should be \\r\\n");
    }

    /**
     * Test case for setting line separator to Unix style.
     */
    @Test
    void testSetLineSeparatorUnix() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("\n");
        assertEquals("\n", format.getLineSeparator(), "Line separator should be \\n");
    }

    /**
     * Test case for setting line separator to Mac style.
     */
    @Test
    void testSetLineSeparatorMac() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("\r");
        assertEquals("\r", format.getLineSeparator(), "Line separator should be \\r");
    }

    /**
     * Test case for setting line separator to an empty string.
     */
    @Test
    void testSetLineSeparatorEmpty() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("");
        assertEquals("", format.getLineSeparator(), "Line separator should be empty string");
    }

    /**
     * Test case for setting line separator to a custom string.
     */
    @Test
    void testSetLineSeparatorCustom() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("custom");
        assertEquals("custom", format.getLineSeparator(), "Line separator should be 'custom'");
    }

    /**
     * Test case for setting line separator to a single space.
     */
    @Test
    void testSetLineSeparatorSpace() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator(" ");
        assertEquals(" ", format.getLineSeparator(), "Line separator should be a single space");
    }

    /**
     * Test case for setting line separator to a tab character.
     */
    @Test
    void testSetLineSeparatorTab() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("\t");
        assertEquals("\t", format.getLineSeparator(), "Line separator should be a tab character");
    }

    /**
     * Test case for setting line separator to a multi-character string.
     */
    @Test
    void testSetLineSeparatorMultiChar() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("abc");
        assertEquals("abc", format.getLineSeparator(), "Line separator should be 'abc'");
    }

    /**
     * Test case for setting line separator to a special character string.
     */
    @Test
    void testSetLineSeparatorSpecialChars() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("!@#$%^&*()");
        assertEquals("!@#$%^&*()", format.getLineSeparator(), "Line separator should be '!@#$%^&*()'");
    }
}