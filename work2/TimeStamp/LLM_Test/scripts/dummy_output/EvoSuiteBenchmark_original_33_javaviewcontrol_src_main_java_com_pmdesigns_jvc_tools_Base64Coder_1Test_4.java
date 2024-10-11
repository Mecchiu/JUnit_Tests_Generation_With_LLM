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
	* Tests {@link Base64Coder#encode(byte[])}.
     * @throws Exception
     */
	@Test
	public void testEncode() throws Exception {
		
		assertEquals("Base64-encoded data does not match expected",
				"YmFyWBxvzTQ==", Base64Coder.encode("YmFyWBxvzTQ"));
		
		assertEquals("Base64-encoded data does not match expected",
				"YmFyWBxvzTQ", Base64Coder.encode("FgAiU0VF5Tb3Rz"));

		assertEquals("Base64-encoded data does not match expected",
				"Ym5Zb3RzQ==", Base64Coder.encode("Ym5Zb3RzQ"));

	}

}