// LongestTest.java
package scenario2;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {
			// Test case 1: Test with empty list
			@Test
			void testEmptyList() {
				List<Object> strings = new ArrayList<>();
				String longest = Longest.longest(strings);
				assertNull(longest);
			}
			
			// Test case 2: Test with list of one string
			@Test
			void testOneString() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				String longest = Longest.longest(strings);
				assertEquals("Hello", longest);
			}
			
			// Test case 3: Test with list of two strings of different lengths
			@Test
			void testTwoStringsDifferentLengths() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add("Hi");
				String longest = Longest.longest(strings);
				assertEquals("Hello", longest);
			}
			
			// Test case 4: Test with list of two strings of same length
			@Test
			void testTwoStringsSameLength() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add("Java");
				String longest = Longest.longest(strings);
				assertEquals("Hello", longest);
			}
			
			// Test case 5: Test with list of three strings of different lengths
			@Test
			void testThreeStringsDifferentLengths() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add("Hi");
				strings.add("Java");
				String longest = Longest.longest(strings);
				assertEquals("Hello", longest);
			}
			
			// Test case 6: Test with list of three strings of same length
			@Test
			void testThreeStringsSameLength() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add("Java");
				strings.add("Code");
				String longest = Longest.longest(strings);
				assertEquals("Hello", longest);
			}
			
			// Test case 7: Test with list of four strings of different lengths
			@Test
			void testFourStringsDifferentLengths() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add("Hi");
				strings.add("Java");
				strings.add("Code");
				String longest = Longest.longest(strings);
				assertEquals("Hello", longest);
			}
			
			// Test case 8: Test with list of four strings of same length
			@Test
			void testFourStringsSameLength() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add("Java");
				strings.add("Code");
				strings.add("Test");
				String longest = Longest.longest(strings);
				assertEquals("Hello", longest);
			}
			
			// Test case 9: Test with list of five strings of different lengths
			@Test
			void testFiveStringsDifferentLengths() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add("Hi");
				strings.add("Java");
				strings.add("Code");
				strings.add("Test");
				String longest = Longest.longest(strings);
				assertEquals("Hello", longest);
			}
			
			// Test case 10: Test with list of five strings of same length
			@Test
			void testFiveStringsSameLength() {
				List<Object> strings = new ArrayList<>();
				strings.add("Hello");
				strings.add("Java");
				strings.add("Code");
				strings.add("Test");
				strings.add("Unit");
				String longest = Longest.longest(strings);
				assertEquals("Hello", longest);
			}
}