// IntersperseTest.java
package scenario2;

import java.util.ArrayList;
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
		List<Object> numbers = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Intersperse.intersperse(numbers, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_oneElement() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		List<Object> actual = Intersperse.intersperse(numbers, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_twoElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(0);
		expected.add(2);
		List<Object> actual = Intersperse.intersperse(numbers, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_threeElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(0);
		expected.add(2);
		expected.add(0);
		expected.add(3);
		List<Object> actual = Intersperse.intersperse(numbers, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_fourElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(0);
		expected.add(2);
		expected.add(0);
		expected.add(3);
		expected.add(0);
		expected.add(4);
		List<Object> actual = Intersperse.intersperse(numbers, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_fiveElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(0);
		expected.add(2);
		expected.add(0);
		expected.add(3);
		expected.add(0);
		expected.add(4);
		expected.add(0);
		expected.add(5);
		List<Object> actual = Intersperse.intersperse(numbers, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_sixElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(0);
		expected.add(2);
		expected.add(0);
		expected.add(3);
		expected.add(0);
		expected.add(4);
		expected.add(0);
		expected.add(5);
		expected.add(0);
		expected.add(6);
		List<Object> actual = Intersperse.intersperse(numbers, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_sevenElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(0);
		expected.add(2);
		expected.add(0);
		expected.add(3);
		expected.add(0);
		expected.add(4);
		expected.add(0);
		expected.add(5);
		expected.add(0);
		expected.add(6);
		expected.add(0);
		expected.add(7);
		List<Object> actual = Intersperse.intersperse(numbers, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_eightElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(0);
		expected.add(2);
		expected.add(0);
		expected.add(3);
		expected.add(0);
		expected.add(4);
		expected.add(0);
		expected.add(5);
		expected.add(0);
		expected.add(6);
		expected.add(0);
		expected.add(7);
		expected.add(0);
		expected.add(8);
		List<Object> actual = Intersperse.intersperse(numbers, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_nineElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(0);
		expected.add(2);
		expected.add(0);
		expected.add(3);
		expected.add(0);
		expected.add(4);
		expected.add(0);
		expected.add(5);
		expected.add(0);
		expected.add(6);
		expected.add(0);
		expected.add(7);
		expected.add(0);
		expected.add(8);
		expected.add(0);
		expected.add(9);
		List<Object> actual = Intersperse.intersperse(numbers, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testIntersperse_tenElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(0);
		expected.add(2);
		expected.add(0);
		expected.add(3);
		expected.add(0);
		expected.add(4);
		expected.add(0);
		expected.add(5);
		expected.add(0);
		expected.add(6);
		expected.add(0);
		expected.add(7);
		expected.add(0);
		expected.add(8);
		expected.add(0);
		expected.add(9);
		expected.add(0);
		expected.add(10);
		List<Object> actual = Intersperse.intersperse(numbers, 0);
		assertEquals(expected, actual);
	}
}