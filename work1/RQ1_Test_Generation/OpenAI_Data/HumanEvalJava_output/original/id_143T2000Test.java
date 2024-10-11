// WordsInSentenceTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains ten unit test cases for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {
	@Test
			void testWordsInSentence1() {
				String sentence = "This is a test";
				String expected = "is";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence2() {
				String sentence = "lets go for swimming";
				String expected = "go for";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence3() {
				String sentence = "there is no place available here";
				String expected = "there is no place";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence4() {
				String sentence = "Hi I am Hussein";
				String expected = "Hi am Hussein";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence5() {
				String sentence = "go for it";
				String expected = "go for it";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence6() {
				String sentence = "here";
				String expected = "";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence7() {
				String sentence = "here is";
				String expected = "is";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence8() {
				String sentence = "This is a test";
				String expected = "is";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence9() {
				String sentence = "lets go for swimming";
				String expected = "go for";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence10() {
				String sentence = "there is no place available here";
				String expected = "there is no place";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}
}
