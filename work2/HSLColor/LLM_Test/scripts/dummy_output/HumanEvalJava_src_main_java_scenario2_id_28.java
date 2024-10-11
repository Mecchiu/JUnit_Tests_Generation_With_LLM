// ConcatenateTest.java
package scenario2;

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
			void testConcatenateEmptyList() {
				List<Object> strings = new ArrayList<>();
				String result = Concatenate.concatenate(strings);
				assertEquals("", result);
			}

			// Test case 2: Test with list containing one string
			@Test
			void testConcatenateOneString() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				String result = Concatenate.concatenate(strings);
				assertEquals("Hello", result);
			}

			// Test case 3: Test with list containing multiple strings
			@Test
			void testConcatenateMultipleStrings() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add(" ");
				strings.add("World");
				String result = Concatenate.concatenate(strings);
				assertEquals("Hello World", result);
			}

			// Test case 4: Test with list containing null values
			@Test
			void testConcatenateNullValues() {
				List<Object> strings = new ArrayList<>();
				strings.add(null);
				strings.add("Hello");
				strings.add(null);
				String result = Concatenate.concatenate(strings);
				assertEquals("nullHellonull", result);
			}

			// Test case 5: Test with list containing empty strings
			@Test
			void testConcatenateEmptyStrings() {
				List<Object> strings = new ArrayList<>();
				strings.add("");
				strings.add("Hello");
				strings.add("");
				String result = Concatenate.concatenate(strings);
				assertEquals("Hello", result);
			}

			// Test case 6: Test with list containing integers
			@Test
			void testConcatenateIntegers() {
				List<Object> strings = new ArrayList<>();
				strings.add(1);
				strings.add(2);
				strings.add(3);
				String result = Concatenate.concatenate(strings);
				assertEquals("123", result);
			}

			// Test case 7: Test with list containing special characters
			@Test
			void testConcatenateSpecialCharacters() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add("!");
				strings.add("#");
				String result = Concatenate.concatenate(strings);
				assertEquals("Hello!#", result);
			}

			// Test case 8: Test with list containing a mix of different types
			@Test
			void testConcatenateDifferentTypes() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add(1);
				strings.add("World");
				strings.add(2);
				String result = Concatenate.concatenate(strings);
				assertEquals("Hello1World2", result);
			}

			// Test case 9: Test with list containing a large number of strings
			@Test
			void testConcatenateLargeNumberOfStrings() {
				List<Object> strings = new ArrayList<>();
				for (int i = 0; i < 1000000; i++) {
					strings.add("Hello");
				}
				String result = Concatenate.concatenate(strings);
				assertEquals("Hello".repeat(1000000), result);
			}

			// Test case 10: Test with list containing very long strings
			@Test
			void testConcatenateVeryLongStrings() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello".repeat(1000000));
				String result = Concatenate.concatenate(strings);
				assertEquals("Hello".repeat(1000000), result);
			}
}