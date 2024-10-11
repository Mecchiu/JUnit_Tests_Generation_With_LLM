package hslcolor;
// HSLColor_0Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#initHSLbyRGB(int, int, int)} method.
*/
class HSLColor_0Test {
    @Test
    void testInitHSLbyRGB_Red() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0);
        assertEquals(0, color.getHue());
        assertEquals(255, color.getSaturation());
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Green() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 0);
        assertEquals(85, color.getHue());
        assertEquals(255, color.getSaturation());
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Blue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 255);
        assertEquals(170, color.getHue());
        assertEquals(255, color.getSaturation());
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_White() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255);
        assertEquals(170, color.getHue());
        assertEquals(0, color.getSaturation());
        assertEquals(255, color.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Black() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0);
        assertEquals(170, color.getHue());
        assertEquals(0, color.getSaturation());
        assertEquals(0, color.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Gray() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128);
        assertEquals(170, color.getHue());
        assertEquals(0, color.getSaturation());
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Yellow() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 0);
        assertEquals(43, color.getHue());
        assertEquals(255, color.getSaturation());
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Cyan() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 255);
        assertEquals(128, color.getHue());
        assertEquals(255, color.getSaturation());
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Magenta() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 255);
        assertEquals(213, color.getHue());
        assertEquals(255, color.getSaturation());
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Orange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 165, 0);
        assertEquals(28, color.getHue());
        assertEquals(255, color.getSaturation());
        assertEquals(128, color.getLuminence());
    }
}