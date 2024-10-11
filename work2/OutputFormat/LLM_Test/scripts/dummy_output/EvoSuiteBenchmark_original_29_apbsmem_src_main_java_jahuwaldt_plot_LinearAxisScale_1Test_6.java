// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_1Test {
		private LinearAxisScale scale;

		/**
		 *  Initialize
		 */
		public LinearAxisScale_1Test() {
			super();

			scale = new LinearAxisScale("myRange", 1, 0, 1);
		}

		/**
		 *  This function is only tested in the unit test suite.  This function
		 *  only returns a new object.
		 *  The function is not called from within the unit test suite.
		 *  The unit test suite uses the function to return a new object.
		 */
		@Test
		public void testLowerBounds() {
			assertNotNull(new LinearAxisScale("myRange", 1, 1, 1).lowerBounds());
			assertNotNull(new LinearAxisScale("myRange", 1, 1, 1).upperBounds());
			assertEqual(scale, new LinearAxisScale("myRange", 1, 0, 1));
		}

		/**
		 *  This function is only tested in the unit test suite.  This function
		 *  only returns a new object.
		 *  The value of this function will not be added to the test suite and
		 *  is added to the suite of tests.
		 *  The unit test suite uses the function to return a new object.
		 */
		@Test
		public void testCalcTickMarks() {
			assertNotNull(new LinearAxisScale("myRange", 1, 1, 1).calcTickMarks(1, 0, 1));
			assertNotNull(new LinearAxisScale("myRange", 1, 1, 1).calcTickMarks(1, 1, 1));
			assertIsInvertible(new LinearAxisScale("myRange", 1, 1, 1).calcTickMarks(0.5, 0, 1));
		}
}