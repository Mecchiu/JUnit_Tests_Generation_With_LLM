// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {

		/**
		* Test of encode method. Test data:
		* <ul>
		* <li>Data array length = 8</li>
		* </ul>
		*/
		@Test
		public void testEncode_ValidArgs() {
			String in = "ABCDEFGHIJKLMNOPQRSTUVWXYZ-_+abcdefghijklmnopqrstuvwxyz0123456789";
			System.out.println("Testing case 1.");
			System.out.println("base64: " + encode(in.getBytes(), 4));
		}
		
		/**
		* Test of encode method, input value of null input array.
		* Test data is the same as {@link #testEncode_ValidArgs()}.
		* Test data is unchanged if any of the chars in the input array is '%'.
		*/
		@Test
		public void testEncode_NullInputData() {
			System.out.println("Testing null input data...");
			System.out.println("base64: " + encode((byte[]) null, 8));
		}

}
