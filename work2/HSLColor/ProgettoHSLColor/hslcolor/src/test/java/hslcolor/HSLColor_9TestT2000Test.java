// HSLColor_9Test.java

package hslcolor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getGreen()} method.
*/
class HSLColor_9Test {
@Test
void testGetGreen() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(120, 50, 75);
    assertEquals(128, hslColor.getGreen(), "Green value should be 128");
}

@Test
void testGetGreen_MaxSaturation() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(180, 255, 50);
    assertEquals(0, hslColor.getGreen(), "Green value should be 0 at maximum saturation");
}

@Test
void testGetGreen_MinSaturation() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(60, 0, 25);
    assertEquals(64, hslColor.getGreen(), "Green value should be 64 at minimum saturation");
}

@Test
void testGetGreen_MaxLuminence() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(240, 100, 255);
    assertEquals(255, hslColor.getGreen(), "Green value should be 255 at maximum luminence");
}

@Test
void testGetGreen_MinLuminence() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(300, 75, 0);
    assertEquals(0, hslColor.getGreen(), "Green value should be 0 at minimum luminence");
}

@Test
void testGetGreen_HueOutOfRange() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(300, 50, 50);
    assertEquals(0, hslColor.getGreen(), "Green value should be 0 for hue out of range");
}

@Test
void testGetGreen_SaturationOutOfRange() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(180, 300, 50);
    assertEquals(0, hslColor.getGreen(), "Green value should be 0 for saturation out of range");
}

@Test
void testGetGreen_LuminenceOutOfRange() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(240, 50, 300);
    assertEquals(255, hslColor.getGreen(), "Green value should be 255 for luminence out of range");
}

@Test
void testGetGreen_Blend() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(120, 50, 75);
    hslColor.blend(0, 255, 0, 0.5f);
    assertEquals(128, hslColor.getGreen(), "Green value should be blended correctly");
}

@Test
void testGetGreen_ReverseColor() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(120, 50, 75);
    hslColor.reverseColor();
    assertEquals(128, hslColor.getGreen(), "Green value should be reversed correctly");
}
}