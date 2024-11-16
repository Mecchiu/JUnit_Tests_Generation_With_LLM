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
    void testGetLuminence_Zero() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0); // Black
        assertEquals(0, color.getLuminence());
    }

    @Test
    void testGetLuminence_White() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255); // White
        assertEquals(255, color.getLuminence());
    }

    @Test
    void testGetLuminence_Red() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0); // Red
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testGetLuminence_Green() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 0); // Green
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testGetLuminence_Blue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 255); // Blue
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testGetLuminence_Yellow() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 0); // Yellow
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testGetLuminence_Cyan() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 255); // Cyan
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testGetLuminence_Magenta() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 255); // Magenta
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testGetLuminence_Gray() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128); // Gray
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testGetLuminence_MidGray() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(192, 192, 192); // Light Gray
        assertEquals(192, color.getLuminence());
    }
}
```

This test class `HSLColor_6Test` contains ten unit test cases for the `getLuminence()` method of the `HSLColor` class. Each test case initializes an `HSLColor` object with specific RGB values and asserts that the calculated luminance matches the expected value.