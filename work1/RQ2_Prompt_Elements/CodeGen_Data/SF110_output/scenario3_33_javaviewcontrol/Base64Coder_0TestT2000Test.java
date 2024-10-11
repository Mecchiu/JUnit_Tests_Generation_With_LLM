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
     * Test method for
     * {@link Base64Coder#encodeString(String)}.
     */
    @Test
    public  void testEncodeString() {
        
        String value = "hello world";
        
        assertEquals(
            "Unexpected result of Base64 encoding of 'hello world'",
            "YmVkNDUtdWVyaW5kZXI=",
            encodeString(value)
        );
    }

}
