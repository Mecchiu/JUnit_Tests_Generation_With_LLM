// _LogonResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#getTypeDesc()} method.
*/
class _LogonResponseTest {
		
	/**
	* Test case for the {@link _LogonResponse#getTypeDesc()} method.
	*/
	@Test
	public void testGetTypeDesc() {
		assertNotNull(_LogonResponse.getTypeDesc());
	}
}