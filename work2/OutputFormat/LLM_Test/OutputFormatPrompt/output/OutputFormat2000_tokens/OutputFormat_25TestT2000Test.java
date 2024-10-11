package outputformat;
// OutputFormat_25Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setNewLineAfterNTags(int)} method.
*/
class OutputFormat_25Test {
    @Test
    void testSetNewLineAfterNTagsZero() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(0);
        assertEquals(0, format.getNewLineAfterNTags(), "NewLineAfterNTags should be 0");
    }

    @Test
    void testSetNewLineAfterNTagsPositive() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(5);
        assertEquals(5, format.getNewLineAfterNTags(), "NewLineAfterNTags should be 5");
    }

    @Test
    void testSetNewLineAfterNTagsNegative() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(-1);
        assertEquals(-1, format.getNewLineAfterNTags(), "NewLineAfterNTags should be -1");
    }

    @Test
    void testSetNewLineAfterNTagsLargeNumber() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(1000);
        assertEquals(1000, format.getNewLineAfterNTags(), "NewLineAfterNTags should be 1000");
    }

    @Test
    void testSetNewLineAfterNTagsChangeValue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(3);
        format.setNewLineAfterNTags(7);
        assertEquals(7, format.getNewLineAfterNTags(), "NewLineAfterNTags should be 7");
    }

    @Test
    void testSetNewLineAfterNTagsDefault() {
        OutputFormat format = new OutputFormat();
        assertEquals(0, format.getNewLineAfterNTags(), "Default NewLineAfterNTags should be 0");
    }

    @Test
    void testSetNewLineAfterNTagsBoundary() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, format.getNewLineAfterNTags(), "NewLineAfterNTags should be Integer.MAX_VALUE");
    }

    @Test
    void testSetNewLineAfterNTagsBoundaryNegative() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, format.getNewLineAfterNTags(), "NewLineAfterNTags should be Integer.MIN_VALUE");
    }

    @Test
    void testSetNewLineAfterNTagsMultipleChanges() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(2);
        format.setNewLineAfterNTags(4);
        format.setNewLineAfterNTags(6);
        assertEquals(6, format.getNewLineAfterNTags(), "NewLineAfterNTags should be 6");
    }

    @Test
    void testSetNewLineAfterNTagsResetToZero() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterNTags(10);
        format.setNewLineAfterNTags(0);
        assertEquals(0, format.getNewLineAfterNTags(), "NewLineAfterNTags should be reset to 0");
    }
}