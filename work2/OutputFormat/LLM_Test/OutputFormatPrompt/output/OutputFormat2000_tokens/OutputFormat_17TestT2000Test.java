package outputformat;
// OutputFormat_17Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setPadText(boolean)} method.
*/
class OutputFormat_17Test {
    /**
     * Test case 1: Test setting padText to true.
     */
    @Test
    void testSetPadTextTrue() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        assertTrue(format.isPadText(), "PadText should be true after setting it to true.");
    }

    /**
     * Test case 2: Test setting padText to false.
     */
    @Test
    void testSetPadTextFalse() {
        OutputFormat format = new OutputFormat();
        format.setPadText(false);
        assertFalse(format.isPadText(), "PadText should be false after setting it to false.");
    }

    /**
     * Test case 3: Test default value of padText.
     */
    @Test
    void testDefaultPadText() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isPadText(), "Default value of PadText should be false.");
    }

    /**
     * Test case 4: Test toggling padText from false to true.
     */
    @Test
    void testTogglePadTextFalseToTrue() {
        OutputFormat format = new OutputFormat();
        format.setPadText(false);
        format.setPadText(true);
        assertTrue(format.isPadText(), "PadText should be true after toggling from false to true.");
    }

    /**
     * Test case 5: Test toggling padText from true to false.
     */
    @Test
    void testTogglePadTextTrueToFalse() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        format.setPadText(false);
        assertFalse(format.isPadText(), "PadText should be false after toggling from true to false.");
    }

    /**
     * Test case 6: Test setting padText multiple times to true.
     */
    @Test
    void testSetPadTextMultipleTrue() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        format.setPadText(true);
        assertTrue(format.isPadText(), "PadText should remain true after setting it multiple times to true.");
    }

    /**
     * Test case 7: Test setting padText multiple times to false.
     */
    @Test
    void testSetPadTextMultipleFalse() {
        OutputFormat format = new OutputFormat();
        format.setPadText(false);
        format.setPadText(false);
        assertFalse(format.isPadText(), "PadText should remain false after setting it multiple times to false.");
    }

    /**
     * Test case 8: Test setting padText to true after default.
     */
    @Test
    void testSetPadTextTrueAfterDefault() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        assertTrue(format.isPadText(), "PadText should be true after setting it to true from default.");
    }

    /**
     * Test case 9: Test setting padText to false after default.
     */
    @Test
    void testSetPadTextFalseAfterDefault() {
        OutputFormat format = new OutputFormat();
        format.setPadText(false);
        assertFalse(format.isPadText(), "PadText should be false after setting it to false from default.");
    }

    /**
     * Test case 10: Test setting padText to true and then false.
     */
    @Test
    void testSetPadTextTrueThenFalse() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        format.setPadText(false);
        assertFalse(format.isPadText(), "PadText should be false after setting it to true and then false.");
    }
}