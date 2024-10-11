// EncodeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {
	/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with the input "test" and expects the output "TGST".
			*/
			@Test
			void testEncode1() {
						String input = "test";
						String expected = "TGST";
						String actual = Encode.encode(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with the input "TEST" and expects the output "tgst".
			*/
			@Test
			void testEncode2() {
						String input = "TEST";
						String expected = "tgst";
						String actual = Encode.encode(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with the input "Mudasir" and expects the output "mWDCSKR".
			*/
			@Test
			void testEncode3() {
						String input = "Mudasir";
						String expected = "mWDCSKR";
						String actual = Encode.encode(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with the input "YES" and expects the output "ygs".
			*/
			@Test
			void testEncode4() {
						String input = "YES";
						String expected = "ygs";
						String actual = Encode.encode(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with the input "This is a message" and expects the output "tHKS KS C MGSSCGG".
			*/
			@Test
			void testEncode5() {
						String input = "This is a message";
						String expected = "tHKS KS C MGSSCGG";
						String actual = Encode.encode(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with the input "I DoNt KnOw WhAt tO WrItE" and expects the output "k dQnT kNqW wHcT Tq wRkTg".
			*/
			@Test
			void testEncode6() {
						String input = "I DoNt KnOw WhAt tO WrItE";
						String expected = "k dQnT kNqW wHcT Tq wRkTg";
						String actual = Encode.encode(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with the input "Hello World" and expects the output "hELLO wORLD".
			*/
			@Test
			void testEncode7() {
						String input = "Hello World";
						String expected = "hELLO wORLD";
						String actual = Encode.encode(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with the input "Java" and expects the output "jAVA".
			*/
			@Test
			void testEncode8() {
						String input = "Java";
						String expected = "jAVA";
						String actual = Encode.encode(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with the input "Python" and expects the output "pYTHON".
			*/
			@Test
			void testEncode9() {
						String input = "Python";
						String expected = "pYTHON";
						String actual = Encode.encode(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Encode#encode(String)} method.
			* It tests the method with the input "C++" and expects the output "c++".
			*/
			@Test
			void testEncode10() {
						String input = "C++";
						String expected = "c++";
						String actual = Encode.encode(input);
						assertEquals(expected, actual);
			}
}
