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
		@SuppressWarnings("all")  // all tests are run for this class.
		public void testDone() throws Exception {
        		int i=0;
                assertFalse(ContourGenerator.done());
                for(i=0;i<10;i++) { // all elements of "iteration" are tested
                        ContourGenerator.testGenerator();
                }
			}

        @Test
        @SuppressWarnings("all")  // all tests are run for this class.
		public void testNoGens() throws Exception {
                ContourGenerator.testGenerator();
        		assertTrue(ContourGenerator.done());
        		ContourGenerator.testGenerator();
				
        	}
}