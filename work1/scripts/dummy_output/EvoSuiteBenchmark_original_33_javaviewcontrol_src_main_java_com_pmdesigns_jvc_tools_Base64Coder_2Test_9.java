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
	* Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#encode(byte[], int)}.
	*/
	@Test
	void testEncodeByteArrayIntInt() {
		//System.out.println("Test method.");
		
		int in[] = { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16 };
		
		String res = Base64Coder.encode(in, 7);
					
		String res2 = Base64Coder.encode(in, 8);
		
		assertEquals(res, res2);
	}
		
	/**
	* Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#decode(String)}.
	* <b>Size checking test. </b>
	*/

	@Test
	void testDecodeString() {
		//System.out.println("Test method.");
		
		int res = Base64Coder.decode("M");
		
		assertEquals(1, res);
		
	}
		
	/**
	* Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#decode(char[])}.
	* <b>Size checking test. </b>
	*/

	@Test
	void testDecodeCharacterArray() {
		//System.out.println("Test method.");
		
		char[] res = Base64Coder.decode("M");
		
		assertEquals(2, res.length);
	}
}