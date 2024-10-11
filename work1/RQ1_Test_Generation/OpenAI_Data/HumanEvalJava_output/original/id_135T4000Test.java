// CanArrangeTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {

	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
	* The test case passes if the method returns the correct index.
	*/
	@Test
	void testCanArrange() {
		List<Object> arr = List.of(1, 2, 4, 3, 5);
		int expected = 3;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
	* The test case passes if the method returns the correct index.
	*/
	@Test
	void testCanArrange2() {
		List<Object> arr = List.of(1, 2, 4, 5);
		int expected = -1;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
	* The test case passes if the method returns the correct index.
	*/
	@Test
	void testCanArrange3() {
		List<Object> arr = List.of(1, 4, 2, 5, 6, 7, 8, 9, 10);
		int expected = 2;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
	* The test case passes if the method returns the correct index.
	*/
	@Test
	void testCanArrange4() {
		List<Object> arr = List.of(4, 8, 5, 7, 3);
		int expected = 4;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
	* The test case passes if the method returns the correct index.
	*/
	@Test
	void testCanArrange5() {
		List<Object> arr = List.of(1, 2, 3);
		int expected = -1;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
	* The test case passes if the method returns the correct index.
	*/
	@Test
	void testCanArrange6() {
		List<Object> arr = List.of(1, 2, 4, 3, 5, 6, 7, 8, 9, 10);
		int expected = 3;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
	* The test case passes if the method returns the correct index.
	*/
	@Test
	void testCanArrange7() {
		List<Object> arr = List.of(1, 2, 4, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		int expected = 3;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
	* The test case passes if the method returns the correct index.
	*/
	@Test
	void testCanArrange8() {
		List<Object> arr = List.of(1, 2, 4, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
		int expected = 3;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
	* The test case passes if the method returns the correct index.
	*/
	@Test
	void testCanArrange9() {
		List<Object> arr = List.of(1, 2, 4, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40);
		int expected = 3;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
	* The test case passes if the method returns the correct index.
	*/
	@Test
	void testCanArrange10() {
		List<Object> arr = List.of();
		int expected = -1;
		int actual = CanArrange.canArrange(arr);
		assertEquals(expected, actual);
	}
}