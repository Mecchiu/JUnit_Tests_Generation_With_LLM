package hslcolor;
// HSLColor_5Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#setSaturation(int)} method.
*/
class HSLColor_5Test {
    @Test
    void testSetSaturationWithinRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(128);
        assertEquals(128, color.getSaturation());
    }

    @Test
    void testSetSaturationBelowZero() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(-10);
        assertEquals(0, color.getSaturation());
    }

    @Test
    void testSetSaturationAboveMax() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(300);
        assertEquals(255, color.getSaturation());
    }

    @Test
    void testSetSaturationZero() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(0);
        assertEquals(0, color.getSaturation());
    }

    @Test
    void testSetSaturationMax() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(255);
        assertEquals(255, color.getSaturation());
    }

    @Test
    void testSetSaturationNoChange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int initialSaturation = color.getSaturation();
        color.setSaturation(initialSaturation);
        assertEquals(initialSaturation, color.getSaturation());
    }

    @Test
    void testSetSaturationFromZeroToMax() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(0);
        color.setSaturation(255);
        assertEquals(255, color.getSaturation());
    }

    @Test
    void testSetSaturationFromMaxToZero() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(255);
        color.setSaturation(0);
        assertEquals(0, color.getSaturation());
    }

    @Test
    void testSetSaturationMidRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(128);
        assertEquals(128, color.getSaturation());
    }

    @Test
    void testSetSaturationWithNegativeInput() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(-50);
        assertEquals(0, color.getSaturation());
    }
}