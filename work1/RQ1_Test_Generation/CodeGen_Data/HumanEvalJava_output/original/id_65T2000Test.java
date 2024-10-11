// CircularShiftTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains one unit test case for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {
  
	String testCases[] = new String[] {
        "",
        "001",
        "12",
        "12",
        "11",
        "11"
    };
	
    
    @Test
    public void testInitial(){
        assertEquals("", CircularShift.circularShift((int)0, (int)0));
        assertEquals("", CircularShift.circularShift((int)0, (int)3)); 
        assertEquals("1001", CircularShift.circularShift((int)0, (int)1)); //Shift the digits right by 3 times by 9
        assertEquals("", CircularShift.circularShift((int)1, (int)3)); //Shift the digits right by 3 times by 9
        assertEquals("", CircularShift.circularShift((int)1, (int)1)); //Shift the digits right by 1 times by 9
        assertEquals("1001", CircularShift.circularShift((int)3, (int)1)); //Shift the digits right by 1 times by 9
        assertEquals("1001", CircularShift.circularShift((int)3, (int)3));//Shift the digits right by 1 times by 9
        assertEquals("1001", CircularShift.circularShift(3, (int)97));
        assertEquals("1001", CircularShift.circularShift(97, (int)3));
        
        
    }
	  
	  
	  @Test
	  public void testTestCases1(){
	    assertEqualsArray(testCases, CircularShift.circularShift(1, 2));
	    assertEqualsArray(testCases, CircularShift.circularShift(1, 2));
	    
	    assertEqualsArray(testCases, CircularShift.circularShift((int)1, (int)97));
	    assertEqualsArray(testCases, CircularShift.circularShift((int)1, (int)97));
	    
	    assertEqualsArray(testCases, CircularShift.circularShift((int)3, (int)3));
	    assertEqualsArray(testCases, CircularShift.circularShift((int)97, (int)3));   
	    
	    assertEqualsArray(testCases, CircularShift.circularShift((int)9, (int)9));
	    assertEqualsArray(testCases, CircularShift.circularShift((int)1, (int)9));
	    
	    assertEqualsArray(testCases, CircularShift.circularShift((int)99, (int)99));
	  }
	    
 	   
	  @Test
	  public void testTestCases2(){
	    assertEqualsArray(testCases, CircularShift.circularShift((int)99, (int)1));
	    assertEqualsArray(testCases, CircularShift.circularShift(99, (int)1));
	    
	    assertEqualsArray(testCases, CircularShift.circularShift((int)1, (int)99));
	    assertEqualsArray(testCases, CircularShift.circularShift((int)1, (int)1));
	    
	    assertEqualsArray(testCases, CircularShift.circularShift((int)9, (int)9));
	    assertEqualsArray(testCases, CircularShift.circularShift((int)1, (int)9));      
	  }
	  
	  
	private static void assertEqualsArray(String[] cases, Object[] cases1){
	    for (int i = 0; i < cases.length; i++){
	        System.err.println(i + " -> " + cases[i]);
	        assertEquals(cases1[i], cases[i]);
	    }
		
	}
}
