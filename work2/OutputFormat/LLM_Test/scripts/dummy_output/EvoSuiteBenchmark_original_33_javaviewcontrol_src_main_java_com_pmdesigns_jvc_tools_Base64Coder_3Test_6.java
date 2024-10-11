// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {
		
    
    
    /**
     * Test of decodeString method, of class com.pmdesigns.jvc.tools.Base64Coder.
     * @throws org.junit.Test
     */
    @Test
    public void testDecodeString()
    {
        String s = "testing";
        String result = new Base64Coder().decodeString(s);
        String expected = "testing";
        assertEquals(expected, result);
    }

	
}