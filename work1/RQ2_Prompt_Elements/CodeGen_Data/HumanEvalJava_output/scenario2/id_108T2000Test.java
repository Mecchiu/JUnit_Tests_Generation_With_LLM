// CountNumsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains one unit test case for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {
// CountNums.java
package scenario2;

import java.util.List;

class CountNums {

    /**
     * * Write a function count_nums which takes an array of integers and returns
     * the number of elements which has a sum of digits > 0.
     * If a number is negative, then its first signed digit will be negative:
     * e.g. -123 has signed digits -1, 2, and 3.
     */
    public static int countNums(List<Object> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            int num = (int) arr.get(i);
            boolean isNegative = num < 0;
            if (isNegative) {
                num = -num;
            }
            while (num!= 0) {
                if (isNegative && num / 10 == 0) {
                    sum -= num % 10;
                } else {
                    sum += num % 10;
                }
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }
}

// CountNumsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains one unit test case for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {
		/**
		 * Test case for {@link CountNums#countNums(List)}.
		 */
	@Test
	void test_countNums() {
		List<Object> list = new ArrayList();
		int sum_nums = 123;
		int count_nums = 772;
		count_nums = CountNums.countNums(list);
		if(!sum_nums ||!count_nums) {
			System.out.println("Test failed! Sum and count do not include all number (e.g. 123).");
		} else
			assertEquals(sum_nums, CountNums.countNums(list));
	}
}
