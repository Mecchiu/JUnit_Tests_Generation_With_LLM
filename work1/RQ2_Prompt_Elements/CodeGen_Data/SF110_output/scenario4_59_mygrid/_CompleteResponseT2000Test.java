// _CompleteResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponseTest {
/**
		 * Test for the {@link _CompleteResponse#getTypeDesc()} method.
		 */
    @Test
    public void testGetTypeDesc() {
        
    	assertEquals(true, _CompleteResponse.isCompleteResult());
    	
    }
    
}
