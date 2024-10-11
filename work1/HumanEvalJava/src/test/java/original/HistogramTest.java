// HistogramTest.java
package original;

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
			 * Test case for the method {@link Histogram#histogram(String)}.
			 * It checks if the method returns the correct result for the input "a b b a".
			 */
			@Test
			void testHistogram1() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 2);
				expected.put("b", 2);
				assertEquals(expected, Histogram.histogram("a b b a"));
			}

			/**
			 * Test case for the method {@link Histogram#histogram(String)}.
			 * It checks if the method returns the correct result for the input "a b c a b".
			 */
			@Test
			void testHistogram2() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 2);
				expected.put("b", 2);
				assertEquals(expected, Histogram.histogram("a b c a b"));
			}

			/**
			 * Test case for the method {@link Histogram#histogram(String)}.
			 * It checks if the method returns the correct result for the input "a b c d g".
			 */
			@Test
			void testHistogram3() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 1);
				expected.put("b", 1);
				expected.put("c", 1);
				expected.put("d", 1);
				expected.put("g", 1);
				assertEquals(expected, Histogram.histogram("a b c d g"));
			}

			/**
			 * Test case for the method {@link Histogram#histogram(String)}.
			 * It checks if the method returns the correct result for the input "r t g".
			 */
			@Test
			void testHistogram4() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("r", 1);
				expected.put("t", 1);
				expected.put("g", 1);
				assertEquals(expected, Histogram.histogram("r t g"));
			}

			/**
			 * Test case for the method {@link Histogram#histogram(String)}.
			 * It checks if the method returns the correct result for the input "b b b b a".
			 */
			@Test
			void testHistogram5() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("b", 4);
				assertEquals(expected, Histogram.histogram("b b b b a"));
			}

			/**
			 * Test case for the method {@link Histogram#histogram(String)}.
			 * It checks if the method returns the correct result for the input "".
			 */
			@Test
			void testHistogram6() {
				Map<String, Integer> expected = new HashMap<>();
				assertEquals(expected, Histogram.histogram(""));
			}

			/**
			 * Test case for the method {@link Histogram#histogram(String)}.
			 * It checks if the method returns the correct result for the input "a".
			 */
			@Test
			void testHistogram7() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 1);
				assertEquals(expected, Histogram.histogram("a"));
			}

			/**
			 * Test case for the method {@link Histogram#histogram(String)}.
			 * It checks if the method returns the correct result for the input "a b c d e f g h i j k l m n o p q r s t u v w x y z".
			 */
			@Test
			void testHistogram8() {
				Map<String, Integer> expected = new HashMap<>();
				expected.put("a", 1);
				expected.put("b", 1);
				expected.put("c", 1);
				expected.put("d", 1);
				expected.put("e", 1);
				expected.put("f", 1);
				expected.put("g", 1);
				expected.put("h", 1);
				expected.put("i", 1);
				expected.put("j", 1);
				expected.put("k", 1);
				expected.put("l", 1);
				expected.put("m", 1);
				expected.put("n", 1);
				expected.put("o", 1);
				expected.put("p", 1);
				expected.put("q", 1);
				expected.put("r", 1);
				expected.put("s", 1);
				expected.put("t", 1);
				expected.put("u", 1);
				expected.put("v", 1);
				expected.put("w", 1);
				expected.put("x", 1);
				expected.put("y", 1);
				expected.put("z", 1);
				assertEquals(expected, Histogram.histogram("a b c d e f g h i j k l m n o p q r s t u v w x y z"));
			}

}