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
	void testDecode()
	{
	int iLen = (int) (8 * 8 - 2);
	try {
		base64TestDecode("abc");
	} catch (IllegalArgumentException ex) {
		fail("No IllegalArgumentException thrown");
	}

	try {
		base64TestDecode("ab");
	} catch (IllegalArgumentException ex) {
		fail("No IllegalArgumentException thrown");
	}
	//TODO: test for illegal argument exceptions
	} else {
		fail("Tested class failed to check validity.");
	}
	
}