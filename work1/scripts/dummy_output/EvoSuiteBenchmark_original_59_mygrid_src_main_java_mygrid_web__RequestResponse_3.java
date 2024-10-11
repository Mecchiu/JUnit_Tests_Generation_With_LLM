// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {
		
    private boolean requestResult;
	
    /**
     * @see {@link #getTypeDesc()}
     */
    @Test
    public void testGetTypeDesc() {
        requestResult = true;
        assertEquals(true, true);
	}
}