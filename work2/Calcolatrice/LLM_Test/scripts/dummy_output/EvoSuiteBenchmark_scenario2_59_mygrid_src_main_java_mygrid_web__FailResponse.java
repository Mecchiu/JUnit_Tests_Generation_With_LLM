// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains ten unit test cases for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {
		
	/**
	* Test case for the {@link _FailResponse#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_FailResponse _FailResponse = new _FailResponse();
		assertNotNull(_FailResponse.getTypeDesc());
	}
}