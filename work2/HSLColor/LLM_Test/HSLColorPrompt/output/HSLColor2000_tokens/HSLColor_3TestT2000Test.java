package hslcolor;
// HSLColor_3Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#setHue(int)} method.
*/
class HSLColor_3Test {
    @Test
    void testSetHueWithinRange() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalSaturation = color.getSaturation();
        int originalLuminance = color.getLuminence();
        
        color.setHue(120);
        assertEquals(120, color.getHue());
        assertEquals(originalSaturation, color.getSaturation());
        assertEquals(originalLuminance, color.getLuminence());
    }

    @Test
    void testSetHueBelowZero() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalSaturation = color.getSaturation();
        int originalLuminance = color.getLuminence();
        
        color.setHue(-10);
        assertEquals(245, color.getHue()); // -10 + 255
        assertEquals(originalSaturation, color.getSaturation());
        assertEquals(originalLuminance, color.getLuminence());
    }

    @Test
    void testSetHueAboveMax() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalSaturation = color.getSaturation();
        int originalLuminance = color.getLuminence();
        
        color.setHue(300);
        assertEquals(45, color.getHue()); // 300 - 255
        assertEquals(originalSaturation, color.getSaturation());
        assertEquals(originalLuminance, color.getLuminence());
    }

    @Test
    void testSetHueAtZero() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalSaturation = color.getSaturation();
        int originalLuminance = color.getLuminence();
        
        color.setHue(0);
        assertEquals(0, color.getHue());
        assertEquals(originalSaturation, color.getSaturation());
        assertEquals(originalLuminance, color.getLuminence());
    }

    @Test
    void testSetHueAtMax() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        int originalSaturation = color.getSaturation();
        int originalLuminance = color.getLuminence();
        
        color.setHue(255);
        assertEquals(255, color.getHue());
        assertEquals(originalSaturation, color.getSaturation());
        assertEquals(originalLuminance, color.getLuminence());
    }

    @Test
    void testSetHueWithGreyscale() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128); // Greyscale
        int originalSaturation = color.getSaturation();
        int originalLuminance = color.getLuminence();
        
        color.setHue(100);
        assertEquals(100, color.getHue());
        assertEquals(originalSaturation, color.getSaturation());
        assertEquals(originalLuminance, color.getLuminence());
    }

    @Test
    void testSetHueWithFullSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 0, 0); // Full saturation
        int originalSaturation = color.getSaturation();
        int originalLuminance = color.getLuminence();
        
        color.setHue(180);
        assertEquals(180, color.getHue());
        assertEquals(originalSaturation, color.getSaturation());
        assertEquals(originalLuminance, color.getLuminence());
    }

    @Test
    void testSetHueWithFullLuminance() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(255, 255, 255); // Full luminance
        int originalSaturation = color.getSaturation();
        int originalLuminance = color.getLuminence();
        
        color.setHue(90);
        assertEquals(90, color.getHue());
        assertEquals(originalSaturation, color.getSaturation());
        assertEquals(originalLuminance, color.getLuminence());
    }

    @Test
    void testSetHueWithZeroSaturation() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(128, 128, 128); // Zero saturation
        int originalSaturation = color.getSaturation();
        int originalLuminance = color.getLuminence();
        
        color.setHue(200);
        assertEquals(200, color.getHue());
        assertEquals(originalSaturation, color.getSaturation());
        assertEquals(originalLuminance, color.getLuminence());
    }

    @Test
    void testSetHueWithZeroLuminance() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(0, 0, 0); // Zero luminance
        int originalSaturation = color.getSaturation();
        int originalLuminance = color.getLuminence();
        
        color.setHue(150);
        assertEquals(150, color.getHue());
        assertEquals(originalSaturation, color.getSaturation());
        assertEquals(originalLuminance, color.getLuminence());
    }
}