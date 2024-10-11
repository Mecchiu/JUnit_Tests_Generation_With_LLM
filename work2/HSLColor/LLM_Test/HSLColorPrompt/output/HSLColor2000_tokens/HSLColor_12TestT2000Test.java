package hslcolor;
// HSLColor_12Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#brighten(float)} method.
*/
class HSLColor_12Test {
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
        assertEquals(HSLColor.HSLMAX, color.getLuminence(), "Luminance should be max when brightening by 100%");
    }

    @Test
    void testBrightenHalfPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalLuminance = color.getLuminence();
        color.brighten(0.5f);
        assertEquals(originalLuminance / 2, color.getLuminence(), "Luminance should be halved when brightening by 50%");
    }

    @Test
    void testBrightenNegativePercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.brighten(-0.5f);
        assertEquals(0, color.getLuminence(), "Luminance should be 0 when brightening by a negative percent");
    }

    @Test
    void testBrightenOverMaxPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.brighten(2);
        assertEquals(HSLColor.HSLMAX, color.getLuminence(), "Luminance should be max when brightening by more than 100%");
    }

    @Test
    void testBrightenSmallPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalLuminance = color.getLuminence();
        color.brighten(0.1f);
        assertEquals((int)(originalLuminance * 0.1f), color.getLuminence(), "Luminance should be 10% of original when brightening by 10%");
    }

    @Test
    void testBrightenLargePercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalLuminance = color.getLuminence();
        color.brighten(0.9f);
        assertEquals((int)(originalLuminance * 0.9f), color.getLuminence(), "Luminance should be 90% of original when brightening by 90%");
    }

    @Test
    void testBrightenWithZeroLuminance() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0);
        color.brighten(0.5f);
        assertEquals(0, color.getLuminence(), "Luminance should remain 0 when brightening a black color");
    }

    @Test
    void testBrightenWithMaxLuminance() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255);
        color.brighten(0.5f);
        assertEquals(HSLColor.HSLMAX, color.getLuminence(), "Luminance should remain max when brightening a white color");
    }

    @Test
    void testBrightenWithMidLuminance() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128);
        int originalLuminance = color.getLuminence();
        color.brighten(0.5f);
        assertEquals((int)(originalLuminance * 0.5f), color.getLuminence(), "Luminance should be halved when brightening a mid-gray color by 50%");
    }
}