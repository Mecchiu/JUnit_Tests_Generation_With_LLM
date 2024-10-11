package outputformat;
// OutputFormat_14Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isTrimText()} method.
*/
class OutputFormat_14Test {
    /**
     * Test case 1: Default value of trimText should be false.
     */
    @Test
    void testDefaultTrimText() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isTrimText(), "Default trimText should be false");
    }

    /**
     * Test case 2: Set trimText to true and verify.
     */
    @Test
    void testSetTrimTextTrue() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "trimText should be true after setting it to true");
    }

    /**
     * Test case 3: Set trimText to false and verify.
     */
    @Test
    void testSetTrimTextFalse() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true); // First set to true
        format.setTrimText(false); // Then set to false
        assertFalse(format.isTrimText(), "trimText should be false after setting it to false");
    }

    /**
     * Test case 4: Verify trimText remains false when set to false multiple times.
     */
    @Test
    void testMultipleSetTrimTextFalse() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(false);
        format.setTrimText(false);
        assertFalse(format.isTrimText(), "trimText should remain false after setting it to false multiple times");
    }

    /**
     * Test case 5: Verify trimText remains true when set to true multiple times.
     */
    @Test
    void testMultipleSetTrimTextTrue() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "trimText should remain true after setting it to true multiple times");
    }

    /**
     * Test case 6: Verify trimText toggles correctly from false to true.
     */
    @Test
    void testToggleTrimTextFalseToTrue() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(false);
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "trimText should be true after toggling from false to true");
    }

    /**
     * Test case 7: Verify trimText toggles correctly from true to false.
     */
    @Test
    void testToggleTrimTextTrueToFalse() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        format.setTrimText(false);
        assertFalse(format.isTrimText(), "trimText should be false after toggling from true to false");
    }

    /**
     * Test case 8: Verify trimText is false when initialized with default constructor.
     */
    @Test
    void testTrimTextDefaultConstructor() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isTrimText(), "trimText should be false when initialized with default constructor");
    }

    /**
     * Test case 9: Verify trimText is false when initialized with indent constructor.
     */
    @Test
    void testTrimTextIndentConstructor() {
        OutputFormat format = new OutputFormat("  ");
        assertFalse(format.isTrimText(), "trimText should be false when initialized with indent constructor");
    }

    /**
     * Test case 10: Verify trimText is false when initialized with indent and newlines constructor.
     */
    @Test
    void testTrimTextIndentNewlinesConstructor() {
        OutputFormat format = new OutputFormat("  ", true);
        assertFalse(format.isTrimText(), "trimText should be false when initialized with indent and newlines constructor");
    }
}