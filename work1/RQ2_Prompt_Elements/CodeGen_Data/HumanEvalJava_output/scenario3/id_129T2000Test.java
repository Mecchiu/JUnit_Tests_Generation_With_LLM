// MinpathTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minpath}.
* It contains one unit test case for the {@link Minpath#minpath(List, int)} method.
*/
class MinpathTest {
private MinpathTest() {}
		
		static {
					 		 // Add some serialization code here.
				 		 List.class.getField("EMPTY_LIST").setAccessible(true);
				 		 List.class.getDeclaredField("EMPTY_LIST").setAccessible(true);
				 	}
		
		@Test
    public void minpathTest() {		 			
				System.out.println("--------------------------------------------------------------------------------------------");
    		assertNotNull(
    			"You cannot create a empty list or try to call the minpath method without the empty list.",
    			Minpath.minpath(new ArrayList(), 0)
    )
    	.hasSize(0)
    	.containsOnly(
    		"-".toCharArray(), "3"
    	)
    	.inOrder();
    }
}
