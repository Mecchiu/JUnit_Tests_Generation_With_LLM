// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_1Test {

		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of a byte array with a length of zero.
		*/
		@Test
		void testEncode_1() {
				byte[] input = new byte[0];
				char[] expected = new char[0];
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of a byte array with a length of one.
		*/
		@Test
		void testEncode_2() {
				byte[] input = new byte[] {0};
				char[] expected = new char[] {'A'};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of a byte array with a length of two.
		*/
		@Test
		void testEncode_3() {
				byte[] input = new byte[] {0, 0};
				char[] expected = new char[] {'A', 'A'};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of a byte array with a length of three.
		*/
		@Test
		void testEncode_4() {
				byte[] input = new byte[] {0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of a byte array with a length of four.
		*/
		@Test
		void testEncode_5() {
				byte[] input = new byte[] {0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of a byte array with a length of five.
		*/
		@Test
		void testEncode_6() {
				byte[] input = new byte[] {0, 0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of a byte array with a length of six.
		*/
		@Test
		void testEncode_7() {
				byte[] input = new byte[] {0, 0, 0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of a byte array with a length of seven.
		*/
		@Test
		void testEncode_8() {
				byte[] input = new byte[] {0, 0, 0, 0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of a byte array with a length of eight.
		*/
		@Test
		void testEncode_9() {
				byte[] input = new byte[] {0, 0, 0, 0, 0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of a byte array with a length of nine.
		*/
		@Test
		void testEncode_10() {
				byte[] input = new byte[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
}
// end class Base64Coder_1Test

// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of zero.
		*/
		@Test
		void testEncode_1() {
				byte[] input = new byte[0];
				char[] expected = new char[0];
				char[] actual = Base64Coder.encode(input, 0);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of one.
		*/
		@Test
		void testEncode_2() {
				byte[] input = new byte[] {0};
				char[] expected = new char[] {'A'};
				char[] actual = Base64Coder.encode(input, 1);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of two.
		*/
		@Test
		void testEncode_3() {
				byte[] input = new byte[] {0, 0};
				char[] expected = new char[] {'A', 'A'};
				char[] actual = Base64Coder.encode(input, 2);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of three.
		*/
		@Test
		void testEncode_4() {
				byte[] input = new byte[] {0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input, 3);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of four.
		*/
		@Test
		void testEncode_5() {
				byte[] input = new byte[] {0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input, 4);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of five.
		*/
		@Test
		void testEncode_6() {
				byte[] input = new byte[] {0, 0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input, 5);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of six.
		*/
		@Test
		void testEncode_7() {
				byte[] input = new byte[] {0, 0, 0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input, 6);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of seven.
		*/
		@Test
		void testEncode_8() {
				byte[] input = new byte[] {0, 0, 0, 0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input, 7);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of eight.
		*/
		@Test
		void testEncode_9() {
				byte[] input = new byte[] {0, 0, 0, 0, 0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input, 8);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[], int)} method.
		* It tests the encoding of a byte array with a length of nine.
		*/
		@Test
		void testEncode_10() {
				byte[] input = new byte[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
				char[] expected = new char[] {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
				char[] actual = Base64Coder.encode(input, 9);
				assertArrayEquals(expected, actual);
		}
		
}
// end class Base64Coder_2Test

// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_3Test {
		
		/**
		* Test case for the {@link Base64Coder#decode(String)} method.
		* It tests the decoding of a string with a length of zero.
		*/
		@Test
		void testDecode_1() {
				String input = "";
				byte[] expected = new byte[0];
				byte[] actual = Base64Coder.decode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decode(String)} method.
		* It tests the decoding of a string with a length of one.
		*/
		@Test
		void testDecode_2() {
				String input = "A";
				byte[] expected = new byte[] {0};
				byte[] actual = Base64Coder.decode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decode(String)} method.
		* It tests the decoding of a string with a length of two.
		*/
		@Test
		void testDecode_3() {
				String input = "AA";
				byte[] expected = new byte[] {0, 0};
				byte[] actual = Base64Coder.decode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decode(String)} method.
		* It tests the decoding of a string with a length of three.
		*/
		@Test
		void testDecode_4() {
				String input = "AAA";
				byte[] expected = new byte[] {0, 0, 0};
				byte[] actual = Base64Coder.decode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decode(String)} method.
		* It tests the decoding of a string with a length of four.
		*/
		@Test
		void