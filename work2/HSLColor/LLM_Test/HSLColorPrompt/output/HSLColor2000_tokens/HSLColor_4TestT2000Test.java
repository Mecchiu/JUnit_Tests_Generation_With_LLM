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
    void testGetSaturation_ZeroSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128); // Grey color, should have zero saturation
        assertEquals(0, color.getSaturation());
    }

    @Test
    void testGetSaturation_MaxSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0); // Pure red, should have maximum saturation
        assertEquals(255, color.getSaturation());
    }

    @Test
    void testGetSaturation_HalfSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(192, 64, 64); // A shade of red with half saturation
        assertTrue(color.getSaturation() > 0 && color.getSaturation() < 255);
    }

    @Test
    void testGetSaturation_BlueColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 255); // Pure blue, should have maximum saturation
        assertEquals(255, color.getSaturation());
    }

    @Test
    void testGetSaturation_GreenColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 0); // Pure green, should have maximum saturation
        assertEquals(255, color.getSaturation());
    }

    @Test
    void testGetSaturation_YellowColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 0); // Yellow, should have maximum saturation
        assertEquals(255, color.getSaturation());
    }

    @Test
    void testGetSaturation_CyanColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 255); // Cyan, should have maximum saturation
        assertEquals(255, color.getSaturation());
    }

    @Test
    void testGetSaturation_MagentaColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 255); // Magenta, should have maximum saturation
        assertEquals(255, color.getSaturation());
    }

    @Test
    void testGetSaturation_WhiteColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255); // White, should have zero saturation
        assertEquals(0, color.getSaturation());
    }

    @Test
    void testGetSaturation_BlackColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0); // Black, should have zero saturation
        assertEquals(0, color.getSaturation());
    }
}
```

This test class `HSLColor_4Test` contains ten unit test cases for the `getSaturation()` method of the `HSLColor` class. Each test case initializes an `HSLColor` object with specific RGB values and checks if the saturation value is as expected.