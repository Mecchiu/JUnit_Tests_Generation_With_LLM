package hslcolor;
// HSLColor_10Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getBlue()} method.
*/
class HSLColor_10Test {
    @Test
    void testGetBlue_initialValue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 255);
        assertEquals(255, color.getBlue());
    }

    @Test
    void testGetBlue_afterSettingRGB() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        assertEquals(200, color.getBlue());
    }

    @Test
    void testGetBlue_afterSettingHSL() {
        HSLColor color = new HSLColor();
        color.initRGBbyHSL(170, 255, 128);
        assertEquals(128, color.getBlue());
    }

    @Test
    void testGetBlue_afterChangingHue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setHue(85);
        assertEquals(200, color.getBlue());
    }

    @Test
    void testGetBlue_afterChangingSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(128);
        assertEquals(200, color.getBlue());
    }

    @Test
    void testGetBlue_afterChangingLuminance() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(128);
        assertEquals(200, color.getBlue());
    }

    @Test
    void testGetBlue_afterReversingColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.reverseColor();
        assertEquals(200, color.getBlue());
    }

    @Test
    void testGetBlue_afterBrightening() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.brighten(1.2f);
        assertEquals(200, color.getBlue());
    }

    @Test
    void testGetBlue_afterBlending() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(50, 100, 150, 0.5f);
        assertEquals(175, color.getBlue());
    }
}