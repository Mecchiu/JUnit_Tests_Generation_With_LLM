// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_1Test {
		
    /**
     * It contains one unit test for the {@link Base64Coder#decode(String)} method  
     */
    @Test
    public void testEncodeDecode() {
        byte[] data = { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        String s = Base64Coder.encode(data);
        char[] array = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c',
            'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l','m', 'n', 'o', 'p', 'q',
            'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        

        for (int i = 0; i < data.length; i++) {
                    byte [] in = { (byte)0};
                    String expected = array[i];
                    byte [] out = Base64Coder.decode(s.toCharArray(),expected,in,in.length);
                    assert(compareArrays(expected, out));
        }
    }

}