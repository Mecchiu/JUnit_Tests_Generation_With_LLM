// OutputFormat_3Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setNewlines(boolean)} method.
*/
class OutputFormat_3Test {
    @Test
    void testSetNewlinesTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should be set to true");
    }

    @Test
    void testSetNewlinesFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(false);
        assertFalse(format.isNewlines(), "Newlines should be set to false");
    }

    @Test
    void testDefaultNewlines() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isNewlines(), "Default newlines should be false");
    }

    @Test
    void testSetNewlinesTrueThenFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(true);
        format.setNewlines(false);
        assertFalse(format.isNewlines(), "Newlines should be set to false after being set to true");
    }

    @Test
    void testSetNewlinesFalseThenTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(false);
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should be set to true after being set to false");
    }

    @Test
    void testSetNewlinesMultipleTimes() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(true);
        format.setNewlines(false);
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should be set to true after multiple changes");
    }

    @Test
    void testSetNewlinesWithIndent() {
        OutputFormat format = new OutputFormat("  ", true);
        assertTrue(format.isNewlines(), "Newlines should be true when set in constructor");
    }

    @Test
    void testSetNewlinesWithIndentFalse() {
        OutputFormat format = new OutputFormat("  ", false);
        assertFalse(format.isNewlines(), "Newlines should be false when set in constructor");
    }

    @Test
    void testSetNewlinesWithEncoding() {
        OutputFormat format = new OutputFormat("  ", true, "UTF-8");
        assertTrue(format.isNewlines(), "Newlines should be true when set in constructor with encoding");
    }

    @Test
    void testSetNewlinesWithEncodingFalse() {
        OutputFormat format = new OutputFormat("  ", false, "UTF-8");
        assertFalse(format.isNewlines(), "Newlines should be false when set in constructor with encoding");
    }
}