// LinearAxisScale_0Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#lowerBounds()} method.
*/
class LinearAxisScale_0Test {
		static double F2 = 10E+10;
		static double B1 = 0.1;
		static double D1 = 0.5;
		static final double MIN_D_LIMIT = D1 * (B1 - F2);
		static final double DEFAULT_LIMIT =
			Math.ceil(Math.min(MIN_D_LIMIT, 1 - MIN_D_LIMIT));


		static void test(int minCount, int maxCount, double minDist, double maxDist, int minPrecision, double maxPrecision, double tol) {
			int n = maxCount - minCount + 1;	// Count of axis scale points needed for test.

			for (int i = 0; i < n; i++) {
				int n2 = (int)Math.sqrt(n*n + n2);
				int j = D1 % n2;	// Nth point to test.
				double r = F1 + ((j+1)*(D1 - F1+1));	// The next point to test (assuming maxCount = n2)
				double min = Math.floor(r);	// The value when minDist <= range.
				double max = Math.ceil(r);	// The value when maxDist > range.
				double val = modfloor(min, max);

				assertEquals("test", j, val, tol);
				assertTrue("test", Math.abs(val - r) < maxDist);
			}
		}
	}