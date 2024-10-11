// _GetEngineResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponse_1Test {
		/**
		 * Run the String getTypeDesc() method test.
		 */
	@Test
	public void testGetTypeDesc() {
		String result = _GetEngineResponse.getTypeDesc();
		assertEquals(result, "<TypeDesc>");
	}
}