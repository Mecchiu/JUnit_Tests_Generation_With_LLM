// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {
		

    /**
     * Test of method "calcTickMarks(double, double, double, double, double)".
     */
    @Test
    public void calcTicks_0() {
        assertEquals(-1.0, LinearAxisScale.calcTickMarks(0.0, 1.0, 0.0, 1.0, 0.0), 1e-15);
    }

    /**
     * Test of method "calcTickMarks(double, double, double, double, double)".
     */
    @Test
    public void calcTicks_1() {
        assertEquals(1.0, LinearAxisScale.calcTickMarks(0.0, 1.0, 1.0, 1.0, 0.0), 1e-15);
    }

    /**
     * Test of method "calcTickMarks(double, double, double, double, double)".
     */
    @Test
    public void calcTicks_2() {
        assertEquals(0.0, LinearAxisScale.calcTickMarks(0.0, 0.0, 0.0, 1.0, 0.0), 1e-15);
    }

    /**
     * Test of method "calcTickMarks(double, double, double, double, double)".
     */
    @Test
    public void calcTicks_3() {
        assertEquals(0.0, LinearAxisScale.calcTickMarks(0.0, 0.0, 0.0, 0.0, 1.0), 1e-15);
    }

}