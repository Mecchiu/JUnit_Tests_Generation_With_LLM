// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {
		
    @Test
    public void test01() throws Exception {
        String s = "123!";
        char[] arr = encodeString(s);

        String s2 = encodeString(arr);

        assertEquals("123!", s);
        assertEquals("e5b1c", s2);
    }
    
        
}