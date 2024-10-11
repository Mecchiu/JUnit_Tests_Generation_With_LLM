// _CompleteResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponseTest {
		// _CompleteResponseTest.java
	
   // Tests

    // Test for {@link _CompleteResponse#completeResult()}
    @Test
    public void completeResultTest(){
        assertTrue(new _CompleteResponse().completeResult());
    }

    // Tests

    // Test for {@link _CompleteResponse#getCompleteResult()}
    @Test
    public void completeResultTest(){
    	assertTrue(new _CompleteResponse().getCompleteResult());
    }
    
}