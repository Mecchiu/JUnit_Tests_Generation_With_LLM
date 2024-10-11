package hslcolor;
// HSLColor_8Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getRed()} method.
*/
class HSLColor_8Test {
    @Test
    void testGetRed_InitialValue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        assertEquals(100, color.getRed());
    }

    @Test
    void testGetRed_AfterSetRed() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setRed(120);
        assertEquals(120, color.getRed());
    }

    @Test
    void testGetRed_AfterSetGreen() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setGreen(180);
        assertEquals(100, color.getRed());
    }

    @Test
    void testGetRed_AfterSetBlue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setBlue(220);
        assertEquals(100, color.getRed());
    }

    @Test
    void testGetRed_AfterSetHue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setHue(50);
        assertNotEquals(100, color.getRed());
    }

    @Test
    void testGetRed_AfterSetSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(100);
        assertNotEquals(100, color.getRed());
    }

    @Test
    void testGetRed_AfterSetLuminance() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(100);
        assertNotEquals(100, color.getRed());
    }

    @Test
    void testGetRed_AfterReverseColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.reverseColor();
        assertNotEquals(100, color.getRed());
    }

    @Test
    void testGetRed_AfterBrighten() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.brighten(1.2f);
        assertNotEquals(100, color.getRed());
    }

    @Test
    void testGetRed_AfterBlend() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(50, 100, 150, 0.5f);
        assertNotEquals(100, color.getRed());
    }
}