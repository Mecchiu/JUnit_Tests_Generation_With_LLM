// HistogramTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {
	/**
			* Test case for empty string.
			*/
			@Test
			void testEmptyString() {
						assertEquals("{}", Histogram.histogram(""));
			}

			/**
			* Test case for single character.
			*/
			@Test
			void testSingleCharacter() {
						assertEquals("{\"a\": 1}", Histogram.histogram("a"));
			}

			/**
			* Test case for two characters.
			*/
			@Test
			void testTwoCharacters() {
						assertEquals("{\"a\": 1, \"b\": 1}", Histogram.histogram("a b"));
			}

			/**
			* Test case for two characters with repetition.
			*/
			@Test
			void testTwoCharactersWithRepetition() {
						assertEquals("{\"a\": 2, \"b\": 2}", Histogram.histogram("a b b a"));
			}

			/**
			* Test case for three characters.
			*/
			@Test
			void testThreeCharacters() {
						assertEquals("{\"a\": 1, \"b\": 1, \"c\": 1}", Histogram.histogram("a b c"));
			}

			/**
			* Test case for three characters with repetition.
			*/
			@Test
			void testThreeCharactersWithRepetition() {
						assertEquals("{\"a\": 2, \"b\": 2, \"c\": 2}", Histogram.histogram("a b c a b c"));
			}

			/**
			* Test case for four characters.
			*/
			@Test
			void testFourCharacters() {
						assertEquals("{\"a\": 1, \"b\": 1, \"c\": 1, \"d\": 1}", Histogram.histogram("a b c d"));
			}

			/**
			* Test case for four characters with repetition.
			*/
			@Test
			void testFourCharactersWithRepetition() {
						assertEquals("{\"a\": 2, \"b\": 2, \"c\": 2, \"d\": 2}", Histogram.histogram("a b c d a b c d"));
			}

			/**
			* Test case for five characters.
			*/
			@Test
			void testFiveCharacters() {
						assertEquals("{\"a\": 1, \"b\": 1, \"c\": 1, \"d\": 1, \"e\": 1}", Histogram.histogram("a b c d e"));
			}

			/**
			* Test case for five characters with repetition.
			*/
			@Test
			void testFiveCharactersWithRepetition() {
						assertEquals("{\"a\": 2, \"b\": 2, \"c\": 2, \"d\": 2, \"e\": 2}", Histogram.histogram("a b c d e a b c d e"));
			}
}
