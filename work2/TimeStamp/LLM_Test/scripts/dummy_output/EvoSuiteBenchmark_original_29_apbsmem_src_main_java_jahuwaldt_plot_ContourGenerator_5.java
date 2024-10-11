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
		
    final int nr_of_points = 3;
    final double min_t = 0;
    final double max_t = 5;

	// Constructor
	public ContourGeneratorTest(Properties properties) throws Exception {
		TestProperties properties = new TestProperties(properties);
		// Min number of points to include
		this.min_t = properties.getDouble("min_t");
		this.max_t = properties.getDouble("max_t");
    }
	
    @Test
    public void test() throws Exception {
        
		// First run through the system and check that it generates no contours
		int tests_to_run = 2;
		while (tests_to_run > 0) {

			// Now run through the system and check that the return code signifies a success
			// or a failure depending on what occurred
			test_done = false;
			for (int i = 0; i < tests_to_run - 1; i++) {
				
				// Call the generator function
				test_gen(i);
				
				// If the return value from the generator is non-zero, then this does
				// not mean that this set of data actually generated a contour.
				// Since this case is a test, we can compare the return value and
				// make absolutely sure that we actually generated a contour
				// (assuming that the code works correctly, which makes
				// it a test with a fail).
				if (test_return_value > 0) {
					test_done = true;
					TestProperties tester_properties = new TestProperties(new Properties());
					tester_properties.setProperty("min_t", this.min_t, "i");
					tester_properties.setProperty("max_t", this.max_t, "i");
					tester_properties.setProperty("nr_of_points",
						"i", "i");
					assertTrue(i + " didn't run on", tester_properties.getInt("nr_of_points") > i);
					assertTrue(i + " didn't run on", tester_properties.getDouble("min_t") > i);
					assertTrue(i + " didn't run on", tester_properties.getDouble("max_t") > i);
				}
			} // end loop through tests to run
			tests_to_run--; // Decrease tests run count
		} // end while loop through tests to run

    }
	
    // This case checks that the given parameters generate a valid
    // contour, or just a single contour if not.  Note we currently do
    // this by passing in an empty set of data.  If you call contourGenerator
    // with nr_of_points equal 0, you get two (two) contours generated,
    // which is unacceptable.
    public boolean test_done;
    public boolean test_gen(int test) {
        done();
        try {
            test_done = false;
            ContourGenerator.done();
        } catch (Exception e) {
            test_done = true;
            throw e;
        }
        return test_done;
    }
}