// HSLColor_12Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#brighten(float)} method.
*/
class HSLColor_12Test {
```java
    @Test
    void testBrightenZeroPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalLuminance = color.getLuminence();
        color.brighten(0);
        assertEquals(originalLuminance, color.getLuminence(), "Luminance should remain unchanged when brightening by 0%");
    }

    @Test
    void testBrightenFullPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.brighten(1);
        assertEquals(255, color.getLuminence(), "Luminance should be maximum when brightening by 100%");
    }

    @Test
    void testBrightenHalfPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalLuminance = color.getLuminence();
        color.brighten(0.5f);
        assertTrue(color.getLuminence() > originalLuminance, "Luminance should increase when brightening by 50%");
    }

    @Test
    void testBrightenNegativePercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalLuminance = color.getLuminence();
        color.brighten(-0.5f);
        assertEquals(originalLuminance, color.getLuminence(), "Luminance should remain unchanged when brightening by a negative percent");
    }

    @Test
    void testBrightenOverMaxPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.brighten(2);
        assertEquals(255, color.getLuminence(), "Luminance should be maximum when brightening by more than 100%");
    }

    @Test
    void testBrightenSmallPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalLuminance = color.getLuminence();
        color.brighten(0.1f);
        assertTrue(color.getLuminence() > originalLuminance, "Luminance should increase when brightening by 10%");
    }

    @Test
    void testBrightenLargePercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalLuminance = color.getLuminence();
        color.brighten(0.9f);
        assertTrue(color.getLuminence() > originalLuminance, "Luminance should increase significantly when brightening by 90%");
    }

    @Test
    void testBrightenToMax() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.brighten(1.5f);
        assertEquals(255, color.getLuminence(), "Luminance should be maximum when brightening by 150%");
    }

    @Test
    void testBrightenFromZero() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0);
        color.brighten(0.5f);
        assertTrue(color.getLuminence() > 0, "Luminance should increase from zero when brightening by 50%");
    }

    @Test
    void testBrightenFromMax() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255);
        int originalLuminance = color.getLuminence();
        color.brighten(0.5f);
        assertEquals(originalLuminance, color.getLuminence(), "Luminance should remain maximum when brightening from maximum");
    }
}
```

These test cases cover various scenarios for the `brighten` method, including edge cases like zero and full percent brightening, as well as negative and over-maximum percentages.