// InspirentoUtilities_1Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#escapeText(String)} method.
*/
class InspirentoUtilities_1Test {

	
    /* Test for {@link InspirentoUtilities#escapeText(String)}.
     * 
     * @see InspirentoUtilities#escapeText(String)
    */

    @Test
    public void testHexEncode() {
       assertEquals("",InsightUtilities.hexEncode(""));
       assertEquals("",InsightUtilities.hexEncode("a"));
       assertEquals("a",InsightUtilities.hexEncode("AB"));
       assertEquals("",InsightUtilities.hexEncode("Ab"));
       assertEquals("AAAAaAb",InsightUtilities.hexEncode("AAABAAAb"));
        
        assertEquals("CAABC",InsightUtilities.hexEncode("CAABC"));
        
        assertEquals("AABCCAABC",InsightUtilities.hexEncode("AABCCAABC"));
               
       assertEquals("AaBcC",InsightUtilities.hexEncode("AaBcC"));
           
       assertEquals("AaBcC",InsightUtilities.hexEncode("aBc"));
            
       assertEquals("BAAABIABI",InsightUtilities.hexEncode("BAAABIABI"));
            
       assertEquals("BAAABIABI",InsightUtilities.hexEncode("aBBBAAaAB"));
            
       assertEquals("ABAAACAAACAAA",InsightUtilities.hexEncode("ABAAACAAACAAA"));

    
    }

    private static void stringReplaceAll(StringBuffer buffer, 
        Object startChar, String replacementChar) {
        Character startCharChar = new Character((Char)startChar);
        buffer.replace(buffer.length()-1, buffer.length(), 
            replacementChar+replacementCharChars(startCharChar,
                startChar));
    }

    private static char replacementCharChars(Character startChar,
        Character endChar) {
        char res = null;
        if (startChar!= null ) {
            res = startChar.getValue();
        }
        if (endChar!= null ) {
            res = endChar.getValue();
        }
        return res;
    }
    
    @Test
    public void testChar() {
        Vector<Character> charVector = new Vector<Character>(2);
        charVector.setElementAt("abcd", 13);
        charVector.setElementAt("AB", 13);
        Vector<Character> charVector2 = new Vector<Character>(2);
        charVector2.setElementAt("d", 13);
        charVector2.setElementAt("F", 13);
        charVector.addAll(charVector2);
        charVector.replace("d", "e");
        assertEquals(5, charVector.size());
        assertEquals("ce",charVector.getElementAt(0));
        assertEquals("f",charVector.getElementAt(1));
        
        charVector2.setElementAt("de", 13);
        assertEquals(13,charVector2.getElementAt(0));
        assertEquals(13,  charVector2.getElementAt(1));
        
        charVector2.replace("de", "d");
        assertEquals(13,charVector2.getElementAt(0));
        assertEquals(13,  charVector2.getElementAt(1));
        //System.out.println(charVector.toString()+" "+charVector2.toString());
    }
}