// MinsubarraysumTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains one unit test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {
private final List<Object> nums;
		private final int[] minsubarraysums;
			/** {@link Minsubarraysum#minsubarraysum(List)}
            * Test case for {@link Minsubarraysum#minsubarraysum(List)}

            * @since 1.1
    */
			@Test
	}

	public MinsubarraysumTest() {
	  nums = ListUtils.createList();
		minsubarraysums = new int[2];
	}

		/**
	* Test case for {@link Minsubarraysum#minsubarraysum(List)}
    *
    * @since 1.1
	*/

	public void testMinsubarraysum() {
	Object[] result = Minsubarraysum.minsubarraysum(nums);

	assertSame(nums.get(0), result[0]);

	assertSame(new Integer(minsubarraysums[1]), result[1]);  // this must be a negative number
	}

	/**
	* Tests the calculation of the minimum sum of subsquare numbers
	*
	* Examples
	* minSubArraySum([2, 3, 4, 1, 2, 4]) == 1
	* minSubArraySum([-1, -2, -3]) == -6
	* minSubArraySum([-9999999999999999L]) == -6
	* minSubArraySum([0, 10, 20, 1000000]) == 0
	* minSubArraySum([-1, -2, -3, 10, -5]) == -10
	* minSubArraySum([100, -1, -2, -3, 10, -5]) == -8
	* minSubArraySum([10, 11, 13, 8, 3, 4]) == 3
	* minSubArraySum([100, -33, 32, -1, 0, -2]) == -33
	* minSubArraySum([10]) == 10
	* minSubArraySum([1, -1]) == -1
	*
	* @since 1.1
	*/
	public void testMinSubArraySumMinSubArraySum() {
	Object[] result = Minsubarraysum.minsubarraysum(nums);

	assertSame(new Integer(minsubarraysums[1]), result[1]);  // this must be a negative number
	}
}













