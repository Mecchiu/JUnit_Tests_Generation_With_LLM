// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_2Test {

 	@Test
	public void test()
	{
		assertEquals(-1.0, LinearAxisScale.findGoodLimits(0.0, 2.0), 0.0);
		assertEquals(1.0, LinearAxisScale.findGoodLimits(10.0, 2.0), 0.0);
	}

 	@Test
	public void test2() {
		//System.out.println("Testing 3-dim data.");
		LinearAxisScale scale = new LinearAxisScale();
		scale.setupAxes(new double[] { 4.0, 6.0, 5.0 });
		//System.out.println("Lower bounds: "+scale.lowerBounds());
		scale.setupSubplots(new int[] { 0, 1, 2, 2 });
		//System.out.println("Upper bounds: "+scale.upperBounds());
		axisTickMarkData tmd = scale.calcTickMarks(new double[] { 4.0, 6.0, 5.0 },  new double[] { 0, 16, 20 }, new double[] { 0.0, 1.0, 2.0 }, new int[] { 0 });
		//System.out.println("Tickmarks: "+tmd.getPoints());
		double max = Math.max(tmd.getPoints());
		double min = Math.min(tmd.getPoints());
		axisTickMarkData.double_loop(x -> {
			System.out.format("[%d/%d] = [%.4f, %.4f] - %.4f; %.4f; %.4f\n",
								 x,
								 scale.length(),
								 x,
								 min,
								 max,
								 x,
								 scale.ticks[x]);
			return;
		});
		// This unit tests a bug where the tickmarks were going to
		// be out of bounds and would cause problems while calculating
		// their bounds, which had to be changed to using axislimits
		assertTrue(x => modfloor(tmd.getPoints()[4], 1.0)-modfloor(tmd.getPoints()[3], 1.0)*0.25 > axisLines[0].getTickLength()); // 0..10; 1..15
		assertTrue(x => modfloor(tmd.getPoints()[5], 1.2)-modfloor(tmd.getPoints()[4], 1.2)*0.25 > axisLines[1].getTickLength()); // 0..10; 1..15
	}
}