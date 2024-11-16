// HSLColor_5Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#setSaturation(int)} method.
*/
class HSLColor_5Test {
```java
    @Test
    void testSetSaturationWithinRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(128);
        assertEquals(128, color.getSaturation());
    }

    @Test
    void testSetSaturationBelowRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(-10);
        assertEquals(0, color.getSaturation());
    }

    @Test
    void testSetSaturationAboveRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(300);
        assertEquals(255, color.getSaturation());
    }

    @Test
    void testSetSaturationZero() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(0);
        assertEquals(0, color.getSaturation());
    }

    @Test
    void testSetSaturationMax() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.setSaturation(255);
        assertEquals(255, color.getSaturation());
    }

    @Test
    void testSetSaturationNoChange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int initialSaturation = color.getSaturation();
        color.setSaturation(initialSaturation);
        assertEquals(initialSaturation, color.getSaturation());
    }

    @Test
    void testSetSaturationWithHueChange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int initialHue = color.getHue();
        color.setSaturation(128);
        assertEquals(initialHue, color.getHue());
    }

    @Test
    void testSetSaturationWithLuminanceChange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int initialLuminance = color.getLuminence();
        color.setSaturation(128);
        assertEquals(initialLuminance, color.getLuminence());
    }

    @Test
    void testSetSaturationWithRedChange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int initialRed = color.getRed();
        color.setSaturation(128);
        assertNotEquals(initialRed, color.getRed());
    }

    @Test
    void testSetSaturationWithGreenChange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int initialGreen = color.getGreen();
        color.setSaturation(128);
        assertNotEquals(initialGreen, color.getGreen());
    }

    @Test
    void testSetSaturationWithBlueChange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int initialBlue = color.getBlue();
        color.setSaturation(128);
        assertNotEquals(initialBlue, color.getBlue());
    }
}
```

This test class `HSLColor_5Test` contains unit tests for the `setSaturation` method of the `HSLColor` class. It checks various scenarios such as setting saturation within range, below range, above range, and ensuring that other properties like hue and luminance remain unchanged while RGB values may change.