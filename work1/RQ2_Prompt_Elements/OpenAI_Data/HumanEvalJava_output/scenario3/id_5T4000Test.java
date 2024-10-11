// IntersperseTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {

	@Test
	void testIntersperse_emptyList() {
		List<Object> numbers = List.of();
		int delimiter = 4;
		List<Object> expected = List.of();
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_oneElement() {
		List<Object> numbers = List.of(1);
		int delimiter = 4;
		List<Object> expected = List.of(1);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_twoElements() {
		List<Object> numbers = List.of(1, 2);
		int delimiter = 4;
		List<Object> expected = List.of(1, 4, 2);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_threeElements() {
		List<Object> numbers = List.of(1, 2, 3);
		int delimiter = 4;
		List<Object> expected = List.of(1, 4, 2, 4, 3);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_fourElements() {
		List<Object> numbers = List.of(1, 2, 3, 4);
		int delimiter = 4;
		List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_fiveElements() {
		List<Object> numbers = List.of(1, 2, 3, 4, 5);
		int delimiter = 4;
		List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4, 4, 5);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_sixElements() {
		List<Object> numbers = List.of(1, 2, 3, 4, 5, 6);
		int delimiter = 4;
		List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_sevenElements() {
		List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
		int delimiter = 4;
		List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_eightElements() {
		List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		int delimiter = 4;
		List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_nineElements() {
		List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int delimiter = 4;
		List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9);
		List<Object> actual = Intersperse.intersperse(numbers, delimiter);
		assertEquals(expected, actual);
	}
}