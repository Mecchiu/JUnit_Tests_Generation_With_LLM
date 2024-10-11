package hslcolor;
// HSLColor_1Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#initRGBbyHSL(int, int, int)} method.
*/
class HSLColor_1Test {
    @Test
    void testInitRGBbyHSL_Greyscale() {
        HSLColor color = new HSLColor();
        color.initRGBbyHSL(0, 0, 128);
        assertEquals(128, color.getRed());
        assertEquals(128, color.getGreen());
        assertEquals(128, color.getBlue());
    }

    @Test
    void testInitRGBbyHSL_Red() {
        HSLColor color = new HSLColor();
        color.initRGBbyHSL(0, 255, 128);
        assertEquals(255, color.getRed());
        assertEquals(0, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    void testInitRGBbyHSL_Green() {
        HSLColor color = new HSLColor();
        color.initRGBbyHSL(85, 255, 128);
        assertEquals(0, color.getRed());
        assertEquals(255, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    void testInitRGBbyHSL_Blue() {
        HSLColor color = new HSLColor();
        color.initRGBbyHSL(170, 255, 128);
        assertEquals(0, color.getRed());
        assertEquals(0, color.getGreen());
        assertEquals(255, color.getBlue());
    }

    @Test
    void testInitRGBbyHSL_Yellow() {
        HSLColor color = new HSLColor();
        color.initRGBbyHSL(42, 255, 128);
        assertEquals(255, color.getRed());
        assertEquals(255, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    void testInitRGBbyHSL_Cyan() {
        HSLColor color = new HSLColor();
        color.initRGBbyHSL(127, 255, 128);
        assertEquals(0, color.getRed());
        assertEquals(255, color.getGreen());
        assertEquals(255, color.getBlue());
    }

    @Test
    void testInitRGBbyHSL_Magenta() {
        HSLColor color = new HSLColor();
        color.initRGBbyHSL(213, 255, 128);
        assertEquals(255, color.getRed());
        assertEquals(0, color.getGreen());
        assertEquals(255, color.getBlue());
    }

    @Test
    void testInitRGBbyHSL_LightnessZero() {
        HSLColor color = new HSLColor();
        color.initRGBbyHSL(0, 255, 0);
        assertEquals(0, color.getRed());
        assertEquals(0, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    void testInitRGBbyHSL_LightnessFull() {
        HSLColor color = new HSLColor();
        color.initRGBbyHSL(0, 255, 255);
        assertEquals(255, color.getRed());
        assertEquals(255, color.getGreen());
        assertEquals(255, color.getBlue());
    }

    @Test
    void testInitRGBbyHSL_SaturationZero() {
        HSLColor color = new HSLColor();
        color.initRGBbyHSL(0, 0, 128);
        assertEquals(128, color.getRed());
        assertEquals(128, color.getGreen());
        assertEquals(128, color.getBlue());
    }
}