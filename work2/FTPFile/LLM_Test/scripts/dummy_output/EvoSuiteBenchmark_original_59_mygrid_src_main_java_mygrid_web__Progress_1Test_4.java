// _Progress_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _Progress_1Test {
		
	int testGetTypeDesc() {
		return new _Progress().getTypeDesc();		
	}

	/**
	 * Test case for getTypeDesc()
	 * @throws Exception 
	 */
	@Test
	void getTypeDesc_1Test() throws Exception {
		assertEquals("Unknown", _Progress.TYPE_VALUE.toString());
		assertEquals(null, _TypeDesc.class);
	}
	
}