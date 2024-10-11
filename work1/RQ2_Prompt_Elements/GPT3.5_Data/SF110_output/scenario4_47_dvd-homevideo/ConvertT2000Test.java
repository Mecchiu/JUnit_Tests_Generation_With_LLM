// ConvertTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConvertTest {

    /**
     * Test case for successful initialization of Convert object
     */
    @Test
    public void testInitSuccess() {
        Convert convert = new Convert("PAL", "4:3", new GUI());
        assertTrue(convert.init());
    }

    /**
     * Test case for unsuccessful initialization of Convert object
     */
    @Test
    public void testInitFailure() {
        Convert convert = new Convert("NTSC", "16:9", null);
        assertFalse(convert.init());
    }

    /**
     * Test case for successful initialization of Convert object with quality parameter
     */
    @Test
    public void testInitQualitySuccess() {
        Convert convert = new Convert(5, "PAL", "16:9", new GUI());
        assertTrue(convert.init());
    }

    /**
     * Test case for unsuccessful initialization of Convert object with quality parameter
     */
    @Test
    public void testInitQualityFailure() {
        Convert convert = new Convert(10, "NTSC", "4:3", null);
        assertFalse(convert.init());
    }

    /**
     * Test case for successful initialization of Convert object with invalid aspect ratio
     */
    @Test
    public void testInitInvalidAspectRatio() {
        Convert convert = new Convert("PAL", "5:4", new GUI());
        assertFalse(convert.init());
    }

    /**
     * Test case for successful initialization of Convert object with invalid format
     */
    @Test
    public void testInitInvalidFormat() {
        Convert convert = new Convert("SECAM", "4:3", new GUI());
        assertFalse(convert.init());
    }

    /**
     * Test case for successful initialization of Convert object with null GUI object
     */
    @Test
    public void testInitNullGUI() {
        Convert convert = new Convert("PAL", "16:9", null);
        assertFalse(convert.init());
    }

    /**
     * Test case for successful initialization of Convert object with empty format and aspect ratio
     */
    @Test
    public void testInitEmptyFormatAndAspectRatio() {
        Convert convert = new Convert("", "", new GUI());
        assertFalse(convert.init());
    }

    /**
     * Test case for successful initialization of Convert object with valid format and aspect ratio
     */
    @Test
    public void testInitValidFormatAndAspectRatio() {
        Convert convert = new Convert("NTSC", "4:3", new GUI());
        assertTrue(convert.init());
    }

    /**
     * Test case for successful initialization of Convert object with valid quality, format and aspect ratio
     */
    @Test
    public void testInitValidQualityFormatAndAspectRatio() {
        Convert convert = new Convert(7, "PAL", "16:9", new GUI());
        assertTrue(convert.init());
    }
}