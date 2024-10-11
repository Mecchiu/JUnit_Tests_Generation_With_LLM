// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_1Test {
		private double testVal;
    LinearAxisScale_1Test() {
        testVal = 10.1;
    }

		/**
		 * Test of the upper bounds method.
		 * @throws Exception If an error occurs.
		 */
		@Test
		public void testComputeUpperBounds() throws Exception {
			System.out.println("computeUpperBounds");

			double d = LinearAxisScale.computeUpperBounds(0.1, 1.0);
			for (double d1 = testVal; d1 > d; d1 *= 1.0) {
				System.out.println(d1 + " ");
			}

			d = LinearAxisScale.computeUpperBounds(0.9, 1.0);
			for (double d1 = testVal; d1 > d; d1 *= 0.5) {
				System.out.println(d1 + " ");
			}

			d = LinearAxisScale.computeUpperBounds(-1.0, -1.0);
			for (double d1 = testVal; d1 > d; d1 *= -1.0) {
				System.out.println(d1 + " ");
			}

			d = LinearAxisScale.computeUpperBounds(0.0, 0.0);
			for (double d1 = testVal; d1 > d; d1 *= 0.0) {
				System.out.println(d1 + " ");
			}
		}

		/**
		 * Test of the upper bounds method (no args constructor).
		 * @throws Exception If an error occurs.
		 */
		@Test
		public void testComputeUpperBoundsNoArgs() throws Exception {

			double d = LinearAxisScale.computeUpperBounds(testVal, testVal);
			for (double d1 = testVal; d1 < d; d1 *= 1.0) {
				System.out.println(d1 + " ");
			}

			d = LinearAxisScale.computeUpperBounds(testVal, 0.1);
			for (double d1 = testVal; d1 > d; d1 *= 0.5) {
				System.out.println(d1 + " ");
			}

			d = LinearAxisScale.computeUpperBounds(testVal, 0.0);
			for (double d1 = testVal; d1 > d; d1 *= -1.0) {
				System.out.println(d1 + " ");
			}
		}
}