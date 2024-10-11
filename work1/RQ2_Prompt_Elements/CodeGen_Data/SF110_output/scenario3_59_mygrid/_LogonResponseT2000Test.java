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
	 * Test method for {@link net.mygrid.grid.mygrid.web.LogonResponse#getTypeDesc()}.
	 */
	@Test
	public void testGetTypeDesc() {
		assertNotNull("New instance of LogonResponse must not be null", new _LogonResponse());
		assertTrue("Returned type is not net.mygrid.grid.mygrid.wg_LogonResponse", getTypeDesc().equals(org.apache.axis.types.TypeDesc.getDefaultInstance()));
	}
	
	public static final String TEST_CLASS_LOCATION = "TestClassLoc";
	public static final java.lang.Class<net.mygrid.grid.mygrid.wg_LogonResponse> TEST_CLASS = net.mygrid.grid.mygrid.wg_LogonResponse.class;
}