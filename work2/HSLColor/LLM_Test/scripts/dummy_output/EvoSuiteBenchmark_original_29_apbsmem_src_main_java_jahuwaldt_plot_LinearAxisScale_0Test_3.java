// LinearAxisScale_0Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#lowerBounds()} method.
*/
class LinearAxisScale_0Test {
		
	/**
	 *  Create the test object, setting up the object
	 *  with the default values for the test data points.
	 */
	public LinearAxisScale_0Test() {
		
		this.func = 1.5;
		this.lowerBounds = -1.0;
		this.upperBounds = 1.0;
		this.output = null;
	}
	
	/**
	 *  Construct a new test object.
	 */
	final private double func = 0.5;
	
	/**
	 *  Get the default bounds of this axis scale.
	 *  The default bounds define the bounds of the lower
	 *  and upper limits, if the axis scale is being called for.
	 */
	final private double lowerBounds = -1.5;
	
	/**
	 *  Get the default bounds of upper data limits.
	 *  The lower and upper bounds define the number bounds
	 *  of data points over which the axis scale will
	 *  calcualbe valid and can be plotted.
	 *  The default bounds define a value for the 0.0 plot
	 *  limits.  This value is used by the method {@link #findGoodLimits(double, double, double, double, double)}
	 *  to find an appropriate place to begin the scaling algorithm.
	 *  Default bounds is 0.0.
	 */
	final private double upperBounds = 1.5;
	
	/**
	 *  Find the position and size (in screen coordinates)
	 *  with a specified axis scale for the test data.
	 *
	 *  @param n the number of data points.
	 *  @param t the value for data point values.
	 *  @param xa the center of the data range.
	 *  @param xb the center of the data range.
	 *  @return A AxisLimitData object at a specified position.
	 */
	AxisLimitData findGoodLimits(double n, double t, double xb, double xa, double xb);
	
	/**
	 *  Calculate and return an appropriate number of ticks for the given datapoint
	 *  for the specified axis scale.
	 *  The default values of ticks are for all data points.
	 */
	final private double calcTickMarks(double n, PlotDatum datum, double t);
	
	/**
	 *  Return a reference to the object to test.
	 */
	final private LinearAxisScale output = null;
	
	double func;
	double lowerBounds;
	double upperBounds;
	double outputTickMarks = -1.0;
	double outputOutputX = 6.7500001;
	double outputOutputY = 525.7500001;
	
}