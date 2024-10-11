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
	* Test case 1 for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
	*/
	@Test
	public void testCalcTickMarks1() {
		double quantum = 1.0;
		double aLB = 0.0;
		double aUB = 10.0;
		double xA = 1.0;
		double xB = 0.0;
		TickMarkData data = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(data.mark.length, 11);
		assertEquals(data.lmark.length, 11);
		assertEquals(data.markValue.length, 11);
		assertEquals(data.mark[0], 0);
		assertEquals(data.lmark[0], 3 * PlotAxis.kTick);
		assertEquals(data.markValue[0], 0.0f);
		assertEquals(data.mark[1], 1);
		assertEquals(data.lmark[1], PlotAxis.kTick);
		assertEquals(data.markValue[1], 0.2f);
		assertEquals(data.mark[2], 2);
		assertEquals(data.lmark[2], PlotAxis.kTick);
		assertEquals(data.markValue[2], 0.4f);
		assertEquals(data.mark[3], 3);
		assertEquals(data.lmark[3], PlotAxis.kTick);
		assertEquals(data.markValue[3], 0.6f);
		assertEquals(data.mark[4], 4);
		assertEquals(data.lmark[4], PlotAxis.kTick);
		assertEquals(data.markValue[4], 0.8f);
		assertEquals(data.mark[5], 5);
		assertEquals(data.lmark[5], 3 * PlotAxis.kTick);
		assertEquals(data.markValue[5], 1.0f);
		assertEquals(data.mark[6], 6);
		assertEquals(data.lmark[6], PlotAxis.kTick);
		assertEquals(data.markValue[6], 1.2f);
		assertEquals(data.mark[7], 7);
		assertEquals(data.lmark[7], PlotAxis.kTick);
		assertEquals(data.markValue[7], 1.4f);
		assertEquals(data.mark[8], 8);
		assertEquals(data.lmark[8], PlotAxis.kTick);
		assertEquals(data.markValue[8], 1.6f);
		assertEquals(data.mark[9], 9);
		assertEquals(data.lmark[9], PlotAxis.kTick);
		assertEquals(data.markValue[9], 1.8f);
		assertEquals(data.mark[10], 10);
		assertEquals(data.lmark[10], 3 * PlotAxis.kTick);
		assertEquals(data.markValue[10], 2.0f);
	}
	
	/**
	* Test case 2 for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
	*/
	@Test
	public void testCalcTickMarks2() {
		double quantum = 1.0;
		double aLB = 0.0;
		double aUB = 10.0;
		double xA = 1.0;
		double xB = 5.0;
		TickMarkData data = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(data.mark.length, 11);
		assertEquals(data.lmark.length, 11);
		assertEquals(data.markValue.length, 11);
		assertEquals(data.mark[0], 5);
		assertEquals(data.lmark[0], 3 * PlotAxis.kTick);
		assertEquals(data.markValue[0], 0.0f);
		assertEquals(data.mark[1], 6);
		assertEquals(data.lmark[1], PlotAxis.kTick);
		assertEquals(data.markValue[1], 0.2f);
		assertEquals(data.mark[2], 7);
		assertEquals(data.lmark[2], PlotAxis.kTick);
		assertEquals(data.markValue[2], 0.4f);
		assertEquals(data.mark[3], 8);
		assertEquals(data.lmark[3], PlotAxis.kTick);
		assertEquals(data.markValue[3], 0.6f);
		assertEquals(data.mark[4], 9);
		assertEquals(data.lmark[4], PlotAxis.kTick);
		assertEquals(data.markValue[4], 0.8f);
		assertEquals(data.mark[5], 10);
		assertEquals(data.lmark[5], 3 * PlotAxis.kTick);
		assertEquals(data.markValue[5], 1.0f);
		assertEquals(data.mark[6], 11);
		assertEquals(data.lmark[6], PlotAxis.kTick);
		assertEquals(data.markValue[6], 1.2f);
		assertEquals(data.mark[7], 12);
		assertEquals(data.lmark[7], PlotAxis.kTick);
		assertEquals(data.markValue[7], 1.4f);
		assertEquals(data.mark[8], 13);
		assertEquals(data.lmark[8], PlotAxis.kTick);
		assertEquals(data.markValue[8], 1.6f);
		assertEquals(data.mark[9], 14);
		assertEquals(data.lmark[9], PlotAxis.kTick);
		assertEquals(data.markValue[9], 1.8f);
		assertEquals(data.mark[10], 15);
		assertEquals(data.lmark[10], 3 * PlotAxis.kTick);
		assertEquals(data.markValue[10], 2.0f);
	}
	
	/**
	* Test case 3 for {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)}.
	*/
	@Test
	public void testCalcTickMarks3() {
		double quantum = 1.0;
		double aLB = 0.0;
		double aUB = 10.0;
		double xA = 2.0;
		double xB = 0.0;
		TickMarkData data = new LinearAxisScale().calcTickMarks(quantum, aLB, aUB, xA, xB);
		assertEquals(data.mark.length, 11);
		assertEquals(data.lmark.length, 11);
		assertEquals(data.markValue.length, 11);
		assertEquals(data.mark[0], 0);
		assertEquals(data.lmark[0], 3 * PlotAxis.kTick);
		assertEquals(data.markValue[0], 0.0f);
		assertEquals(data.mark[1], 2);
		assertEquals(data.lmark[1], PlotAxis.kTick);
		assertEquals(data.markValue[1], 0.2f);
		assertEquals(data.mark[2], 4);
		assertEquals(data.lmark[2], PlotAxis.kTick);
		assertEquals(data.mark