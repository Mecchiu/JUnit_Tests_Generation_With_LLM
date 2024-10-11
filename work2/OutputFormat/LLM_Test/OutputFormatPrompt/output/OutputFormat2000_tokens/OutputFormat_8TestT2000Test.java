package outputformat;
// OutputFormat_8Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setSuppressDeclaration(boolean)} method.
*/
class OutputFormat_8Test {
    @Test
    void testSuppressDeclarationDefault() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isSuppressDeclaration(), "Default value of suppressDeclaration should be false");
    }

    @Test
    void testSetSuppressDeclarationTrue() {
        OutputFormat format = new OutputFormat();
        format.setSuppressDeclaration(true);
        assertTrue(format.isSuppressDeclaration(), "suppressDeclaration should be true after setting it to true");
    }

    @Test
    void testSetSuppressDeclarationFalse() {
        OutputFormat format = new OutputFormat();
        format.setSuppressDeclaration(true);
        format.setSuppressDeclaration(false);
        assertFalse(format.isSuppressDeclaration(), "suppressDeclaration should be false after setting it to false");
    }

    @Test
    void testSuppressDeclarationWithPrettyPrint() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isSuppressDeclaration(), "Pretty print format should have suppressDeclaration as false");
    }

    @Test
    void testSuppressDeclarationWithCompactFormat() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isSuppressDeclaration(), "Compact format should have suppressDeclaration as false");
    }

    @Test
    void testSuppressDeclarationAfterMultipleChanges() {
        OutputFormat format = new OutputFormat();
        format.setSuppressDeclaration(true);
        format.setSuppressDeclaration(false);
        format.setSuppressDeclaration(true);
        assertTrue(format.isSuppressDeclaration(), "suppressDeclaration should be true after multiple changes");
    }

    @Test
    void testSuppressDeclarationWithCustomIndent() {
        OutputFormat format = new OutputFormat("    ");
        assertFalse(format.isSuppressDeclaration(), "Custom indent should not affect suppressDeclaration default value");
    }

    @Test
    void testSuppressDeclarationWithNewlines() {
        OutputFormat format = new OutputFormat("    ", true);
        assertFalse(format.isSuppressDeclaration(), "Newlines should not affect suppressDeclaration default value");
    }

    @Test
    void testSuppressDeclarationWithEncoding() {
        OutputFormat format = new OutputFormat("    ", true, "ISO-8859-1");
        assertFalse(format.isSuppressDeclaration(), "Encoding should not affect suppressDeclaration default value");
    }

    @Test
    void testSuppressDeclarationAfterParseOptions() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-suppressDeclaration"};
        format.parseOptions(args, 0);
        assertTrue(format.isSuppressDeclaration(), "suppressDeclaration should be true after parsing options with -suppressDeclaration");
    }
}