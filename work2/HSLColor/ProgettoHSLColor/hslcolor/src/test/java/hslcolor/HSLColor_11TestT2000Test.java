package hslcolor;
// HSLColor_11Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#reverseColor()} method.
*/
class HSLColor_11Test {
    @Test
    void testReverseColor1() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0); // Red
        color.reverseColor();
        assertEquals(85, color.getHue()); // Cyan
    }

    @Test
    void testReverseColor2() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 0); // Green
        color.reverseColor();
        assertEquals(213, color.getHue()); // Magenta
    }

    @Test
    void testReverseColor3() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 255); // Blue
        color.reverseColor();
        assertEquals(42, color.getHue()); // Yellow
    }

    @Test
    void testReverseColor4() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 0); // Yellow
        color.reverseColor();
        assertEquals(127, color.getHue()); // Blue
    }

    @Test
    void testReverseColor5() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 255); // Cyan
        color.reverseColor();
        assertEquals(0, color.getHue()); // Red
    }

    @Test
    void testReverseColor6() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 255); // Magenta
        color.reverseColor();
        assertEquals(170, color.getHue()); // Green
    }

    @Test
    void testReverseColor7() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128); // Grey
        color.reverseColor();
        assertEquals(170, color.getHue()); // Grey remains unchanged
    }

    @Test
    void testReverseColor8() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 165, 0); // Orange
        color.reverseColor();
        assertEquals(85, color.getHue()); // Blueish
    }

    @Test
    void testReverseColor9() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(75, 0, 130); // Indigo
        color.reverseColor();
        assertEquals(213, color.getHue()); // Yellowish
    }

    @Test
    void testReverseColor10() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(238, 130, 238); // Violet
        color.reverseColor();
        assertEquals(42, color.getHue()); // Greenish
    }
}