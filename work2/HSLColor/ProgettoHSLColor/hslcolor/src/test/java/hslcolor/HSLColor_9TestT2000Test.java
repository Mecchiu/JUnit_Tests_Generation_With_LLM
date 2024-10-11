package hslcolor;
// HSLColor_9Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getGreen()} method.
*/
class HSLColor_9Test {
    @Test
    void testGetGreenWithBlack() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0);
        assertEquals(0, color.getGreen());
    }

    @Test
    void testGetGreenWithWhite() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255);
        assertEquals(255, color.getGreen());
    }

    @Test
    void testGetGreenWithRed() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0);
        assertEquals(0, color.getGreen());
    }

    @Test
    void testGetGreenWithLime() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 0);
        assertEquals(255, color.getGreen());
    }

    @Test
    void testGetGreenWithBlue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 255);
        assertEquals(0, color.getGreen());
    }

    @Test
    void testGetGreenWithYellow() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 0);
        assertEquals(255, color.getGreen());
    }

    @Test
    void testGetGreenWithCyan() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 255);
        assertEquals(255, color.getGreen());
    }

    @Test
    void testGetGreenWithMagenta() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 255);
        assertEquals(0, color.getGreen());
    }

    @Test
    void testGetGreenWithGray() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128);
        assertEquals(128, color.getGreen());
    }

    @Test
    void testGetGreenWithRandomColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(123, 234, 45);
        assertEquals(234, color.getGreen());
    }
}