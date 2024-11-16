// HSLColor_2Test.java

package hslcolor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getHue()} method.
*/
class HSLColor_2Test {
@Test
void testGetHue_WhenInitializedWithRGB_ExpectCorrectHue() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(255, 0, 0);
    assertEquals(0, hslColor.getHue());
}

@Test
void testGetHue_WhenSetHueTo180_Expect180() {
    HSLColor hslColor = new HSLColor();
    hslColor.setHue(180);
    assertEquals(180, hslColor.getHue());
}

@Test
void testGetHue_WhenSetHueTo300_Expect45() {
    HSLColor hslColor = new HSLColor();
    hslColor.setHue(300);
    assertEquals(45, hslColor.getHue());
}

@Test
void testGetHue_WhenSetHueToNegative_Expect225() {
    HSLColor hslColor = new HSLColor();
    hslColor.setHue(-30);
    assertEquals(225, hslColor.getHue());
}

@Test
void testGetHue_WhenSetHueToGreaterThanMax_Expect45() {
    HSLColor hslColor = new HSLColor();
    hslColor.setHue(300);
    assertEquals(45, hslColor.getHue());
}

@Test
void testGetHue_WhenReverseColor_ExpectHueShifted180() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(255, 0, 0);
    hslColor.reverseColor();
    assertEquals(180, hslColor.getHue());
}

@Test
void testGetHue_WhenGreyscale_ExpectUndefinedHue() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(255, 255, 255);
    assertEquals(170, hslColor.getHue());
}

@Test
void testGetHue_WhenBlendWithRed_ExpectHueShiftedTowardsRed() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(0, 255, 255);
    hslColor.blend(255, 0, 0, 0.5f);
    assertEquals(0, hslColor.getHue());
}

@Test
void testGetHue_WhenBrighten_ExpectHueUnchanged() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(255, 0, 0);
    hslColor.brighten(0.5f);
    assertEquals(0, hslColor.getHue());
}
}