// AddElementsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {

	/**
	* Test case 1.
	* The input list is empty.
	* The expected result is 0.
	*/
	@Test
	void testAddElements1() {
		List<Integer> arr = List.of();
		int k = 0;
		int expected = 0;
		int actual = AddElements.addElements(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains one element.
	* The expected result is the element.
	*/
	@Test
	void testAddElements2() {
		List<Integer> arr = List.of(1);
		int k = 1;
		int expected = 1;
		int actual = AddElements.addElements(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains two elements.
	* The expected result is the sum of the elements.
	*/
	@Test
	void testAddElements3() {
		List<Integer> arr = List.of(1, 2);
		int k = 2;
		int expected = 3;
		int actual = AddElements.addElements(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains three elements.
	* The expected result is the sum of the elements.
	*/
	@Test
	void testAddElements4() {
		List<Integer> arr = List.of(1, 2, 3);
		int k = 3;
		int expected = 6;
		int actual = AddElements.addElements(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains four elements.
	* The expected result is the sum of the elements.
	*/
	@Test
	void testAddElements5() {
		List<Integer> arr = List.of(1, 2, 3, 4);
		int k = 4;
		int expected = 10;
		int actual = AddElements.addElements(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains five elements.
	* The expected result is the sum of the elements.
	*/
	@Test
	void testAddElements6() {
		List<Integer> arr = List.of(1, 2, 3, 4, 5);
		int k = 5;
		int expected = 15;
		int actual = AddElements.addElements(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains six elements.
	* The expected result is the sum of the elements.
	*/
	@Test
	void testAddElements7() {
		List<Integer> arr = List.of(1, 2, 3, 4, 5, 6);
		int k = 6;
		int expected = 21;
		int actual = AddElements.addElements(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains seven elements.
	* The expected result is the sum of the elements.
	*/
	@Test
	void testAddElements8() {
		List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7);
		int k = 7;
		int expected = 28;
		int actual = AddElements.addElements(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains eight elements.
	* The expected result is the sum of the elements.
	*/
	@Test
	void testAddElements9() {
		List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		int k = 8;
		int expected = 36;
		int actual = AddElements.addElements(arr, k);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains nine elements.
	* The expected result is the sum of the elements.
	*/
	@Test
	void testAddElements10() {
		List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int k = 9;
		int expected = 45;
		int actual = AddElements.addElements(arr, k);
		assertEquals(expected, actual);
	}
}