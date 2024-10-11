// _CompleteResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponseTest {

    // getCompleteResponseTest() is a static method that returns a reference to
    // the _CompleteResponse class.
    	private static _CompleteResponse createTestClass = null;
    
	/**
	* Test of getTypeDesc() method, of class _CompleteResponse.
	*/
	@Test
	public void testGetTypeDesc() {
		assertNotNull(
			"getTypeDesc was not called", 
			createTestClass.getTypeDesc()
		);
	}
    
}