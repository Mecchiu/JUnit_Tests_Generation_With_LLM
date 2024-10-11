// ConcatenateTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {
	// Test case 1: Test with empty list
			@Test
			void testConcatenateWithEmptyList() {
				List<Object> strings = new ArrayList<>();
				String result = Concatenate.concatenate(strings);
				assertEquals("", result);
			}

			// Test case 2: Test with list of one string
			@Test
			void testConcatenateWithOneString() {
				List<Object> strings = new ArrayList<>();
				strings.add("a");
				String result = Concatenate.concatenate(strings);
				assertEquals("a", result);
			}

			// Test case 3: Test with list of two strings
			@Test
			void testConcatenateWithTwoStrings() {
				List<Object> strings = new ArrayList<>();
				strings.add("a");
				strings.add("b");
				String result = Concatenate.concatenate(strings);
				assertEquals("ab", result);
			}

			// Test case 4: Test with list of three strings
			@Test
			void testConcatenateWithThreeStrings() {
				List<Object> strings = new ArrayList<>();
				strings.add("a");
				strings.add("b");
				strings.add("c");
				String result = Concatenate.concatenate(strings);
				assertEquals("abc", result);
			}

			// Test case 5: Test with list of four strings
			@Test
			void testConcatenateWithFourStrings() {
				List<Object> strings = new ArrayList<>();
				strings.add("a");
				strings.add("b");
				strings.add("c");
				strings.add("d");
				String result = Concatenate.concatenate(strings);
				assertEquals("abcd", result);
			}

			// Test case 6: Test with list of five strings
			@Test
			void testConcatenateWithFiveStrings() {
				List<Object> strings = new ArrayList<>();
				strings.add("a");
				strings.add("b");
				strings.add("c");
				strings.add("d");
				strings.add("e");
				String result = Concatenate.concatenate(strings);
				assertEquals("abcde", result);
			}

			// Test case 7: Test with list of six strings
			@Test
			void testConcatenateWithSixStrings() {
				List<Object> strings = new ArrayList<>();
				strings.add("a");
				strings.add("b");
				strings.add("c");
				strings.add("d");
				strings.add("e");
				strings.add("f");
				String result = Concatenate.concatenate(strings);
				assertEquals("abcdef", result);
			}

			// Test case 8: Test with list of seven strings
			@Test
			void testConcatenateWithSevenStrings() {
				List<Object> strings = new ArrayList<>();
				strings.add("a");
				strings.add("b");
				strings.add("c");
				strings.add("d");
				strings.add("e");
				strings.add("f");
				strings.add("g");
				String result = Concatenate.concatenate(strings);
				assertEquals("abcdefg", result);
			}

			// Test case 9: Test with list of eight strings
			@Test
			void testConcatenateWithEightStrings() {
				List<Object> strings = new ArrayList<>();
				strings.add("a");
				strings.add("b");
				strings.add("c");
				strings.add("d");
				strings.add("e");
				strings.add("f");
				strings.add("g");
				strings.add("h");
				String result = Concatenate.concatenate(strings);
				assertEquals("abcdefgh", result);
			}

			// Test case 10: Test with list of nine strings
			@Test
			void testConcatenateWithNineStrings() {
				List<Object> strings = new ArrayList<>();
				strings.add("a");
				strings.add("b");
				strings.add("c");
				strings.add("d");
				strings.add("e");
				strings.add("f");
				strings.add("g");
				strings.add("h");
				strings.add("i");
				String result = Concatenate.concatenate(strings);
				assertEquals("abcdefghi", result);
			}
}