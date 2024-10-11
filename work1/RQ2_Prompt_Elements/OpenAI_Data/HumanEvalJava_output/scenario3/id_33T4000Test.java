// SortThirdTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {

	@Test
	void testSortThird1() {
		List<Integer> l = List.of(1, 2, 3);
		List<Integer> expected = List.of(1, 2, 3);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortThird2() {
		List<Integer> l = List.of(5, 6, 3, 4, 8, 9, 2);
		List<Integer> expected = List.of(2, 6, 3, 4, 8, 9, 5);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortThird3() {
		List<Integer> l = List.of(1, 2, 3);
		List<Integer> expected = List.of(1, 2, 3);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortThird4() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		List<Integer> expected = List.of(1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortThird5() {
		List<Integer> l = List.of(5, 8, -12, 4, 23, 2, 3, 11, 12, -10);
		List<Integer> expected = List.of(-10, 8, -12, 3, 23, 2, 4, 11, 12, 5);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortThird6() {
		List<Integer> l = List.of(5, 6, 3, 4, 8, 9, 2);
		List<Integer> expected = List.of(2, 6, 3, 4, 8, 9, 5);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortThird7() {
		List<Integer> l = List.of(5, 8, 3, 4, 6, 9, 2);
		List<Integer> expected = List.of(2, 8, 3, 4, 6, 9, 5);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortThird8() {
		List<Integer> l = List.of(5, 6, 9, 4, 8, 3, 2);
		List<Integer> expected = List.of(2, 6, 9, 4, 8, 3, 5);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortThird9() {
		List<Integer> l = List.of(5, 6, 3, 4, 8, 9, 2, 1);
		List<Integer> expected = List.of(2, 6, 3, 4, 8, 9, 5, 1);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSortThird10() {
		List<Integer> l = List.of(5, 6, 3, 4, 8, 9, 2, 1, 0);
		List<Integer> expected = List.of(2, 6, 3, 4, 8, 9, 5, 1, 0);
		List<Integer> actual = SortThird.sortThird(l);
		assertEquals(expected, actual);
	}
}