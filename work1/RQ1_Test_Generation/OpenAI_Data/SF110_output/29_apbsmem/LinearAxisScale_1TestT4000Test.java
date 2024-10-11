// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#lowerBounds()} method.
*/
class LinearAxisScale_1Test {

	/**
	* Test case for {@link LinearAxisScale#lowerBounds()}.
	*/
	@Test
	void testLowerBounds() {
		LinearAxisScale linearAxisScale = new LinearAxisScale();
		assertEquals(-1.0, linearAxisScale.lowerBounds(), 0.0);
	}
	
}

// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_2Test {
		
	/**
	* Test case for {@link LinearAxisScale#upperBounds()}.
	*/
	@Test
	void testUpperBounds() {
		LinearAxisScale linearAxisScale = new LinearAxisScale();
		assertEquals(1.0, linearAxisScale.upperBounds(), 0.0);
	}
	
}

// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#func(double)} method.
*/
class LinearAxisScale_3Test {
		
	/**
	* Test case for {@link LinearAxisScale#func(double)}.
	*/
	@Test
	void testFunc() {
		LinearAxisScale linearAxisScale = new LinearAxisScale();
		assertEquals(0.0, linearAxisScale.func(0.0), 0.0);
		assertEquals(1.0, linearAxisScale.func(1.0), 0.0);
		assertEquals(-1.0, linearAxisScale.func(-1.0), 0.0);
		assertEquals(2.0, linearAxisScale.func(2.0), 0.0);
		assertEquals(-2.0, linearAxisScale.func(-2.0), 0.0);
		assertEquals(3.0, linearAxisScale.func(3.0), 0.0);
		assertEquals(-3.0, linearAxisScale.func(-3.0), 0.0);
		assertEquals(4.0, linearAxisScale.func(4.0), 0.0);
		assertEquals(-4.0, linearAxisScale.func(-4.0), 0.0);
		assertEquals(5.0, linearAxisScale.func(5.0), 0.0);
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
	* Test case for {@link LinearAxisScale#findGoodLimits(double, double)}.
	*/
	@Test
	void testFindGoodLimits() {
		LinearAxisScale linearAxisScale = new LinearAxisScale();
		AxisLimitData axisLimitData = linearAxisScale.findGoodLimits(0.0, 0.0);
		assertEquals(-1.0, axisLimitData.lb, 0.0);
		assertEquals(1.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 1.0);
		assertEquals(-1.0, axisLimitData.lb, 0.0);
		assertEquals(2.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 2.0);
		assertEquals(-2.0, axisLimitData.lb, 0.0);
		assertEquals(2.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 3.0);
		assertEquals(-3.0, axisLimitData.lb, 0.0);
		assertEquals(3.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 4.0);
		assertEquals(-4.0, axisLimitData.lb, 0.0);
		assertEquals(4.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 5.0);
		assertEquals(-5.0, axisLimitData.lb, 0.0);
		assertEquals(5.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 6.0);
		assertEquals(-6.0, axisLimitData.lb, 0.0);
		assertEquals(6.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 7.0);
		assertEquals(-7.0, axisLimitData.lb, 0.0);
		assertEquals(7.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 8.0);
		assertEquals(-8.0, axisLimitData.lb, 0.0);
		assertEquals(8.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 9.0);
		assertEquals(-9.0, axisLimitData.lb, 0.0);
		assertEquals(9.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 10.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(10.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 11.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(11.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 12.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(12.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 13.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(13.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 14.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(14.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 15.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(15.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 16.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(16.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 17.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(17.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 18.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(18.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 19.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(19.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 20.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(1.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 21.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 22.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 23.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 24.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 25.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 26.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 27.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 28.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 29.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 30.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 31.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 32.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 33.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(2.0, axisLimitData.quantum, 0.0);
		axisLimitData = linearAxisScale.findGoodLimits(0.0, 34.0);
		assertEquals(-10.0, axisLimitData.lb, 0.0);
		assertEquals(20.0, axisLimitData.ub, 0.0);
		assertEquals(