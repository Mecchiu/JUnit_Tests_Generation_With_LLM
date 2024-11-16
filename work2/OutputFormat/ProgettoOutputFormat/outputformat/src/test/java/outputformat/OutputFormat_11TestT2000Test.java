// OutputFormat_11Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isNewLineAfterDeclaration()} method.
*/
class OutputFormat_11Test {
    /**
     * Test case for default value of newLineAfterDeclaration.
     */
    @Test
    void testDefaultNewLineAfterDeclaration() {
        OutputFormat format = new OutputFormat();
        assertTrue(format.isNewLineAfterDeclaration(), "Default value should be true");
    }

    /**
     * Test case for setting newLineAfterDeclaration to true.
     */
    @Test
    void testSetNewLineAfterDeclarationTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "Value should be true after setting to true");
    }

    /**
     * Test case for setting newLineAfterDeclaration to false.
     */
    @Test
    void testSetNewLineAfterDeclarationFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "Value should be false after setting to false");
    }

    /**
     * Test case for toggling newLineAfterDeclaration from true to false.
     */
    @Test
    void testToggleNewLineAfterDeclarationTrueToFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(true);
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "Value should be false after toggling from true to false");
    }

    /**
     * Test case for toggling newLineAfterDeclaration from false to true.
     */
    @Test
    void testToggleNewLineAfterDeclarationFalseToTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "Value should be true after toggling from false to true");
    }

    /**
     * Test case for newLineAfterDeclaration with multiple changes.
     */
    @Test
    void testMultipleChangesNewLineAfterDeclaration() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "Value should be false after first change");
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "Value should be true after second change");
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "Value should be false after third change");
    }

    /**
     * Test case for newLineAfterDeclaration with default constructor.
     */
    @Test
    void testNewLineAfterDeclarationDefaultConstructor() {
        OutputFormat format = new OutputFormat();
        assertTrue(format.isNewLineAfterDeclaration(), "Default constructor should set value to true");
    }

    /**
     * Test case for newLineAfterDeclaration with indent constructor.
     */
    @Test
    void testNewLineAfterDeclarationIndentConstructor() {
        OutputFormat format = new OutputFormat("  ");
        assertTrue(format.isNewLineAfterDeclaration(), "Indent constructor should set value to true");
    }

    /**
     * Test case for newLineAfterDeclaration with indent and newlines constructor.
     */
    @Test
    void testNewLineAfterDeclarationIndentNewlinesConstructor() {
        OutputFormat format = new OutputFormat("  ", true);
        assertTrue(format.isNewLineAfterDeclaration(), "Indent and newlines constructor should set value to true");
    }

    /**
     * Test case for newLineAfterDeclaration with indent, newlines, and encoding constructor.
     */
    @Test
    void testNewLineAfterDeclarationIndentNewlinesEncodingConstructor() {
        OutputFormat format = new OutputFormat("  ", true, "UTF-8");
        assertTrue(format.isNewLineAfterDeclaration(), "Indent, newlines, and encoding constructor should set value to true");
    }
}