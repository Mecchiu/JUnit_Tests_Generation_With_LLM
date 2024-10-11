// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_1Test {
		private final String data = encodeString("A");
		
	/**
	* Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#encode(byte[])}.
	* @throws Exception 
	* if an error occurs.
	*/
	@Test
	public void testEncode()  throws Exception {
	assertEquals("A", encode(data));
	}

	/**
	* Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#decode(byte[])}.
	* @throws Exception 
	* if an error occurs.
	*/
	@Test
	public void testDecode()  throws Exception {
	byte[] b1 = encode(data);
	assertEquals(data, decode(b1));
	}
		
}