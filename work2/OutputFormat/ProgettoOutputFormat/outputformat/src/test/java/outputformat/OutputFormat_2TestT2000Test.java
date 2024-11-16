// OutputFormat_2Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isNewlines()} method.
*/
class OutputFormat_2Test {
    @Test
    void testDefaultNewlines() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isNewlines(), "Default newlines should be false");
    }

    @Test
    void testSetNewlinesTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should be true after setting to true");
    }

    @Test
    void testSetNewlinesFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(true);
        format.setNewlines(false);
        assertFalse(format.isNewlines(), "Newlines should be false after setting to false");
    }

    @Test
    void testNewlinesWithIndent() {
        OutputFormat format = new OutputFormat("  ", true);
        assertTrue(format.isNewlines(), "Newlines should be true when initialized with newlines true");
    }

    @Test
    void testNewlinesWithoutIndent() {
        OutputFormat format = new OutputFormat(null, false);
        assertFalse(format.isNewlines(), "Newlines should be false when initialized with newlines false");
    }

    @Test
    void testNewlinesWithEncoding() {
        OutputFormat format = new OutputFormat("  ", true, "UTF-8");
        assertTrue(format.isNewlines(), "Newlines should be true when initialized with newlines true and encoding");
    }

    @Test
    void testNewlinesAfterSettingIndent() {
        OutputFormat format = new OutputFormat();
        format.setIndent("  ");
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should be true after setting indent and newlines");
    }

    @Test
    void testNewlinesAfterSettingEncoding() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("UTF-8");
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should be true after setting encoding and newlines");
    }

    @Test
    void testNewlinesAfterSettingLineSeparator() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("\r\n");
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should be true after setting line separator and newlines");
    }

    @Test
    void testNewlinesAfterSettingTrimText() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should be true after setting trim text and newlines");
    }
}