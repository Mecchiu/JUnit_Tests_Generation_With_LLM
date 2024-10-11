// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_3Test {

	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test data: aLB = -1.0, aUB = 1.0.
	* Expected result: limData.lb = -1.0, limData.ub = 1.0, limData.quantum = 0.2.
	*/
	@Test
	void testFindGoodLimits_1() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, limData.lb, 0.0);
		assertEquals(1.0, limData.ub, 0.0);
		assertEquals(0.2, limData.quantum, 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test data: aLB = -1.0, aUB = 1.0.
	* Expected result: limData.lb = -1.0, limData.ub = 1.0, limData.quantum = 0.2.
	*/
	@Test
	void testFindGoodLimits_2() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, limData.lb, 0.0);
		assertEquals(1.0, limData.ub, 0.0);
		assertEquals(0.2, limData.quantum, 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test data: aLB = -1.0, aUB = 1.0.
	* Expected result: limData.lb = -1.0, limData.ub = 1.0, limData.quantum = 0.2.
	*/
	@Test
	void testFindGoodLimits_3() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, limData.lb, 0.0);
		assertEquals(1.0, limData.ub, 0.0);
		assertEquals(0.2, limData.quantum, 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test data: aLB = -1.0, aUB = 1.0.
	* Expected result: limData.lb = -1.0, limData.ub = 1.0, limData.quantum = 0.2.
	*/
	@Test
	void testFindGoodLimits_4() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, limData.lb, 0.0);
		assertEquals(1.0, limData.ub, 0.0);
		assertEquals(0.2, limData.quantum, 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test data: aLB = -1.0, aUB = 1.0.
	* Expected result: limData.lb = -1.0, limData.ub = 1.0, limData.quantum = 0.2.
	*/
	@Test
	void testFindGoodLimits_5() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, limData.lb, 0.0);
		assertEquals(1.0, limData.ub, 0.0);
		assertEquals(0.2, limData.quantum, 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test data: aLB = -1.0, aUB = 1.0.
	* Expected result: limData.lb = -1.0, limData.ub = 1.0, limData.quantum = 0.2.
	*/
	@Test
	void testFindGoodLimits_6() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, limData.lb, 0.0);
		assertEquals(1.0, limData.ub, 0.0);
		assertEquals(0.2, limData.quantum, 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test data: aLB = -1.0, aUB = 1.0.
	* Expected result: limData.lb = -1.0, limData.ub = 1.0, limData.quantum = 0.2.
	*/
	@Test
	void testFindGoodLimits_7() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, limData.lb, 0.0);
		assertEquals(1.0, limData.ub, 0.0);
		assertEquals(0.2, limData.quantum, 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test data: aLB = -1.0, aUB = 1.0.
	* Expected result: limData.lb = -1.0, limData.ub = 1.0, limData.quantum = 0.2.
	*/
	@Test
	void testFindGoodLimits_8() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, limData.lb, 0.0);
		assertEquals(1.0, limData.ub, 0.0);
		assertEquals(0.2, limData.quantum, 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test data: aLB = -1.0, aUB = 1.0.
	* Expected result: limData.lb = -1.0, limData.ub = 1.0, limData.quantum = 0.2.
	*/
	@Test
	void testFindGoodLimits_9() {
		double aLB = -1.0;
		double aUB = 1.0;
		AxisLimitData limData = new LinearAxisScale().findGoodLimits(aLB, aUB);
		assertEquals(-1.0, limData.lb, 0.0);
		assertEquals(1.0, limData.ub, 0.0);
		assertEquals(0.2, limData.quantum, 0.0);
	}
	
	/**
	* Test case for {@link LinearAxisScale#findGoodLim