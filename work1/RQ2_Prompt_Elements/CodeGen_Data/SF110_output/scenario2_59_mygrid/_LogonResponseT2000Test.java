// _LogonResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains one unit test case for the {@link _LogonResponse#getTypeDesc()} method.
*/
class _LogonResponseTest {
/**
		* Unit test for the getTypeDesc() method.
		*/
	@org.junit.jupiter.api.Test
	public void testGetTypeDesc() {
		final _LogonResponse result = _LogonResponse.getTypeDesc();
		assertEquals("Wrong return type", "java.lang.String", result.getClass().getName());
		assertEquals("Wrong return instance", java.lang.String.class.getName(), result.getInstance());
		assertTrue("Wrong value of attribute", null!= result.getAttribute());
		assertEquals("Wrong value code of attribute", "LogonResult", result.getAttribute().getCode());
	}
}
// _LogonResponseTest.java
