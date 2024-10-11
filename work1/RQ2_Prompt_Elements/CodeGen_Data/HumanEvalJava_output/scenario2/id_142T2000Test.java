// SumSquares1Test.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains one unit test case for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
// SumSquares1.java
package scenario2;

import java.util.ArrayList;
import java.util.List;

class SumSquares1 {

    /**
     * "
     * This function will take a list of integers. For all entries in the list, the function shall square the integer entry if its index is a
     * multiple of 3 and will cube the integer entry if its index is a multiple of 4 and not a multiple of 3. The function will not
     * change the entries in the list whose indexes are not a multiple of 3 or 4. The function shall then return the sum of all entries.
     */
    public static int sumSquares(List<Object> lst) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < lst.size(); i++) {
            if (i % 3 == 0) {
                result.add((int) lst.get(i) * (int) lst.get(i));
            } else if (i % 4 == 0 && i % 3!= 0) {
                result.add((int) lst.get(i) * (int) lst.get(i) * (int) lst.get(i));
            } else {
                result.add((int) lst.get(i));
            }
        }
        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i);
        }
        return sum;
    }
}

// SumSquares1Test.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains one unit test case for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
		/**
		 * A test case of {@link SumSquares1#maxProfit.
		 */
		@Test
    public void sumSquares1Test() {
        List<Object> list = new ArrayList<Object>();

        list.add(3);
        list.add(2);

        assertEquals("The max profit value from the sum of squares function of a list of numbers is expected value", 1, list.size());
        assertEquals("The max profit value from the sum of squares function of a list of numbers is expected value", 10, list.get(0).intValue());
        assertEquals("The max profit value from the sum of squares function of a list of numbers is expected value", 10, list.get(1).intValue());
        assertEquals("The max profit value from the sum of squares function of a list of numbers is expected value", 10, list.get(2).intValue());

        List list2 = new ArrayList<Object>();
        list = list2;

        list.add(10);
        list.add(4);
        list.add(3);

        assertEquals("The max profit value from the sum of squares function of a list of number from list2 is expected value", 10, list.size());
        assertEquals("The max profit value from the sum of squares function of a list of number from list2 is expected value", 10, list.get(0).intValue());
        assertEquals("The max profit value from the sum of squares function of a list of number from list2 is expected value", 10, list.get(1).intValue());
        assertEquals("The max profit value from the sum of squares function of a list of number from list2 is expected value", 10, list.get(2).intValue());
    }
}
