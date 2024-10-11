// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_2Test {
		/**
 *  Constructor.
 *  Creates an instance of the {@link LinearAxisScale_2Test} class and tests
 *  its {@link #calcTickMarks(double, double, double, double, AxisLimitData)} method.
 */
    @Test
    void testConstructor() {
        assertEquals(0.0,
            LinearAxisScale_2Test.modceil(0.0, -10.0),
            Log.ERROR,
            "modceil");

        assertEquals(0.0,            
            LinearAxisScale_2Test.modfloor(0.0, -10.0),
            Log.ERROR,
            "modfloor");
    }

}
/**
* <p>
* <b>Summary:</b>
* <br>This test class is designed to check if the function
* {@link LinearAxisScale#calcTickMarks(double, double, double, double, AxisLimitData)}
* returns the correct values and the tick mark step size based on the
* lower and upper bounds as provided.
* <br>It also checks that the returned coordinates are calculated correctly
* by calling {@link LinearAxisScale#calcTickMarks(double, double, double, double, LinearAxisScale)}, 
* the {@link #calcTickMarks(double, double, double, Double, AxisLimitData)}
* method and
* {@link LinearAxisScale#adjustForErrorBars(PlotDatum, double, double, AxisLimitData, String)}
 * by checking that the bounds are appropriately returned.
* Other test cases are described therein.

* See Also:
*
*/