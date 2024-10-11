package outputformat;
// OutputFormat_16Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isPadText()} method.
*/
class OutputFormat_16Test {
    @Test
    void testDefaultPadText() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isPadText(), "Default padText should be false");
    }

    @Test
    void testSetPadTextTrue() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        assertTrue(format.isPadText(), "padText should be true after setting it to true");
    }

    @Test
    void testSetPadTextFalse() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        format.setPadText(false);
        assertFalse(format.isPadText(), "padText should be false after setting it to false");
    }

    @Test
    void testPadTextWithPrettyPrint() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertTrue(format.isPadText(), "padText should be true in pretty print format");
    }

    @Test
    void testPadTextWithCompactFormat() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertFalse(format.isPadText(), "padText should be false in compact format");
    }

    @Test
    void testPadTextAfterClone() throws CloneNotSupportedException {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        OutputFormat clonedFormat = (OutputFormat) format.clone();
        assertTrue(clonedFormat.isPadText(), "padText should be true in cloned format");
    }

    @Test
    void testPadTextAfterChangingIndent() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        format.setIndent("    ");
        assertTrue(format.isPadText(), "padText should remain true after changing indent");
    }

    @Test
    void testPadTextAfterChangingNewlines() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        format.setNewlines(false);
        assertTrue(format.isPadText(), "padText should remain true after changing newlines");
    }

    @Test
    void testPadTextAfterChangingEncoding() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        format.setEncoding("ISO-8859-1");
        assertTrue(format.isPadText(), "padText should remain true after changing encoding");
    }

    @Test
    void testPadTextAfterChangingLineSeparator() {
        OutputFormat format = new OutputFormat();
        format.setPadText(true);
        format.setLineSeparator("\r\n");
        assertTrue(format.isPadText(), "padText should remain true after changing line separator");
    }
}