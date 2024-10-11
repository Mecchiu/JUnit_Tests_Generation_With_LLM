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
	 * Test method for {@link Base64Coder#encode(byte [])}.
	 * @throws java.lang.IllegalStateException If the {@link Base64Coder} cannot support
	 *                              encoding the input data.
	 */
	@Test
	void test_2()
	{
		assertEquals(Base64Coder_2Test.encode(base64_1), Base64Coder_2Test.decode(base64_2));
	}


}