// RollingMaxTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

	@Test
	void testRollingMax_EmptyList() {
		List<Object> numbers = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_OneElement() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_TwoElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_ThreeElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_FourElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_FiveElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_SixElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_SevenElements() {
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
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_EightElements() {
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
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_NineElements() {
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
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRollingMax_TenElements() {
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
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		expected.add(9);
		expected.add(10);
		List<Object> actual = RollingMax.rollingMax(numbers);
		assertEquals(expected, actual);
	}
}