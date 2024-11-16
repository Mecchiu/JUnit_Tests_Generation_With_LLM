// OutputFormat_16Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isPadText()} method.
*/
class OutputFormat_16Test {
    /**
     * Test case 1: Default value of padText should be false.
     */
    @Test
    void testDefaultPadText() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isPadText(), "Default padText should be false");
    }

    /**
     * Test case 2: Set padText to true and verify.
     */
    @Test
    void testSetPadTextTrue() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        assertTrue(format.isPadText(), "padText should be true after setting it to true");
    }

    /**
     * Test case 3: Set padText to false and verify.
     */
    @Test
    void testSetPadTextFalse() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true); // First set to true
        format.setPadText(false); // Then set to false
        assertFalse(format.isPadText(), "padText should be false after setting it to false");
    }

    /**
     * Test case 4: Verify padText remains false when set to false multiple times.
     */
    @Test
    void testMultipleSetPadTextFalse() {
        OutputFormat format = new OutputFormat();
        format.setPadText(false);
        format.setPadText(false);
        assertFalse(format.isPadText(), "padText should remain false after setting it to false multiple times");
    }

    /**
     * Test case 5: Verify padText remains true when set to true multiple times.
     */
    @Test
    void testMultipleSetPadTextTrue() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        format.setPadText(true);
        assertTrue(format.isPadText(), "padText should remain true after setting it to true multiple times");
    }

    /**
     * Test case 6: Verify padText is false after toggling from true to false.
     */
    @Test
    void testTogglePadTextTrueToFalse() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        format.setPadText(false);
        assertFalse(format.isPadText(), "padText should be false after toggling from true to false");
    }

    /**
     * Test case 7: Verify padText is true after toggling from false to true.
     */
    @Test
    void testTogglePadTextFalseToTrue() {
        OutputFormat format = new OutputFormat();
        format.setPadText(false);
        format.setPadText(true);
        assertTrue(format.isPadText(), "padText should be true after toggling from false to true");
    }

    /**
     * Test case 8: Verify padText is false after setting it to false, true, and then false again.
     */
    @Test
    void testSetPadTextFalseTrueFalse() {
        OutputFormat format = new OutputFormat();
        format.setPadText(false);
        format.setPadText(true);
        format.setPadText(false);
        assertFalse(format.isPadText(), "padText should be false after setting it to false, true, and then false again");
    }

    /**
     * Test case 9: Verify padText is true after setting it to true, false, and then true again.
     */
    @Test
    void testSetPadTextTrueFalseTrue() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        format.setPadText(false);
        format.setPadText(true);
        assertTrue(format.isPadText(), "padText should be true after setting it to true, false, and then true again");
    }

    /**
     * Test case 10: Verify padText is false after setting it to false, false, and then false again.
     */
    @Test
    void testSetPadTextFalseFalseFalse() {
        OutputFormat format = new OutputFormat();
        format.setPadText(false);
        format.setPadText(false);
        format.setPadText(false);
        assertFalse(format.isPadText(), "padText should be false after setting it to false, false, and then false again");
    }
}