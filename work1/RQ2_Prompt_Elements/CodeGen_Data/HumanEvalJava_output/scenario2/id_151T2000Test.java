// DoubleTheDifferenceTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains one unit test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
// DoubleTheDifference.java
package scenario2;

import java.util.List;

class DoubleTheDifference {

    /**
     * * Given a list of numbers, return the sum of squares of the numbers
     * in the list that are odd. Ignore numbers that are negative or not integers.
     */
    public static int doubleTheDifference(List<Object> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) instanceof Integer) {
                int num = (int) lst.get(i);
                if (num % 2!= 0 && num > 0) {
                    sum += num * num;
                }
            }
        }
        return sum;
    }
}

// DoubleTheDifferenceTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains one unit test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
		
    /**
     * Test of doubleTheDifference method, of class DoubleTheDifference.
     */
	@Test
    public void testDoubleTheDifference() {
		assertEquals(Double.valueOf(2), Double.valueOf(doubleTheDifference((List<Object>))));
		assertEquals(1, Long.valueOf(0).compareTo(Long.valueOf(1)));
        assertEquals(0, Long.valueOf(0).compareTo(Long.valueOf(-1)));
    }

}
//class DoubleTheDifferenceTest