// FilterIntegersTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {

	@Test
	void testFilterIntegers_1() {
		List<Object> values = List.of("a", 3.14, 5);
		List<Object> expected = List.of(5);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_2() {
		List<Object> values = List.of(1, 2, 3, "abc", new Object(), List.of());
		List<Object> expected = List.of(1, 2, 3);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_3() {
		List<Object> values = List.of();
		List<Object> expected = List.of();
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_4() {
		List<Object> values = List.of(4, new Object(), List.of(), 23.2, 9, "adasd");
		List<Object> expected = List.of(4, 9);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_5() {
		List<Object> values = List.of(3, "c", 3, 3, "a", "b");
		List<Object> expected = List.of(3, 3, 3);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_6() {
		List<Object> values = List.of(3, "c", 3, 3, "a", "b", new Object(), List.of(), 23.2, 9, "adasd");
		List<Object> expected = List.of(3, 3, 3, 9);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_7() {
		List<Object> values = List.of(3, "c", 3, 3, "a", "b", new Object(), List.of(), 23.2, 9, "adasd", 4, new Object(), List.of(), 23.2, 9, "adasd");
		List<Object> expected = List.of(3, 3, 3, 9, 9);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_8() {
		List<Object> values = List.of(3, "c", 3, 3, "a", "b", new Object(), List.of(), 23.2, 9, "adasd", 4, new Object(), List.of(), 23.2, 9, "adasd", 3, "c", 3, 3, "a", "b", new Object(), List.of(), 23.2, 9, "adasd", 4, new Object(), List.of(), 23.2, 9, "adasd");
		List<Object> expected = List.of(3, 3, 3, 9, 9, 9, 9);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_9() {
		List<Object> values = List.of(3, "c", 3, 3, "a", "b", new Object(), List.of(), 23.2, 9, "adasd", 4, new Object(), List.of(), 23.2, 9, "adasd", 3, "c", 3, 3, "a", "b", new Object(), List.of(), 23.2, 9, "adasd", 4, new Object(), List.of(), 23.2, 9, "adasd", 3, "c", 3, 3, "a", "b", new Object(), List.of(), 23.2, 9, "adasd", 4, new Object(), List.of(), 23.2, 9, "adasd");
		List<Object> expected = List.of(3, 3, 3, 9, 9, 9, 9, 9, 9, 9, 9);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_10() {
		List<Object> values = List.of(3, "c", 3, 3, "a", "b", new Object(), List.of(), 23.2, 9, "adasd", 4, new Object(), List.of(), 23.2, 9, "adasd", 3, "c", 3, 3, "a", "b", new Object(), List.of(), 23.2, 9, "adasd", 4, new Object(), List.of(), 23.2, 9, "adasd", 3, "c", 3, 3, "a", "b", new Object(), List.of(), 23.2, 9, "adasd", 4, new Object(), List.of(), 23.2, 9, "adasd", 3, "c", 3, 3, "a", "b", new Object(), List.of(), 23.2, 9, "adasd", 4, new Object(), List.of(), 23.2, 9, "adasd");
		List<Object> expected = List.of(3, 3, 3, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
}