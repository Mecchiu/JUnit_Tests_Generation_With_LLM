// IntToMiniRomanTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains one unit test case for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {
  
  /**
   * Test case for the <code>intToMiniRoman(int)</code> method.
   */
	@Test
    public void test_intToMiniRoman() {
		  
		  final int[] values = {1, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		  final String[] symbols = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
		  final int romanValue = 4;
		  
		  String expected = "m" + romanValue + "c";
		  
	    assertEquals(expected, IntToMiniRoman.intToMiniRoman(romanValue));
		  
    	  String result = "";
		    
		  for (int i = 0; i < values.length; i++) {
			  while (romanValue >= values[i]) {
				  romanValue -= values[i];
				  result += symbols[i];
			  }
		  }
		  assertEquals("expected: " + expected + "\n result: " + result, expected.trim(), result.trim());
		  
    	  //check result after truncated
	  	  result = "";
	    

assertTrue("result equals: m" + romanValue + "c", result.equals(expected));
                
               
    }
  
  
}