// HistogramTest.java
package scenario1;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {

		/**
		* Test case 1.
		* The input string is null.
		* The expected result is an empty map.
		*/
		@Test
		void testHistogram1() {
				Map<String, Integer> expected = new HashMap<>();
				assertEquals(expected, Histogram.histogram(null));
		}
		
		/**
		* Test case 2.
		* The input string is empty.
		* The expected result is an empty map.
		*/
		@Test
		void testHistogram2() {
				Map<String, Integer> expected = new HashMap<>();
				assertEquals(expected, Histogram.histogram(""));
		}
		
		/**
		* Test case 3.
		* The input string is "a".
		* The expected result is a map with one entry: "a" -> 1.
		*/
		@Test
		void testHistogram3() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 1);
				assertEquals(expected, Histogram.histogram("a"));
		}
		
		/**
		* Test case 4.
		* The input string is "a a".
		* The expected result is a map with one entry: "a" -> 2.
		*/
		@Test
		void testHistogram4() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 2);
				assertEquals(expected, Histogram.histogram("a a"));
		}
		
		/**
		* Test case 5.
		* The input string is "a b".
		* The expected result is a map with two entries: "a" -> 1, "b" -> 1.
		*/
		@Test
		void testHistogram5() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 1);
				expected.put("b", 1);
				assertEquals(expected, Histogram.histogram("a b"));
		}
		
		/**
		* Test case 6.
		* The input string is "a a b".
		* The expected result is a map with two entries: "a" -> 2, "b" -> 1.
		*/
		@Test
		void testHistogram6() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 2);
				expected.put("b", 1);
				assertEquals(expected, Histogram.histogram("a a b"));
		}
		
		/**
		* Test case 7.
		* The input string is "a b b".
		* The expected result is a map with two entries: "a" -> 1, "b" -> 2.
		*/
		@Test
		void testHistogram7() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 1);
				expected.put("b", 2);
				assertEquals(expected, Histogram.histogram("a b b"));
		}
		
		/**
		* Test case 8.
		* The input string is "a a b b".
		* The expected result is a map with two entries: "a" -> 2, "b" -> 2.
		*/
		@Test
		void testHistogram8() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 2);
				expected.put("b", 2);
				assertEquals(expected, Histogram.histogram("a a b b"));
		}
		
		/**
		* Test case 9.
		* The input string is "a a b b c".
		* The expected result is a map with three entries: "a" -> 2, "b" -> 2, "c" -> 1.
		*/
		@Test
		void testHistogram9() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 2);
				expected.put("b", 2);
				expected.put("c", 1);
				assertEquals(expected, Histogram.histogram("a a b b c"));
		}
		
		/**
		* Test case 10.
		* The input string is "a a b b c c".
		* The expected result is a map with three entries: "a" -> 2, "b" -> 2, "c" -> 2.
		*/
		@Test
		void testHistogram10() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 2);
				expected.put("b", 2);
				expected.put("c", 2);
				assertEquals(expected, Histogram.histogram("a a b b c c"));
		}
}