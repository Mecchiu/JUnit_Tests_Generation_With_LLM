// _CompleteResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponse_1Test {
		
	static final boolean TEST = true;
	static final int I = 1;

	/**
	* Test some basic functionality.
	*/
	@Test
	public void testGetTypeDesc() {
		_CompleteResponse result = new _CompleteResponse(TEST, I);
		String _typeDesc = result.getTypeDesc();
		if (_typeDesc == null) {
			System.out.println("error in testGetTypeDesc: _typeDesc should not be null");
			fail("error in testGetTypeDesc: _typeDesc should not be null");
		}
		
		assertNotNull(stringPattern(result.completeResult));
	}
	
}