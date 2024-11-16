// HSLColor_10Test.java

package hslcolor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getBlue()} method.
*/
class HSLColor_10Test {
    @Test
    void testGetBlue() {
        HSLColor hslColor = new HSLColor();
        hslColor.initRGBbyHSL(120, 200, 150);
        assertEquals(150, hslColor.getBlue());
    }

    @Test
    void testGetBlue_MaxValue() {
        HSLColor hslColor = new HSLColor();
        hslColor.initRGBbyHSL(100, 150, 255);
        assertEquals(255, hslColor.getBlue());
    }

    @Test
    void testGetBlue_MinValue() {
        HSLColor hslColor = new HSLColor();
        hslColor.initRGBbyHSL(50, 100, 0);
        assertEquals(0, hslColor.getBlue());
    }

    @Test
    void testGetBlue_NegativeValue() {
        HSLColor hslColor = new HSLColor();
        hslColor.initRGBbyHSL(200, 100, -50);
        assertEquals(0, hslColor.getBlue());
    }

    @Test
    void testGetBlue_HueZero() {
        HSLColor hslColor = new HSLColor();
        hslColor.initRGBbyHSL(0, 100, 200);
        assertEquals(200, hslColor.getBlue());
    }

    @Test
    void testGetBlue_SaturationZero() {
        HSLColor hslColor = new HSLColor();
        hslColor.initRGBbyHSL(180, 0, 100);
        assertEquals(100, hslColor.getBlue());
    }

    @Test
    void testGetBlue_LuminenceZero() {
        HSLColor hslColor = new HSLColor();
        hslColor.initRGBbyHSL(240, 200, 0);
        assertEquals(0, hslColor.getBlue());
    }

    @Test
    void testGetBlue_MaxValues() {
        HSLColor hslColor = new HSLColor();
        hslColor.initRGBbyHSL(255, 255, 255);
        assertEquals(255, hslColor.getBlue());
    }

    @Test
    void testGetBlue_Blend() {
        HSLColor hslColor = new HSLColor();
        hslColor.initRGBbyHSL(100, 150, 200);
        hslColor.blend(50, 100, 150, 0.5f);
        assertEquals(175, hslColor.getBlue());
    }

    @Test
    void testGetBlue_BlendZeroPercent() {
        HSLColor hslColor = new HSLColor();
        hslColor.initRGBbyHSL(100, 150, 200);
        hslColor.blend(50, 100, 150, 0);
        assertEquals(200, hslColor.getBlue());
    }
}