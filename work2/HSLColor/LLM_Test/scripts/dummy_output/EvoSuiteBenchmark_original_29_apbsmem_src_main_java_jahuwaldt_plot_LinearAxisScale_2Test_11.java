// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_2Test {
		private double scale;
		@Test
		public void test() {
			LinearAxisScale scale1 = new LinearAxisScale();
			assertNotSame(null, scale1.lowerBounds());
			assertNotSame(null, scale1.upperBounds());
			scale1.lowerBounds();
		}
		
		@Test
		public void test_adjust_output() {
			LinearAxisScale scale = new LinearAxisScale();
			TickMarkData td = null;
			double d = 0.4;
			scale.setScale(d, d);
			td =  scale.calcTickMarks(0.1, -1, 1, 0.1, 0.1);
			d = scale.upperBounds();
			td =  scale.calcTickMarks(-1, d, d, 0.1, 0.1);
			d = scale.lowerBounds();
			td =  scale.calcTickMarks(0, d, d, 0.1, 0.1);
			assertTrue(scale.lowerBounds() == d);
			assertTrue(scale.upperBounds() < p2);
		}
}