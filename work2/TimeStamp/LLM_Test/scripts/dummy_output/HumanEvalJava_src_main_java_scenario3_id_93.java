// EncodeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {
			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a simple string.
			*/
			@Test
			void testEncode1() {
						String message = "test";
						String expected = "TGST";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a string that contains only uppercase letters.
			*/
			@Test
			void testEncode2() {
						String message = "TEST";
						String expected = "tgst";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a string that contains only lowercase letters.
			*/
			@Test
			void testEncode3() {
						String message = "mudasir";
						String expected = "mWDCSKR";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a string that contains only vowels.
			*/
			@Test
			void testEncode4() {
						String message = "aeiou";
						String expected = "CEGKO";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a string that contains only consonants.
			*/
			@Test
			void testEncode5() {
						String message = "bcdfghjklmnpqrstvwxyz";
						String expected = "BCDFGHJKLMNPQRSTVWXYZ";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a string that contains both uppercase and lowercase letters.
			*/
			@Test
			void testEncode6() {
						String message = "Mudasir";
						String expected = "mWDCSKR";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a string that contains both vowels and consonants.
			*/
			@Test
			void testEncode7() {
						String message = "This is a message";
						String expected = "tHKS KS C MGSSCGG";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a string that contains special characters.
			*/
			@Test
			void testEncode8() {
						String message = "This is a message!";
						String expected = "tHKS KS C MGSSCGG!";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with an empty string.
			*/
			@Test
			void testEncode9() {
						String message = "";
						String expected = "";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with a string that contains spaces.
			*/
			@Test
			void testEncode10() {
						String message = "I DoNt KnOw WhAt tO WrItE";
						String expected = "k dQnT kNqW wHcT Tq wRkTg";
						String actual = Encode.encode(message);
						assertEquals(expected, actual);
			}
}