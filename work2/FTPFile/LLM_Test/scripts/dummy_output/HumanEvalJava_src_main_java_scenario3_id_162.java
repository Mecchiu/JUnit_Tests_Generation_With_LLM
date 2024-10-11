// StringToMd5Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {
			/**
			* Test case 1: Test the method with a non-empty string.
			* The expected result is the md5 hash of the string.
			*/
			@Test
			void testStringToMd5NonEmptyString() {
				String text = "Hello world";
				String expected = "3e25960a79dbc69b674cd4ec67a72c62";
				String actual = StringToMd5.stringToMd5(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: Test the method with an empty string.
			* The expected result is null.
			*/
			@Test
			void testStringToMd5EmptyString() {
				String text = "";
				String expected = null;
				String actual = StringToMd5.stringToMd5(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: Test the method with a string containing spaces.
			* The expected result is the md5 hash of the string.
			*/
			@Test
			void testStringToMd5StringWithSpaces() {
				String text = "A B C";
				String expected = "0ef78513b0cb8cef12743f5aeb35f888";
				String actual = StringToMd5.stringToMd5(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: Test the method with a string containing special characters.
			* The expected result is the md5 hash of the string.
			*/
			@Test
			void testStringToMd5StringWithSpecialCharacters() {
				String text = "!@#$%^&*()";
				String expected = "b5f4c5a1c5f4c5a1c5f4c5a1c5f4c5a1";
				String actual = StringToMd5.stringToMd5(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: Test the method with a string containing numbers.
			* The expected result is the md5 hash of the string.
			*/
			@Test
			void testStringToMd5StringWithNumbers() {
				String text = "1234567890";
				String expected = "e807f1fcf82d132f9bb018ca6738a19f";
				String actual = StringToMd5.stringToMd5(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: Test the method with a string containing uppercase letters.
			* The expected result is the md5 hash of the string.
			*/
			@Test
			void testStringToMd5StringWithUppercaseLetters() {
				String text = "HELLO WORLD";
				String expected = "b10a8db164e0754105b7a99be72e3fe5";
				String actual = StringToMd5.stringToMd5(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case 7: Test the method with a string containing lowercase letters.
			* The expected result is the md5 hash of the string.
			*/
			@Test
			void testStringToMd5StringWithLowercaseLetters() {
				String text = "hello world";
				String expected = "5eb63bbbe01eeed093cb22bb8f5acdc3";
				String actual = StringToMd5.stringToMd5(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case 8: Test the method with a string containing a single character.
			* The expected result is the md5 hash of the string.
			*/
			@Test
			void testStringToMd5StringWithSingleCharacter() {
				String text = "a";
				String expected = "0cc175b9c0f1b6a831c399e269772661";
				String actual = StringToMd5.stringToMd5(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case 9: Test the method with a string containing multiple lines.
			* The expected result is the md5 hash of the string.
			*/
			@Test
			void testStringToMd5StringWithMultipleLines() {
				String text = "Hello\nworld";
				String expected = "b10a8db164e0754105b7a99be72e3fe5";
				String actual = StringToMd5.stringToMd5(text);
				assertEquals(expected, actual);
			}

			/**
			* Test case 10: Test the method with a string containing unicode characters.
			* The expected result is the md5 hash of the string.
			*/
			@Test
			void testStringToMd5StringWithUnicodeCharacters() {
				String text = "你好世界";
				String expected = "7b7b7b7b7b7b7b7b7b7b7b7b7b7b7b7b";
				String actual = StringToMd5.stringToMd5(text);
				assertEquals(expected, actual);
			}
}