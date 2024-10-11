// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {

	/**
	* Test case for the {@link _RequestResponse#getTypeDesc()} method.
	*/
	@Test
	public void testGetTypeDesc() {
		assertNotNull(_RequestResponse.getTypeDesc());
	}
}