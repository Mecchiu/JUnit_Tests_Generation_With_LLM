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
	* Test method for {@link mygrid.web._CompleteResponse#getTypeDesc()}.
	*/
    @org.junit.jupiter.api.Test
    @SuppressWarnings("all")
    public void testGetTypeDesc() throws Exception {
        // BEGIN main
        String result = new _CompleteResponse().getTypeDesc();
        // END main
    }
     
}
