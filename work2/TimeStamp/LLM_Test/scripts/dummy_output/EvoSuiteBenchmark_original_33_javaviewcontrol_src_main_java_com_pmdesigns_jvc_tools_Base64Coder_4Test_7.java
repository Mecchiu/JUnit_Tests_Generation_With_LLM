// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {
		
		@Test
		void testDecodeString() {
        String base64 = "MIIBqYJKoZIhvcNAQcCoIHYMDCBDa0EA";

        String result = Base64Coder.decode(base64);

        assertEquals("Base64 Coder (input string) corrupted", base64, result);

		}
	
			

}