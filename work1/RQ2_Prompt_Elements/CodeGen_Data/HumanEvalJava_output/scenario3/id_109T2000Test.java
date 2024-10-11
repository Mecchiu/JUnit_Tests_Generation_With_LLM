// MoveOneBallTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains one unit test case for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {
// MoveOneBall.java
package scenario3;

import java.util.List;

class MoveOneBall {

    /**
     * We have an array 'arr' of N integers arr[1], arr[2],..., arr[N].The
     * numbers in the array will be randomly ordered. Your task is to determine if
     * it is possible to get an array sorted in non-decreasing order by performing
     * the following operation on the given array:
     * You are allowed to perform right shift operation any number of times.
     *
     * One right shift operation means shifting all elements of the array by one
     * position in the right direction. The last element of the array will be moved to
     * the starting position in the array i.e. 0th index.
     *
     * If it is possible to obtain the sorted array by performing the above operation
     * then return True else return False.
     * If the given array is empty then return True.
     *
     * Note: The given list is guaranteed to have unique elements.
     *
     * For Example:
     *
     * move_one_ball([3, 4, 5, 1, 2])==>True
     * Explanation: By performing 2 right shift operations, non-decreasing order can
     * be achieved for the given array.
     * move_one_ball([3, 5, 4, 1, 2])==>False
     * Explanation:It is not possible to get non-decreasing order for the given
     * array by performing any number of right shift operations.
     *
     * > moveOneBall([3, 4, 5, 1, 2])
     * true
     * > moveOneBall([3, 5, 10, 1, 2])
     * true
     * > moveOneBall([4, 3, 1, 2])
     * false
     * > moveOneBall([3, 5, 4, 1, 2])
     * false
     * > moveOneBall([])
     * true
     */
    public static Boolean moveOneBall(List<Object> arr) {
    }
}

// MoveOneBallTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains one unit test case for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {
		
	/**
	* Tester case of {@link MoveOneBall#moveOneBall(List)}.
	*/
	@Test
	public void test() {
        MoveOneBall m = new MoveOneBall();
		
		String expected = "expected =";
		
		List<String> arr = new MockList<>();
		
		fail();
		
		arr = m.moveOneBall(null);
		assertNull(arr.get(0));
		
		arr = m.moveOneBall(new ArrayList<String>());
		assertNotNull(arr.get(0));
	}
	
	/**
	* Test class of {@link MoveOneBall#moveOneBall(List)}.
	*/
	@Test
	public void test_1() {
        MoveOneBall m = new MoveOneBall();
		
		String expected = "expected =";
		
		List<String> arr = new MockList<>();
		
		arr = m.moveOneBall(null);
		assertNull(arr.get(0));
		
		arr = m.moveOneBall(new ArrayList<String>());
		assertNotNull(arr.get(0));
	}

}