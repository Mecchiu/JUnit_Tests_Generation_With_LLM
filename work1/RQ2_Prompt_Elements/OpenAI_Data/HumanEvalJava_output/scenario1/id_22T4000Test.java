// FilterIntegersTest.java
package scenario1;

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
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_2() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add("a");
		values.add("b");
		values.add("c");
		values.add("d");
		values.add("e");
		values.add("f");
		values.add("g");
		values.add("h");
		values.add("i");
		values.add("j");
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_3() {
		List<Object> values = new ArrayList<Object>();
		values.add("a");
		values.add("b");
		values.add("c");
		values.add("d");
		values.add("e");
		values.add("f");
		values.add("g");
		values.add("h");
		values.add("i");
		values.add("j");
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_4() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add("a");
		values.add("b");
		values.add("c");
		values.add("d");
		values.add("e");
		values.add("f");
		values.add("g");
		values.add("h");
		values.add("i");
		values.add("j");
		values.add(1.1);
		values.add(2.2);
		values.add(3.3);
		values.add(4.4);
		values.add(5.5);
		values.add(6.6);
		values.add(7.7);
		values.add(8.8);
		values.add(9.9);
		values.add(10.10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_5() {
		List<Object> values = new ArrayList<Object>();
		values.add(1.1);
		values.add(2.2);
		values.add(3.3);
		values.add(4.4);
		values.add(5.5);
		values.add(6.6);
		values.add(7.7);
		values.add(8.8);
		values.add(9.9);
		values.add(10.10);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_6() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add(1.1);
		values.add(2.2);
		values.add(3.3);
		values.add(4.4);
		values.add(5.5);
		values.add(6.6);
		values.add(7.7);
		values.add(8.8);
		values.add(9.9);
		values.add(10.10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_7() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add("a");
		values.add("b");
		values.add("c");
		values.add("d");
		values.add("e");
		values.add("f");
		values.add("g");
		values.add("h");
		values.add("i");
		values.add("j");
		values.add(1.1);
		values.add(2.2);
		values.add(3.3);
		values.add(4.4);
		values.add(5.5);
		values.add(6.6);
		values.add(7.7);
		values.add(8.8);
		values.add(9.9);
		values.add(10.10);
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_8() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add("a");
		values.add("b");
		values.add("c");
		values.add("d");
		values.add("e");
		values.add("f");
		values.add("g");
		values.add("h");
		values.add("i");
		values.add("j");
		values.add(1.1);
		values.add(2.2);
		values.add(3.3);
		values.add(4.4);
		values.add(5.5);
		values.add(6.6);
		values.add(7.7);
		values.add(8.8);
		values.add(9.9);
		values.add(10.10);
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add(1.1);
		values.add(2.2);
		values.add(3.3);
		values.add(4.4);
		values.add(5.5);
		values.add(6.6);
		values.add(7.7);
		values.add(8.8);
		values.add(9.9);
		values.add(10.10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = FilterIntegers.filterIntegers(values);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFilterIntegers_9() {
		List<Object> values = new ArrayList<Object>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add("a");
		values.add("b");
		values.add("c");
		values.add("d");
		values.add("e");
		values.add("f");
		values.add("g");
		values.add("h");
		values.add("i");
		values.add("j");
		values.add(1.1);
		values.add(2.2);
		values.add(3.3);
		values.add(4.4);
		values.add(5.5);
		values.add(6.6);
		values.add(7.7);
		values.add(8.8);
		values.add(9.9);
		values.add(10.10);
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add(1.1);
		values.add(2.2);
		values.add(3.3);
		values.add(4.4);
		values.add(5.5);
		values.add(6.6);
		values.add(7.7);
		values.add(8.8);
		values.add(9.9);
		values.add(10.10);
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.