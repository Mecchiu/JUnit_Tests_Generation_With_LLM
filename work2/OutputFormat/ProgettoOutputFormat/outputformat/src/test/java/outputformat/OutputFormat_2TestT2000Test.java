package outputformat;
// OutputFormat_2Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isNewlines()} method.
*/
class OutputFormat_2Test {
    /**
     * Test case for default constructor.
     * It should return false as the default value for newlines is false.
     */
    @Test
    void testIsNewlinesDefault() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isNewlines(), "Default newlines should be false");
    }

    /**
     * Test case for constructor with indent parameter.
     * It should return false as the default value for newlines is false.
     */
    @Test
    void testIsNewlinesWithIndent() {
        OutputFormat format = new OutputFormat("  ");
        assertFalse(format.isNewlines(), "Newlines should be false when only indent is set");
    }

    /**
     * Test case for constructor with indent and newlines parameters.
     * It should return true as the newlines parameter is set to true.
     */
    @Test
    void testIsNewlinesWithIndentAndNewlinesTrue() {
        OutputFormat format = new OutputFormat("  ", true);
        assertTrue(format.isNewlines(), "Newlines should be true when set in constructor");
    }

    /**
     * Test case for constructor with indent and newlines parameters.
     * It should return false as the newlines parameter is set to false.
     */
    @Test
    void testIsNewlinesWithIndentAndNewlinesFalse() {
        OutputFormat format = new OutputFormat("  ", false);
        assertFalse(format.isNewlines(), "Newlines should be false when set in constructor");
    }

    /**
     * Test case for constructor with indent, newlines, and encoding parameters.
     * It should return true as the newlines parameter is set to true.
     */
    @Test
    void testIsNewlinesWithIndentNewlinesTrueAndEncoding() {
        OutputFormat format = new OutputFormat("  ", true, "UTF-8");
        assertTrue(format.isNewlines(), "Newlines should be true when set in constructor with encoding");
    }

    /**
     * Test case for constructor with indent, newlines, and encoding parameters.
     * It should return false as the newlines parameter is set to false.
     */
    @Test
    void testIsNewlinesWithIndentNewlinesFalseAndEncoding() {
        OutputFormat format = new OutputFormat("  ", false, "UTF-8");
        assertFalse(format.isNewlines(), "Newlines should be false when set in constructor with encoding");
    }

    /**
     * Test case for setNewlines method.
     * It should return true after setting newlines to true.
     */
    @Test
    void testSetNewlinesTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should be true after setting to true");
    }

    /**
     * Test case for setNewlines method.
     * It should return false after setting newlines to false.
     */
    @Test
    void testSetNewlinesFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(false);
        assertFalse(format.isNewlines(), "Newlines should be false after setting to false");
    }

    /**
     * Test case for createPrettyPrint method.
     * It should return true as the pretty print format has newlines enabled.
     */
    @Test
    void testCreatePrettyPrint() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertTrue(format.isNewlines(), "Pretty print format should have newlines enabled");
    }

    /**
     * Test case for createCompactFormat method.
     * It should return false as the compact format has newlines disabled.
     */
    @Test
    void testCreateCompactFormat() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isNewlines(), "Compact format should have newlines disabled");
    }
}