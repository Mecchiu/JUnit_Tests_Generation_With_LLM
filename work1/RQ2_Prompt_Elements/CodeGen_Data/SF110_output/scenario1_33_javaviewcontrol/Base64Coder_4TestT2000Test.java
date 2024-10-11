// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {

    @Test
    void testDecode() {	
        // Test case #1: Invalid input
        assertThrows(java.util.CantParseBase64Exception.class, new Runnable() {
					
			@Override public void run() {
					new Base64Coder(40).decode("");
				}
			}
		);
        // Test case #2: Correct input
        assertEquals("YnUzK5gwTU4c2Dyb7jRf2LdUQt9KxFc4kVw1g=", new Base64Coder(40).decode("FjqdZyQ8S3s7bM3T/7/3G3X3N6Lk/Lz+o=".toCharArray()));
    }

}// Base64Coder_4Test.java