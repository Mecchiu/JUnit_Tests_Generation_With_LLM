// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains one unit test case for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {
		
	private static String name = "LogonTest";

	// Create a new instance.
	private _LogonTest(java.lang.String name) {
		this.name = name;
	}

		@Test
	void getTypeDesc() {
		assertNotNull(getTypeDesc());
	}

	@org.junit.Test
	public void getTypeDesc_0_0() {
		_Logon.getTypeDesc();
	}

	/**
	 * Test of getUser method, of class _LogonTest.
	 */
	@Test
	void getUser_1() {
		System.out.println("login");
		_LogonTest.getUser();
	}

}