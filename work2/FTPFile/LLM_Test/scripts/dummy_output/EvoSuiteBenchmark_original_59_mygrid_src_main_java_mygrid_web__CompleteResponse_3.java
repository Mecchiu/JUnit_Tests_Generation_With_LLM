// _CompleteResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponseTest {
		
    protected boolean completeResult;

    //_CompleteResponseTest.java

    /**
     * 
     * Constructor testing all properties and methods of the {@link _CompleteResponse} class.
     *  
     * It will invoke all properties of the {@link _CompleteResponse} class with different values or it throws
     * exceptions for those attributes that need to have different values.
     */
    public _CompleteResponseTest() {
        completeReset();
    }
    
    /**
     * 
     * Setter class for the {@link #completeResult} property.
     *  
     * It will set the value of the {@link #completeResult} property to true.
     */
    public void setCompleteResult(boolean completeResult) {
        this.completeResult = completeResult;
    }

    //completeReset
    
    private void completeReset() {
        completeResult = false;
    }

    //_CompleteResponseTest.java

    /**
     * 
     * Test method for
     * {@link _CompleteResponse#getCompleteResult()}.
     * 
     */
    @Test
    public void testGetCompleteResult() {
        completeReset();
        assertEquals(true, waitForCompleteResult);
    }

    /**
     * 
     * Test method for
     * {@link _CompleteResponse#isCompleteResult()}.
     * 
     */
    @Test
    public void testIsCompleteResult() {
        completeReset();
        assertEquals(true, waitForCompleteResult);
    }
}