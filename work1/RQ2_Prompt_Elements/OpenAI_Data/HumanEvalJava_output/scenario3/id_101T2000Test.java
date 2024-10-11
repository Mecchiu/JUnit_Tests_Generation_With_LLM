// WordsStringTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
	@Test
			void testWordsString1() {
				List<Object> result = WordsString.wordsString("Hi, my name is John");
				List<Object> expected = List.of("Hi", "my", "name", "is", "John");
				assertEquals(expected, result);
			}

			@Test
			void testWordsString2() {
				List<Object> result = WordsString.wordsString("One, two, three, four, five, six");
				List<Object> expected = List.of("One", "two", "three", "four", "five", "six");
				assertEquals(expected, result);
			}

			@Test
			void testWordsString3() {
				List<Object> result = WordsString.wordsString("Hi, my name");
				List<Object> expected = List.of("Hi", "my", "name");
				assertEquals(expected, result);
			}

			@Test
			void testWordsString4() {
				List<Object> result = WordsString.wordsString("One,, two, three, four, five, six,");
				List<Object> expected = List.of("One", "two", "three", "four", "five", "six");
				assertEquals(expected, result);
			}

			@Test
			void testWordsString5() {
				List<Object> result = WordsString.wordsString("");
				List<Object> expected = List.of();
				assertEquals(expected, result);
			}

			@Test
			void testWordsString6() {
				List<Object> result = WordsString.wordsString("ahmed     , gamal");
				List<Object> expected = List.of("ahmed", "gamal");
				assertEquals(expected, result);
			}

			@Test
			void testWordsString7() {
				List<Object> result = WordsString.wordsString("Hi, my name is John");
				List<Object> expected = List.of("Hi", "my", "name", "is", "John");
				assertEquals(expected, result);
			}

			@Test
			void testWordsString8() {
				List<Object> result = WordsString.wordsString("One, two, three, four, five, six");
				List<Object> expected = List.of("One", "two", "three", "four", "five", "six");
				assertEquals(expected, result);
			}

			@Test
			void testWordsString9() {
				List<Object> result = WordsString.wordsString("Hi, my name");
				List<Object> expected = List.of("Hi", "my", "name");
				assertEquals(expected, result);
			}

			@Test
			void testWordsString10() {
				List<Object> result = WordsString.wordsString("One,, two, three, four, five, six,");
				List<Object> expected = List.of("One", "two", "three", "four", "five", "six");
				assertEquals(expected, result);
			}
}
