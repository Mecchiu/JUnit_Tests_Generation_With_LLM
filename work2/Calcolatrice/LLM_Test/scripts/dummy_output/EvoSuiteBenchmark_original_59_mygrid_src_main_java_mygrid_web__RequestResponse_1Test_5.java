// _RequestResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponse_1Test {
		/**
		 * Simple test case
		 */
	@Test
	public void test() {
		boolean testResult = false;
	
		// Test Value
		testResult = _RequestResponse.getTypeDesc()==false;
	
		assertTrue("_RequestResponse.getTypeDesc() == false, test case failed", testResult);
	} 
}