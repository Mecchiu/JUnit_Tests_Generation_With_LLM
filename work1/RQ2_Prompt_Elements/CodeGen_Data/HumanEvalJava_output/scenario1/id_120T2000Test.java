// Maximum1Test.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains one unit test case for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

	/** {@inheritDoc} */
    @Test
    public void maximum() {
    	List<Object> res = new ArrayList<Object>();
        List<Integer> resList = new ArrayList<Integer>();
        int k = 1000;
        res.add(new Integer(0));
        res.add(new Integer(1));
        assertArrayEquals(res.toArray(), new Integer[] {new Integer(0),new Integer(1)});
        assertArrayEquals(maximum(resList, k).toArray(), resList.toArray());
    }

	/**
	 * Checks the correctness of {@link Maximum1#maximum(List, int)} method.
	 * This method runs several times on the test data.
	 * Finally, a {@link TestCase} is generated containing all unit test cases (in the same order as the
	 * array {@link Maximum1Test#res}) of this class.
	 */
    @Test
    public void testClass() throws Exception {
    	List<Object> res = new ArrayList<Object>();
        List<Integer> resList = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++){
            res.add(new Integer(i));
            resList.add(new Integer(i));
            assertArrayEquals(maximum(resList, 10).toArray(), resList.toArray());
        }
    	List<Object> res3 = new ArrayList<Object>();
    	for (int i = 0; i < 100; i++){
            res.add(new Integer(i));
        }
    	res3.add(new Integer(99));
        assertArrayEquals(maximum(res, 3).toArray(), res.toArray());
        assertArrayEquals(maximum(res3, 3).toArray(), res3.toArray());
    }
}
