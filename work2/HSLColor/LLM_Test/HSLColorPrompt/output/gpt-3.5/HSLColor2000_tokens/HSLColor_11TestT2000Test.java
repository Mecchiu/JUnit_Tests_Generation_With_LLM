// HSLColor_11Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#reverseColor()} method.
*/
class HSLColor_11Test {
```java
import static org.junit.jupiter.api.Assertions.assertEquals;

class HSLColor_11Test {

    @Test
    void testReverseColor() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(255, 0, 0); // Red color
        hslColor.reverseColor();
        assertEquals(0, hslColor.getHue());
    }

    @Test
    void testReverseColorWithHueWrapAround() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(0, 255, 0); // Green color
        hslColor.reverseColor();
        assertEquals(128, hslColor.getHue());
    }

    @Test
    void testReverseColorWithHueOverflow() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(0, 0, 255); // Blue color
        hslColor.reverseColor();
        assertEquals(85, hslColor.getHue());
    }

    @Test
    void testReverseColorWithGreyscale() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(128, 128, 128); // Grey color
        hslColor.reverseColor();
        assertEquals(170, hslColor.getHue());
    }

    @Test
    void testReverseColorWithMaxHue() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(255, 255, 255); // White color
        hslColor.reverseColor();
        assertEquals(128, hslColor.getHue());
    }

    @Test
    void testReverseColorWithMinHue() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(0, 0, 0); // Black color
        hslColor.reverseColor();
        assertEquals(128, hslColor.getHue());
    }

    @Test
    void testReverseColorWithRandomColor() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 150, 200); // Random color
        hslColor.reverseColor();
        assertEquals(218, hslColor.getHue());
    }

    @Test
    void testReverseColorWithNegativeHue() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(200, 100, 50); // Random color
        hslColor.reverseColor();
        assertEquals(78, hslColor.getHue());
    }

    @Test
    void testReverseColorWithHueOverflowNegative() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(50, 200, 100); // Random color
        hslColor.reverseColor();
        assertEquals(198, hslColor.getHue());
    }

    @Test
    void testReverseColorWithZeroSaturation() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 100, 100); // Grey color
        hslColor.reverseColor();
        assertEquals(170, hslColor.getHue());
    }
}
```
