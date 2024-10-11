// LinearAxisScale_0Test.java
package jahuwaldt.plot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link LinearAxisScale}.
 * It contains ten unit test cases for the {@link LinearAxisScale#lowerBounds()} method.
 */
class LinearAxisScale_0Test {

    /**
     * Test case that verifies the default lower bounds is -1.0.
     */
    @Test
    void testDefaultLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        assertEquals(-1.0, scale.lowerBounds());
    }

    /**
     * Test case that verifies the lower bounds is correctly set to a positive value.
     */
    @Test
    void testPositiveLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        scale.setLowerBounds(0.0);
        assertEquals(0.0, scale.lowerBounds());
    }

    /**
     * Test case that verifies the lower bounds is correctly set to a negative value.
     */
    @Test
    void testNegativeLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        scale.setLowerBounds(-10.0);
        assertEquals(-10.0, scale.lowerBounds());
    }

    /**
     * Test case that verifies the lower bounds is correctly set to the maximum double value.
     */
    @Test
    void testMaxDoubleLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        scale.setLowerBounds(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, scale.lowerBounds());
    }

    /**
     * Test case that verifies the lower bounds is correctly set to the minimum double value.
     */
    @Test
    void testMinDoubleLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        scale.setLowerBounds(Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, scale.lowerBounds());
    }

    /**
     * Test case that verifies the lower bounds is correctly set to zero.
     */
    @Test
    void testZeroLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        scale.setLowerBounds(0.0);
        assertEquals(0.0, scale.lowerBounds());
    }

    /**
     * Test case that verifies the lower bounds is correctly set to a small positive value.
     */
    @Test
    void testSmallPositiveLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        scale.setLowerBounds(0.0001);
        assertEquals(0.0001, scale.lowerBounds());
    }

    /**
     * Test case that verifies the lower bounds is correctly set to a small negative value.
     */
    @Test
    void testSmallNegativeLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        scale.setLowerBounds(-0.0001);
        assertEquals(-0.0001, scale.lowerBounds());
    }

    /**
     * Test case that verifies the lower bounds is correctly set to NaN.
     */
    @Test
    void testNaNLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        scale.setLowerBounds(Double.NaN);
        assertTrue(Double.isNaN(scale.lowerBounds()));
    }

    /**
     * Test case that verifies the lower bounds is correctly set to positive infinity.
     */
    @Test
    void testPositiveInfinityLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        scale.setLowerBounds(Double.POSITIVE_INFINITY);
        assertTrue(Double.isInfinite(scale.lowerBounds()));
        assertTrue(scale.lowerBounds() > 0);
    }

    /**
     * Test case that verifies the lower bounds is correctly set to negative infinity.
     */
    @Test
    void testNegativeInfinityLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        scale.setLowerBounds(Double.NEGATIVE_INFINITY);
        assertTrue(Double.isInfinite(scale.lowerBounds()));
        assertTrue(scale.lowerBounds() < 0);
    }
}