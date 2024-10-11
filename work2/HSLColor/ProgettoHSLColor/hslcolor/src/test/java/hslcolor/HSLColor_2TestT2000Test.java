package hslcolor;
// HSLColor_2Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getHue()} method.
*/
class HSLColor_2Test {
    @Test
    void testGetHue_initialValue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0); // Red
        assertEquals(0, color.getHue());
    }

    @Test
    void testGetHue_afterSettingHue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0); // Red
        color.setHue(85);
        assertEquals(85, color.getHue());
    }

    @Test
    void testGetHue_wrapAroundPositive() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0); // Red
        color.setHue(300);
        color.setHue(300 + 255); // Wrap around
        assertEquals(45, color.getHue());
    }

    @Test
    void testGetHue_wrapAroundNegative() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0); // Red
        color.setHue(-30);
        assertEquals(225, color.getHue());
    }

    @Test
    void testGetHue_greyscale() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128); // Grey
        assertEquals(170, color.getHue()); // UNDEFINED
    }

    @Test
    void testGetHue_fullSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 0); // Green
        assertEquals(85, color.getHue());
    }

    @Test
    void testGetHue_fullLightness() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255); // White
        assertEquals(170, color.getHue()); // UNDEFINED
    }

    @Test
    void testGetHue_noLightness() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0); // Black
        assertEquals(170, color.getHue()); // UNDEFINED
    }

    @Test
    void testGetHue_halfSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 255, 128); // Light Green
        assertEquals(85, color.getHue());
    }

    @Test
    void testGetHue_halfLightness() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 0, 0); // Dark Red
        assertEquals(0, color.getHue());
    }
}