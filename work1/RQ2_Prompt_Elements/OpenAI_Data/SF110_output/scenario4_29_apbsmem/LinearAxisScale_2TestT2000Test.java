// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_2Test {

	/**
	* Test case 1 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits_1() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, result.getLowerBounds());
		assertEquals(1.0, result.getUpperBounds());
		assertEquals(0.2, result.getQuantum());
	}
	
	/**
	* Test case 2 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits_2() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, result.getLowerBounds());
		assertEquals(1.0, result.getUpperBounds());
		assertEquals(0.2, result.getQuantum());
	}
	
	/**
	* Test case 3 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits_3() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, result.getLowerBounds());
		assertEquals(1.0, result.getUpperBounds());
		assertEquals(0.2, result.getQuantum());
	}
	
	/**
	* Test case 4 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits_4() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, result.getLowerBounds());
		assertEquals(1.0, result.getUpperBounds());
		assertEquals(0.2, result.getQuantum());
	}
	
	/**
	* Test case 5 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits_5() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, result.getLowerBounds());
		assertEquals(1.0, result.getUpperBounds());
		assertEquals(0.2, result.getQuantum());
	}
	
	/**
	* Test case 6 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits_6() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, result.getLowerBounds());
		assertEquals(1.0, result.getUpperBounds());
		assertEquals(0.2, result.getQuantum());
	}
	
	/**
	* Test case 7 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits_7() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, result.getLowerBounds());
		assertEquals(1.0, result.getUpperBounds());
		assertEquals(0.2, result.getQuantum());
	}
	
	/**
	* Test case 8 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits_8() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, result.getLowerBounds());
		assertEquals(1.0, result.getUpperBounds());
		assertEquals(0.2, result.getQuantum());
	}
	
	/**
	* Test case 9 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits_9() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, result.getLowerBounds());
		assertEquals(1.0, result.getUpperBounds());
		assertEquals(0.2, result.getQuantum());
	}
	
	/**
	* Test case 10 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits_10() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData result = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, result.getLowerBounds());
		assertEquals(1.0, result.getUpperBounds());
		assertEquals(0.2, result.getQuantum());
	}
	
}

// LogAxisScale.java
package jahuwaldt.plot;

/**
 *  <p> This object provides logarithmic scaling for plot axes.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version January 10, 2001
 */
public class LogAxisScale extends Object implements PlotAxisScale {

    //	Debug flag.
    private static final boolean DEBUG = false;

    /**
     *  The transformation function used to scale the data
     *  plotted against this axis.
     *  This axis uses a logarithmic scaling function:  f(a) = log(a).
     */
    public final double func(double a);

    /**
     *  Method that returns the default lower bounds for
     *  this axis scale.  Returns 0.1.
     */
    public double lowerBounds();

    /**
     *  Method that returns the default upper bounds for
     *  this axis scale.  Returns 10.0.
     */
    public double upperBounds();

    /**
     *  Method that returns an AxisLimitData object that contains
     *  the preferred axis limits and tick mark spacing for the
     *  specified range of data values for this logarithmic axis scale.
     *
     *  @param  aLB  The lower bounds of the data plotted on this axis.
     *  @param  aUB  The upper bounds of the data plotted on this axis.
     */
    public AxisLimitData findGoodLimits(double aLB, double aUB);

    /**
     *  Find the position and size (in screen coordinates) of tick
     *  marks for a given axis scale.
     *
     *  @param  quantum   Tick mark step size for the axis using this scale.
     *  @param 