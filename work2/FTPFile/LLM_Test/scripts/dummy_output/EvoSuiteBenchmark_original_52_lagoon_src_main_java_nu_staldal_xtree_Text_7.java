// TextTest.java
package nu.staldal.xtree;

import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Text}.
* It contains one unit test case for the {@link Text#asCharArray()} method.
*/
class TextTest {
		
	/**
     * Test getCharArray(...)(String).
     */
    @Test
    public void basicOperation(){
    
        final String string = "hello";
        final char[] expected = new char[]{'h', 'e', 'l', 'l', 'o',''};

        checkStr(string, expected);
        
        String str = Text.getCharArray(string);
        
        assertEquals(expected.length, str.length());
        for (int i=0; i<string.length(); i++){
            if (expected[i] == str.charAt(i)) {
                continue;
            }
            fail("Didn't get expected value.");
        }
        
        str = Text.getCharArray("hello goodbye");
        assertTrue(str.length() > 0);
        
        String firstGoodbye = "goodbye";
        String bye = "goodbye";
        
        checkStr("hello " + firstGoodbye + bye, expected);
        
        checkStr("hello  " + firstGoodbye + bye, expected);
        
        checkStr("hello " + firstGoodbye, expected);
        checkStr(" " + bye, expected);
    }
    
        
    /**
    * Test getCharArray(String).
    */
    @Test
    public void nullString(){
        
        final char[] expected = new char[]{'h', 'e', 'l', 'l', 'o',''};
        
        final String string = null;
        
        final char[] actual = Text.getCharArray(string);
        
        assertEquals(expected.length, actual.length);
        
        for (int i=0; i<string.length(); i++){
            if (expected[i] == actual[i]) {
                continue;
            }
            fail("Didn't get expected value.");
        }
        
        checkStr("hello", expected);
        checkStr("world", expected);
        checkStr("goodbye", expected);
        
    }
    
        
    /**
    * Test getCharArray(String).
    */
    public void chars(){
    
        final char[] expected = new char[]{'h', 'e', 'l', 'l', 'o',''};
    
        final String string = "hello";
    
        final char[] actual = Text.getCharArray(string);
        
        assertEquals(expected.length, actual.length);
        
        for (int i=0; i<string.length(); i++){
            if (expected[i] == actual[i]) {
                continue;
            }
            fail("Didn't get expected value.");
        }
        
        checkStr("hello", expected);
        checkStr("world", expected);
        checkStr("goodbye", expected);
    }
   
}