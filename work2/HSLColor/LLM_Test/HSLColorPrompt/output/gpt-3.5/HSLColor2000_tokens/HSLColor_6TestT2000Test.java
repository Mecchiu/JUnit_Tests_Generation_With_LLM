// HSLColor_6Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getLuminence()} method.
*/
class HSLColor_6Test {
```java
@Test
void testGetLuminence_WhenInitializedWithRGB_ExpectCorrectLuminence() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(100, 150, 200);
    assertEquals(170, hslColor.getLuminence());
}

@Test
void testGetLuminence_WhenInitializedWithHSL_ExpectCorrectLuminence() {
    HSLColor hslColor = new HSLColor();
    hslColor.initRGBbyHSL(120, 200, 100);
    assertEquals(100, hslColor.getLuminence());
}

@Test
void testSetLuminence_WhenValueWithinRange_ExpectLuminenceUpdated() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(50, 100, 150);
    hslColor.setLuminence(200);
    assertEquals(200, hslColor.getLuminence());
}

@Test
void testSetLuminence_WhenValueBelowRange_ExpectLuminenceSetToMinimum() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(50, 100, 150);
    hslColor.setLuminence(-50);
    assertEquals(0, hslColor.getLuminence());
}

@Test
void testSetLuminence_WhenValueAboveRange_ExpectLuminenceSetToMaximum() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(50, 100, 150);
    hslColor.setLuminence(300);
    assertEquals(255, hslColor.getLuminence());
}

@Test
void testSetLuminence_WhenValueZero_ExpectLuminenceSetToZero() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(50, 100, 150);
    hslColor.setLuminence(0);
    assertEquals(0, hslColor.getLuminence());
}

@Test
void testSetLuminence_WhenValueMax_ExpectLuminenceSetToMax() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(50, 100, 150);
    hslColor.setLuminence(255);
    assertEquals(255, hslColor.getLuminence());
}

@Test
void testSetLuminence_WhenValueUnchanged_ExpectLuminenceUnchanged() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(50, 100, 150);
    hslColor.setLuminence(150);
    assertEquals(150, hslColor.getLuminence());
}

@Test
void testSetLuminence_WhenValueNegative_ExpectLuminenceSetToZero() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(50, 100, 150);
    hslColor.setLuminence(-100);
    assertEquals(0, hslColor.getLuminence());
}

@Test
void testSetLuminence_WhenValueExceedsMax_ExpectLuminenceSetToMax() {
    HSLColor hslColor = new HSLColor();
    hslColor.initHSLbyRGB(50, 100, 150);
    hslColor.setLuminence(300);
    assertEquals(255, hslColor.getLuminence());
}
```
