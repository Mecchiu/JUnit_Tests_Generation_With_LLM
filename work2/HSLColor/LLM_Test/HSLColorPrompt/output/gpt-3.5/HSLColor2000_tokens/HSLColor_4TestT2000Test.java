// HSLColor_4Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getSaturation()} method.
*/
class HSLColor_4Test {
```java
@Test
void testSaturationZero() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 0, 100);
    assertEquals(0, hslColor.getSaturation());
}

@Test
void testSaturationHalf() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 128, 100);
    assertEquals(128, hslColor.getSaturation());
}

@Test
void testSaturationMax() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 255, 100);
    assertEquals(255, hslColor.getSaturation());
}

@Test
void testSaturationNegative() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, -50, 100);
    assertEquals(0, hslColor.getSaturation());
}

@Test
void testSaturationOverMax() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 300, 100);
    assertEquals(255, hslColor.getSaturation());
}

@Test
void testSaturationChange() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 100, 100);
    hslColor.setSaturation(200);
    assertEquals(255, hslColor.getSaturation());
}

@Test
void testSaturationChangeToZero() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 100, 100);
    hslColor.setSaturation(0);
    assertEquals(0, hslColor.getSaturation());
}

@Test
void testSaturationChangeToNegative() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 100, 100);
    hslColor.setSaturation(-50);
    assertEquals(0, hslColor.getSaturation());
}

@Test
void testSaturationChangeOverMax() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 100, 100);
    hslColor.setSaturation(300);
    assertEquals(255, hslColor.getSaturation());
}

@Test
void testSaturationChangeUnderZero() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(0, 100, 100);
    hslColor.setSaturation(-100);
    assertEquals(0, hslColor.getSaturation());
}
```
