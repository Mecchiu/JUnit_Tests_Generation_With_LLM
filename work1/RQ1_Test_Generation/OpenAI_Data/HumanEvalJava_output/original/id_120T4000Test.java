// Maximum1Test.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

	@Test
	void testMaximum1() {
		List<Integer> arr = Arrays.asList(-3, -4, 5);
		int k = 3;
		List<Object> expected = Arrays.asList(-4, -3, 5);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum2() {
		List<Integer> arr = Arrays.asList(4, -4, 4);
		int k = 2;
		List<Object> expected = Arrays.asList(4, 4);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum3() {
		List<Integer> arr = Arrays.asList(-3, 2, 1, 2, -1, -2, 1);
		int k = 1;
		List<Object> expected = Arrays.asList(2);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum4() {
		List<Integer> arr = Arrays.asList(123, -123, 20, 0, 1, 2, -3);
		int k = 3;
		List<Object> expected = Arrays.asList(2, 20, 123);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum5() {
		List<Integer> arr = Arrays.asList(-123, 20, 0, 1, 2, -3);
		int k = 4;
		List<Object> expected = Arrays.asList(0, 1, 2, 20);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum6() {
		List<Integer> arr = Arrays.asList(5, 15, 0, 3, -13, -8, 0);
		int k = 7;
		List<Object> expected = Arrays.asList(-13, -8, 0, 0, 3, 5, 15);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum7() {
		List<Integer> arr = Arrays.asList(-1, 0, 2, 5, 3, -10);
		int k = 2;
		List<Object> expected = Arrays.asList(3, 5);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum8() {
		List<Integer> arr = Arrays.asList(1, 0, 5, -7);
		int k = 1;
		List<Object> expected = Arrays.asList(5);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum9() {
		List<Integer> arr = Arrays.asList(4, -4);
		int k = 2;
		List<Object> expected = Arrays.asList(-4, 4);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaximum10() {
		List<Integer> arr = Arrays.asList(-10, 10);
		int k = 2;
		List<Object> expected = Arrays.asList(-10, 10);
		List<Object> actual = Maximum1.maximum(arr, k);
		assertEquals(expected, actual);
	}
}