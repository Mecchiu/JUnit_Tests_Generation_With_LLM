// CanArrangeTest.java
package scenario2;

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
	* The test case checks if the method returns the correct index of the element
	* which is not greater than or equal to the element immediately preceding it.
	*/
	@Test
	void testCanArrange() {
		List<Object> arr = List.of(1, 2, 3, 4, 5);
		assertEquals(4, CanArrange.canArrange(arr));
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element
	* which is not greater than or equal to the element immediately preceding it.
	*/
	@Test
	void testCanArrange2() {
		List<Object> arr = List.of(5, 4, 3, 2, 1);
		assertEquals(0, CanArrange.canArrange(arr));
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element
	* which is not greater than or equal to the element immediately preceding it.
	*/
	@Test
	void testCanArrange3() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(9, CanArrange.canArrange(arr));
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element
	* which is not greater than or equal to the element immediately preceding it.
	*/
	@Test
	void testCanArrange4() {
		List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertEquals(0, CanArrange.canArrange(arr));
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element
	* which is not greater than or equal to the element immediately preceding it.
	*/
	@Test
	void testCanArrange5() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		assertEquals(19, CanArrange.canArrange(arr));
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element
	* which is not greater than or equal to the element immediately preceding it.
	*/
	@Test
	void testCanArrange6() {
		List<Object> arr = List.of(20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertEquals(0, CanArrange.canArrange(arr));
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element
	* which is not greater than or equal to the element immediately preceding it.
	*/
	@Test
	void testCanArrange7() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
		assertEquals(29, CanArrange.canArrange(arr));
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element
	* which is not greater than or equal to the element immediately preceding it.
	*/
	@Test
	void testCanArrange8() {
		List<Object> arr = List.of(30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertEquals(0, CanArrange.canArrange(arr));
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element
	* which is not greater than or equal to the element immediately preceding it.
	*/
	@Test
	void testCanArrange9() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40);
		assertEquals(39, CanArrange.canArrange(arr));
	}
	
	/**
	* Test case for {@link CanArrange#canArrange(List)} method.
	* The test case checks if the method returns the correct index of the element
	* which is not greater than or equal to the element immediately preceding it.
	*/
	@Test
	void testCanArrange10() {
		List<Object> arr = List.of(40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertEquals(0, CanArrange.canArrange(arr));
	}
}