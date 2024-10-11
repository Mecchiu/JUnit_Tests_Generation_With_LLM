// WordsInSentenceTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains ten unit test cases for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {
	@Test
			void testWordsInSentence1() {
				String sentence = "The cat is white";
				String expected = "The cat";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence2() {
				String sentence = "The dog is black";
				String expected = "dog";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence3() {
				String sentence = "The bird is yellow";
				String expected = "bird yellow";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence4() {
				String sentence = "The fish is red";
				String expected = "fish";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence5() {
				String sentence = "The horse is brown";
				String expected = "horse brown";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence6() {
				String sentence = "The cow is green";
				String expected = "cow green";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence7() {
				String sentence = "The lion is orange";
				String expected = "lion orange";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence8() {
				String sentence = "The tiger is purple";
				String expected = "tiger purple";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence9() {
				String sentence = "The wolf is pink";
				String expected = "wolf pink";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}

			@Test
			void testWordsInSentence10() {
				String sentence = "The bear is gray";
				String expected = "bear gray";
				String actual = WordsInSentence.wordsInSentence(sentence);
				assertEquals(expected, actual);
			}
}
