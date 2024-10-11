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
		TickMarkData data = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, data.mark.length);
		assertEquals(10, data.lmark.length);
		assertEquals(10, data.markValue.length);
		assertEquals(0, data.mark[0]);
		assertEquals(PlotAxis.kTick, data.lmark[0]);
		assertEquals(0.0f, data.markValue[0]);
		assertEquals(1, data.mark[1]);
		assertEquals(PlotAxis.kTick, data.lmark[1]);
		assertEquals(1.0f, data.markValue[1]);
		assertEquals(2, data.mark[2]);
		assertEquals(PlotAxis.kTick, data.lmark[2]);
		assertEquals(2.0f, data.markValue[2]);
		assertEquals(3, data.mark[3]);
		assertEquals(PlotAxis.kTick, data.lmark[3]);
		assertEquals(3.0f, data.markValue[3]);
		assertEquals(4, data.mark[4]);
		assertEquals(PlotAxis.kTick, data.lmark[4]);
		assertEquals(4.0f, data.markValue[4]);
		assertEquals(5, data.mark[5]);
		assertEquals(3 * PlotAxis.kTick, data.lmark[5]);
		assertEquals(5.0f, data.markValue[5]);
		assertEquals(6, data.mark[6]);
		assertEquals(PlotAxis.kTick, data.lmark[6]);
		assertEquals(6.0f, data.markValue[6]);
		assertEquals(7, data.mark[7]);
		assertEquals(PlotAxis.kTick, data.lmark[7]);
		assertEquals(7.0f, data.markValue[7]);
		assertEquals(8, data.mark[8]);
		assertEquals(PlotAxis.kTick, data.lmark[8]);
		assertEquals(8.0f, data.markValue[8]);
		assertEquals(9, data.mark[9]);
		assertEquals(PlotAxis.kTick, data.lmark[9]);
		assertEquals(9.0f, data.markValue[9]);
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
		double xB = 10.0;
		TickMarkData data = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, data.mark.length);
		assertEquals(10, data.lmark.length);
		assertEquals(10, data.markValue.length);
		assertEquals(10, data.mark[0]);
		assertEquals(PlotAxis.kTick, data.lmark[0]);
		assertEquals(0.0f, data.markValue[0]);
		assertEquals(11, data.mark[1]);
		assertEquals(PlotAxis.kTick, data.lmark[1]);
		assertEquals(1.0f, data.markValue[1]);
		assertEquals(12, data.mark[2]);
		assertEquals(PlotAxis.kTick, data.lmark[2]);
		assertEquals(2.0f, data.markValue[2]);
		assertEquals(13, data.mark[3]);
		assertEquals(PlotAxis.kTick, data.lmark[3]);
		assertEquals(3.0f, data.markValue[3]);
		assertEquals(14, data.mark[4]);
		assertEquals(PlotAxis.kTick, data.lmark[4]);
		assertEquals(4.0f, data.markValue[4]);
		assertEquals(15, data.mark[5]);
		assertEquals(3 * PlotAxis.kTick, data.lmark[5]);
		assertEquals(5.0f, data.markValue[5]);
		assertEquals(16, data.mark[6]);
		assertEquals(PlotAxis.kTick, data.lmark[6]);
		assertEquals(6.0f, data.markValue[6]);
		assertEquals(17, data.mark[7]);
		assertEquals(PlotAxis.kTick, data.lmark[7]);
		assertEquals(7.0f, data.markValue[7]);
		assertEquals(18, data.mark[8]);
		assertEquals(PlotAxis.kTick, data.lmark[8]);
		assertEquals(8.0f, data.markValue[8]);
		assertEquals(19, data.mark[9]);
		assertEquals(PlotAxis.kTick, data.lmark[9]);
		assertEquals(9.0f, data.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks3() {
		double quantum = 1.0;
		double aLB = 0.0;
		double aUB = 10.0;
		double xA = 2.0;
		double xB = 10.0;
		TickMarkData data = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, data.mark.length);
		assertEquals(10, data.lmark.length);
		assertEquals(10, data.markValue.length);
		assertEquals(10, data.mark[0]);
		assertEquals(PlotAxis.kTick, data.lmark[0]);
		assertEquals(0.0f, data.markValue[0]);
		assertEquals(13, data.mark[1]);
		assertEquals(PlotAxis.kTick, data.lmark[1]);
		assertEquals(1.0f, data.markValue[1]);
		assertEquals(16, data.mark[2]);
		assertEquals(PlotAxis.kTick, data.lmark[2]);
		assertEquals(2.0f, data.markValue[2]);
		assertEquals(19, data.mark[3]);
		assertEquals(PlotAxis.kTick, data.lmark[3]);
		assertEquals(3.0f, data.markValue[3]);
		assertEquals(22, data.mark[4]);
		assertEquals(PlotAxis.kTick, data.lmark[4]);
		assertEquals(4.0f, data.markValue[4]);
		assertEquals(25, data.mark[5]);
		assertEquals(3 * PlotAxis.kTick, data.lmark[5]);
		assertEquals(5.0f, data.markValue[5]);
		assertEquals(28, data.mark[6]);
		assertEquals(PlotAxis.kTick, data.lmark[6]);
		assertEquals(6.0f, data.markValue[6]);
		assertEquals(31, data.mark[7]);
		assertEquals(PlotAxis.kTick, data.lmark[7]);
		assertEquals(7.0f, data.markValue[7]);
		assertEquals(34, data.mark[8]);
		assertEquals(PlotAxis.kTick, data.lmark[8]);
		assertEquals(8.0f, data.markValue[8]);
		assertEquals(37, data.mark[9]);
		assertEquals(PlotAxis.kTick, data.lmark[9]);
		assertEquals(9.0f, data.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks4() {
		double quantum = 1.0;
		double aLB = 0.0;
		double aUB = 10.0;
		double xA = -1.0;
		double xB = 10.0;
		TickMarkData data = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, data.mark.length);
		assertEquals(10, data.lmark.length);
		assertEquals(10, data.markValue.length);
		assertEquals(10, data.mark[0]);
		assertEquals(PlotAxis.kTick, data.lmark[0]);
		assertEquals(0.0f, data.markValue[0]);
		assertEquals(9, data.mark[1]);
		assertEquals(PlotAxis.kTick, data.lmark[1]);
		assertEquals(1.0f, data.markValue[1]);
		assertEquals(8, data.mark[2]);
		assertEquals(PlotAxis.kTick, data.lmark[2]);
		assertEquals(2.0f, data.markValue[2]);
		assertEquals(7, data.mark[3]);
		assertEquals(PlotAxis.kTick, data.lmark[3]);
		assertEquals(3.0f, data.markValue[3]);
		assertEquals(6, data.mark[4]);
		assertEquals(PlotAxis.kTick, data.lmark[4]);
		assertEquals(4.0f, data.markValue[4]);
		assertEquals(5, data.mark[5]);
		assertEquals(3 * PlotAxis.kTick, data.lmark[5]);
		assertEquals(5.0f, data.markValue[5]);
		assertEquals(4, data.mark[6]);
		assertEquals(PlotAxis.kTick, data.lmark[6]);
		assertEquals(6.0f, data.markValue[6]);
		assertEquals(3, data.mark[7]);
		assertEquals(PlotAxis.kTick, data.lmark[7]);
		assertEquals(7.0f, data.markValue[7]);
		assertEquals(2, data.mark[8]);
		assertEquals(PlotAxis.kTick, data.lmark[8]);
		assertEquals(8.0f, data.markValue[8]);
		assertEquals(1, data.mark[9]);
		assertEquals(PlotAxis.kTick, data.lmark[9]);
		assertEquals(9.0f, data.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks5() {
		double quantum = 1.0;
		double aLB = 0.0;
		double aUB = 10.0;
		double xA = -2.0;
		double xB = 10.0;
		TickMarkData data = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, data.mark.length);
		assertEquals(10, data.lmark.length);
		assertEquals(10, data.markValue.length);
		assertEquals(10, data.mark[0]);
		assertEquals(PlotAxis.kTick, data.lmark[0]);
		assertEquals(0.0f, data.markValue[0]);
		assertEquals(7, data.mark[1]);
		assertEquals(PlotAxis.kTick, data.lmark[1]);
		assertEquals(1.0f, data.markValue[1]);
		assertEquals(4, data.mark[2]);
		assertEquals(PlotAxis.kTick, data.lmark[2]);
		assertEquals(2.0f, data.markValue[2]);
		assertEquals(1, data.mark[3]);
		assertEquals(PlotAxis.kTick, data.lmark[3]);
		assertEquals(3.0f, data.markValue[3]);
		assertEquals(-2, data.mark[4]);
		assertEquals(PlotAxis.kTick, data.lmark[4]);
		assertEquals(4.0f, data.markValue[4]);
		assertEquals(-5, data.mark[5]);
		assertEquals(3 * PlotAxis.kTick, data.lmark[5]);
		assertEquals(5.0f, data.markValue[5]);
		assertEquals(-8, data.mark[6]);
		assertEquals(PlotAxis.kTick, data.lmark[6]);
		assertEquals(6.0f, data.markValue[6]);
		assertEquals(-11, data.mark[7]);
		assertEquals(PlotAxis.kTick, data.lmark[7]);
		assertEquals(7.0f, data.markValue[7]);
		assertEquals(-14, data.mark[8]);
		assertEquals(PlotAxis.kTick, data.lmark[8]);
		assertEquals(8.0f, data.markValue[8]);
		assertEquals(-17, data.mark[9]);
		assertEquals(PlotAxis.kTick, data.lmark[9]);
		assertEquals(9.0f, data.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks6() {
		double quantum = 1.0;
		double aLB = 0.0;
		double aUB = 10.0;
		double xA = -1.0;
		double xB = -10.0;
		TickMarkData data = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, data.mark.length);
		assertEquals(10, data.lmark.length);
		assertEquals(10, data.markValue