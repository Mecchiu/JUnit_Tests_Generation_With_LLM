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
	* Test case for a serializable {@link _LogonResponse} object
	*/
	@Test
    public void test_LogonResponse_1() {
	_LogonResponse response = new _LogonResponse();
        assertEquals(null, response.getTypeDesc());
        assertTrue(response instanceof java.lang.Object);
    }

    /**
     * Test case for a serializable {@link _LogonResponse} object
     */
	@Test (expected = java.lang.IllegalStateException.class)
	public void test_LogonResponse_2() {
		_LogonResponse.NONE;
		_LogonResponse.NONE;
		assertEquals(null, response.getTypeDesc());
		assertTrue(response instanceof java.lang.Object);
	}

    /**
     * Test case for a serializable {@link _LogonResponse} object
     */	
	@Test (expected = java.lang.IllegalStateException.class)
	public void test_LogonResponse_3() {
		_LogonResponse.getTypeDesc();
		assertEquals(null, response.getTypeDesc());
		assertTrue(response instanceof java.lang.Object);
	}

}