// OutputFormat_9Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isSuppressDeclaration()} method.
*/
class OutputFormat_9Test {
    @Test
    void testDefaultSuppressDeclaration() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isSuppressDeclaration(), "Default suppressDeclaration should be false");
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
    void testSuppressDeclarationAfterParseOptions() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-suppressDeclaration"};
        format.parseOptions(args, 0);
        assertTrue(format.isSuppressDeclaration(), "suppressDeclaration should be true after parsing -suppressDeclaration option");
    }

    @Test
    void testSuppressDeclarationAfterMultipleParseOptions() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-omitEncoding", "-suppressDeclaration", "-newlines"};
        format.parseOptions(args, 0);
        assertTrue(format.isSuppressDeclaration(), "suppressDeclaration should be true after parsing multiple options including -suppressDeclaration");
    }

    @Test
    void testSuppressDeclarationWithInvalidOption() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-invalidOption", "-suppressDeclaration"};
        int index = format.parseOptions(args, 0);
        assertEquals(0, index, "parseOptions should return the index of the first unrecognized option");
        assertFalse(format.isSuppressDeclaration(), "suppressDeclaration should remain false if invalid option is encountered first");
    }

    @Test
    void testSuppressDeclarationWithNoOptions() {
        OutputFormat format = new OutputFormat();
        String[] args = {};
        format.parseOptions(args, 0);
        assertFalse(format.isSuppressDeclaration(), "suppressDeclaration should remain false if no options are provided");
    }

    @Test
    void testSuppressDeclarationWithNullOptions() {
        OutputFormat format = new OutputFormat();
        format.parseOptions(null, 0);
        assertFalse(format.isSuppressDeclaration(), "suppressDeclaration should remain false if null options are provided");
    }
}