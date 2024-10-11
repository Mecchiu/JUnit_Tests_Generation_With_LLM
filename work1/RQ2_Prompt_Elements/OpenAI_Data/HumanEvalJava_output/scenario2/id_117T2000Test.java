// SelectWordsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains ten unit test cases for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {
	@Test
			void testSelectWords() {
				List<Object> expected = new ArrayList<>();
				expected.add("test");
				expected.add("words");
				expected.add("string");
				expected.add("empty");
				expected.add("list");
				assertEquals(expected, SelectWords.selectWords("This is a test string with some words and an empty list", 4));
			}

			@Test
			void testSelectWordsEmpty() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords("", 4));
			}

			@Test
			void testSelectWordsNoWords() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords("This is a test string with some words and an empty list", 0));
			}

			@Test
			void testSelectWordsNoConsonants() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords("This is a test string with some words and an empty list", 5));
			}

			@Test
			void testSelectWordsOneWord() {
				List<Object> expected = new ArrayList<>();
				expected.add("test");
				assertEquals(expected, SelectWords.selectWords("test", 4));
			}

			@Test
			void testSelectWordsOneWordNoConsonants() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords("test", 0));
			}

			@Test
			void testSelectWordsOneWordEmpty() {
				List<Object> expected = new ArrayList<>();
				assertEquals(expected, SelectWords.selectWords("", 4));
			}

			@Test
			void testSelectWordsOneWordOneConsonant() {
				List<Object> expected = new ArrayList<>();
				expected.add("test");
				assertEquals(expected, SelectWords.selectWords("test", 3));
			}

			@Test
			void testSelectWordsOneWordOneConsonantUpperCase() {
				List<Object> expected = new ArrayList<>();
				expected.add("TEST");
				assertEquals(expected, SelectWords.selectWords("TEST", 3));
			}

			@Test
			void testSelectWordsOneWordOneConsonantLowerCase() {
				List<Object> expected = new ArrayList<>();
				expected.add("test");
				assertEquals(expected, SelectWords.selectWords("test", 3));
			}
}
