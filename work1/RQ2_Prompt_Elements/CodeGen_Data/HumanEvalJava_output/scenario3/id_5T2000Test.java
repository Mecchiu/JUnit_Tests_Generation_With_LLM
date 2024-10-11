// IntersperseTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains one unit test case for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {

	@Test
	public void test_intersperseWithStringList() {
		
		// Given
		List<String> strings = List.of("abc", "xyz");
		
		// When
		List<Object> result = Intersperse.intersperse(strings, 5);

		// Then
		assertEquals(strings, result);
	}

	@Test
	public void test_intersperseWithList() {
		
		// Given
		List<String> strings = List.of("abc", "xyz");
		
		// When
		List<Object> result = Intersperse.intersperse(strings);

		// Then
		assertEquals(strings, result);
	}

	@Test
	public void test_intersperseWith0DelimiterAndList() {
		
		// Given
		List<String> strings = List.of("abc", "xyz");
		
		// When
		List<Object> result = Intersperse.intersperse(strings, 0);

		// Then
		assertEquals(strings, result);
	}

	@Test
	public void test_intersperseWith0DelimiterAndObject() {
		
		// Given
		List<String> strings = List.of("abc", "xyz");
		
		// When
		List<Object> result = Intersperse.intersperse(strings, 0);

		// Then
		assertEquals(strings, result);
	}

	@Test
	public void test_intersperseWith1DelimiterAndList() {
		
		// Given
		List<String> strings = List.of("abc", "xyz");
		
		// When
		List<Object> result = Intersperse.intersperse(strings, 1);

		// Then
		assertEquals(strings, result);
	}

	@Test
	public void test_intersperseWith1DelimiterAndObject() {
		
		// Given
		List<String> strings = List.of("abc", "xyz");
		
		// When
		List<Object> result = Intersperse.intersperse(strings, 1);

		// Then
		assertEquals(strings, result);
	}

	@Test
	public void test_intersperseWith2DelimiterAndList() {
		
		// Given
		List<String> strings = List.of("abc", "xyz");
		
		// When
		List<Object> result = Intersperse.intersperse(strings, 2);

		// Then
		assertEquals(strings, result);
	}

	@Test
	public void test_intersperseWith2DelimiterAndObject() {
		
		// Given
		List<String> strings = List.of("abc", "xyz");
		
		// When
		List<Object> result = Intersperse.intersperse(strings, 2);

		// Then
		assertEquals(strings, result);
	}

	@Test
	public void test_intersperseWith3DelimiterAndList() {
		
		// Given
		List<String> strings = List.of("abc", "xyz");
		
		// When
		List<Object> result = Intersperse.intersperse(strings, 3);

		// Then
		assertEquals(strings, result);
	}

	@Test
	public void test_intersperseWith3DelimiterAndObject() {
		
		// Given
		List<String> strings = List.of("abc", "xyz");
		
		// When
		List<Object> result = Intersperse.intersperse(strings, 3);

		// Then
		assertEquals(strings, result);
	}

}
