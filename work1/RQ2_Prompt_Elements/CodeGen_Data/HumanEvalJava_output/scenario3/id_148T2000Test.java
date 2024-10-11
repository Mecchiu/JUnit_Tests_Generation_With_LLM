// BfTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains one unit test case for the {@link Bf#bf(String, String)} method.
*/
class BfTest {
/** The test data. */
		final String[] tests;

		/** The test data length. */
		final int tLength;

		/**
		 * Constructor for BfTest.
		 * @param tests Test data and test length.
		 */
    // <editor-fold defaultstate="collapsed" desc="Constructor parameters">
    public BfTest (String[] tests, int tLength) {
        this.tests = tests;
        this.tLength = tLength;
    }
	// </editor-fold>

		/**
		 * Creates a {@link Bf} object from the test data used in this class.
		 * The {@link Bf#bf(String) bf(String, String)} method should return
		 * a tuple with only those planets in the data set which are
		 * located between the orignal planets and the one used as input.
		 * @return A {@link Bf} object of the test data.
		 */
		static public Bf bf (String[] tests, int tLength) {
			if (tests.length!= tLength) {
                throw new IllegalArgumentException("Test data and test length should have the same length");
            }
			return new Bf(tests, tLength);
		}

		@Test
		public void test () {
			// Iterate through test data
			for (int i = 0; i < tests.length; i += tLength) {
				Bf bf = Bf.bf(tests[i], tests[i+1]);
				for (int k = 0; k < bf.size(); k++) {
					assertEquals(bf.getPlanet(k), tests[i+k]);
				}
			}
		}

}
