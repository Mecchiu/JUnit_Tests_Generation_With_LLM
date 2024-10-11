// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
		
	@Test
	public void testDecodeString(){
		if(!Base64Coder.isEmpty(Base64Coder.decode("AAA"))) {
			String s = Base64Coder.decode("AAA");
		}

		if(!Base64Coder.isEmpty(Base64Coder.decode("="))) {
			String s =  Base64Coder.decode("=");
			assertTrue(s.length()==1);
		}
    }

	@Test
	public void testDecode() {
		String s = Base64Coder.decode("AAA");
		s = Base64Coder.decode("ABCDEFGH");
		assertTrue(s.length()!=0);
	}
}