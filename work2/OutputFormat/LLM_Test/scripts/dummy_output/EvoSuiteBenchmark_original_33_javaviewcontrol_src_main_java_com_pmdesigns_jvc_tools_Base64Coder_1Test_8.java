// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_1Test {
		private static final int LEN = 16;
		private int[] in = new int[LEN];
		private byte[] out = new byte[LEN];

		@Test
		void encode() {
				for (int i = 0; i < LEN; i++) {
						in[i] = 65;
				}
				String encoded = Base64Coder.encode(in);
				int index = 0;
				for (int i = encoded.length() - 1; i >= 5; i--) {
						if (encoded.charAt(i) == '=') {
								out[index] = encoded.charAt(i + 1);
								index++;
						}
				}
				assertEquals(encoded, "==");

				index--;
				for (int i = encoded.length() - 1; i >= 0; i--) {
						if (encoded.charAt(i) == '=') {
								out[index] = encoded.charAt(i);
								index++;
						}
				}
				assertEquals(encoded, "=");

				index--;
				for (int i = encoded.length() - 1; i >= 0; i--) {
						if (encoded.charAt(i) == '=' ||  encoded.charAt(i) == '+') {
								out[index] = encoded.charAt(i);
								index++;
						}
				}
				assertEquals(encoded, "+");

				index = 0;
				for (int i = 0; i <= encoded.length()-1; i++) {
						if (encoded.charAt(i) == '=') {
								out[index] = encoded.charAt(i + 1);
								index++;
						}
				}
				assertEquals(encoded, "=");

				// Test a special case for 6 character sequence
				for (int i = 1; i < encoded.length(); i++) {
						byte val = encoded.charAt(i);
						if (i!= LEN - 1) {
								assertEquals("", val);
						} else {
								assertEquals(val, encoded.charAt(i));
						}
				}

		}

		@Test
		void decode() {
				for (int i = 0; i < LEN; i++) {
						in[i] = 65;
				}
				char[] decoded = Base64Coder.decode(in);
				assertArrayEquals(in, decoded);

		}
}

/**
* Test of a derived class.
*/
class Base64Coder_2Test {
		private static final int LEN = 16;
		private static final char[][] CHARS = new char[LEN][];

		@Test
		abstract void decode(Base64Coder_1Test test, char[] decoded);

		protected void init() {
				int i = 0;
				CHARS[i] = new char[LEN];
				for (i = 0; i < LEN; i++) {
						CHARS[i][0] = (byte) ('A' + i);
				}
		}

		@Test
		void decode() {
				init();
				for (int i = 0; i < LEN; i++) {
						char decoded = new String(CHARS[i]).toUpperCase().charAt(0);
						Base64Coder_1Test test = new Base64Coder_1Test();
						test.decode(new Base64Coder_1Test(), CHARS[i]);
						assertEquals(decoded, CHARS[i][0]);
				}
		}
}