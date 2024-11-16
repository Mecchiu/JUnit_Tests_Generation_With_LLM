// HSLColor_1Test.java

package hslcolor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#initRGBbyHSL(int, int, int)} method.
*/
class HSLColor_1Test {
@Test
void testInitRGBbyHSL_Greyscale() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(170, 0, 127);
    assertEquals(127, hslColor.getRed());
    assertEquals(127, hslColor.getGreen());
    assertEquals(127, hslColor.getBlue());
}

@Test
void testInitRGBbyHSL_SaturatedColor() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(85, 255, 127);
    assertEquals(255, hslColor.getRed());
    assertEquals(0, hslColor.getGreen());
    assertEquals(127, hslColor.getBlue());
}

@Test
void testInitRGBbyHSL_LowSaturation() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(42, 63, 191);
    assertEquals(191, hslColor.getRed());
    assertEquals(191, hslColor.getGreen());
    assertEquals(191, hslColor.getBlue());
}

@Test
void testInitRGBbyHSL_HighSaturation() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(127, 191, 127);
    assertEquals(127, hslColor.getRed());
    assertEquals(255, hslColor.getGreen());
    assertEquals(127, hslColor.getBlue());
}

@Test
void testInitRGBbyHSL_LowLuminence() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(170, 127, 63);
    assertEquals(63, hslColor.getRed());
    assertEquals(63, hslColor.getGreen());
    assertEquals(63, hslColor.getBlue());
}

@Test
void testInitRGBbyHSL_HighLuminence() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(170, 127, 191);
    assertEquals(191, hslColor.getRed());
    assertEquals(191, hslColor.getGreen());
    assertEquals(191, hslColor.getBlue());
}

@Test
void testInitRGBbyHSL_RedHue() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 255, 127);
    assertEquals(255, hslColor.getRed());
    assertEquals(0, hslColor.getGreen());
    assertEquals(0, hslColor.getBlue());
}

@Test
void testInitRGBbyHSL_GreenHue() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(85, 255, 127);
    assertEquals(0, hslColor.getRed());
    assertEquals(255, hslColor.getGreen());
    assertEquals(0, hslColor.getBlue());
}

@Test
void testInitRGBbyHSL_BlueHue() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(170, 255, 127);
    assertEquals(0, hslColor.getRed());
    assertEquals(0, hslColor.getGreen());
    assertEquals(255, hslColor.getBlue());
}

@Test
void testInitRGBbyHSL_ReverseColor() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 255, 127);
    hslColor.reverseColor();
    assertEquals(127, hslColor.getRed());
    assertEquals(0, hslColor.getGreen());
    assertEquals(255, hslColor.getBlue());
}
}