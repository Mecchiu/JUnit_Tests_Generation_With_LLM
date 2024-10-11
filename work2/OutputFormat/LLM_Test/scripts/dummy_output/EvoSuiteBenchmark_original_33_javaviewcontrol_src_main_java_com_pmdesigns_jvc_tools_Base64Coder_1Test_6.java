// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_1Test {
		
	/**
	* Tests the encoding of the passed in String.
	*/
	@Test
	void encodeString( ) throws Throwable {
		assertEquals("", Base64Coder.encodeString(new String(new byte[] {})));
	}
	
	/**
	* Tests the encoding of a byte array in Base64 format.
	*/
	@Test
	void encode( ) throws Throwable {
		assertEquals("", Base64Coder.encode(new byte[0]));
	}
	
	/**
	* Tests the decoding of the passed in String.
	*/
	@Test
	void decodeString( ) throws Throwable {
		assertEquals("", Base64Coder.decodeString(""));
	}
	
	/**
	* Tests the decoding of a byte array in Base64 format
	*/
	@Test
	void decode( ) throws Throwable {
		assertEquals("", Base64Coder.decode(""));
	}
}