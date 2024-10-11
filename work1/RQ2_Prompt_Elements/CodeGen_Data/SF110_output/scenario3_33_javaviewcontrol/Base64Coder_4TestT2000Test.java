// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {
/**
		 * Tests the correctness of the method.
		 */
		@Test
		public void testDecode() {
				// Given
				String s = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
				byte[] b = decode(s);        // Decode Base64 without padding 				

				// When
		
				assertArrayEquals(b, decode(s));	// Decode Base64, without padding 														
				assertEquals(0, s.getBytes().length);
				assertTrue(true);
		}

		/**
		* Tests the correctness of the method.
		*/
		@Test
		public void testDecodeNoPadding() {
				// Given
				String s = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
				byte[] b = decode(s);						// Decode Base64 without padding 			

				// When
		
				assertArrayEquals(b, decode(s));		// Decode Base64, without padding 			
				assertEquals(0, s.getBytes().length);
				assertTrue(true);
		}

		/**
		* Tests the correctness of the method.
		*/
		@Test
		public void testDecodeWithPaddingInMiddle() {
				// Given
				String s = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
				byte[] b = decode(s);						// Decode Base64 without padding 			

				// When
		
				assertArrayEquals(b, decode(s+"======"));	// Decode Base64, with padding 			
				assertEquals(4, s.getBytes().length);
				assertTrue(true);
		}

		/**
		* Tests the correctness of the method.
		*/
		@Test
		public void testDecodeWithPaddingInEnd() {
				// Given
				String s = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA=";
				byte[] b = decode(s);						// Decode Base64 without padding 			

				// When
		
				assertArrayEquals(b, decode(s+"====="));	// Decode Base64, with padding 			
				assertEquals(3, s.getBytes().length);
				assertTrue(true);
		}

		public byte[] encode(String b) {
		byte[] bb = b.getBytes();
		byte[] b1 = new byte[bb.length*4/3];
		for(int i = 0; i < bb.length; i++) {
			int pos = (int) ((double) bb[i] * 0.5);
			b1[i] = (byte) ((bb[i] - pos) | pos << 4);
		}
		return b1;
		}
}
