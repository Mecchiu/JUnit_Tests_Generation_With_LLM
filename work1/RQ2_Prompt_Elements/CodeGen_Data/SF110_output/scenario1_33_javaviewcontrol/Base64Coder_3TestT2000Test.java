// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {

    @Test
    public void testGetBinaryString() {
        assertEquals("I'm not sure what to do", 
                Base64Coder.decodeString("Hi I'm just a test"), 
                Base64Coder.decodeString("I'm just a test"));
        
        assertEquals("This is base64 encoded string", 
                "Hi I'm just a test", 
                Base64Coder.decodeString("Hi I'm just a test", "utf-8"));
        
        assertEquals("This is base64 encoded string with newlines", 
                "I'm just a test\n", 
                Base64Coder.decodeString("I'm just a test\n", "utf-8"));
    }
	
    @Test
    public void testDecodeString() {
		
        String expected = "This is base64 encoded (utf-8)";
        String actual = Base64Coder.decodeString("This is base64 encoded (utf-8)", "utf-8");
        
        assertEquals(expected, actual);
   
        assertFalse("This is base64 encoded string", 
                Base64Coder.decodeString("This is base64 encoded string", "utf-8"));
    }
}