package outputformat;
// OutputFormat_24Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#getNewLineAfterNTags()} method.
*/
class OutputFormat_24Test {
    /**
     * Test case for default value of newLineAfterNTags.
     */
    @Test
    void testDefaultNewLineAfterNTags() {
        OutputFormat format = new OutputFormat();
        assertEquals(0, format.getNewLineAfterNTags(), "Default value of newLineAfterNTags should be 0");
    }

    /**
     * Test case for setting newLineAfterNTags to a positive value.
     */
    @Test
    void testSetNewLineAfterNTagsPositive() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(5);
        assertEquals(5, format.getNewLineAfterNTags(), "newLineAfterNTags should be set to 5");
    }

    /**
     * Test case for setting newLineAfterNTags to zero.
     */
    @Test
    void testSetNewLineAfterNTagsZero() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(0);
        assertEquals(0, format.getNewLineAfterNTags(), "newLineAfterNTags should be set to 0");
    }

    /**
     * Test case for setting newLineAfterNTags to a negative value.
     * This should be handled gracefully, assuming the implementation allows it.
     */
    @Test
    void testSetNewLineAfterNTagsNegative() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(-1);
        assertEquals(-1, format.getNewLineAfterNTags(), "newLineAfterNTags should be set to -1");
    }

    /**
     * Test case for setting newLineAfterNTags multiple times.
     */
    @Test
    void testSetNewLineAfterNTagsMultipleTimes() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(3);
        assertEquals(3, format.getNewLineAfterNTags(), "newLineAfterNTags should be set to 3");
        format.setNewLineAfterNTags(7);
        assertEquals(7, format.getNewLineAfterNTags(), "newLineAfterNTags should be updated to 7");
    }

    /**
     * Test case for setting newLineAfterNTags to a large value.
     */
    @Test
    void testSetNewLineAfterNTagsLargeValue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(1000);
        assertEquals(1000, format.getNewLineAfterNTags(), "newLineAfterNTags should be set to 1000");
    }

    /**
     * Test case for setting newLineAfterNTags to a small positive value.
     */
    @Test
    void testSetNewLineAfterNTagsSmallPositive() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(1);
        assertEquals(1, format.getNewLineAfterNTags(), "newLineAfterNTags should be set to 1");
    }

    /**
     * Test case for setting newLineAfterNTags to a very large value.
     */
    @Test
    void testSetNewLineAfterNTagsVeryLargeValue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, format.getNewLineAfterNTags(), "newLineAfterNTags should be set to Integer.MAX_VALUE");
    }

    /**
     * Test case for setting newLineAfterNTags to a very small negative value.
     */
    @Test
    void testSetNewLineAfterNTagsVerySmallNegative() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, format.getNewLineAfterNTags(), "newLineAfterNTags should be set to Integer.MIN_VALUE");
    }

    /**
     * Test case for setting newLineAfterNTags to a typical value.
     */
    @Test
    void testSetNewLineAfterNTagsTypicalValue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(10);
        assertEquals(10, format.getNewLineAfterNTags(), "newLineAfterNTags should be set to 10");
    }
}