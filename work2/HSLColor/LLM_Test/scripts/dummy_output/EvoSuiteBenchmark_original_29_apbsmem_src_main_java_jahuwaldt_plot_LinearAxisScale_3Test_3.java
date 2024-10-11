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
		* Test method {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
		* @throws Exception 
		* 
		*     Modification:  
		* 
		*       Test case: Result = {@value #TEST_CANDIDATE #Result}
		*/
    @Test
    void calcTickMarks( ) {
        final LinearAxisScale base = new LinearAxisScale();
        final AxisLimitData output = base.calcTickMarks(0.3d,0.15d,0.15d,1.15d,1.15d);
        out("Base : " + base + " (0.3, 0.15), output : " + output + "  (0.15,1.15) ");
        final double t = 3.0;
        final double f = 0.5;
        final double g = 1.0;
        final double[] c = calcTickMarks(f, c(t), c(t), g, g);
        out("tickmarks for " + f + " with spacing " + g + 
                ": expected values -> " + c  + "  ( 0.15,1.15)");
    }
}