package outputformat;
// OutputFormat_15Test.java



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
        assertTrue(format.isTrimText(), "Trim text should be true");
    }

    /**
     * Test case for setting trimText to false.
     */
    @Test
    void testSetTrimTextFalse() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(false);
        assertFalse(format.isTrimText(), "Trim text should be false");
    }

    /**
     * Test case for default trimText value.
     */
    @Test
    void testDefaultTrimText() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isTrimText(), "Default trim text should be false");
    }

    /**
     * Test case for setting trimText to true and then false.
     */
    @Test
    void testSetTrimTextTrueThenFalse() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        format.setTrimText(false);
        assertFalse(format.isTrimText(), "Trim text should be false after setting to false");
    }

    /**
     * Test case for setting trimText to false and then true.
     */
    @Test
    void testSetTrimTextFalseThenTrue() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(false);
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "Trim text should be true after setting to true");
    }

    /**
     * Test case for setting trimText multiple times to true.
     */
    @Test
    void testSetTrimTextMultipleTrue() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "Trim text should remain true");
    }

    /**
     * Test case for setting trimText multiple times to false.
     */
    @Test
    void testSetTrimTextMultipleFalse() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(false);
        format.setTrimText(false);
        assertFalse(format.isTrimText(), "Trim text should remain false");
    }

    /**
     * Test case for setting trimText to true and checking other properties.
     */
    @Test
    void testSetTrimTextTrueCheckOthers() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "Trim text should be true");
        assertFalse(format.isPadText(), "Pad text should be false by default");
        assertFalse(format.isNewlines(), "Newlines should be false by default");
    }

    /**
     * Test case for setting trimText to false and checking other properties.
     */
    @Test
    void testSetTrimTextFalseCheckOthers() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(false);
        assertFalse(format.isTrimText(), "Trim text should be false");
        assertFalse(format.isPadText(), "Pad text should be false by default");
        assertFalse(format.isNewlines(), "Newlines should be false by default");
    }

    /**
     * Test case for setting trimText to true and using createPrettyPrint.
     */
    @Test
    void testSetTrimTextTrueWithPrettyPrint() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "Trim text should be true");
        assertTrue(format.isPadText(), "Pad text should be true in pretty print");
        assertTrue(format.isNewlines(), "Newlines should be true in pretty print");
    }
}