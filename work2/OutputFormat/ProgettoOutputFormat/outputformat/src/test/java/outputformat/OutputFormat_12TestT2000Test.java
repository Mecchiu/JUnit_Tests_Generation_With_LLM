package outputformat;
// OutputFormat_12Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isExpandEmptyElements()} method.
*/
class OutputFormat_12Test {
    /**
     * Test case 1: Default value of expandEmptyElements should be false.
     */
    @Test
    void testDefaultExpandEmptyElements() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isExpandEmptyElements(), "Default value of expandEmptyElements should be false.");
    }

    /**
     * Test case 2: Setting expandEmptyElements to true should reflect in the getter.
     */
    @Test
    void testSetExpandEmptyElementsTrue() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should be true after setting it to true.");
    }

    /**
     * Test case 3: Setting expandEmptyElements to false should reflect in the getter.
     */
    @Test
    void testSetExpandEmptyElementsFalse() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        format.setExpandEmptyElements(false);
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should be false after setting it to false.");
    }

    /**
     * Test case 4: Setting expandEmptyElements to true twice should keep it true.
     */
    @Test
    void testSetExpandEmptyElementsTrueTwice() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        format.setExpandEmptyElements(true);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should remain true after setting it to true twice.");
    }

    /**
     * Test case 5: Setting expandEmptyElements to false twice should keep it false.
     */
    @Test
    void testSetExpandEmptyElementsFalseTwice() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(false);
        format.setExpandEmptyElements(false);
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should remain false after setting it to false twice.");
    }

    /**
     * Test case 6: Toggling expandEmptyElements from false to true and back to false.
     */
    @Test
    void testToggleExpandEmptyElements() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should be true after setting it to true.");
        format.setExpandEmptyElements(false);
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should be false after setting it back to false.");
    }

    /**
     * Test case 7: Check expandEmptyElements after using createPrettyPrint.
     */
    @Test
    void testExpandEmptyElementsWithPrettyPrint() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should be false in pretty print format.");
    }

    /**
     * Test case 8: Check expandEmptyElements after using createCompactFormat.
     */
    @Test
    void testExpandEmptyElementsWithCompactFormat() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should be false in compact format.");
    }

    /**
     * Test case 9: Check expandEmptyElements after parsing options with -expandEmpty.
     */
    @Test
    void testExpandEmptyElementsWithParseOptions() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-expandEmpty"};
        format.parseOptions(args, 0);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should be true after parsing -expandEmpty option.");
    }

    /**
     * Test case 10: Check expandEmptyElements after parsing options without -expandEmpty.
     */
    @Test
    void testExpandEmptyElementsWithoutParseOptions() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-indent", "  "};
        format.parseOptions(args, 0);
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should remain false if -expandEmpty is not parsed.");
    }
}