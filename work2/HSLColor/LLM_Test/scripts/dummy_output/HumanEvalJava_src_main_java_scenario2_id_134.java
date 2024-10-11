// CheckIfLastCharIsALetterTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {
			/**
			* Test case when the input string is empty.
			*/
			@Test
			void testEmptyString() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
			}

			/**
			* Test case when the input string contains only one character.
			*/
			@Test
			void testOneCharacter() {
						assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a"));
			}

			/**
			* Test case when the input string contains only one character and it is not a letter.
			*/
			@Test
			void testOneNonLetterCharacter() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1"));
			}

			/**
			* Test case when the input string contains only one word.
			*/
			@Test
			void testOneWord() {
						assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Hello"));
			}

			/**
			* Test case when the input string contains only one word and the last character is not a letter.
			*/
			@Test
			void testOneWordWithNonLetterLastChar() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Hello1"));
			}

			/**
			* Test case when the input string contains two words.
			*/
			@Test
			void testTwoWords() {
						assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Hello World"));
			}

			/**
			* Test case when the input string contains two words and the last character is not a letter.
			*/
			@Test
			void testTwoWordsWithNonLetterLastChar() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Hello World1"));
			}

			/**
			* Test case when the input string contains three words.
			*/
			@Test
			void testThreeWords() {
						assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Hello World!"));
			}

			/**
			* Test case when the input string contains three words and the last character is not a letter.
			*/
			@Test
			void testThreeWordsWithNonLetterLastChar() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Hello World!1"));
			}

			/**
			* Test case when the input string contains three words and the last character is a letter but it is a part of a word.
			*/
			@Test
			void testThreeWordsWithLetterLastCharButItIsAPartOfAWord() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Hello World1!"));
			}
}