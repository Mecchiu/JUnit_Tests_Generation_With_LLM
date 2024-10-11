package outputformat;
// OutputFormat_10Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setNewLineAfterDeclaration(boolean)} method.
*/
class OutputFormat_10Test {
    @Test
    void testSetNewLineAfterDeclarationTrue() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "New line after declaration should be true");
    }

    @Test
    void testSetNewLineAfterDeclarationFalse() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "New line after declaration should be false");
    }

    @Test
    void testDefaultNewLineAfterDeclaration() {
        OutputFormat format = new OutputFormat();
        assertTrue(format.isNewLineAfterDeclaration(), "Default new line after declaration should be true");
    }

    @Test
    void testSetNewLineAfterDeclarationTwice() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "New line after declaration should be true after setting it twice");
    }

    @Test
    void testSetNewLineAfterDeclarationWithPrettyPrint() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "New line after declaration should be false in pretty print format");
    }

    @Test
    void testSetNewLineAfterDeclarationWithCompactFormat() {
        OutputFormat format = OutputFormat.createCompactFormat();
        format.setNewLineAfterDeclaration(true);
        assertTrue(format.isNewLineAfterDeclaration(), "New line after declaration should be true in compact format");
    }

    @Test
    void testSetNewLineAfterDeclarationWithCustomIndent() {
        OutputFormat format = new OutputFormat("    ");
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "New line after declaration should be false with custom indent");
    }

    @Test
    void testSetNewLineAfterDeclarationWithEncoding() {
        OutputFormat format = new OutputFormat("  ", true, "ISO-8859-1");
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "New line after declaration should be false with custom encoding");
    }

    @Test
    void testSetNewLineAfterDeclarationWithXHTML() {
        OutputFormat format = new OutputFormat();
        format.setXHTML(true);
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "New line after declaration should be false with XHTML");
    }

    @Test
    void testSetNewLineAfterDeclarationWithTrimText() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        format.setNewLineAfterDeclaration(false);
        assertFalse(format.isNewLineAfterDeclaration(), "New line after declaration should be false with trim text");
    }
}