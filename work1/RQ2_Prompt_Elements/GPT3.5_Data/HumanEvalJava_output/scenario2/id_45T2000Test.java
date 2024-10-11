Here's the code for the TriangleAreaTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link TriangleArea}.
 * It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
 */
class TriangleAreaTest {

    @Test
    void testTriangleAreaWithPositiveValues() {
        assertEquals(10.0, TriangleArea.triangleArea(5, 4));
    }

    @Test
    void testTriangleAreaWithZeroValues() {
        assertEquals(0.0, TriangleArea.triangleArea(0, 0));
    }

    @Test
    void testTriangleAreaWithNegativeValues() {
        assertEquals(-10.0, TriangleArea.triangleArea(-5, 4));
    }

    @Test
    void testTriangleAreaWithOneNegativeValue() {
        assertEquals(-10.0, TriangleArea.triangleArea(5, -4));
    }

    @Test
    void testTriangleAreaWithMaxValues() {
        assertEquals(2.147483647E9, TriangleArea.triangleArea(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void testTriangleAreaWithMinValues() {
        assertEquals(-2.147483648E9, TriangleArea.triangleArea(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    void testTriangleAreaWithMaxAndMinValues() {
        assertEquals(-2.305843009213694E18, TriangleArea.triangleArea(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    void testTriangleAreaWithMaxValueAndOne() {
        assertEquals(1.073741824E9, TriangleArea.triangleArea(Integer.MAX_VALUE, 2));
    }

    @Test
    void testTriangleAreaWithMinValueAndOne() {
        assertEquals(-1.073741824E9, TriangleArea.triangleArea(Integer.MIN_VALUE, 2));
    }

    @Test
    void testTriangleAreaWithMaxValueAndNegativeOne() {
        assertEquals(-1.073741824E9, TriangleArea.triangleArea(Integer.MAX_VALUE, -2));
    }
}
```

This test class contains ten unit test cases for the `triangleArea` method of the `TriangleArea` class. The test cases cover a range of scenarios, including positive and negative values, zero values, and extreme values such as the maximum and minimum integer values.