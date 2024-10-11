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
	public _CompleteResponseTest() {
	}

	/**
	 * Test the getTypeDesc method with a <code>result</code> not including a complete result.
	 * It verifies that the result is <code>null</code>.
	 */
	@Test
	public void testGetTypeDesc1() {
		_CompleteResponse obj = new _CompleteResponse();
		String typeDesc = obj.getTypeDesc();
		assertNull(typeDesc);
	}
}