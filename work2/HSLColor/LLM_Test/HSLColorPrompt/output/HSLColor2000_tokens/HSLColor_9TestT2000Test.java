// HSLColor_9Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#getGreen()} method.
*/
class HSLColor_9Test {
```java
    @Test
    void testGetGreenWithBlack() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0);
        assertEquals(0, color.getGreen(), "Green value for black should be 0");
    }

    @Test
    void testGetGreenWithWhite() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255);
        assertEquals(255, color.getGreen(), "Green value for white should be 255");
    }

    @Test
    void testGetGreenWithRed() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0);
        assertEquals(0, color.getGreen(), "Green value for red should be 0");
    }

    @Test
    void testGetGreenWithLime() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 0);
        assertEquals(255, color.getGreen(), "Green value for lime should be 255");
    }

    @Test
    void testGetGreenWithBlue() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 255);
        assertEquals(0, color.getGreen(), "Green value for blue should be 0");
    }

    @Test
    void testGetGreenWithYellow() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 0);
        assertEquals(255, color.getGreen(), "Green value for yellow should be 255");
    }

    @Test
    void testGetGreenWithCyan() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 255);
        assertEquals(255, color.getGreen(), "Green value for cyan should be 255");
    }

    @Test
    void testGetGreenWithMagenta() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 255);
        assertEquals(0, color.getGreen(), "Green value for magenta should be 0");
    }

    @Test
    void testGetGreenWithGray() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128);
        assertEquals(128, color.getGreen(), "Green value for gray should be 128");
    }

    @Test
    void testGetGreenWithRandomColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(123, 234, 45);
        assertEquals(234, color.getGreen(), "Green value for the color (123, 234, 45) should be 234");
    }
}
```

This test class `HSLColor_9Test` contains ten unit test cases for the `getGreen()` method of the `HSLColor` class. Each test case initializes an `HSLColor` object with specific RGB values and asserts that the `getGreen()` method returns the expected green component.