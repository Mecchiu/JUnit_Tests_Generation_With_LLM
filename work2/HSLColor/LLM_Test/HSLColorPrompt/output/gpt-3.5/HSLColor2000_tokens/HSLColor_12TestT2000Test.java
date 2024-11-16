// HSLColor_12Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#brighten(float)} method.
*/
class HSLColor_12Test {
```java
class HSLColor_12Test {

    @Test
    void testBrighten_ZeroPercent() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 150, 200);
        hslColor.brighten(0);
        assertEquals(0, hslColor.getLuminence());
    }

    @Test
    void testBrighten_PositivePercent() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 150, 200);
        hslColor.brighten(0.5f);
        assertTrue(hslColor.getLuminence() > 0 && hslColor.getLuminence() < 255);
    }

    @Test
    void testBrighten_MaxPercent() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 150, 200);
        hslColor.brighten(1);
        assertEquals(255, hslColor.getLuminence());
    }

    @Test
    void testBrighten_NegativePercent() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 150, 200);
        hslColor.brighten(-0.5f);
        assertTrue(hslColor.getLuminence() >= 0 && hslColor.getLuminence() < 150);
    }

    @Test
    void testBrighten_LowerBound() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 150, 200);
        hslColor.brighten(-1);
        assertEquals(0, hslColor.getLuminence());
    }

    @Test
    void testBrighten_UpperBound() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 150, 200);
        hslColor.brighten(2);
        assertEquals(255, hslColor.getLuminence());
    }

    @Test
    void testBrighten_RoundingDown() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 150, 200);
        hslColor.brighten(0.3f);
        assertTrue(hslColor.getLuminence() > 0 && hslColor.getLuminence() < 255);
    }

    @Test
    void testBrighten_RoundingUp() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 150, 200);
        hslColor.brighten(0.7f);
        assertTrue(hslColor.getLuminence() > 0 && hslColor.getLuminence() < 255);
    }

    @Test
    void testBrighten_NoChange() {
        HSLColor hslColor = new HSLColor();
        hslColor.initHSLbyRGB(100, 150, 200);
        hslColor.brighten(0.0f);
        assertEquals(128, hslColor.getLuminence());
    }
}
```
```