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
		 * Test method for getTypeDesc
		 */
	public void testGetTypeDesc() {
		_LogonResponse testSubject = new _LogonResponse();
		assertEquals(_LogonResponse.TYPE, testSubject.getTypeDesc());
	}

 }