// EvenOddCountTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains one unit test case for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
/**
		 * Generate a {@link EvenOddCount} and verify it returned in a {@link List} with equal size.
		 */
    public static void test()
    {
        EvenOddCount test1 = EvenOddCount.evenOddCount(-12);
        assertEquals("evenOddCount(-12)", test1.toString());
        List<Integer> result = evenOddCount.evenOddCount(-78);
        assertTrue("result is a List containing value -78", result instanceof List);
        assertEquals("List value -78", test1.evenOddCount(-78), result);
    }
}