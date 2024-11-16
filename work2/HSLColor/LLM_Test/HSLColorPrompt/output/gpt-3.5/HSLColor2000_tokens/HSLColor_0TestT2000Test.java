// HSLColor_0Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#initHSLbyRGB(int, int, int)} method.
*/
class HSLColor_0Test {
```java
    @Test
    void testInitHSLbyRGB_Grey() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(128, 128, 128);
        assertEquals(0, hslColor.getSaturation());
        assertEquals(170, hslColor.getHue());
        assertEquals(128, hslColor.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Red() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(255, 0, 0);
        assertEquals(255, hslColor.getSaturation());
        assertEquals(0, hslColor.getHue());
        assertEquals(76, hslColor.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Green() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(0, 255, 0);
        assertEquals(255, hslColor.getSaturation());
        assertEquals(85, hslColor.getHue());
        assertEquals(76, hslColor.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Blue() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(0, 0, 255);
        assertEquals(255, hslColor.getSaturation());
        assertEquals(170, hslColor.getHue());
        assertEquals(76, hslColor.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Yellow() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(255, 255, 0);
        assertEquals(255, hslColor.getSaturation());
        assertEquals(42, hslColor.getHue());
        assertEquals(76, hslColor.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Cyan() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(0, 255, 255);
        assertEquals(255, hslColor.getSaturation());
        assertEquals(127, hslColor.getHue());
        assertEquals(76, hslColor.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_Magenta() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(255, 0, 255);
        assertEquals(255, hslColor.getSaturation());
        assertEquals(212, hslColor.getHue());
        assertEquals(76, hslColor.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_LowSaturation() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 150, 200);
        assertEquals(85, hslColor.getSaturation());
        assertEquals(212, hslColor.getHue());
        assertEquals(60, hslColor.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_HighSaturation() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(200, 100, 50);
        assertEquals(170, hslColor.getSaturation());
        assertEquals(42, hslColor.getHue());
        assertEquals(60, hslColor.getLuminence());
    }

    @Test
    void testInitHSLbyRGB_HighLuminence() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(50, 100, 200);
        assertEquals(85, hslColor.getSaturation());
        assertEquals(170, hslColor.getHue());
        assertEquals(80, hslColor.getLuminence());
    }
}
```