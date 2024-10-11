// StringToMd5Test.java
package original;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {
			/**
			* Test case 1: Test the case when the input string is empty.
			* The expected output is null.
			*/
			@Test
			void testEmptyString() {
				String input = "";
				String expected = null;
				String actual = StringToMd5.stringToMd5(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: Test the case when the input string is "Hello world".
			* The expected output is "3e25960a79dbc69b674cd4ec67a72c62".
			*/
			@Test
			void testHelloWorld() {
				String input = "Hello world";
				String expected = "3e25960a79dbc69b674cd4ec67a72c62";
				String actual = StringToMd5.stringToMd5(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: Test the case when the input string is "A B C".
			* The expected output is "0ef78513b0cb8cef12743f5aeb35f888".
			*/
			@Test
			void testABC() {
				String input = "A B C";
				String expected = "0ef78513b0cb8cef12743f5aeb35f888";
				String actual = StringToMd5.stringToMd5(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: Test the case when the input string is "password".
			* The expected output is "5f4dcc3b5aa765d61d8327deb882cf99".
			*/
			@Test
			void testPassword() {
				String input = "password";
				String expected = "5f4dcc3b5aa765d61d8327deb882cf99";
				String actual = StringToMd5.stringToMd5(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: Test the case when the input string is "123456".
			* The expected output is "e10adc3949ba59abbe56e057f20f883e".
			*/
			@Test
			void test123456() {
				String input = "123456";
				String expected = "e10adc3949ba59abbe56e057f20f883e";
				String actual = StringToMd5.stringToMd5(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: Test the case when the input string is "qwerty".
			* The expected output is "d8578edf8458ce06fbc5bb76a58c5ca4".
			*/
			@Test
			void testQwerty() {
				String input = "qwerty";
				String expected = "d8578edf8458ce06fbc5bb76a58c5ca4";
				String actual = StringToMd5.stringToMd5(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case 7: Test the case when the input string is "abc123".
			* The expected output is "e99a18c428cb38d5f260853678922e03".
			*/
			@Test
			void testAbc123() {
				String input = "abc123";
				String expected = "e99a18c428cb38d5f260853678922e03";
				String actual = StringToMd5.stringToMd5(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case 8: Test the case when the input string is "iloveyou".
			* The expected output is "f5a7924e621e84c9280a9a27e1bcb7f6".
			*/
			@Test
			void testIloveyou() {
				String input = "iloveyou";
				String expected = "f5a7924e621e84c9280a9a27e1bcb7f6";
				String actual = StringToMd5.stringToMd5(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case 9: Test the case when the input string is "admin".
			* The expected output is "21232f297a57a5a743894a0e4a801fc3".
			*/
			@Test
			void testAdmin() {
				String input = "admin";
				String expected = "21232f297a57a5a743894a0e4a801fc3";
				String actual = StringToMd5.stringToMd5(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case 10: Test the case when the input string is "welcome".
			* The expected output is "5d41402abc4b2a76b9719d911017c592".
			*/
			@Test
			void testWelcome() {
				String input = "welcome";
				String expected = "5d41402abc4b2a76b9719d911017c592";
				String actual = StringToMd5.stringToMd5(input);
				assertEquals(expected, actual);
			}
}