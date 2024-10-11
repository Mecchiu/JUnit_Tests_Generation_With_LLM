// LinearAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScaleTest {

	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits1() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 0.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(0.0, result.getUpperBound(), 0.0);
		assertEquals(0.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits2() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 1.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(1.0, result.getUpperBound(), 0.0);
		assertEquals(0.1, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits3() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 2.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(2.0, result.getUpperBound(), 0.0);
		assertEquals(0.2, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits4() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 5.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(5.0, result.getUpperBound(), 0.0);
		assertEquals(1.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits5() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 10.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(10.0, result.getUpperBound(), 0.0);
		assertEquals(2.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits6() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 20.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(20.0, result.getUpperBound(), 0.0);
		assertEquals(5.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits7() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 50.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(50.0, result.getUpperBound(), 0.0);
		assertEquals(10.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits8() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 100.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(100.0, result.getUpperBound(), 0.0);
		assertEquals(20.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits9() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 200.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(200.0, result.getUpperBound(), 0.0);
		assertEquals(50.0, result.getTickSpacing(), 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits10() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 500.0);
		assertEquals(0.0, result.getLowerBound(), 0.0);
		assertEquals(500.0, result.getUpperBound(), 0.0);
		assertEquals(100.0, result.getTickSpacing(), 0.0);
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

    /**
     *  Method that returns an AxisLimitData object that contains
     *  the preferred axis limits and tick mark spacing for the
     *  specified range of data values for this logarithmic axis scale.
     *
     * @param aLB The lower bounds of the data plotted on this axis.
     * @param aUB The upper bounds of the data plotted on this axis.
     */
    public AxisLimitData findGoodLimits(double aLB, double aUB);
}

// LogAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogAxisScale}.
* It contains ten unit test cases for the {@link LogAxisScale#findGoodLimits(double, double)} method.
*/
class LogAxisScaleTest {
		
	/**
	* Test case for {@link LogAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits1() {
		LogAxisScale scale = new LogAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 0.0);
		assertEquals(0