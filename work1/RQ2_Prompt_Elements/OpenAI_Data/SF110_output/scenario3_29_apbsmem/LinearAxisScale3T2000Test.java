// LinearAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScaleTest {

	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks1() {
		double quantum = 1.0;
		double aLB = 0.0;
		double aUB = 10.0;
		double xA = 1.0;
		double xB = 0.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(0.0, result.getTickMark(0), 1e-6);
		assertEquals(1.0, result.getTickMark(1), 1e-6);
		assertEquals(2.0, result.getTickMark(2), 1e-6);
		assertEquals(3.0, result.getTickMark(3), 1e-6);
		assertEquals(4.0, result.getTickMark(4), 1e-6);
		assertEquals(5.0, result.getTickMark(5), 1e-6);
		assertEquals(6.0, result.getTickMark(6), 1e-6);
		assertEquals(7.0, result.getTickMark(7), 1e-6);
		assertEquals(8.0, result.getTickMark(8), 1e-6);
		assertEquals(9.0, result.getTickMark(9), 1e-6);
		assertEquals(10.0, result.getTickMark(10), 1e-6);
		assertEquals(11, result.getNumTicks());
		assertEquals(0.0, result.getDataValue(0), 1e-6);
		assertEquals(1.0, result.getDataValue(1), 1e-6);
		assertEquals(2.0, result.getDataValue(2), 1e-6);
		assertEquals(3.0, result.getDataValue(3), 1e-6);
		assertEquals(4.0, result.getDataValue(4), 1e-6);
		assertEquals(5.0, result.getDataValue(5), 1e-6);
		assertEquals(6.0, result.getDataValue(6), 1e-6);
		assertEquals(7.0, result.getDataValue(7), 1e-6);
		assertEquals(8.0, result.getDataValue(8), 1e-6);
		assertEquals(9.0, result.getDataValue(9), 1e-6);
		assertEquals(10.0, result.getDataValue(10), 1e-6);
		assertEquals(11, result.getNumTicks());
		assertEquals(0.0, result.getTickLength(0), 1e-6);
		assertEquals(0.0, result.getTickLength(1), 1e-6);
		assertEquals(0.0, result.getTickLength(2), 1e-6);
		assertEquals(0.0, result.getTickLength(3), 1e-6);
		assertEquals(0.0, result.getTickLength(4), 1e-6);
		assertEquals(0.0, result.getTickLength(5), 1e-6);
		assertEquals(0.0, result.getTickLength(6), 1e-6);
		assertEquals(0.0, result.getTickLength(7), 1e-6);
		assertEquals(0.0, result.getTickLength(8), 1e-6);
		assertEquals(0.0, result.getTickLength(9), 1e-6);
		assertEquals(0.0, result.getTickLength(10), 1e-6);
		assertEquals(11, result.getNumTicks());
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks2() {
		double quantum = 1.0;
		double aLB = 0.0;
		double aUB = 10.0;
		double xA = 1.0;
		double xB = 0.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(0.0, result.getTickMark(0), 1e-6);
		assertEquals(1.0, result.getTickMark(1), 1e-6);
		assertEquals(2.0, result.getTickMark(2), 1e-6);
		assertEquals(3.0, result.getTickMark(3), 1e-6);
		assertEquals(4.0, result.getTickMark(4), 1e-6);
		assertEquals(5.0, result.getTickMark(5), 1e-6);
		assertEquals(6.0, result.getTickMark(6), 1e-6);
		assertEquals(7.0, result.getTickMark(7), 1e-6);
		assertEquals(8.0, result.getTickMark(8), 1e-6);
		assertEquals(9.0, result.getTickMark(9), 1e-6);
		assertEquals(10.0, result.getTickMark(10), 1e-6);
		assertEquals(11, result.getNumTicks());
		assertEquals(0.0, result.getDataValue(0), 1e-6);
		assertEquals(1.0, result.getDataValue(1), 1e-6);
		assertEquals(2.0, result.getDataValue(2), 1e-6);
		assertEquals(3.0, result.getDataValue(3), 1e-6);
		assertEquals(4.0, result.getDataValue(4), 1e-6);
		assertEquals(5.0, result.getDataValue(5), 1e-6);
		assertEquals(6.0, result.getDataValue(6), 1e-6);
		assertEquals(7.0, result.getDataValue(7), 1e-6);
		assertEquals(8.0, result.getDataValue(8), 1e-6);
		assertEquals(9.0, result.getDataValue(9), 1e-6);
		assertEquals(10.0, result.getDataValue(10), 1e-6);
		assertEquals(11, result.getNumTicks());
		assertEquals(0.0, result.getTickLength(0), 1e-6);
		assertEquals(0.0, result.getTickLength(1), 1e-6);
		assertEquals(0.0, result.getTickLength(2), 1e-6);
		assertEquals(0.0, result.getTickLength(3), 1e-6);
		assertEquals(0.0, result.getTickLength(4), 1e-6);
		assertEquals(0.0, result.getTickLength(5), 1e-6);
		assertEquals(0.0, result.getTickLength(6), 1e-6);
		assertEquals(0.0, result.getTickLength(7), 1e-6);
		assertEquals(0.0, result.getTickLength(8), 1e-6);
		assertEquals(0.0, result.getTickLength(9), 1e-6);
		assertEquals(0.0, result.getTickLength(