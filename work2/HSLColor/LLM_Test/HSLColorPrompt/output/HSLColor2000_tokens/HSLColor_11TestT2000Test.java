// HSLColor_11Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#reverseColor()} method.
*/
class HSLColor_11Test {
```java
    @Test
    void testReverseColor_1() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0); // Red
        color.reverseColor();
        assertEquals(85, color.getHue()); // Cyan
    }

    @Test
    void testReverseColor_2() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 0); // Green
        color.reverseColor();
        assertEquals(213, color.getHue()); // Magenta
    }

    @Test
    void testReverseColor_3() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 255); // Blue
        color.reverseColor();
        assertEquals(42, color.getHue()); // Yellow
    }

    @Test
    void testReverseColor_4() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 0); // Yellow
        color.reverseColor();
        assertEquals(127, color.getHue()); // Blue
    }

    @Test
    void testReverseColor_5() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 255, 255); // Cyan
        color.reverseColor();
        assertEquals(0, color.getHue()); // Red
    }

    @Test
    void testReverseColor_6() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 255); // Magenta
        color.reverseColor();
        assertEquals(170, color.getHue()); // Green
    }

    @Test
    void testReverseColor_7() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128); // Grey
        color.reverseColor();
        assertEquals(170, color.getHue()); // Grey remains unchanged
    }

    @Test
    void testReverseColor_8() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255); // White
        color.reverseColor();
        assertEquals(170, color.getHue()); // White remains unchanged
    }

    @Test
    void testReverseColor_9() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0); // Black
        color.reverseColor();
        assertEquals(170, color.getHue()); // Black remains unchanged
    }

    @Test
    void testReverseColor_10() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(123, 234, 45); // Random color
        int originalHue = color.getHue();
        color.reverseColor();
        assertEquals((originalHue + 127) % 255, color.getHue()); // Check reversed hue
    }
}
```

These test cases cover a variety of scenarios, including primary colors, secondary colors, greyscale, and random colors. The `reverseColor` method is expected to shift the hue by 127 (half of 255) to achieve the complementary color. The tests also ensure that greyscale colors remain unchanged, as they do not have a defined hue.