// IncrListTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {

	/**
	* Test case 1.
	* The input list is empty.
	* The expected result is an empty list.
	*/
	@Test
	void testCase1() {
		List<Object> input = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The input list contains only one integer.
	* The expected result is a list containing the incremented integer.
	*/
	@Test
	void testCase2() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The input list contains only one string.
	* The expected result is an empty list.
	*/
	@Test
	void testCase3() {
		List<Object> input = new ArrayList<Object>();
		input.add("a");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The input list contains only one integer and one string.
	* The expected result is a list containing the incremented integer.
	*/
	@Test
	void testCase4() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add("a");
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The input list contains only one string and one integer.
	* The expected result is a list containing the incremented integer.
	*/
	@Test
	void testCase5() {
		List<Object> input = new ArrayList<Object>();
		input.add("a");
		input.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The input list contains only two integers.
	* The expected result is a list containing the incremented integers.
	*/
	@Test
	void testCase6() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The input list contains only two strings.
	* The expected result is an empty list.
	*/
	@Test
	void testCase7() {
		List<Object> input = new ArrayList<Object>();
		input.add("a");
		input.add("b");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The input list contains an integer, a string, and another integer.
	* The expected result is a list containing the incremented integers.
	*/
	@Test
	void testCase8() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add("a");
		input.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The input list contains a string, an integer, and another string.
	* The expected result is a list containing the incremented integer.
	*/
	@Test
	void testCase9() {
		List<Object> input = new ArrayList<Object>();
		input.add("a");
		input.add(1);
		input.add("b");
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The input list contains two integers and a string.
	* The expected result is a list containing the incremented integers.
	*/
	@Test
	void testCase10() {
		List<Object> input = new ArrayList<Object>();
		input.add(1);
		input.add(2);
		input.add("a");
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		List<Object> actual = IncrList.incrList(input);
		assertEquals(expected, actual);
	}
}