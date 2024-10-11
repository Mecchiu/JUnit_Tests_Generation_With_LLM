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
     * Test case for lower bounds of a linear axis scale.
     * The lower bounds should be -1.0.
     */
    @Test
    void testLowerBounds() {
        LinearAxisScale scale = new LinearAxisScale();
        assertEquals(-1.0, scale.lowerBounds());
    }
}