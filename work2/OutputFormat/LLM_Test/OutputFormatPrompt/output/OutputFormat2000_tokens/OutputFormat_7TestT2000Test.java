package outputformat;
// OutputFormat_7Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setOmitEncoding(boolean)} method.
*/
class OutputFormat_7Test {
    @Test
    void testSetOmitEncodingTrue() {
        OutputFormat format = new OutputFormat();
        format.setOmitEncoding(true);
        assertTrue(format.isOmitEncoding(), "OmitEncoding should be true after setting it to true.");
    }

    @Test
    void testSetOmitEncodingFalse() {
        OutputFormat format = new OutputFormat();
        format.setOmitEncoding(false);
        assertFalse(format.isOmitEncoding(), "OmitEncoding should be false after setting it to false.");
    }

    @Test
    void testDefaultOmitEncoding() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isOmitEncoding(), "Default OmitEncoding should be false.");
    }

    @Test
    void testSetOmitEncodingTrueThenFalse() {
        OutputFormat format = new OutputFormat();
        format.setOmitEncoding(true);
        format.setOmitEncoding(false);
        assertFalse(format.isOmitEncoding(), "OmitEncoding should be false after setting it to true then false.");
    }

    @Test
    void testSetOmitEncodingFalseThenTrue() {
        OutputFormat format = new OutputFormat();
        format.setOmitEncoding(false);
        format.setOmitEncoding(true);
        assertTrue(format.isOmitEncoding(), "OmitEncoding should be true after setting it to false then true.");
    }

    @Test
    void testSetOmitEncodingMultipleTrue() {
        OutputFormat format = new OutputFormat();
        format.setOmitEncoding(true);
        format.setOmitEncoding(true);
        assertTrue(format.isOmitEncoding(), "OmitEncoding should remain true after setting it to true multiple times.");
    }

    @Test
    void testSetOmitEncodingMultipleFalse() {
        OutputFormat format = new OutputFormat();
        format.setOmitEncoding(false);
        format.setOmitEncoding(false);
        assertFalse(format.isOmitEncoding(), "OmitEncoding should remain false after setting it to false multiple times.");
    }

    @Test
    void testSetOmitEncodingTrueAfterDefault() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isOmitEncoding(), "Default OmitEncoding should be false.");
        format.setOmitEncoding(true);
        assertTrue(format.isOmitEncoding(), "OmitEncoding should be true after setting it to true from default.");
    }

    @Test
    void testSetOmitEncodingFalseAfterDefault() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isOmitEncoding(), "Default OmitEncoding should be false.");
        format.setOmitEncoding(false);
        assertFalse(format.isOmitEncoding(), "OmitEncoding should remain false after setting it to false from default.");
    }

    @Test
    void testSetOmitEncodingToggle() {
        OutputFormat format = new OutputFormat();
        format.setOmitEncoding(true);
        assertTrue(format.isOmitEncoding(), "OmitEncoding should be true after setting it to true.");
        format.setOmitEncoding(false);
        assertFalse(format.isOmitEncoding(), "OmitEncoding should be false after setting it to false.");
        format.setOmitEncoding(true);
        assertTrue(format.isOmitEncoding(), "OmitEncoding should be true after setting it to true again.");
    }
}