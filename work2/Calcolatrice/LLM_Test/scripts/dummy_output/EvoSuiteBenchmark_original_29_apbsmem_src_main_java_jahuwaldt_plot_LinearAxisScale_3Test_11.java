// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {
		private static double fval_10, fval_100;

		private static double xval_10, xval_100;

		public void setUp() {
				// Create a 10% fractional value function.
				fval_10 = 12.0;

				// Create a 100% fractional value function.
				fval_100 = 1.0;

				// Calculate this variable using 1.0% scale.
				xval_10 = fval_10 * 0.1;

				// Calculate this variable using 1.0% scale.
				xval_100 = fval_100 * 0.1;
		}

		@Test
		public void calcTickMarks_1_0_10() { assertEquals(fval_10, calcTickMarks(fval_10, fval_10, xval_10, xval_10, 100.0), 0.01); }
		@Test
		public void calcTickMarks_1_0_100() { assertEquals(fval_100, calcTickMarks(fval_100, fval_100, xval_100, xval_100, 100.0), 0.01); }

	    @Test
		public void calcTickMarks_2_5_100() { assertEquals(fval_100, calcTickMarks(0.0, fval_100, 0.5, 100.0, 100.0), 0.01); }
		@Test
		public void calcTickMarks_4_6_100() { assertEquals(fval_100, calcTickMarks(0.0, fval_100, fval_10, 100.0, 100.0), 0.01); }
		@Test
		public void calcTickMarks_7_8_100() { assertEquals(fval_100, calcTickMarks(0.5, fval_100, fval_10, 100.0, 100.0), 0.01); }
		@Test
		public void calcTickMarks_9_10_100() { assertEquals(fval_100, calcTickMarks(fval_100, fval_100, fval_10, fval_10, 100.0), 0.01); }
		@Test
		public void calcTickMarks_10_10_100() { assertEquals(fval_100, calcTickMarks(fval_100, fval_100, fval_100, fval_100, 100.0), 0.01); }
}

// End LinearAxisScale_3Test.java