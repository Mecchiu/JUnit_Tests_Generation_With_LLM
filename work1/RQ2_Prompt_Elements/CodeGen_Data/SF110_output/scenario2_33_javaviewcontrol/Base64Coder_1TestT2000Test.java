// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_1Test {
@Test
		public void test() {
			String data = "";

			assertEncoded(1.0);

			data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			assertEncoded(data);

			data = "abcdefghijklmnopqrstuvwxyz";

			assertEncoded(data);

			data = "";

			assertNotEncoded(1.0);
		}

		private static final void assertEncoded(double expected) {
			assertEquals("encoded should contain correct values", expected,
					encode(expected), 0.0000001);
		}

		private static final void assertNotEncoded(double expected) {
			assertEquals("encoded cannot contain not encoded values",
					expected, decode(expected), 0);
		}

		// Method that returns encoded bytes in the form of char[]
		char[] encode(double b) {
			return Base64Coder.encode(b);
		}

		// Method that returns decoded value in the form of char[]
		private char[] decode(char s) {
			return Base64Coder.decode(s);
		}

		// Basic testing of decode function
		private double decode() {
			return Base64Coder.decode(new byte[] { 13, 13, 13, 13 });
		}

		// Basic testing of decode function of hex characters
		private double decode(double b) {
			return Base64Coder.decode(new byte[] {
					(byte) (b / 0x100), (byte) (b % 0x100),
					(byte) (b / 0x100), (byte) (b % 0x100) });
		}

		@Test
		public void testHexaSimple() {
			assertDecoded(0, 13, 13);

			assertDecoded(0, 43);

			assertDecoded(1, 43, 43);

			assertDecoded(1, 13, 43);

			assertDecoded(8, 13, 43);

			assertNotDecoded(0, 13, 43);
		}

		private void assertDecoded(int base, int exp, int exp2) {
			assertEquals("decoded data is incorrect ", exp, decode(exp),
					0);
			assertEquals("decoded data is incorrect ", exp2, decode(exp2), 0);

			double b = 0.0;

			b = 1.0 / 15.0;
			assertDecoded(b, 13, 13);

			b = -1.0 / 15.0;
			assertDecoded(b, 43, 13);

			b = 0.0 / 0.333333;
			assertDecoded(b, 13, 43);

			b = -1.0 / 0.333333;
			assertDecoded(b, 43, 43);

			b = 1.0 / -0.75;
			assertDecoded(b, 43, 13);

			b = -1.0 / (23 / 29.0);
			assertDecoded(b, 13, 43);

			b = 1.0 / (23 / 23.0);
			assertDecoded(b, 43, 43);

			b = -1.0 / (-33 / 67.5);
			assertDecoded(b, 13, 43);

			// b = 1.0 / (-33/67.5);
			// assertDecoded(b, 43, 43);

			b = (23.0 / -67.5);
			assertDecoded(b, 43, 43);

			// b = 1.0 / 23.0;
			// assertDecoded(b, 43, 43);

			// Base64CoderTest.assertNotBase64("1");
			Base64Coder.assertEncoded("123456789".getBytes());
		}
}

// java.io
