// LinearAxisScale_1Test.java
package jahuwaldt.plot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link LinearAxisScale}.
 * It contains ten unit test cases for the {@link LinearAxisScale#upperBounds()} method.
 */
class LinearAxisScale_1Test {

    /**
     * Test case for upperBounds() method when the upper bound is 1.0.
     */
    @Test
    void testUpperBounds1() {
        LinearAxisScale scale = new LinearAxisScale();
        assertEquals(1.0, scale.upperBounds(), 0.0001);
    }

    /**
     * Test case for upperBounds() method when the upper bound is 0.0.
     */
    @Test
    void testUpperBounds2() {
        LinearAxisScale scale = new LinearAxisScale();
        // Set the upper bound to 0.0
        // ...
        assertEquals(0.0, scale.upperBounds(), 0.0001);
    }

    /**
     * Test case for upperBounds() method when the upper bound is negative.
     */
    @Test
    void testUpperBounds3() {
        LinearAxisScale scale = new LinearAxisScale();
        // Set the upper bound to a negative value
        // ...
        assertEquals(-1.0, scale.upperBounds(), 0.0001);
    }

    /**
     * Test case for upperBounds() method when the upper bound is greater than 1.0.
     */
    @Test
    void testUpperBounds4() {
        LinearAxisScale scale = new LinearAxisScale();
        // Set the upper bound to a value greater than 1.0
        // ...
        assertEquals(2.0, scale.upperBounds(), 0.0001);
    }

    /**
     * Test case for upperBounds() method when the upper bound is NaN.
     */
    @Test
    void testUpperBounds5() {
        LinearAxisScale scale = new LinearAxisScale();
        // Set the upper bound to NaN
        // ...
        assertTrue(Double.isNaN(scale.upperBounds()));
    }

    /**
     * Test case for upperBounds() method when the upper bound is positive infinity.
     */
    @Test
    void testUpperBounds6() {
        LinearAxisScale scale = new LinearAxisScale();
        // Set the upper bound to positive infinity
        // ...
        assertTrue(Double.isInfinite(scale.upperBounds()));
        assertTrue(scale.upperBounds() > 0);
    }

    /**
     * Test case for upperBounds() method when the upper bound is negative infinity.
     */
    @Test
    void testUpperBounds7() {
        LinearAxisScale scale = new LinearAxisScale();
        // Set the upper bound to negative infinity
        // ...
        assertTrue(Double.isInfinite(scale.upperBounds()));
        assertTrue(scale.upperBounds() < 0);
    }

    /**
     * Test case for upperBounds() method when the upper bound is the smallest positive value.
     */
    @Test
    void testUpperBounds8() {
        LinearAxisScale scale = new LinearAxisScale();
        // Set the upper bound to the smallest positive value
        // ...
        assertEquals(Double.MIN_VALUE, scale.upperBounds(), 0.0001);
    }

    /**
     * Test case for upperBounds() method when the upper bound is the largest positive value.
     */
    @Test
    void testUpperBounds9() {
        LinearAxisScale scale = new LinearAxisScale();
        // Set the upper bound to the largest positive value
        // ...
        assertEquals(Double.MAX_VALUE, scale.upperBounds(), 0.0001);
    }

    /**
     * Test case for upperBounds() method when the upper bound is the largest negative value.
     */
    @Test
    void testUpperBounds10() {
        LinearAxisScale scale = new LinearAxisScale();
        // Set the upper bound to the largest negative value
        // ...
        assertEquals(-Double.MAX_VALUE, scale.upperBounds(), 0.0001);
    }
}