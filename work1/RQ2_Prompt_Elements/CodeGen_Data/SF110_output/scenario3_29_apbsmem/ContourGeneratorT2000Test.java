// ContourGeneratorTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourGenerator}.
* It contains one unit test case for the {@link ContourGenerator#done()} method.
*/
class ContourGeneratorTest {
@Test
		void containsTest() {
			final int s1 = 300; // sample size for y-values
			final String s2 = "my_name";
			final double x_0 = 0;
			final double x_1 = 1;
			final double x_2 = 2;
			final double x_3 = 3;

			// Create list of 3-D points
			final Map<Double, Integer> x = new HashMap<Double, Integer>();
			final Map<Double, Double> y = new HashMap<Double, Double>();
			for (int i = 0; i < Math.pow(s1, 2); i++) {
				x.put(i, (Integer) x_0);
				y.put(i, (Double) x_1);
				y.put(Integer.MAX_VALUE + i, (Double) x_2);
				y.put(Integer.max_value + i, (Double) x_3);
			}

			// Generate a map of data, for easy access
			final double[][] data = new double[s1][9];
			for (int i = 0; i < s1; i++) {
				for (int k = 0; k < 9; k++) {
					data[i][k] = (Double) x.get(i);
				}
			}

			// Create the object
			final ContourGenerator clg = new ContourGenerator();

			// Check that the object is not done yet
			assertFalse(clg.done());

			// Create the object
			clg.done(true);

			// Assert that the class is done
			assertTrue(clg.done());

			clg.done(true); // reset it

			// Run the tests
			clg.start();
			clg.done(true);   // re-run tests
			clg.start();
			clg.done(true);   // re-run tests
			clg.start();
			clg.done(true);
		}
}