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
     * Test case to verify that the default upper bounds is 1.0.
     */
    @Test
    void testDefaultUpperBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        assertEquals(1.0, scale.upperBounds());
    }

    /**
     * Test case to verify that the upper bounds is correctly set to a positive value.
     */
    @Test
    void testPositiveUpperBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        double upperBounds = 10.0;
        scale.setUpperBounds(upperBounds);
        assertEquals(upperBounds, scale.upperBounds());
    }

    /**
     * Test case to verify that the upper bounds is correctly set to a negative value.
     * This should throw an IllegalArgumentException.
     */
    @Test
    void testNegativeUpperBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        double upperBounds = -10.0;
        assertThrows(IllegalArgumentException.class, () -> scale.setUpperBounds(upperBounds));
    }

    /**
     * Test case to verify that the upper bounds is correctly set to zero.
     * This should throw an IllegalArgumentException.
     */
    @Test
    void testZeroUpperBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        double upperBounds = 0.0;
        assertThrows(IllegalArgumentException.class, () -> scale.setUpperBounds(upperBounds));
    }

    /**
     * Test case to verify that the upper bounds is correctly set to NaN.
     * This should throw an IllegalArgumentException.
     */
    @Test
    void testNaNUpperBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        double upperBounds = Double.NaN;
        assertThrows(IllegalArgumentException.class, () -> scale.setUpperBounds(upperBounds));
    }

    /**
     * Test case to verify that the upper bounds is correctly set to positive infinity.
     */
    @Test
    void testPositiveInfinityUpperBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        double upperBounds = Double.POSITIVE_INFINITY;
        scale.setUpperBounds(upperBounds);
        assertEquals(upperBounds, scale.upperBounds());
    }

    /**
     * Test case to verify that the upper bounds is correctly set to negative infinity.
     * This should throw an IllegalArgumentException.
     */
    @Test
    void testNegativeInfinityUpperBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        double upperBounds = Double.NEGATIVE_INFINITY;
        assertThrows(IllegalArgumentException.class, () -> scale.setUpperBounds(upperBounds));
    }

    /**
     * Test case to verify that the upper bounds is correctly set to the maximum value of a double.
     */
    @Test
    void testMaxValueUpperBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        double upperBounds = Double.MAX_VALUE;
        scale.setUpperBounds(upperBounds);
        assertEquals(upperBounds, scale.upperBounds());
    }

    /**
     * Test case to verify that the upper bounds is correctly set to the minimum value of a double.
     * This should throw an IllegalArgumentException.
     */
    @Test
    void testMinValueUpperBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        double upperBounds = Double.MIN_VALUE;
        assertThrows(IllegalArgumentException.class, () -> scale.setUpperBounds(upperBounds));
    }

    /**
     * Test case to verify that the upper bounds is correctly set to a value that is less than the current lower bounds.
     * This should throw an IllegalArgumentException.
     */
    @Test
    void testUpperBoundsLessThanLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        double lowerBounds = 0.0;
        double upperBounds = 10.0;
        scale.setLowerBounds(lowerBounds);
        assertThrows(IllegalArgumentException.class, () -> scale.setUpperBounds(upperBounds));
    }
}