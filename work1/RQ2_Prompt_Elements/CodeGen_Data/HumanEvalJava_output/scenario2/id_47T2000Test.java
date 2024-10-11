// MedianTest.java
package scenario2;

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
     * Test of median method, of class Median.
     * @throws Exception
     */
    @Test
    public void testMedian() throws Exception {
        final int numberOfArrays = 100;
        List<Integer> l = Random.generateList(numberOfArrays, new Integer(90000));
        Number expectedResult = l.get(l.size() / 2);
		median(l);
		assertEquals(expectedResult, median(l), 0);
    }
	
}
