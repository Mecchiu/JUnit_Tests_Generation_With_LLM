// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {
		
    /**
     * Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#decode(java.lang.String)}.
     */
    @Test
    public void testDecode() {
        System.out.println("decode is called from Base64Coder_4Test...");
        System.out.println("Base64Coder_4Test.testDecode - Base64 encoded data...");
        char[] decoded = Base64Coder.decode("AAAAAAABAAAAAAAAAAAABAAAAAAAABAAAAAAAAA");
        assertArrayEquals(new char[] { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' }, decoded);
        System.out.println(" Base64Coder_4Test.testDecode end");
    }
}