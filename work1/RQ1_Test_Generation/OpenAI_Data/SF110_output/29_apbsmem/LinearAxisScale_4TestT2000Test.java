// LinearAxisScale_4Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_4Test {

	/**
	* Test case 1 for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
	*/
	@Test
	void testCalcTickMarks_1() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 1.0;
		double xB = 0.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(0, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(1, result.mark[1]);
		assertEquals(PlotAxis.kTick, result.lmark[1]);
		assertEquals(0.2f, result.markValue[1]);
		assertEquals(2, result.mark[2]);
		assertEquals(PlotAxis.kTick, result.lmark[2]);
		assertEquals(0.3f, result.markValue[2]);
		assertEquals(3, result.mark[3]);
		assertEquals(PlotAxis.kTick, result.lmark[3]);
		assertEquals(0.4f, result.markValue[3]);
		assertEquals(4, result.mark[4]);
		assertEquals(PlotAxis.kTick, result.lmark[4]);
		assertEquals(0.5f, result.markValue[4]);
		assertEquals(5, result.mark[5]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[5]);
		assertEquals(0.6f, result.markValue[5]);
		assertEquals(6, result.mark[6]);
		assertEquals(PlotAxis.kTick, result.lmark[6]);
		assertEquals(0.7f, result.markValue[6]);
		assertEquals(7, result.mark[7]);
		assertEquals(PlotAxis.kTick, result.lmark[7]);
		assertEquals(0.8f, result.markValue[7]);
		assertEquals(8, result.mark[8]);
		assertEquals(PlotAxis.kTick, result.lmark[8]);
		assertEquals(0.9f, result.markValue[8]);
		assertEquals(9, result.mark[9]);
		assertEquals(PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case 2 for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
	*/
	@Test
	void testCalcTickMarks_2() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 1.0;
		double xB = 1.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(1, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(2, result.mark[1]);
		assertEquals(PlotAxis.kTick, result.lmark[1]);
		assertEquals(0.2f, result.markValue[1]);
		assertEquals(3, result.mark[2]);
		assertEquals(PlotAxis.kTick, result.lmark[2]);
		assertEquals(0.3f, result.markValue[2]);
		assertEquals(4, result.mark[3]);
		assertEquals(PlotAxis.kTick, result.lmark[3]);
		assertEquals(0.4f, result.markValue[3]);
		assertEquals(5, result.mark[4]);
		assertEquals(PlotAxis.kTick, result.lmark[4]);
		assertEquals(0.5f, result.markValue[4]);
		assertEquals(6, result.mark[5]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[5]);
		assertEquals(0.6f, result.markValue[5]);
		assertEquals(7, result.mark[6]);
		assertEquals(PlotAxis.kTick, result.lmark[6]);
		assertEquals(0.7f, result.markValue[6]);
		assertEquals(8, result.mark[7]);
		assertEquals(PlotAxis.kTick, result.lmark[7]);
		assertEquals(0.8f, result.markValue[7]);
		assertEquals(9, result.mark[8]);
		assertEquals(PlotAxis.kTick, result.lmark[8]);
		assertEquals(0.9f, result.markValue[8]);
		assertEquals(10, result.mark[9]);
		assertEquals(PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case 3 for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
	*/
	@Test
	void testCalcTickMarks_3() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 2.0;
		double xB = 0.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(0, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(2, result.mark[1]);
		assertEquals(PlotAxis.kTick, result.lmark[1]);
		assertEquals(0.2f, result.markValue[1]);
		assertEquals(4, result.mark[2]);
		assertEquals(PlotAxis.kTick, result.lmark[2]);
		assertEquals(0.3f, result.markValue[2]);
		assertEquals(6, result.mark[3]);
		assertEquals(PlotAxis.kTick, result.lmark[3]);
		assertEquals(0.4f, result.markValue[3]);
		assertEquals(8, result.mark[4]);
		assertEquals(PlotAxis.kTick, result.lmark[4]);
		assertEquals(0.5f, result.markValue[4]);
