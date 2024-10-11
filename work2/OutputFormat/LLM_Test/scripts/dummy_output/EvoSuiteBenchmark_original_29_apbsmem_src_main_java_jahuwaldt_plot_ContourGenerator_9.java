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
	 * Returns true if the contour generation process has been done, or false if not.
	 */
    @Test
    void doneTest() {
        assertFalse(ContourGenerator.done());
    	
    	ContourGenerator.done();
    	assertTrue(ContourGenerator.done());
    	
    	// Assert that the done method has been called at least once.
    }
}