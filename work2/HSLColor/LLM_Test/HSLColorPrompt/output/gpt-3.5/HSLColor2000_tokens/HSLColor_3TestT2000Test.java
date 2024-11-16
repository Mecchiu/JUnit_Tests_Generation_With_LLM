// HSLColor_3Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#setHue(int)} method.
*/
class HSLColor_3Test {
```java
@Test
void testSetHue_PositiveValue() {
    HSLColor color = new HSLColor();
    color.initRGBbyHSL(0, 255, 128);
    color.setHue(100);
    assertEquals(100, color.getHue());
}

@Test
void testSetHue_NegativeValue() {
    HSLColor color = new HSLColor();
    color.initRGBbyHSL(0, 255, 128);
    color.setHue(-50);
    assertEquals(205, color.getHue());
}

@Test
void testSetHue_ValueGreaterThanHSLMAX() {
    HSLColor color = new HSLColor();
    color.initRGBbyHSL(0, 255, 128);
    color.setHue(300);
    assertEquals(45, color.getHue());
}

@Test
void testSetHue_ZeroValue() {
    HSLColor color = new HSLColor();
    color.initRGBbyHSL(0, 255, 128);
    color.setHue(0);
    assertEquals(0, color.getHue());
}

@Test
void testSetHue_MaxValue() {
    HSLColor color = new HSLColor();
    color.initRGBbyHSL(0, 255, 128);
    color.setHue(255);
    assertEquals(255, color.getHue());
}

@Test
void testSetHue_Greyscale() {
    HSLColor color = new HSLColor();
    color.initRGBbyHSL(0, 0, 128);
    color.setHue(50);
    assertEquals(170, color.getHue());
}

@Test
void testSetHue_MaxSaturation() {
    HSLColor color = new HSLColor();
    color.initRGBbyHSL(0, 255, 128);
    color.setSaturation(255);
    color.setHue(100);
    assertEquals(100, color.getHue());
}

@Test
void testSetHue_MinSaturation() {
    HSLColor color = new HSLColor();
    color.initRGBbyHSL(0, 0, 128);
    color.setHue(50);
    assertEquals(170, color.getHue());
}

@Test
void testSetHue_MaxLuminence() {
    HSLColor color = new HSLColor();
    color.initRGBbyHSL(0, 255, 255);
    color.setHue(100);
    assertEquals(100, color.getHue());
}

@Test
void testSetHue_MinLuminence() {
    HSLColor color = new HSLColor();
    color.initRGBbyHSL(0, 255, 0);
    color.setHue(50);
    assertEquals(170, color.getHue());
}
```
