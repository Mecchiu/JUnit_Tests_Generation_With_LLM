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
/**
		* Method to return the value of done().
		* @return the value of done()
		*/
		@Test
		public void testDone() {
			boolean result = ContourGenerator.done();
			assertTrue(result);
		}

}
