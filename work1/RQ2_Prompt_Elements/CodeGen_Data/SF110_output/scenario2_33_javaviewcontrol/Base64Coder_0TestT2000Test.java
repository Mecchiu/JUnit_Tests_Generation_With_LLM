// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {
public void run() throws Exception { }
        /**
         * Checks if the two arrays can be properly encoded.
         *
         * @param d1 a Array of length 1 containing the data.
         * @param d2 a Array of length 1 containing the data.
         */
        @Test
        public void checkCompatibleArray(String s1, String s2, boolean b) {
            byte[] b1 = encodeString(s1).getBytes();
            byte[] b2 = encodeString(s2).getBytes();

            assertTrue(b1.length == b2.length);
            assertTrue(b1.length <= 1024);

            // check all
            for (int i=0; i< b1.length; ++i) {
                assertTrue(b1[i] == b2[i]);
                if (b)
                   assertTrue(0x01&b1[i] == 0x02 & 0x04&b2[i] == 0x02);
            }
        }
}		