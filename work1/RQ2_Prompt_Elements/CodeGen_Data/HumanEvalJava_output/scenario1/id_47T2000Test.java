// MedianTest.java
package scenario1;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains one unit test case for the {@link Median#median(List)} method.
*/
class MedianTest {

	/**
	 * Test method for {@link Median#median(List)}.
	 */
    @Test
    public void testMedian() {
        List<Integer> l = Collections.singletonList(20);
        try {
            int r = Median.median(l);
            fail("Test case is invalid!");
        } catch (IllegalArgumentException ex) {
            assertEquals("the given argument was null");
            assertNull(ex.getMessage());
        }
    }
}
