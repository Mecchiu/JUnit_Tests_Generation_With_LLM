package hslcolor;
// HSLColor_13Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#blend(int, int, int, float)} method.
*/
class HSLColor_13Test {
    @Test
    void testBlendFullPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(50, 100, 150, 1.0f);
        assertEquals(50, color.getRed());
        assertEquals(100, color.getGreen());
        assertEquals(150, color.getBlue());
    }

    @Test
    void testBlendZeroPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(50, 100, 150, 0.0f);
        assertEquals(100, color.getRed());
        assertEquals(150, color.getGreen());
        assertEquals(200, color.getBlue());
    }

    @Test
    void testBlendHalfPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(50, 100, 150, 0.5f);
        assertEquals(75, color.getRed());
        assertEquals(125, color.getGreen());
        assertEquals(175, color.getBlue());
    }

    @Test
    void testBlendQuarterPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(50, 100, 150, 0.25f);
        assertEquals(87, color.getRed());
        assertEquals(137, color.getGreen());
        assertEquals(187, color.getBlue());
    }

    @Test
    void testBlendThreeQuarterPercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(50, 100, 150, 0.75f);
        assertEquals(62, color.getRed());
        assertEquals(112, color.getGreen());
        assertEquals(162, color.getBlue());
    }

    @Test
    void testBlendNegativePercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(50, 100, 150, -0.5f);
        assertEquals(100, color.getRed());
        assertEquals(150, color.getGreen());
        assertEquals(200, color.getBlue());
    }

    @Test
    void testBlendOverOnePercent() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(50, 100, 150, 1.5f);
        assertEquals(50, color.getRed());
        assertEquals(100, color.getGreen());
        assertEquals(150, color.getBlue());
    }

    @Test
    void testBlendWithBlack() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(0, 0, 0, 0.5f);
        assertEquals(50, color.getRed());
        assertEquals(75, color.getGreen());
        assertEquals(100, color.getBlue());
    }

    @Test
    void testBlendWithWhite() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(255, 255, 255, 0.5f);
        assertEquals(177, color.getRed());
        assertEquals(202, color.getGreen());
        assertEquals(227, color.getBlue());
    }

    @Test
    void testBlendWithSameColor() {
        HSLColor color = new HSLColor();
        color.initHSLbyRGB(100, 150, 200);
        color.blend(100, 150, 200, 0.5f);
        assertEquals(100, color.getRed());
        assertEquals(150, color.getGreen());
        assertEquals(200, color.getBlue());
    }
}