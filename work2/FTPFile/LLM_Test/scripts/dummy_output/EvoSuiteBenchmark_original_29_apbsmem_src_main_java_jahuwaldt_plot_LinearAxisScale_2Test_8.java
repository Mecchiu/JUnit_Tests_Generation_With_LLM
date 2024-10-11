// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_2Test {
		private double xLB;
		private double xUB;

		private LinearAxisScale scale;

		private AxisLimitData expected;
		private AxisLimitData actual;
		private double t;

		public LinearAxisScale_2Test() {
			xLB = 1.0;
			xUB = 5.0;
		}

		@Test
		public void testFindGoodRibbon() {

//			expected = new AxisLimitData();
//			expected.upperBounds() = modfloor(xUB, 10.0);
//			expected.lowerBounds() = modfloor(xLB, 10.0);
//
//			actual = new AxisLimitData();
//			actual.upperBounds() = modfloor(xUB, 5.0);
//			actual.lowerBounds() = modfloor(xLB, 5.0);
//			actual.tickmarks() = new org.junit.jupiter.api.TestDecorator(() -> {
//				org.junit.jupiter.api.Assertions.assertEquals(xUB, modfloor(xUB, 1.0));
//			});


			expected = new AxisLimitData(
                      xLB,
                      modfloor(xUB, 10.0),
                      xUB,
                      modfloor(xLB, 10.0),
              "");
			expected.tickmarks().size = 0;

//			System.err.println("\n" + String.format("\nExpected:\n%f\n", modfloor(xUB, 10.0)) + "\nGot:" + String.format("%f", modfloor(xUB, 10.0)));

			actual = new AxisLimitData(
                      xLB,
                      modfloor(xLB, 10.0),
                      xLB,
                      modfloor(xUB, 10.0),
              "");

			actual.tickmarks().size = 0;

			assertEquals(xUB, actual.upperLimit(), 0.000001);
			assertEquals(expected, actual);

			scale.lowerBounds(1.0);
			assertEquals(expected.lowerBounds(), modfloor(xLB, 1.0), 0.00001);

			// This code only works for one tickMark
//			xLB = xUB = modfloor(xLB, 10.0);
//			System.out.println(xLB + " -> "+ modfloor(xLB, 10.0));

//			xUB = xLB + 10.0;
//			expected = new AxisLimitData(xUB, 30000.0, xUB, 70000.0, "Expected");
//			expected.upperLimit() = modfloor(xLB, 10.0);
//			actual = new AxisLimitData(xLB + 0.5 * 4, xLB, xUB, xLB - 1.0, "");
//			assertEquals(expected, actual);

			scale.lowerBounds(1.0);
			assertEquals(expected, actual);

//				assertEquals("Upper Bound = "+ modfloor(xLB, 1.0), modfloor(xLB, 10.0));
				assertEquals(expected.upperBounds(), modfloor(xLB, 10.0), 0.00001);
//				assertEquals("Lower Bound = "+ modfloor(xLB, 1.0), modfloor(xLB, 10.0));
             assertEquals(expected.lowerBounds(), modfloor(xLB, 10.0), 0.00001);
			assertEquals(expected.upperLimit(), modfloor(xUB, 10.0), 0.00001);
			assertEquals(expected.lowerLimit(), modfloor(xLB, 10.0), 0.00001);
//			assertTrue(! (expected.tickmarks().contains(actual)));
		}

		@Test
		public void testCalcTickMarks() {

//			expected = new AxisLimitData();
//			expected.upperBounds() = modfloor(xUB, 10.0);
//			expected.lowerBounds() = modfloor(xLB, 10.0);
//
//			actual = new AxisLimitData();
//			actual.upperBounds() = modfloor(xUB, 100.0);
//			actual.lowerBounds() = modfloor(xLB, 100.0);
//			actual.tickmarks() = new org.junit.jupiter.api.TestDecorator(() -> {
//				org.junit.jupiter.api.Assertions.assertEquals(xUB, modfloor(100.0, xUB));
//			});


			expected =  new AxisLimitData(
						xUB,
						modfloor(xUB, 10.0),
						xUB,
						modfloor(xLB, 10.0),
				"");

//			System.err.println("\n" + String.format("\nExpected:\n%f\n", modfloor(xUB, 10.0)) + "\nGot:" + String.format("%f", modfloor(
}
}