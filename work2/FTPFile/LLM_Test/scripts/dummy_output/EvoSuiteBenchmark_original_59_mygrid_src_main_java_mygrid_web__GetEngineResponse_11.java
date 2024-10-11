// _GetEngineResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponseTest {
		/**
		* Test method for getTypeDesc()
		*/
	@Test
	public void testGetTypeDesc() {
		_GetEngineResponse result = new _GetEngineResponse();
		java.lang.Object obj = null;

		result.setGetEngineResult(obj);

		java.lang.Object obj_return = result.getGetEngineResult();

		assertNotNull(obj_return);
	}
}