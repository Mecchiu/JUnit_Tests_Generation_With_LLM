// HSLColor_8Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getRed()} method.
*/
class HSLColor_8Test {
```java
@Test
void testGetRed() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 255, 128);
    assertEquals(255, hslColor.getRed());
}

@Test
void testGetRed_Greyscale() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 0, 128);
    assertEquals(128, hslColor.getRed());
}

@Test
void testGetRed_MaxSaturation() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 255, 0);
    assertEquals(0, hslColor.getRed());
}

@Test
void testGetRed_MaxLuminence() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 0, 255);
    assertEquals(255, hslColor.getRed());
}

@Test
void testGetRed_HueShift() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(85, 255, 128);
    assertEquals(128, hslColor.getRed());
}

@Test
void testGetRed_LuminenceShift() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 255, 64);
    assertEquals(191, hslColor.getRed());
}

@Test
void testGetRed_SaturationShift() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 128, 128);
    assertEquals(128, hslColor.getRed());
}

@Test
void testGetRed_Blend() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 255, 128);
    hslColor.blend(128, 0, 255, 0.5f);
    assertEquals(191, hslColor.getRed());
}

@Test
void testGetRed_Brighten() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 255, 128);
    hslColor.brighten(0.5f);
    assertEquals(191, hslColor.getRed());
}
```
