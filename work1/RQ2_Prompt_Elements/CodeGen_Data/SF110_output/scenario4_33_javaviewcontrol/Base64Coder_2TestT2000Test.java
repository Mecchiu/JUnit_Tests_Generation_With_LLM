// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
private final static String BASE64CODER_FINAL = "MHA1ovb3BqcnB0RXNlYXV0dGlvbiBiZW1lc3NldCBjYTBXNyYWw9\ndIAAAAAAAAAAAA==";
        @Test
        void encode() {
            // given
	        byte[] in = new byte[]{(byte) 0, 'a', 'b', 'c', 'd'};
	        int iLen = in.length;

	        // when
	        String out = Base64Coder.encode(in, iLen);

	        // then
	        assertEquals("MHA1ovb3BqcnB0RXNlYXV0dGlvbiBiZW1lc3NldCBjYTBXNyYWw9", out);
        }

}