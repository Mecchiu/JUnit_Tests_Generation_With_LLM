// _RequestResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponse_1Test {
		
	/**
	* Test constructor.
	*/
	@Test
	public void testConstructor() {
		try {
			assertFalse(new _RequestResponse(_false, "http://tempuri.org/", null).getRequestResult());
		} catch(Exception e) {
			assertTrue(e.getCause() instanceof java.lang.NullPointerException);
		}
	}

	/**
	* Return Descriptor.
	*/
	@Test
	public void testGetTypeDesc() {
		assertNotNull(new _RequestResponse("", "http://tempuri.org/", null).getTypeDesc());
		assertEquals(new java.lang.String("http://tempuri.org/"), new _RequestResponse("", "http://tempuri.org/", null).getTypeDesc());
	}

	/**
	* Return value.
	*/
	@Test
	public void testGetValue() {
		assertFalse(new _RequestResponse().getTypeDesc().isRequestResult());
		assertTrue(new _RequestResponse("true", "http://tempuri.org/", null).getTypeDesc().isRequestResult());
	}

	/**
	* Return value.
	*/

	java.lang.String _false = org.apache.axis.utils.datetime.DateDeserializer.getBoolean(Boolean.class, "false");
	
	/**
	* Return value.
	*/

	public static boolean _false;
}