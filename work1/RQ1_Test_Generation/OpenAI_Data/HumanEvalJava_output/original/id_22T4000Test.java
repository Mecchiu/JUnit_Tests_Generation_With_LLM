// FilterIntegersTest.java
package original;

import java.util.ArrayList;
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
		List<Object> values = new ArrayList<Object>();
		values.add("a");
		values.add(3.14);
		values.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(5);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_2() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add("abc");
		values.add(new Object());
		values.add(new ArrayList<Object>());
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_3() {
		List<Object> values = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_4() {
		List<Object> values = new ArrayList<Object>();
		values.add(4);
		values.add(new Object());
		values.add(new ArrayList<Object>());
		values.add(23.2);
		values.add(9);
		values.add("adasd");
		List<Object> expected = new ArrayList<Object>();
		expected.add(4);
		expected.add(9);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_5() {
		List<Object> values = new ArrayList<Object>();
		values.add(3);
		values.add("c");
		values.add(3);
		values.add(3);
		values.add("a");
		values.add("b");
		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(3);
		expected.add(3);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_6() {
		List<Object> values = new ArrayList<Object>();
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_7() {
		List<Object> values = new ArrayList<Object>();
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_8() {
		List<Object> values = new ArrayList<Object>();
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_9() {
		List<Object> values = new ArrayList<Object>();
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_10() {
		List<Object> values = new ArrayList<Object>();
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		values.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
}