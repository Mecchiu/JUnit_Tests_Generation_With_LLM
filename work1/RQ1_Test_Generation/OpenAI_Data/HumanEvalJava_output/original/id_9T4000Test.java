// RollingMaxTest.java
package original;

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
	void testRollingMax() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(2);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(4);
		expected.add(4);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxEmpty() {
		List<Object> numbers = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxAscending() {
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
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxDescending() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(4);
		expected.add(4);
		expected.add(4);
		expected.add(4);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxPeak() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(3);
		numbers.add(100);
		numbers.add(3);
		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(3);
		expected.add(3);
		expected.add(100);
		expected.add(100);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxSingle() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxSingleNegative() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(-1);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxSingleZero() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(0);
		List<Object> expected = new ArrayList<Object>();
		expected.add(0);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxSingleMax() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(Integer.MAX_VALUE);
		List<Object> expected = new ArrayList<Object>();
		expected.add(Integer.MAX_VALUE);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxSingleMin() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(Integer.MIN_VALUE);
		List<Object> expected = new ArrayList<Object>();
		expected.add(Integer.MIN_VALUE);
		assertEquals(expected, RollingMax.rollingMax(numbers));
	}
	
	@Test
	void testRollingMaxInvalidType() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add("2");
		numbers.add(3);
		assertThrows(IllegalArgumentException.class, () -> {
			RollingMax.rollingMax(numbers);
		});
	}
}