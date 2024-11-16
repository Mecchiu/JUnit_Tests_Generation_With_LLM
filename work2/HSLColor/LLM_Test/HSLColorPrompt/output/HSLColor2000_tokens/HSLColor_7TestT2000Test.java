// HSLColor_7Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#setLuminence(int)} method.
*/
class HSLColor_7Test {
```java
    @Test
    void testSetLuminenceWithinRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(128);
        assertEquals(128, color.getLuminence());
    }

    @Test
    void testSetLuminenceBelowRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(-10);
        assertEquals(0, color.getLuminence());
    }

    @Test
    void testSetLuminenceAboveRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(300);
        assertEquals(255, color.getLuminence());
    }

    @Test
    void testSetLuminenceZero() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(0);
        assertEquals(0, color.getLuminence());
    }

    @Test
    void testSetLuminenceMax() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(255);
        assertEquals(255, color.getLuminence());
    }

    @Test
    void testSetLuminenceMidRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setLuminence(127);
        assertEquals(127, color.getLuminence());
    }

    @Test
    void testSetLuminenceWithGreyscale() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128);
        color.setLuminence(100);
        assertEquals(100, color.getLuminence());
    }

    @Test
    void testSetLuminenceWithSaturatedColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0);
        color.setLuminence(200);
        assertEquals(200, color.getLuminence());
    }

    @Test
    void testSetLuminenceWithDesaturatedColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 100, 100);
        color.setLuminence(50);
        assertEquals(50, color.getLuminence());
    }

    @Test
    void testSetLuminenceWithRandomColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(123, 234, 45);
        color.setLuminence(180);
        assertEquals(180, color.getLuminence());
    }
}
```

These test cases cover various scenarios for the `setLuminence` method, including setting luminance within the valid range, below the range, above the range, and with different types of colors (greyscale, saturated, desaturated, and random colors).