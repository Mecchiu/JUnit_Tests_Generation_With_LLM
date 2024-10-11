// CheckIfLastCharIsALetterTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {
	/**
			* Test case 1: Test if the last character of a given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCheckIfLastCharIsALetter1() {
						Boolean result = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie");
						assertFalse(result);
			}

			/**
			* Test case 2: Test if the last character of a given string is an alphabetical character and is not a part of a word.
			* Expected output: True
			*/
			@Test
			void testCheckIfLastCharIsALetter2() {
						Boolean result = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e");
						assertTrue(result);
			}

			/**
			* Test case 3: Test if the last character of a given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCheckIfLastCharIsALetter3() {
						Boolean result = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e ");
						assertFalse(result);
			}

			/**
			* Test case 4: Test if the last character of a given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCheckIfLastCharIsALetter4() {
						Boolean result = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("");
						assertFalse(result);
			}

			/**
			* Test case 5: Test if the last character of a given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCheckIfLastCharIsALetter5() {
						Boolean result = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple");
						assertFalse(result);
			}

			/**
			* Test case 6: Test if the last character of a given string is an alphabetical character and is not a part of a word.
			* Expected output: True
			*/
			@Test
			void testCheckIfLastCharIsALetter6() {
						Boolean result = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee");
						assertTrue(result);
			}

			/**
			* Test case 7: Test if the last character of a given string is an alphabetical character and is not a part of a word.
			* Expected output: True
			*/
			@Test
			void testCheckIfLastCharIsALetter7() {
						Boolean result = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A");
						assertTrue(result);
			}

			/**
			* Test case 8: Test if the last character of a given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCheckIfLastCharIsALetter8() {
						Boolean result = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie ");
						assertFalse(result);
			}

			/**
			* Test case 9: Test if the last character of a given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCheckIfLastCharIsALetter9() {
						Boolean result = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1");
						assertFalse(result);
			}

			/**
			* Test case 10: Test if the last character of a given string is an alphabetical character and is not a part of a word.
			* Expected output: False
			*/
			@Test
			void testCheckIfLastCharIsALetter10() {
						Boolean result = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee e ");
						assertFalse(result);
			}
}