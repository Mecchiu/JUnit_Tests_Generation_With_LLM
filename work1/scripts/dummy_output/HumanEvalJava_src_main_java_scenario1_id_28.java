// ConcatenateTest.java
package scenario1;

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
			
			// Test case 4: Test with list containing one integer
			@Test
			void testConcatenateOneInteger() {
				List<Object> strings = new ArrayList<>();
				strings.add(5);
				String result = Concatenate.concatenate(strings);
				assertEquals("5", result);
			}
			
			// Test case 5: Test with list containing multiple integers
			@Test
			void testConcatenateMultipleIntegers() {
				List<Object> strings = new ArrayList<>();
				strings.add(5);
				strings.add(10);
				strings.add(15);
				String result = Concatenate.concatenate(strings);
				assertEquals("51015", result);
			}
			
			// Test case 6: Test with list containing one float
			@Test
			void testConcatenateOneFloat() {
				List<Object> strings = new ArrayList<>();
				strings.add(5.5);
				String result = Concatenate.concatenate(strings);
				assertEquals("5.5", result);
			}
			
			// Test case 7: Test with list containing multiple floats
			@Test
			void testConcatenateMultipleFloats() {
				List<Object> strings = new ArrayList<>();
				strings.add(5.5);
				strings.add(10.5);
				strings.add(15.5);
				String result = Concatenate.concatenate(strings);
				assertEquals("5.510.515.5", result);
			}
			
			// Test case 8: Test with list containing one boolean
			@Test
			void testConcatenateOneBoolean() {
				List<Object> strings = new ArrayList<>();
				strings.add(true);
				String result = Concatenate.concatenate(strings);
				assertEquals("true", result);
			}
			
			// Test case 9: Test with list containing multiple booleans
			@Test
			void testConcatenateMultipleBooleans() {
				List<Object> strings = new ArrayList<>();
				strings.add(true);
				strings.add(false);
				strings.add(true);
				String result = Concatenate.concatenate(strings);
				assertEquals("truefalsetrue", result);
			}
			
			// Test case 10: Test with list containing different types of objects
			@Test
			void testConcatenateDifferentTypes() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add(5);
				strings.add(5.5);
				strings.add(true);
				String result = Concatenate.concatenate(strings);
				assertEquals("Hello55.5true", result);
			}
}