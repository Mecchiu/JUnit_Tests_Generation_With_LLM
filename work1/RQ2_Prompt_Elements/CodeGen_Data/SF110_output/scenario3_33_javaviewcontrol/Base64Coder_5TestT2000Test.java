// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {

  /**
   * Tests {@link Base64Coder#decode(char[])}.
   */
	@Test
	public void Test(){
            byte[] expected = 
			(new byte[]{(byte)'S','C','Q'}).clone();
			expected = Base64Coder.decode(expected);
			assertArrayEquals(expected, new byte[]{(byte)'A','P','Z'}); //
	}
	
}
