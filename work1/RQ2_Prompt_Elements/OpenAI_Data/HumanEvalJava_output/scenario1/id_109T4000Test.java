// MoveOneBallTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {

	/**
	* Test case 1.
	* The input is an empty list.
	* The expected result is true.
	*/
	@Test
	void testCase1() {
		List<Object> arr = List.of();
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	/**
	* Test case 2.
	* The input is a list with one element.
	* The expected result is true.
	*/
	@Test
	void testCase2() {
		List<Object> arr = List.of(1);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	/**
	* Test case 3.
	* The input is a list with two elements.
	* The expected result is true.
	*/
	@Test
	void testCase3() {
		List<Object> arr = List.of(1, 2);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	/**
	* Test case 4.
	* The input is a list with three elements.
	* The expected result is true.
	*/
	@Test
	void testCase4() {
		List<Object> arr = List.of(1, 2, 3);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	/**
	* Test case 5.
	* The input is a list with four elements.
	* The expected result is true.
	*/
	@Test
	void testCase5() {
		List<Object> arr = List.of(1, 2, 3, 4);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	/**
	* Test case 6.
	* The input is a list with five elements.
	* The expected result is true.
	*/
	@Test
	void testCase6() {
		List<Object> arr = List.of(1, 2, 3, 4, 5);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	/**
	* Test case 7.
	* The input is a list with six elements.
	* The expected result is true.
	*/
	@Test
	void testCase7() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	/**
	* Test case 8.
	* The input is a list with seven elements.
	* The expected result is true.
	*/
	@Test
	void testCase8() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	/**
	* Test case 9.
	* The input is a list with eight elements.
	* The expected result is true.
	*/
	@Test
	void testCase9() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	/**
	* Test case 10.
	* The input is a list with nine elements.
	* The expected result is true.
	*/
	@Test
	void testCase10() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
}