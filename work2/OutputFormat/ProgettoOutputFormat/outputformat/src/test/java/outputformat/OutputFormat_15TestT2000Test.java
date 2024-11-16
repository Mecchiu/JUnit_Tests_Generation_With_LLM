// OutputFormat_15Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setTrimText(boolean)} method.
*/
class OutputFormat_15Test {
    /**
     * Test case for setting trimText to true.
     */
    @Test
    void testSetTrimTextTrue() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "TrimText should be true after setting it to true.");
    }

    /**
     * Test case for setting trimText to false.
     */
    @Test
    void testSetTrimTextFalse() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(false);
        assertFalse(format.isTrimText(), "TrimText should be false after setting it to false.");
    }

    /**
     * Test case for default value of trimText.
     */
    @Test
    void testDefaultTrimText() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isTrimText(), "Default value of TrimText should be false.");
    }

    /**
     * Test case for setting trimText to true and then false.
     */
    @Test
    void testSetTrimTextTrueThenFalse() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        format.setTrimText(false);
        assertFalse(format.isTrimText(), "TrimText should be false after setting it to true and then false.");
    }

    /**
     * Test case for setting trimText to false and then true.
     */
    @Test
    void testSetTrimTextFalseThenTrue() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(false);
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "TrimText should be true after setting it to false and then true.");
    }

    /**
     * Test case for setting trimText multiple times to true.
     */
    @Test
    void testSetTrimTextMultipleTrue() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "TrimText should remain true after setting it multiple times to true.");
    }

    /**
     * Test case for setting trimText multiple times to false.
     */
    @Test
    void testSetTrimTextMultipleFalse() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(false);
        format.setTrimText(false);
        assertFalse(format.isTrimText(), "TrimText should remain false after setting it multiple times to false.");
    }

    /**
     * Test case for setting trimText to true and checking with createPrettyPrint.
     */
    @Test
    void testSetTrimTextTrueWithPrettyPrint() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "TrimText should be true after setting it to true with pretty print format.");
    }

    /**
     * Test case for setting trimText to false and checking with createPrettyPrint.
     */
    @Test
    void testSetTrimTextFalseWithPrettyPrint() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setTrimText(false);
        assertFalse(format.isTrimText(), "TrimText should be false after setting it to false with pretty print format.");
    }

    /**
     * Test case for setting trimText to true and checking with createCompactFormat.
     */
    @Test
    void testSetTrimTextTrueWithCompactFormat() {
        OutputFormat format = OutputFormat.createCompactFormat();
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "TrimText should be true after setting it to true with compact format.");
    }
}