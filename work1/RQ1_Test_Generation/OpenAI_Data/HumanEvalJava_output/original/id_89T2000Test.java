// EncryptTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains ten unit test cases for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {
	/**
			* Test case for the {@link Encrypt#encrypt(String)} method.
			* It tests the case when the input string is "hi".
			*/
			@Test
			void testEncryptHi() {
				String input = "hi";
				String expected = "lm";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encrypt#encrypt(String)} method.
			* It tests the case when the input string is "asdfghjkl".
			*/
			@Test
			void testEncryptAsdfghjkl() {
				String input = "asdfghjkl";
				String expected = "ewhjklnop";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encrypt#encrypt(String)} method.
			* It tests the case when the input string is "gf".
			*/
			@Test
			void testEncryptGf() {
				String input = "gf";
				String expected = "kj";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encrypt#encrypt(String)} method.
			* It tests the case when the input string is "et".
			*/
			@Test
			void testEncryptEt() {
				String input = "et";
				String expected = "ix";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encrypt#encrypt(String)} method.
			* It tests the case when the input string is "faewfawefaewg".
			*/
			@Test
			void testEncryptFaewfawefaewg() {
				String input = "faewfawefaewg";
				String expected = "jeiajeaijeiak";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encrypt#encrypt(String)} method.
			* It tests the case when the input string is "hellomyfriend".
			*/
			@Test
			void testEncryptHellomyfriend() {
				String input = "hellomyfriend";
				String expected = "lippsqcjvmirh";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encrypt#encrypt(String)} method.
			* It tests the case when the input string is "dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh".
			*/
			@Test
			void testEncryptDxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh() {
				String input = "dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh";
				String expected = "hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encrypt#encrypt(String)} method.
			* It tests the case when the input string is "a".
			*/
			@Test
			void testEncryptA() {
				String input = "a";
				String expected = "e";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encrypt#encrypt(String)} method.
			* It tests the case when the input string is "b".
			*/
			@Test
			void testEncryptB() {
				String input = "b";
				String expected = "f";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encrypt#encrypt(String)} method.
			* It tests the case when the input string is "c".
			*/
			@Test
			void testEncryptC() {
				String input = "c";
				String expected = "g";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
			}
}
