// IntersperseTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains one unit test case for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {

	@Test
	void emptylist () {
		List<Object> numbers = new ArrayList<Object>();
		Object result = intersperse(numbers, 0);
		for (int i = 0; i < numbers.size(); i++) {
			assertFalse(result instanceof List);
		}
	}
		
	@Test
	void testcase1 () {
		List<Object> numbers = new ArrayList<Object>(3);
		for (int i = 0; i < numbers.size(); i++) {
			numbers.add(i * 2);
		}
				
		Object result = intersperse(numbers, 0);
		for (int i = 0; i < numbers.size(); i++) {
			assertEquals(numbers.get(i * 2), result);
		}
		
	}

	@Test
	void testcase2 () {
		List<Object> numbers = new ArrayList<Object>(3);
		int size = 0;
		for (int i = 0; i < numbers.size(); i++) {
			numbers.add(i * 2);
			size++;
		}

		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(6);

		List<Object> result = intersperse(numbers, size - 1);
		assertEquals(expected, result);
	}

	@Test
	void testcase3 () {
		List<Object> numbers = new ArrayList<Object>(3);
		int size = 0;
		for (int i = 0; i < numbers.size(); i++) {
			numbers.add(i * 2);
			size++;
		}

		List<Object> expected = new ArrayList<Object>();
		expected.add(3);
		expected.add(6);

		// System.out.println("size = " + size);

		for (int i = 1; i <= size - 1; i++) {
			expected.add(numbers.get(i));
		}
		// System.out.println("expected size = " + expected.size());

		List<Object> result = intersperse(numbers, size - 1);
		assertEquals(expected, result);
	}

	@Test
	void intersperseempty() {
		List<Object> numbers = new ArrayList<Object>(3);
		for (int i = 0; i < numbers.size(); i++) {
			numbers.add(i * 2);
		}

		List<Object> expected = new ArrayList<Object>();
		expected.add(3);

		List<Object> result = intersperse(numbers, 0);
		assertEquals(expected, result);
	}
		
}
