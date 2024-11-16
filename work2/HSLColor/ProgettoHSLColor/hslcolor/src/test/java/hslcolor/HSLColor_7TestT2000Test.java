// HSLColor_7Test.java

package hslcolor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#setLuminence(int)} method.
*/
class HSLColor_7Test {
@Test
void testSetLuminence_LessThanZero() {
    HSLColor hslColor = new HSLColor();
    hslColor.setLuminence(-10);
    assertEquals(0, hslColor.getLuminence());
}

@Test
void testSetLuminence_GreaterThanMax() {
    HSLColor hslColor = new HSLColor();
    hslColor.setLuminence(300);
    assertEquals(255, hslColor.getLuminence());
}

@Test
void testSetLuminence_Zero() {
    HSLColor hslColor = new HSLColor();
    hslColor.setLuminence(0);
    assertEquals(0, hslColor.getLuminence());
}

@Test
void testSetLuminence_Max() {
    HSLColor hslColor = new HSLColor();
    hslColor.setLuminence(255);
    assertEquals(255, hslColor.getLuminence());
}

@Test
void testSetLuminence_BetweenZeroAndMax() {
    HSLColor hslColor = new HSLColor();
    hslColor.setLuminence(150);
    assertEquals(150, hslColor.getLuminence());
}

@Test
void testSetLuminence_NegativeValue() {
    HSLColor hslColor = new HSLColor();
    hslColor.setLuminence(-50);
    assertEquals(0, hslColor.getLuminence());
}

@Test
void testSetLuminence_ValueGreaterThanMax() {
    HSLColor hslColor = new HSLColor();
    hslColor.setLuminence(300);
    assertEquals(255, hslColor.getLuminence());
}

@Test
void testSetLuminence_HighValue() {
    HSLColor hslColor = new HSLColor();
    hslColor.setLuminence(200);
    assertEquals(200, hslColor.getLuminence());
}

@Test
void testSetLuminence_LowValue() {
    HSLColor hslColor = new HSLColor();
    hslColor.setLuminence(50);
    assertEquals(50, hslColor.getLuminence());
}

@Test
void testSetLuminence_MaxValue() {
    HSLColor hslColor = new HSLColor();
    hslColor.setLuminence(255);
    assertEquals(255, hslColor.getLuminence());
}
}