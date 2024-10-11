package hslcolor;
// HSLColor_4Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getSaturation()} method.
*/
class HSLColor_4Test {
    @Test
    void testGetSaturation_ZeroSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128); // Grey color
        assertEquals(0, color.getSaturation(), "Saturation should be 0 for grey color");
    }

    @Test
    void testGetSaturation_MaxSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0); // Pure red color
        assertEquals(255, color.getSaturation(), "Saturation should be 255 for pure red color");
    }

    @Test
    void testGetSaturation_HalfSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(192, 64, 64); // A shade of red
        assertTrue(color.getSaturation() > 0 && color.getSaturation() < 255, "Saturation should be between 0 and 255 for a shade of red");
    }

    @Test
    void testGetSaturation_BlackColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0); // Black color
        assertEquals(0, color.getSaturation(), "Saturation should be 0 for black color");
    }

    @Test
    void testGetSaturation_WhiteColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255); // White color
        assertEquals(0, color.getSaturation(), "Saturation should be 0 for white color");
    }

    @Test
    void testGetSaturation_MidGreyColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128); // Mid grey color
        assertEquals(0, color.getSaturation(), "Saturation should be 0 for mid grey color");
    }

    @Test
    void testGetSaturation_LightGreyColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(192, 192, 192); // Light grey color
        assertEquals(0, color.getSaturation(), "Saturation should be 0 for light grey color");
    }

    @Test
    void testGetSaturation_DarkGreyColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(64, 64, 64); // Dark grey color
        assertEquals(0, color.getSaturation(), "Saturation should be 0 for dark grey color");
    }

    @Test
    void testGetSaturation_NonGreyColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200); // Non-grey color
        assertTrue(color.getSaturation() > 0, "Saturation should be greater than 0 for non-grey color");
    }

    @Test
    void testGetSaturation_AnotherNonGreyColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(50, 100, 150); // Another non-grey color
        assertTrue(color.getSaturation() > 0, "Saturation should be greater than 0 for another non-grey color");
    }
}