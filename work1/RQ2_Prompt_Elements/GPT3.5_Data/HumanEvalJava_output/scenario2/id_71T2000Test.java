// TriangleArea1Test.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link TriangleArea1}.
 * It contains ten unit test cases for the {@link TriangleArea1#triangleArea(int, int, int)} method.
 */
class TriangleArea1Test {

    @Test
    void testTriangleAreaValid() {
        assertEquals(6.0, TriangleArea1.triangleArea(3, 4, 5));
    }

    @Test
    void testTriangleAreaInvalid() {
        assertEquals(-1, TriangleArea1.triangleArea(3, 4, 8));
    }

    @Test
    void testTriangleAreaZero() {
        assertEquals(-1, TriangleArea1.triangleArea(0, 0, 0));
    }

    @Test
    void testTriangleAreaNegative() {
        assertEquals(-1, TriangleArea1.triangleArea(-3, -4, -5));
    }

    @Test
    void testTriangleAreaMaxValue() {
        assertEquals(-1, TriangleArea1.triangleArea(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void testTriangleAreaMinValue() {
        assertEquals(-1, TriangleArea1.triangleArea(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    void testTriangleAreaOverflow() {
        assertEquals(-1, TriangleArea1.triangleArea(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
    }

    @Test
    void testTriangleAreaUnderflow() {
        assertEquals(-1, TriangleArea1.triangleArea(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE + 1));
    }

    @Test
    void testTriangleAreaLargeNumbers() {
        assertEquals(499999999.5, TriangleArea1.triangleArea(1000000000, 1000000000, 1414213562));
    }

    @Test
    void testTriangleAreaDecimal() {
        assertEquals(0.43, TriangleArea1.triangleArea(1, 1, 2));
    }
}