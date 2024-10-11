package hslcolor;
// HSLColor_7Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#setLuminence(int)} method.
*/
class HSLColor_7Test {
    @Test
    void testSetLuminenceWithinRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(128);
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testSetLuminenceBelowRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(-10);
        assertEquals(0, color.getLuminence());
    }

    @Test
    void testSetLuminenceAboveRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(300);
        assertEquals(255, color.getLuminence());
    }

    @Test
    void testSetLuminenceZero() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(0);
        assertEquals(0, color.getLuminence());
    }

    @Test
    void testSetLuminenceMax() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(255);
        assertEquals(255, color.getLuminence());
    }

    @Test
    void testSetLuminenceMidRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(127);
        assertEquals(127, color.getLuminence());
    }

    @Test
    void testSetLuminenceNoChange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int initialLum = color.getLuminence();
        color.setLuminence(initialLum);
        assertEquals(initialLum, color.getLuminence());
    }

    @Test
    void testSetLuminenceFromMinToMax() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0);
        color.setLuminence(255);
        assertEquals(255, color.getLuminence());
    }

    @Test
    void testSetLuminenceFromMaxToMin() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255);
        color.setLuminence(0);
        assertEquals(0, color.getLuminence());
    }

    @Test
    void testSetLuminenceWithNegativeInput() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(-50);
        assertEquals(0, color.getLuminence());
    }
}