// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {

	
	/**
	 * Tests if the Base64Coder class can convert a char array into a String.
	 */
	@Test
	public void convertsArrayChar() {
		String input1 = "A very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very high";

		String input2 = "JVC has been written by Victor D. Rivest to encourage the future of using all modern protocols. " +
				"No blanks or line breaks are allowed within the content of the Base64 encoded content, nor are blanks leading to the end of the content or beginning of the content, and without leading or trailing blanks or line breaks. ";

		String input3 = "Binary data has been encoded to Base64 using the default charset and the default character set. ";
		
		assertEquals(input1.length(), input2.length());
		
		for(int i = 0; i < input1.length(); i++) {
			assertEquals(input1.charAt(i), input2.charAt(i));
			assertEquals(input2.charAt(i), encoder.encode(input2.charAt(i)));
			assertEquals(input3.charAt(i), encoder.encode(input3.charAt(i)));
		}
		
	}

	/**
	 * Tests the {@link Base64Coder#encode(byte[])} method of the default {@link Encoder}.
	 */

	@Test
	public void convertsByteArrayEncode() {
		String input1 = "A very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very " +
	"very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very " +
	"very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very, a very very very very very very very very very very very very very very very very very very " +
	"very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very";

		byte[] encoded = encoder.encode(input1.getBytes());
		
		assertEquals(input1.length(), encoded.length);
		
		for(int i = 0; i < input1.length(); i++) {
			// System.out.println(i + "---0---0---0---" + input1.charAt(i));
			assertEquals(input1.charAt(i), encoded.charAt(i));
			assertEquals(input1.charAt(i), encoder.encode(encoded.charAt(i)));
		}
		
	}
}