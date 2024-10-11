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
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 0.0);
		assertEquals(-1.0, result.lb, 0.0);
		assertEquals(1.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 1.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(1.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 2.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(2.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 3.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(3.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 4.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(4.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 5.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(5.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 6.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(6.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 7.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(7.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 8.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(8.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 9.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(9.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
	}
}

// LinearAxisScale_4Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_4Test {
		
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 10.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(10.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 11.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(10.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 12.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(10.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 13.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(10.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 14.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(10.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 15.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(15.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 16.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(15.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 17.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(15.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 18.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(15.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 19.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(20.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
	}
}

// LinearAxisScale_5Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_5Test {
		
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 20.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(20.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 21.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(20.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 22.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(20.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 23.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(20.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 24.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(20.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 25.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(25.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 26.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(25.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 27.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(25.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 28.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(25.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 29.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(30.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
	}
}

// LinearAxisScale_6Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_6Test {
		
	/**
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)} method.
	*/
	@Test
	void testFindGoodLimits() {
		LinearAxisScale scale = new LinearAxisScale();
		AxisLimitData result = scale.findGoodLimits(0.0, 30.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(30.0, result.ub, 0.0);
		assertEquals(1.0, result.quantum, 0.0);
		result = scale.findGoodLimits(0.0, 31.0);
		assertEquals(0.0, result.lb, 0.0);
		assertEquals(30.0, result.ub, 0.0);
		assertEquals(