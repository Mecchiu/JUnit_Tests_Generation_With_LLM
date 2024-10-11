// DigitsumTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
	/**
			* Test case for empty string.
			*/
			@Test
			void testEmptyString() {
				assertEquals(0, Digitsum.digitSum(""));
			}
			
			/**
			* Test case for string with only lower case characters.
			*/
			@Test
			void testLowerCaseString() {
				assertEquals(0, Digitsum.digitSum("abc"));
			}
			
			/**
			* Test case for string with only upper case characters.
			*/
			@Test
			void testUpperCaseString() {
				assertEquals(195, Digitsum.digitSum("ABC"));
			}
			
			/**
			* Test case for string with both upper and lower case characters.
			*/
			@Test
			void testMixedCaseString() {
				assertEquals(195, Digitsum.digitSum("aBcDeF"));
			}
			
			/**
			* Test case for string with special characters.
			*/
			@Test
			void testSpecialCharactersString() {
				assertEquals(0, Digitsum.digitSum("!@#$%^&*()"));
			}
			
			/**
			* Test case for string with numbers.
			*/
			@Test
			void testNumbersString() {
				assertEquals(0, Digitsum.digitSum("123456789"));
			}
			
			/**
			* Test case for string with spaces.
			*/
			@Test
			void testSpacesString() {
				assertEquals(0, Digitsum.digitSum("   "));
			}
			
			/**
			* Test case for string with special characters and numbers.
			*/
			@Test
			void testSpecialCharactersAndNumbersString() {
				assertEquals(0, Digitsum.digitSum("!@#$%^&*()123456789"));
			}
			
			/**
			* Test case for string with special characters, numbers and spaces.
			*/
			@Test
			void testSpecialCharactersNumbersAndSpacesString() {
				assertEquals(0, Digitsum.digitSum("!@#$%^&*() 123456789"));
			}
			
			/**
			* Test case for string with special characters, numbers, spaces and upper case characters.
			*/
			@Test
			void testSpecialCharactersNumbersSpacesAndUpperCaseString() {
				assertEquals(195, Digitsum.digitSum("!@#$%^&*() 123456789 ABC"));
			}
}