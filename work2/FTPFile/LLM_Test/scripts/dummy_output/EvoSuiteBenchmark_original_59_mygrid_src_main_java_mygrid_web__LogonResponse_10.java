// _LogonResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains one unit test case for the {@link _LogonResponse#getTypeDesc()} method.
*/
class _LogonResponseTest {
		
    @org.junit.jupiter.api.Test
    public void testgetTypeDesc() {
        assertNotNull(new _LogonResponse().getTypeDesc());
    }

}