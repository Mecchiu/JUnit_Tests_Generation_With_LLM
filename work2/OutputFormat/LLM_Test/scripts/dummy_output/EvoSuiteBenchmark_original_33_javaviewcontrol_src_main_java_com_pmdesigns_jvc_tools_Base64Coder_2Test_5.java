// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
		 
	@Test
	public void test_encode() {
		// Prepare test data.
		byte[] array = new byte[64];
		for(int i=0; i<array.length; i++){
			array[i] = (byte)map1[((i %=64) + 64) % 256];
		}

		// Tests.
		String input = encodeString("");
		byte[] out = encode(input);

		// Assert.
		assertTrue(Arrays.equals(array, out));
	}
	
	@Test
	public void test_decode() {
		// Prepare test data.
		byte[] array = new byte[64];
		for(int i=0; i<array.length; i++){
			array[i] = (byte)map1[((i %=64) + 64) % 256];
		}
		
		// Tests.
		String input = decodeString("");
		byte[] out = decode(input);//No blanks, line breaks, or doublequotes

		// Assert.
		assertTrue(Arrays.equals(array, out));
	}
}