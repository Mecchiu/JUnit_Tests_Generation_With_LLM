package outputformat;
// OutputFormat_13Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setExpandEmptyElements(boolean)} method.
*/
class OutputFormat_13Test {
    /**
     * Test case 1: Test setting expandEmptyElements to true.
     */
    @Test
    void testSetExpandEmptyElementsTrue() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should be true");
    }

    /**
     * Test case 2: Test setting expandEmptyElements to false.
     */
    @Test
    void testSetExpandEmptyElementsFalse() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(false);
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should be false");
    }

    /**
     * Test case 3: Test default value of expandEmptyElements.
     */
    @Test
    void testDefaultExpandEmptyElements() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isExpandEmptyElements(), "Default expandEmptyElements should be false");
    }

    /**
     * Test case 4: Test setting expandEmptyElements to true and then false.
     */
    @Test
    void testSetExpandEmptyElementsTrueThenFalse() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        format.setExpandEmptyElements(false);
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should be false after setting to true then false");
    }

    /**
     * Test case 5: Test setting expandEmptyElements to false and then true.
     */
    @Test
    void testSetExpandEmptyElementsFalseThenTrue() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(false);
        format.setExpandEmptyElements(true);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should be true after setting to false then true");
    }

    /**
     * Test case 6: Test setting expandEmptyElements multiple times to true.
     */
    @Test
    void testSetExpandEmptyElementsMultipleTrue() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        format.setExpandEmptyElements(true);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should remain true after multiple true settings");
    }

    /**
     * Test case 7: Test setting expandEmptyElements multiple times to false.
     */
    @Test
    void testSetExpandEmptyElementsMultipleFalse() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(false);
        format.setExpandEmptyElements(false);
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should remain false after multiple false settings");
    }

    /**
     * Test case 8: Test setting expandEmptyElements to true, false, true.
     */
    @Test
    void testSetExpandEmptyElementsTrueFalseTrue() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        format.setExpandEmptyElements(false);
        format.setExpandEmptyElements(true);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should be true after setting to true, false, true");
    }

    /**
     * Test case 9: Test setting expandEmptyElements to false, true, false.
     */
    @Test
    void testSetExpandEmptyElementsFalseTrueFalse() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(false);
        format.setExpandEmptyElements(true);
        format.setExpandEmptyElements(false);
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should be false after setting to false, true, false");
    }

    /**
     * Test case 10: Test setting expandEmptyElements to true and checking with a new instance.
     */
    @Test
    void testSetExpandEmptyElementsTrueNewInstance() {
        OutputFormat format1 = new OutputFormat();
        format1.setExpandEmptyElements(true);
        OutputFormat format2 = new OutputFormat();
        assertFalse(format2.isExpandEmptyElements(), "expandEmptyElements should be false in a new instance");
    }
}