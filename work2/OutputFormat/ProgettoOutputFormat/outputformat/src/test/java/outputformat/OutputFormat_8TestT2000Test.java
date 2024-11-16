// OutputFormat_8Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setSuppressDeclaration(boolean)} method.
*/
class OutputFormat_8Test {
    @Test
    void testSetSuppressDeclarationTrue() {
        OutputFormat format = new OutputFormat();
        format.setSuppressDeclaration(true);
        assertTrue(format.isSuppressDeclaration(), "The suppressDeclaration should be true.");
    }

    @Test
    void testSetSuppressDeclarationFalse() {
        OutputFormat format = new OutputFormat();
        format.setSuppressDeclaration(false);
        assertFalse(format.isSuppressDeclaration(), "The suppressDeclaration should be false.");
    }

    @Test
    void testDefaultSuppressDeclaration() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isSuppressDeclaration(), "The default suppressDeclaration should be false.");
    }

    @Test
    void testSuppressDeclarationAfterToggle() {
        OutputFormat format = new OutputFormat();
        format.setSuppressDeclaration(true);
        format.setSuppressDeclaration(false);
        assertFalse(format.isSuppressDeclaration(), "The suppressDeclaration should be false after toggling.");
    }

    @Test
    void testSuppressDeclarationMultipleTrue() {
        OutputFormat format = new OutputFormat();
        format.setSuppressDeclaration(true);
        format.setSuppressDeclaration(true);
        assertTrue(format.isSuppressDeclaration(), "The suppressDeclaration should remain true after setting it to true multiple times.");
    }

    @Test
    void testSuppressDeclarationMultipleFalse() {
        OutputFormat format = new OutputFormat();
        format.setSuppressDeclaration(false);
        format.setSuppressDeclaration(false);
        assertFalse(format.isSuppressDeclaration(), "The suppressDeclaration should remain false after setting it to false multiple times.");
    }

    @Test
    void testSuppressDeclarationWithOtherSettings() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(4);
        format.setNewlines(true);
        format.setSuppressDeclaration(true);
        assertTrue(format.isSuppressDeclaration(), "The suppressDeclaration should be true even with other settings.");
    }

    @Test
    void testSuppressDeclarationWithEncodingChange() {
        OutputFormat format = new OutputFormat();
        format.setEncoding("ISO-8859-1");
        format.setSuppressDeclaration(true);
        assertTrue(format.isSuppressDeclaration(), "The suppressDeclaration should be true even after changing encoding.");
    }

    @Test
    void testSuppressDeclarationWithIndentChange() {
        OutputFormat format = new OutputFormat();
        format.setIndent("    ");
        format.setSuppressDeclaration(true);
        assertTrue(format.isSuppressDeclaration(), "The suppressDeclaration should be true even after changing indent.");
    }

    @Test
    void testSuppressDeclarationWithNewLineAfterDeclaration() {
        OutputFormat format = new OutputFormat();
        format.setNewLineAfterDeclaration(false);
        format.setSuppressDeclaration(true);
        assertTrue(format.isSuppressDeclaration(), "The suppressDeclaration should be true even after changing newLineAfterDeclaration.");
    }
}