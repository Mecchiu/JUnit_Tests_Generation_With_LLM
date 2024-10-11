// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {
		
	/**
	* _RequestResponse.getTypeDesc method test.
	*/
	@Test
	public void testGetTypeDesc(){
		_RequestResponse requestResult = _RequestResponse.getTypeDesc();
		assertTrue(requestResult == _RequestResponse.TYPE_DESC);
	}

	/**
	* _RequestResponse.getTypeDesc method test.
	*/
	@Test
	public void testEnum(){
		String strRequestResult = _RequestResponse.TYPE_DESC;
		String strEnum = _RequestResponse.TYPE_DESC;
		boolean bResult = Boolean.parseBoolean(strRequestResult);
		boolean bEnum = Boolean.parseBoolean(strEnum);
		assertNotNull(bResult);
		assertEquals(bResult, new Boolean(bEnum));
	}
}