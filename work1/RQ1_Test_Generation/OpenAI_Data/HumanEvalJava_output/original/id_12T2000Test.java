// LongestTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {
	/**
			* Test case for the {@link Longest#longest(List)} method.
			* It tests the case when the input list is empty.
			*/
			@Test
			void testEmptyList() {
				List<Object> strings = List.of();
				String longest = Longest.longest(strings);
				assertNull(longest);
			}

			/**
			* Test case for the {@link Longest#longest(List)} method.
			* It tests the case when the input list contains one string.
			*/
			@Test
			void testOneString() {
				List<Object> strings = List.of("a");
				String longest = Longest.longest(strings);
				assertEquals("a", longest);
			}

			/**
			* Test case for the {@link Longest#longest(List)} method.
			* It tests the case when the input list contains two strings of the same length.
			*/
			@Test
			void testTwoStringsSameLength() {
				List<Object> strings = List.of("a", "b");
				String longest = Longest.longest(strings);
				assertEquals("a", longest);
			}

			/**
			* Test case for the {@link Longest#longest(List)} method.
			* It tests the case when the input list contains two strings of different lengths.
			*/
			@Test
			void testTwoStringsDifferentLengths() {
				List<Object> strings = List.of("a", "bb");
				String longest = Longest.longest(strings);
				assertEquals("bb", longest);
			}

			/**
			* Test case for the {@link Longest#longest(List)} method.
			* It tests the case when the input list contains three strings of the same length.
			*/
			@Test
			void testThreeStringsSameLength() {
				List<Object> strings = List.of("a", "b", "c");
				String longest = Longest.longest(strings);
				assertEquals("a", longest);
			}

			/**
			* Test case for the {@link Longest#longest(List)} method.
			* It tests the case when the input list contains three strings of different lengths.
			*/
			@Test
			void testThreeStringsDifferentLengths() {
				List<Object> strings = List.of("a", "bb", "ccc");
				String longest = Longest.longest(strings);
				assertEquals("ccc", longest);
			}

			/**
			* Test case for the {@link Longest#longest(List)} method.
			* It tests the case when the input list contains four strings of the same length.
			*/
			@Test
			void testFourStringsSameLength() {
				List<Object> strings = List.of("a", "b", "c", "d");
				String longest = Longest.longest(strings);
				assertEquals("a", longest);
			}

			/**
			* Test case for the {@link Longest#longest(List)} method.
			* It tests the case when the input list contains four strings of different lengths.
			*/
			@Test
			void testFourStringsDifferentLengths() {
				List<Object> strings = List.of("a", "bb", "ccc", "dddd");
				String longest = Longest.longest(strings);
				assertEquals("dddd", longest);
			}

			/**
			* Test case for the {@link Longest#longest(List)} method.
			* It tests the case when the input list contains five strings of the same length.
			*/
			@Test
			void testFiveStringsSameLength() {
				List<Object> strings = List.of("a", "b", "c", "d", "e");
				String longest = Longest.longest(strings);
				assertEquals("a", longest);
			}

			/**
			* Test case for the {@link Longest#longest(List)} method.
			* It tests the case when the input list contains five strings of different lengths.
			*/
			@Test
			void testFiveStringsDifferentLengths() {
				List<Object> strings = List.of("a", "bb", "ccc", "dddd", "eeeee");
				String longest = Longest.longest(strings);
				assertEquals("eeeee", longest);
			}
}
