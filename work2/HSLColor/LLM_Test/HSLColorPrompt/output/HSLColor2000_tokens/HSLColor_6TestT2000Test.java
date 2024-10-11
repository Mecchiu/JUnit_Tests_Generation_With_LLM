package hslcolor;
// HSLColor_6Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getLuminence()} method.
*/
class HSLColor_6Test {
    @Test
    void testGetLuminenceForBlack() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0);
        assertEquals(0, color.getLuminence(), "Luminance for black should be 0");
    }

    @Test
    void testGetLuminenceForWhite() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255);
        assertEquals(255, color.getLuminence(), "Luminance for white should be 255");
    }

    @Test
    void testGetLuminenceForRed() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0);
        assertEquals(128, color.getLuminence(), "Luminance for red should be 128");
    }

    @Test
    void testGetLuminenceForGreen() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 0);
        assertEquals(128, color.getLuminence(), "Luminance for green should be 128");
    }

    @Test
    void testGetLuminenceForBlue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 255);
        assertEquals(128, color.getLuminence(), "Luminance for blue should be 128");
    }

    @Test
    void testGetLuminenceForGray() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128);
        assertEquals(128, color.getLuminence(), "Luminance for gray should be 128");
    }

    @Test
    void testGetLuminenceForCyan() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 255);
        assertEquals(191, color.getLuminence(), "Luminance for cyan should be 191");
    }

    @Test
    void testGetLuminenceForMagenta() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 255);
        assertEquals(191, color.getLuminence(), "Luminance for magenta should be 191");
    }

    @Test
    void testGetLuminenceForYellow() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 0);
        assertEquals(191, color.getLuminence(), "Luminance for yellow should be 191");
    }

    @Test
    void testGetLuminenceForRandomColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(123, 234, 45);
        assertEquals(140, color.getLuminence(), "Luminance for the color (123, 234, 45) should be 140");
    }
}