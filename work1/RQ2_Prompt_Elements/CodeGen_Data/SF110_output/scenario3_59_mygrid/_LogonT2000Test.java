// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains one unit test case for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {
/**
		 * Get type test body
		 */
	private static String __elem = null ;
	
	@Test
	public void testReturnTypeDesc1() {
		assertNotNull("Test: returned type desc", __elem ) ;
		__elem = null ;
	}
	
/**
* Test method for {@link mygrid.web.Logon#getTypeDesc()}
*/
	@Test
	public void testGetTypeDesc() {
		Logon __tplObj = new Logon();
		__tplObj.getTypeDesc() ;
	}
}

