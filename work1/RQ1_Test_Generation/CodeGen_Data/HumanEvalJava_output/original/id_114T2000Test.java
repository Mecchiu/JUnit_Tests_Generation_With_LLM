// MinsubarraysumTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains one unit test case for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {

	// @Test
    @Test
    public void minSubArraySum(){
        List<Object> testObjects = null;
              
        // First test min array sum
        long test1 = 3;
        long test2 = 0;

        // Second test min array sum
        long test3 = 7;
        
        // Third test min array sum
        long test4 = 10;
        
        // Fourth test min array sum
        long test5 = 30;
        
        // Fifth test min array sum
        long test6 = 400;

		assertEquals(13, testObjects.size()); // The original list size is 10, 
                                                // while min array sum of the new list is 3        
        testObjects = new ArrayList<Object>(testObjects);

        testObjects.add(test1);
        testObjects.add(test2);
        testObjects.add(test3);
        testObjects.add(test4);
        testObjects.add(test5);
        testObjects.add(test6);
        
        long testTotalSum = minsubarraysum(testObjects);
        assertEquals(testTotalSum, test1);  
        
        testTotalSum = minsubarraysum(testObjects);
        assertTrue("min sum of array of integer object is less than one", (testTotalSum & 1) == 1);   
        
        testTotalSum = minsubarraysum(testObjects);
        assertEquals(testTotalSum, test2);
        
        testTotalSum = minsubarraysum(testObjects);
        assertTrue("min sum of array of integer object is less than one", (testTotalSum & 1) == 1);
        
        testObjects = new ArrayList<Object>(testObjects);
        testObjects.add(test6);
        testTotalSum = minsubarraysum(testObjects);
        assertEquals(testTotalSum, test3);
                
        test0 = minSubArray(10);
        testObjects = new ArrayList<Object>(testObjects);
        testObjects.add(test0);
        assertEquals(testTotalSum, minsubarraysum(testObjects));
        
        assertEquals(testTotalSum, test2);
        
    }
    
}
