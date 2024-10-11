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
     * Test case to verify that the default lower bounds for a linear axis scale is -1.0.
     */
    @Test
    void testLowerBounds() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertEquals(-1.0, axisScale.lowerBounds());
    }

    /**
     * Test case to verify that the default lower bounds for a linear axis scale is not 0.0.
     */
    @Test
    void testLowerBoundsNotZero() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertNotEquals(0.0, axisScale.lowerBounds());
    }

    /**
     * Test case to verify that the default lower bounds for a linear axis scale is not positive.
     */
    @Test
    void testLowerBoundsNotPositive() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertTrue(axisScale.lowerBounds() < 0.0);
    }

    /**
     * Test case to verify that the default lower bounds for a linear axis scale is not NaN.
     */
    @Test
    void testLowerBoundsNotNaN() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertFalse(Double.isNaN(axisScale.lowerBounds()));
    }

    /**
     * Test case to verify that the default lower bounds for a linear axis scale is not infinity.
     */
    @Test
    void testLowerBoundsNotInfinity() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertFalse(Double.isInfinite(axisScale.lowerBounds()));
    }

    /**
     * Test case to verify that the default lower bounds for a linear axis scale is not greater than -1.0.
     */
    @Test
    void testLowerBoundsNotGreaterThanNegativeOne() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertFalse(axisScale.lowerBounds() > -1.0);
    }

    /**
     * Test case to verify that the default lower bounds for a linear axis scale is not less than -1.0.
     */
    @Test
    void testLowerBoundsNotLessThanNegativeOne() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertFalse(axisScale.lowerBounds() < -1.0);
    }

    /**
     * Test case to verify that the default lower bounds for a linear axis scale is not greater than 0.0.
     */
    @Test
    void testLowerBoundsNotGreaterThanZero() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertFalse(axisScale.lowerBounds() > 0.0);
    }

    /**
     * Test case to verify that the default lower bounds for a linear axis scale is not less than 0.0.
     */
    @Test
    void testLowerBoundsNotLessThanZero() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertFalse(axisScale.lowerBounds() < 0.0);
    }

    /**
     * Test case to verify that the default lower bounds for a linear axis scale is not greater than positive infinity.
     */
    @Test
    void testLowerBoundsNotGreaterThanPositiveInfinity() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertFalse(axisScale.lowerBounds() > Double.POSITIVE_INFINITY);
    }

    /**
     * Test case to verify that the default lower bounds for a linear axis scale is not less than negative infinity.
     */
    @Test
    void testLowerBoundsNotLessThanNegativeInfinity() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertFalse(axisScale.lowerBounds() < Double.NEGATIVE_INFINITY);
    }
}