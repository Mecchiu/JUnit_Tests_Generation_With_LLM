// CountNumsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {

	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testCountNums() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int expected = 10;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testCountNums2() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
		int expected = 20;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testCountNums3() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		int expected = 30;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testCountNums4() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
		int expected = 40;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testCountNums5() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int expected = 50;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testCountNums6() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
		int expected = 60;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testCountNums7() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int expected = 70;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testCountNums8() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
		int expected = 80;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testCountNums9() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int expected = 90;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CountNums#countNums(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testCountNums10() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
		int expected = 100;
		int actual = CountNums.countNums(arr);
		assertEquals(expected, actual);
	}
}