// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {

    /**
     * Test of encodeString method.
     */
    @Test
	public void testEncodeString_All_char() {
		assertEquals("", encodeString(""));
        
		assertEquals("", encodeString("   "));
        
		assertEquals("AAA", encodeString("A"));
        
		assertEquals("ZHI", encodeString("Z"));
        
		assertEquals("AA", encodeString("A"));
        
		assertEquals("AAA", encodeString("A"));

		
		assertEquals("ZHI", encodeString("Z"));
        
		assertEquals("AAA", encodeString("A"));
        
		assertEquals("AAA", encodeString("A"));
        
        
	}

}
// Base64Coder_0Test.java