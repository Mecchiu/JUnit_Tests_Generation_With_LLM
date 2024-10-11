// SearchTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains one unit test case for the {@link Search#search(List)} method.
*/
class SearchTest {

	private final int num = 50;
	
	@Test
    public void searchTest_1() {
        assertNotNull(Search.search(Integer.toString(num).toUpperCase()));
    }
	
    @Test
    public void searchTest_2(){
    	assertEquals(1, Search.search("1"));
    }
	
} 
