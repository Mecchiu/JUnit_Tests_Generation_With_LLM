// OutputFormat_12Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isExpandEmptyElements()} method.
*/
class OutputFormat_12Test {
```java
    /**
     * Test case 1: Default value of expandEmptyElements should be false.
     */
    @Test
    void testDefaultExpandEmptyElements() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isExpandEmptyElements(), "Default value of expandEmptyElements should be false.");
    }

    /**
     * Test case 2: Set expandEmptyElements to true and verify.
     */
    @Test
    void testSetExpandEmptyElementsTrue() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should be true after setting it to true.");
    }

    /**
     * Test case 3: Set expandEmptyElements to false and verify.
     */
    @Test
    void testSetExpandEmptyElementsFalse() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        format.setExpandEmptyElements(false);
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should be false after setting it to false.");
    }

    /**
     * Test case 4: Verify expandEmptyElements remains false after multiple false settings.
     */
    @Test
    void testMultipleFalseSettings() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(false);
        format.setExpandEmptyElements(false);
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should remain false after multiple false settings.");
    }

    /**
     * Test case 5: Verify expandEmptyElements remains true after multiple true settings.
     */
    @Test
    void testMultipleTrueSettings() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        format.setExpandEmptyElements(true);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should remain true after multiple true settings.");
    }

    /**
     * Test case 6: Verify expandEmptyElements toggles correctly.
     */
    @Test
    void testToggleExpandEmptyElements() {
        OutputFormat format = new OutputFormat();
        format.setExpandEmptyElements(true);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should be true after setting it to true.");
        format.setExpandEmptyElements(false);
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should be false after setting it to false.");
    }

    /**
     * Test case 7: Verify expandEmptyElements with createPrettyPrint.
     */
    @Test
    void testCreatePrettyPrint() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should be false in pretty print format.");
    }

    /**
     * Test case 8: Verify expandEmptyElements with createCompactFormat.
     */
    @Test
    void testCreateCompactFormat() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should be false in compact format.");
    }

    /**
     * Test case 9: Verify expandEmptyElements after parsing options.
     */
    @Test
    void testParseOptionsExpandEmptyElements() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-expandEmpty"};
        format.parseOptions(args, 0);
        assertTrue(format.isExpandEmptyElements(), "expandEmptyElements should be true after parsing -expandEmpty option.");
    }

    /**
     * Test case 10: Verify expandEmptyElements remains false if not set.
     */
    @Test
    void testExpandEmptyElementsNotSet() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isExpandEmptyElements(), "expandEmptyElements should remain false if not explicitly set.");
    }
}
```