// _SetEngineInfoResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfoResponse}.
* It contains ten unit test cases for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
*/
class _SetEngineInfoResponseTest {
		
	/**
	* Test case for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_SetEngineInfoResponse _SetEngineInfoResponse = new _SetEngineInfoResponse();
		assertNotNull(_SetEngineInfoResponse.getTypeDesc());
	}
}