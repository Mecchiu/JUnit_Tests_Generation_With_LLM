// InspirentoUtilities_2Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
*/
class InspirentoUtilities_2Test {
		 
	/**
	 * Test method for
	 * {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)}.
	 */
	@Test
    public void testStringReplaceAll() {
        
        String source = 
            "This is a test string with spaces, a test with single quotes, " +
            "a test with a leading double quote character, a test with the same ending " +
            "quote character";
        
        StringTokenizer tokens = new StringTokenizer(source, "\"");
        StringBuffer result = new StringBuffer();
        
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();
            result.append(token);
        }
             
        // Test case: test case 1
        
        String expectedResult1 = 
            "This is a test string with spaces, a test with a leading " +
            "double quote character, a test with the same ending quote " +
            "character";
         
        assertEquals(expectedResult1, result.toString());
                
        // Test case 2
        
        String expectedResult2 = 
            "This is a test string with spaces, a test with a leading " +
            "double quote character, a test with the same ending quote " +
            "character, " +
            ""  +
            "The ending quote character";
         
        assertEquals(expectedResult2, result.toString());
               
    }

}