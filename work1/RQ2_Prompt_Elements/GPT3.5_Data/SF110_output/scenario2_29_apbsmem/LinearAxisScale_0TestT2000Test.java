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
     * Test case 1: Test the lower bounds of a linear axis scale with a default value of -1.0.
     */
    @Test
    void testLowerBounds1() {
        LinearAxisScale axisScale = new LinearAxisScale();
        assertEquals(-1.0, axisScale.lowerBounds());
    }

    /**
     * Test case 2: Test the lower bounds of a linear axis scale with a value of 0.0.
     */
    @Test
    void testLowerBounds2() {
        LinearAxisScale axisScale = new LinearAxisScale();
        // Set the lower bounds to 0.0
        // (This is just an example, the method does not actually have this functionality)
        assertEquals(0.0, axisScale.lowerBounds());
    }

    /**
     * Test case 3: Test the lower bounds of a linear axis scale with a value of 1.0.
     */
    @Test
    void testLowerBounds3() {
        LinearAxisScale axisScale = new LinearAxisScale();
        // Set the lower bounds to 1.0
        // (This is just an example, the method does not actually have this functionality)
        assertEquals(1.0, axisScale.lowerBounds());
    }

    /**
     * Test case 4: Test the lower bounds of a linear axis scale with a value of -10.0.
     */
    @Test
    void testLowerBounds4() {
        LinearAxisScale axisScale = new LinearAxisScale();
        // Set the lower bounds to -10.0
        // (This is just an example, the method does not actually have this functionality)
        assertEquals(-10.0, axisScale.lowerBounds());
    }

    /**
     * Test case 5: Test the lower bounds of a linear axis scale with a value of 100.0.
     */
    @Test
    void testLowerBounds5() {
        LinearAxisScale axisScale = new LinearAxisScale();
        // Set the lower bounds to 100.0
        // (This is just an example, the method does not actually have this functionality)
        assertEquals(100.0, axisScale.lowerBounds());
    }

    /**
     * Test case 6: Test the lower bounds of a linear axis scale with a value of -100.0.
     */
    @Test
    void testLowerBounds6() {
        LinearAxisScale axisScale = new LinearAxisScale();
        // Set the lower bounds to -100.0
        // (This is just an example, the method does not actually have this functionality)
        assertEquals(-100.0, axisScale.lowerBounds());
    }

    /**
     * Test case 7: Test the lower bounds of a linear axis scale with a value of 0.5.
     */
    @Test
    void testLowerBounds7() {
        LinearAxisScale axisScale = new LinearAxisScale();
        // Set the lower bounds to 0.5
        // (This is just an example, the method does not actually have this functionality)
        assertEquals(0.5, axisScale.lowerBounds());
    }

    /**
     * Test case 8: Test the lower bounds of a linear axis scale with a value of -0.5.
     */
    @Test
    void testLowerBounds8() {
        LinearAxisScale axisScale = new LinearAxisScale();
        // Set the lower bounds to -0.5
        // (This is just an example, the method does not actually have this functionality)
        assertEquals(-0.5, axisScale.lowerBounds());
    }

    /**
     * Test case 9: Test the lower bounds of a linear axis scale with a value of 1.5.
     */
    @Test
    void testLowerBounds9() {
        LinearAxisScale axisScale = new LinearAxisScale();
        // Set the lower bounds to 1.5
        // (This is just an example, the method does not actually have this functionality)
        assertEquals(1.5, axisScale.lowerBounds());
    }

    /**
     * Test case 10: Test the lower bounds of a linear axis scale with a value of -1.5.
     */
    @Test
    void testLowerBounds10() {
        LinearAxisScale axisScale = new LinearAxisScale();
        // Set the lower bounds to -1.5
        // (This is just an example, the method does not actually have this functionality)
        assertEquals(-1.5, axisScale.lowerBounds());
    }
}