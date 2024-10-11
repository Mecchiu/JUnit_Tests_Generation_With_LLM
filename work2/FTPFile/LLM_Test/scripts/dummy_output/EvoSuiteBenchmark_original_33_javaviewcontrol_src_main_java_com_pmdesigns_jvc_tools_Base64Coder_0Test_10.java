// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {
		private void testEncodeString(String in) {
			String enc = Base64Coder.encode(in);
			
			String dec = Base64Coder.decode(enc);
			
			assertEquals(true, in, dec);

		}
        	
		@Test
		public void testEncodeString( ) {
			testEncodeString(" ");
			testEncodeString("   ");
			testEncodeString("\n"); 
			testEncodeString("\r\n");
			testEncodeString("\t\f"); 
		}
}