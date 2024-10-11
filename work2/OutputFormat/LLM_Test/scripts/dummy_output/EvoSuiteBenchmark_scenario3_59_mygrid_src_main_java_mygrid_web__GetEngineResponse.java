// _GetEngineResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponseTest {
		
	/**
	* Test case for the {@link _GetEngineResponse#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_GetEngineResponse _getEngineResponse = new _GetEngineResponse();
		assertNotNull(_getEngineResponse.getTypeDesc());
	}
}