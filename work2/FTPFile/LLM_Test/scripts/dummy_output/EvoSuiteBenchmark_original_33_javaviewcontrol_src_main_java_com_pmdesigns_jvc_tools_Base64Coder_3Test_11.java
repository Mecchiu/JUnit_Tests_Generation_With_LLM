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
         * Test of encodeString method, of class Base64Coder.
         */
         @Test
         void testDecodeString() {
            System.out.println("decodeString");
              String sRet = Base64Coder.decode("ABC");
 
              byte[] retArr = Base64Coder.encode(sRet);
              String s = Base64Coder.decode(retArr);
              assertEquals(sRet, s);
        }
	    
	    /**
         * Test of encode method, of class Base64Coder.
         */
         @Test
        public void testEncode() {
                System.out.println("testEncode");
                String s = "ABC";
                byte[] srcArr = Base64Coder.encode(s);
                byte[] dst = Base64Coder.encode(srcArr);
                assertTrue(Base64Coder.equals(srcArr,dst));
                
        }
}