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