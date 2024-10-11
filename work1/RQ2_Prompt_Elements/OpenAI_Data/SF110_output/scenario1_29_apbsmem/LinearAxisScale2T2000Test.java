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
	* Test case 1 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	public void testFindGoodLimits1() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 0.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(0.0, result.ub, 0.0);
		assertEquals(0.0, result.quantum, 0.0);
	}
	
	/**
	* Test case 2 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	public void testFindGoodLimits2() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 1.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(1.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
	}
	
	/**
	* Test case 3 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	public void testFindGoodLimits3() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 2.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(2.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
	}
	
	/**
	* Test case 4 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	public void testFindGoodLimits4() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 3.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(3.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
	}
	
	/**
	* Test case 5 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	public void testFindGoodLimits5() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 4.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(4.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
	}
	
	/**
	* Test case 6 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	public void testFindGoodLimits6() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 5.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(5.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
	}
	
	/**
	* Test case 7 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	public void testFindGoodLimits7() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 6.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(6.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
	}
	
	/**
	* Test case 8 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	public void testFindGoodLimits8() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 7.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(7.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
	}
	
	/**
	* Test case 9 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	public void testFindGoodLimits9() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 8.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(8.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
	}
	
	/**
	* Test case 10 for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	public void testFindGoodLimits10() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 9.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(9.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
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

    public AxisLimitData findGoodLimits(double aLB, double aUB) {
        //	The lower limit and tick mark spacing being calculated.
        double s = 0., r = 0.;
        //	Make sure we don't have a degenerate case.
        if (Math.abs(aUB - aLB) <= 0.000001) {
            if (aUB > 0.) {
                aUB = 2. * aUB;
                aLB = 0.;
            } else if (aLB < 0) {
                aLB = 2. * aLB;
                aUB = 0.;
            }
            if (Math.abs(aUB - aLB) <= 0.000001) {
                aLB = lowerBounds();
                aUB = upperBounds();
            }
        }
        if (DEBUG) {
            System.out.println("In findGoodLimits()...");
            System.out.println("   aLB = " + aLB + ", aUB = " + aUB);
        }
        //	Object used to return results.
        AxisLimitData limData = new AxisLimitData();
        boolean done = false;
        while (!done) {
            done = true;
            double ub = aUB;
            double lb = aLB;
            double delta = ub - lb;
            //	Scale up by s, a power of 10, so range (delta) exceeds 1.
            s = 1.;
            while (delta * s < 10.) s *= 10.;
            //	Find power of 10 quantum, r, such that delta/10 <= r < delta.
            r = 1. / s;
           