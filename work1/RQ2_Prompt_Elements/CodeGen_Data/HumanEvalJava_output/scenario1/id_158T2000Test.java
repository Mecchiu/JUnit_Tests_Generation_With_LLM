// FindMaxTest.java
package scenario1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains one unit test case for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {

   List<String> words;	
		    
    /**
	* Create an empty test case. 
	*/
	public FindMaxTest() {
	System.out.println("Test: FindMaxTest instantiating");
	
	words = new String[2];
	for (int i = 0; i < words.length; i++) {
	        words[i] = "";
	}
	}

    /**
	* Initialization for the test. 
	*/	
    public void Setup() { 
	    System.out.println("Test: FindMax#Setup");
		words = new String[2];
	}

    /**
	*  End of the test. 
	*/

    /**
	* Returns the number of words in test. 
	*/
 
    @Test 
    public void test() { 
 
        System.out.println("Test: FindMax.test");
		
        Setup();
            
        words[0] = "hello world";	
        words[1] = "hello world";	
	}
  


}

