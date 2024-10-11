package outputformat;
// OutputFormat_3Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setNewlines(boolean)} method.
*/
class OutputFormat_3Test {
    /**
     * Test case for setting newlines to true.
     */
    @Test
    void testSetNewlinesTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should be set to true");
    }

    /**
     * Test case for setting newlines to false.
     */
    @Test
    void testSetNewlinesFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(false);
        assertFalse(format.isNewlines(), "Newlines should be set to false");
    }

    /**
     * Test case for default newlines value.
     */
    @Test
    void testDefaultNewlines() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isNewlines(), "Default newlines should be false");
    }

    /**
     * Test case for setting newlines to true and then false.
     */
    @Test
    void testSetNewlinesTrueThenFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(true);
        format.setNewlines(false);
        assertFalse(format.isNewlines(), "Newlines should be set to false after being set to true");
    }

    /**
     * Test case for setting newlines to false and then true.
     */
    @Test
    void testSetNewlinesFalseThenTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(false);
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should be set to true after being set to false");
    }

    /**
     * Test case for setting newlines multiple times to true.
     */
    @Test
    void testSetNewlinesMultipleTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(true);
        format.setNewlines(true);
        assertTrue(format.isNewlines(), "Newlines should remain true after being set multiple times");
    }

    /**
     * Test case for setting newlines multiple times to false.
     */
    @Test
    void testSetNewlinesMultipleFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewlines(false);
        format.setNewlines(false);
        assertFalse(format.isNewlines(), "Newlines should remain false after being set multiple times");
    }

    /**
     * Test case for setting newlines to true using constructor.
     */
    @Test
    void testConstructorWithNewlinesTrue() {
        OutputFormat format = new OutputFormat(OutputFormat.STANDARD_INDENT, true);
        assertTrue(format.isNewlines(), "Newlines should be true when set via constructor");
    }

    /**
     * Test case for setting newlines to false using constructor.
     */
    @Test
    void testConstructorWithNewlinesFalse() {
        OutputFormat format = new OutputFormat(OutputFormat.STANDARD_INDENT, false);
        assertFalse(format.isNewlines(), "Newlines should be false when set via constructor");
    }

    /**
     * Test case for setting newlines to true using constructor with encoding.
     */
    @Test
    void testConstructorWithNewlinesTrueAndEncoding() {
        OutputFormat format = new OutputFormat(OutputFormat.STANDARD_INDENT, true, "UTF-8");
        assertTrue(format.isNewlines(), "Newlines should be true when set via constructor with encoding");
    }
}