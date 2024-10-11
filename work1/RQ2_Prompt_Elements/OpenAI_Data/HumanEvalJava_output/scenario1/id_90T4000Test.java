// NextSmallestTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {

	@Test
	void testNextSmallest_1() {
		List<Object> lst = List.of(1, 2, 3, 4, 5);
		Integer expected = 2;
		Integer actual = NextSmallest.nextSmallest(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNextSmallest_2() {
		List<Object> lst = List.of(5, 4, 3, 2, 1);
		Integer expected = 4;
		Integer actual = NextSmallest.nextSmallest(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNextSmallest_3() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer expected = 2;
		Integer actual = NextSmallest.nextSmallest(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNextSmallest_4() {
		List<Object> lst = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		Integer expected = 9;
		Integer actual = NextSmallest.nextSmallest(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNextSmallest_5() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		Integer expected = 2;
		Integer actual = NextSmallest.nextSmallest(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNextSmallest_6() {
		List<Object> lst = List.of(20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		Integer expected = 19;
		Integer actual = NextSmallest.nextSmallest(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNextSmallest_7() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
		Integer expected = 2;
		Integer actual = NextSmallest.nextSmallest(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNextSmallest_8() {
		List<Object> lst = List.of(30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		Integer expected = 29;
		Integer actual = NextSmallest.nextSmallest(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNextSmallest_9() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40);
		Integer expected = 2;
		Integer actual = NextSmallest.nextSmallest(lst);
		assertEquals(expected, actual);
	}
	
	@Test
	void testNextSmallest_10() {
		List<Object> lst = List.of(40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		Integer expected = 39;
		Integer actual = NextSmallest.nextSmallest(lst);
		assertEquals(expected, actual);
	}
}