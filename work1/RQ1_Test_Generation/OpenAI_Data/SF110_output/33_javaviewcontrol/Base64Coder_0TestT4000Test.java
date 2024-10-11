// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {

		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "Man".
		*/
		@Test
		void testEncodeString_0() {
				String input = "Man";
				String expected = "TWFu";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "Ma".
		*/
		@Test
		void testEncodeString_1() {
				String input = "Ma";
				String expected = "TWE=";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "M".
		*/
		@Test
		void testEncodeString_2() {
				String input = "M";
				String expected = "TQ==";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "Man is all".
		*/
		@Test
		void testEncodeString_3() {
				String input = "Man is all";
				String expected = "TWFuIGlzIGFsbA==";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "any carnal pleasure.".
		*/
		@Test
		void testEncodeString_4() {
				String input = "any carnal pleasure.";
				String expected = "YW55IGNhcm5hbCBwbGVhc3VyZS4=";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "any carnal pleasure".
		*/
		@Test
		void testEncodeString_5() {
				String input = "any carnal pleasure";
				String expected = "YW55IGNhcm5hbCBwbGVhc3VyZQ==";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "any carnal pleasur".
		*/
		@Test
		void testEncodeString_6() {
				String input = "any carnal pleasur";
				String expected = "YW55IGNhcm5hbCBwbGVhc3Vy";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "any carnal pleasu".
		*/
		@Test
		void testEncodeString_7() {
				String input = "any carnal pleasu";
				String expected = "YW55IGNhcm5hbCBwbGVhc3U=";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "any carnal pleas".
		*/
		@Test
		void testEncodeString_8() {
				String input = "any carnal pleas";
				String expected = "YW55IGNhcm5hbCBwbGVhcw==";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encodeString(String)} method.
		* It tests the encoding of the string "pleasure.".
		*/
		@Test
		void testEncodeString_9() {
				String input = "pleasure.";
				String expected = "cGxlYXN1cmUu";
				String actual = Base64Coder.encodeString(input);
				assertEquals(expected, actual);
		}
		
}
// end class Base64Coder_0Test

// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_1Test {
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "TWFu".
		*/
		@Test
		void testDecodeString_0() {
				String input = "TWFu";
				String expected = "Man";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "TWE=".
		*/
		@Test
		void testDecodeString_1() {
				String input = "TWE=";
				String expected = "Ma";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "TQ==".
		*/
		@Test
		void testDecodeString_2() {
				String input = "TQ==";
				String expected = "M";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "TWFuIGlzIGFsbA==".
		*/
		@Test
		void testDecodeString_3() {
				String input = "TWFuIGlzIGFsbA==";
				String expected = "Man is all";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "YW55IGNhcm5hbCBwbGVhc3VyZS4=".
		*/
		@Test
		void testDecodeString_4() {
				String input = "YW55IGNhcm5hbCBwbGVhc3VyZS4=";
				String expected = "any carnal pleasure.";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "YW55IGNhcm5hbCBwbGVhc3VyZQ==".
		*/
		@Test
		void testDecodeString_5() {
				String input = "YW55IGNhcm5hbCBwbGVhc3VyZQ==";
				String expected = "any carnal pleasure";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "YW55IGNhcm5hbCBwbGVhc3Vy".
		*/
		@Test
		void testDecodeString_6() {
				String input = "YW55IGNhcm5hbCBwbGVhc3Vy";
				String expected = "any carnal pleasur";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "YW55IGNhcm5hbCBwbGVhc3U=".
		*/
		@Test
		void testDecodeString_7() {
				String input = "YW55IGNhcm5hbCBwbGVhc3U=";
				String expected = "any carnal pleasu";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "YW55IGNhcm5hbCBwbGVhcw==".
		*/
		@Test
		void testDecodeString_8() {
				String input = "YW55IGNhcm5hbCBwbGVhcw==";
				String expected = "any carnal pleas";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of the string "cGxlYXN1cmUu".
		*/
		@Test
		void testDecodeString_9() {
				String input = "cGxlYXN1cmUu";
				String expected = "pleasure.";
				String actual = Base64Coder.decodeString(input);
				assertEquals(expected, actual);
		}
		
}
// end class Base64Coder_1Test

// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_2Test {
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of the byte array {77, 97, 110}.
		*/
		@Test
		void testEncode_0() {
				byte[] input = {77, 97, 110};
				char[] expected = {'T', 'W', 'F', 'u'};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of the byte array {77, 97}.
		*/
		@Test
		void testEncode_1() {
				byte[] input = {77, 97};
				char[] expected = {'T', 'W', 'E', '='};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of the byte array {77}.
		*/
		@Test
		void testEncode_2() {
				byte[] input = {77};
				char[] expected = {'T', 'Q', '=', '='};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of the byte array {77, 97, 110, 32, 105, 115, 32, 97, 108, 108}.
		*/
		@Test
		void testEncode_3() {
				byte[] input = {77, 97, 110, 32, 105, 115, 32, 97, 108, 108};
				char[] expected = {'T', 'W', 'F', 'u', ' ', 'a', 'X', 'M', 'g', 'Y', 'W', 'x', 's', 'A', '=', '='};
				char[] actual = Base64Coder.encode(input);
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link Base64Coder#encode(byte[])} method.
		* It tests the encoding of the byte array {97, 110, 121, 32, 99, 97, 114, 110, 97, 108, 32, 112, 108, 101, 97, 115, 117, 114, 101, 46}.
		*/
		@Test
		void testEncode_4() {
				byte[] input = {97, 110, 121, 32, 99, 97, 114, 110, 97, 108, 32, 112, 108, 101, 97, 115, 117, 114, 101, 46};
				char[] expected = {'Y', 'W', '5', '5', 'I', 'G', 'N', 'h', 'c', 'm', '5', 'h', 'b', 'C', 'B', 'w', 'b', 'G', 'V', 'h', 'c', '3', 'V',