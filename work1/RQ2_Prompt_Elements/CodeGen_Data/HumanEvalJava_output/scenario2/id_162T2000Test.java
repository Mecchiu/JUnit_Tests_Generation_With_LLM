// StringToMd5Test.java
package scenario2;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains one unit test case for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {
 
	/**
	 * Tests {@link StringToMd5#stringToMd5(String)} 
	 * with a string containing a number with the digits 0-9. 
	*/
    @Test
    public void testNumber() {
        
        String text = "00";
        String expectedValue = "0000000";
        assertEquals("Test string number 1 is not equal to '0'.", expectedValue, StringToMd5.stringToMd5(text));
          
    }
    
    
    
    /**
	 * Tests {@link StringToMd5#stringToMd5(String)} 
	 * with a string containing a number with the digits -10-100. 
	*/
    @Test
    public void testNumberWithZero() {
        
        String text = "000000";
        String expectedValue = "-00000000";
        assertEquals("Test string number 1 is not equal to '00'.", expectedValue, StringToMd5.stringToMd5(text));
           
    }
    
    
    /**
	 * Tests {@link StringToMd5#stringToMd5(String)} 
	 * with a string containing a number with the digits 10-100. 
	*/
    @Test
    public void testNumberWithNegative() {
        
        String text = "0000000000";
        String expectedValue = "000000000000000000000000000";
        assertEquals("Test string number 1 is not equal to '00'.", expectedValue, StringToMd5.stringToMd5(text));    
                 
    }
  
    /**
	 * Tests {@link StringToMd5#stringToMd5(String)} 
	 * with a string containing a number with the digits 0. 
	*/
    @Test
    public void testNumberWithZeroAndLeadingZero() {
        
        String text = "000000000000";
        String expectedValue = "000000000000";
        assertEquals("Test string number 1 is not equal to '00'.", expectedValue, StringToMd5.stringToMd5(text));  

    }    

    /**
	 * Tests {@link StringToMd5#stringToMd5(String)} 
	 * with a string containing the text '1'. 
	*/    
    @Test
    public void testNumberWithLeadingZero() {       
        
        String text = "1";
        String expectedValue = "111111100";
        assertEquals("Test string number 1 is not equal to '1'.", expectedValue, StringToMd5.stringToMd5(text));  

    }    

    /**
	 * Tests {@link StringToMd5#stringToMd5(String)} 
	 * with a string containing the text '1'.
	*/    
    @Test
    public void testNumberWithLeadingZeroAndOdd() {       
        
        String text = "1";
        String expectedValue = "11111111111111111111";
        assertEquals("Test string number 1 is not equal to '1'.", expectedValue, StringToMd5.stringToMd5(text));  

    }    

    /**
	 * Tests {@link StringToMd5#stringToMd5(String)} 
	 * with a string containing the text '1'.    
	*/    
    @Test
    public void testNumberWithLeadingZeroAndEven() {       
        
        String text = "1";
        String expectedValue = "1111111111111111111";
        assertEquals("Test string number 1 is not equal to '1'.", expectedValue, StringToMd5.stringToMd5(text));    
        
    }    
}