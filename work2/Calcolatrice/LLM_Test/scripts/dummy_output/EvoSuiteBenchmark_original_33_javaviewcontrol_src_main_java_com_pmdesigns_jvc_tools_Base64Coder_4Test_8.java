// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {
		
        void test_decode1S(String s) throws Exception {
    	        assertEquals("Hello World", Base64Coder.decode(s));
 }
	
        // Dummy constructor.
        Base64Coder_4Test() {
		}
}