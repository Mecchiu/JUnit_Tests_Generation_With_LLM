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
		* Test method for {@link mygrid.web.CompleteResponse.getTypeDesc()}.
		* Example of how to implement unit test for getTypeDesc():
		* <pre>
		* public String toString() {
	      
		*   return "Complete:"
		*  + (isCompleteResult()? "" : " not completed");
		* }
		* </pre>
		*/
	@Test
	public void testGetTypeDesc() {
		assertEquals(true, mygrid.web.CompleteResponse.getTypeDesc().equals(
			"mygrid.web.CompleteResponse"));
	}

}