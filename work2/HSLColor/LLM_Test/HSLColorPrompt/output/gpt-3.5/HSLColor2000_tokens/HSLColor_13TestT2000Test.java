// HSLColor_13Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#blend(int, int, int, float)} method.
*/
class HSLColor_13Test {
```java
@Test
void testBlend_WhenFPercentIsZero_ShouldNotChangeColor() {
    HSLColor color = new HSLColor();
    color.initHSLbyRGB(100, 150, 200);
    color.blend(50, 100, 150, 0);
    assertEquals(100, color.getRed());
    assertEquals(150, color.getGreen());
    assertEquals(200, color.getBlue());
}

@Test
void testBlend_WhenFPercentIsOne_ShouldSetToNewColor() {
    HSLColor color = new HSLColor();
    color.initHSLbyRGB(100, 150, 200);
    color.blend(50, 100, 150, 1);
    assertEquals(50, color.getRed());
    assertEquals(100, color.getGreen());
    assertEquals(150, color.getBlue());
}

@Test
void testBlend_WhenFPercentIsBetweenZeroAndOne_ShouldBlendColors() {
    HSLColor color = new HSLColor();
    color.initHSLbyRGB(100, 150, 200);
    color.blend(50, 100, 150, 0.5f);
    assertEquals(75, color.getRed());
    assertEquals(125, color.getGreen());
    assertEquals(175, color.getBlue());
}

@Test
void testBlend_WhenFPercentIsGreaterThanOne_ShouldSetToNewColor() {
    HSLColor color = new HSLColor();
    color.initHSLbyRGB(100, 150, 200);
    color.blend(50, 100, 150, 1.5f);
    assertEquals(50, color.getRed());
    assertEquals(100, color.getGreen());
    assertEquals(150, color.getBlue());
}

@Test
void testBlend_WhenFPercentIsNegative_ShouldNotChangeColor() {
    HSLColor color = new HSLColor();
    color.initHSLbyRGB(100, 150, 200);
    color.blend(50, 100, 150, -0.5f);
    assertEquals(100, color.getRed());
    assertEquals(150, color.getGreen());
    assertEquals(200, color.getBlue());
}

@Test
void testBlend_WhenFPercentIsZeroAndInitialColorIsBlack_ShouldNotChangeColor() {
    HSLColor color = new HSLColor();
    color.initHSLbyRGB(0, 0, 0);
    color.blend(50, 100, 150, 0);
    assertEquals(0, color.getRed());
    assertEquals(0, color.getGreen());
    assertEquals(0, color.getBlue());
}

@Test
void testBlend_WhenFPercentIsOneAndInitialColorIsWhite_ShouldSetToNewColor() {
    HSLColor color = new HSLColor();
    color.initHSLbyRGB(255, 255, 255);
    color.blend(50, 100, 150, 1);
    assertEquals(50, color.getRed());
    assertEquals(100, color.getGreen());
    assertEquals(150, color.getBlue());
}

@Test
void testBlend_WhenFPercentIsHalfAndInitialColorIsGrey_ShouldBlendColors() {
    HSLColor color = new HSLColor();
    color.initHSLbyRGB(128, 128, 128);
    color.blend(50, 100, 150, 0.5f);
    assertEquals(89, color.getRed());
    assertEquals(114, color.getGreen());
    assertEquals(139, color.getBlue());
}

@Test
void testBlend_WhenFPercentIsOneAndInitialColorIsRed_ShouldSetToNewColor() {
    HSLColor color = new HSLColor();
    color.initHSLbyRGB(255, 0, 0);
    color.blend(50, 100, 150, 1);
    assertEquals(50, color.getRed());
    assertEquals(100, color.getGreen());
    assertEquals(150, color.getBlue());
}
```
