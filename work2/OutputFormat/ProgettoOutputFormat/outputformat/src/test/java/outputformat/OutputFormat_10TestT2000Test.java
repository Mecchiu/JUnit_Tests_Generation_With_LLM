// OutputFormat_10Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setNewLineAfterDeclaration(boolean)} method.
*/
class OutputFormat_10Test {
    /**
     * Test case 1: Test default value of newLineAfterDeclaration.
     */
    @Test
    void testDefaultNewLineAfterDeclaration() {
        OutputFormat format = new OutputFormat();
        assertTrue(format.isNewLineAfterDeclaration(), "Default value should be true");
    }

    /**
     * Test case 2: Set newLineAfterDeclaration to true.
     */
    @Test
    void testSetNewLineAfterDeclarationTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "Value should be true after setting to true");
    }

    /**
     * Test case 3: Set newLineAfterDeclaration to false.
     */
    @Test
    void testSetNewLineAfterDeclarationFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "Value should be false after setting to false");
    }

    /**
     * Test case 4: Toggle newLineAfterDeclaration from true to false.
     */
    @Test
    void testToggleNewLineAfterDeclarationTrueToFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(true);
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "Value should be false after toggling from true to false");
    }

    /**
     * Test case 5: Toggle newLineAfterDeclaration from false to true.
     */
    @Test
    void testToggleNewLineAfterDeclarationFalseToTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "Value should be true after toggling from false to true");
    }

    /**
     * Test case 6: Set newLineAfterDeclaration multiple times to true.
     */
    @Test
    void testSetNewLineAfterDeclarationMultipleTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(true);
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "Value should remain true after setting multiple times to true");
    }

    /**
     * Test case 7: Set newLineAfterDeclaration multiple times to false.
     */
    @Test
    void testSetNewLineAfterDeclarationMultipleFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "Value should remain false after setting multiple times to false");
    }

    /**
     * Test case 8: Set newLineAfterDeclaration to true after false.
     */
    @Test
    void testSetNewLineAfterDeclarationTrueAfterFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "Value should be true after setting to true after false");
    }

    /**
     * Test case 9: Set newLineAfterDeclaration to false after true.
     */
    @Test
    void testSetNewLineAfterDeclarationFalseAfterTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(true);
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "Value should be false after setting to false after true");
    }

    /**
     * Test case 10: Check newLineAfterDeclaration with createPrettyPrint.
     */
    @Test
    void testCreatePrettyPrintNewLineAfterDeclaration() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertTrue(format.isNewLineAfterDeclaration(), "Pretty print format should have newLineAfterDeclaration as true");
    }
}