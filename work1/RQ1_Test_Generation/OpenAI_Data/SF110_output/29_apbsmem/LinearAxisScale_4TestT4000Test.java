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
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
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
		assertEquals(10, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_2() {
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
		assertEquals(20, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_3() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 1.0;
		double xB = 10.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(10, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(20, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_4() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 2.0;
		double xB = 10.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(20, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(40, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_5() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 1.0;
		double xB = -10.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(-10, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(0, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_6() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 2.0;
		double xB = -10.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(-20, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(-10, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_7() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 1.0;
		double xB = -20.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(-20, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(-10, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_8() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 2.0;
		double xB = -20.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(-40, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(-20, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_9() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 1.0;
		double xB = -30.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(-30, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(-20, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
	/**
	* Test case for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
	*/
	@Test
	void testCalcTickMarks_10() {
		double quantum = 0.1;
		double aLB = 0.0;
		double aUB = 1.0;
		double xA = 2.0;
		double xB = -30.0;
		TickMarkData result = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(10, result.mark.length);
		assertEquals(10, result.lmark.length);
		assertEquals(10, result.markValue.length);
		assertEquals(-60, result.mark[0]);
		assertEquals(PlotAxis.kTick, result.lmark[0]);
		assertEquals(0.1f, result.markValue[0]);
		assertEquals(-40, result.mark[9]);
		assertEquals(3 * PlotAxis.kTick, result.lmark[9]);
		assertEquals(1.0f, result.markValue[9]);
	}
	
}