// CheckIfLastCharIsALetterTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {
	/**
			* Test case #1: Test if the last character of the given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCase1() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
			}

			/**
			* Test case #2: Test if the last character of the given string is an alphabetical character and is not a part of a word.
			* Expected output: True
			*/
			@Test
			void testCase2() {
						assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e"));
			}

			/**
			* Test case #3: Test if the last character of the given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCase3() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
			}

			/**
			* Test case #4: Test if the last character of the given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCase4() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
			}

			/**
			* Test case #5: Test if the last character of the given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCase5() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee"));
			}

			/**
			* Test case #6: Test if the last character of the given string is an alphabetical character and is not a part of a word.
			* Expected output: True
			*/
			@Test
			void testCase6() {
						assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
			}

			/**
			* Test case #7: Test if the last character of the given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCase7() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie "));
			}

			/**
			* Test case #8: Test if the last character of the given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCase8() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1"));
			}

			/**
			* Test case #9: Test if the last character of the given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCase9() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
			}

			/**
			* Test case #10: Test if the last character of the given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCase10() {
						assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee e "));
			}
}