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
	* Test of getTypeDesc() method, of class mygrid.web.LogonResponse.
	*/
	@org.junit.jupiter.api.Test
    public void testGetTypeDesc() {
        _LogonResponse instance = null;
        
        instance.setLogonResult(false);
        java.lang.String expResult = "Logon Result";
        java.lang.String result = instance.getTypeDesc();
        assertEquals(expResult, result);
    }
}