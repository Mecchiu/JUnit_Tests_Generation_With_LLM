// _LogonResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains one unit test case for the {@link _LogonResponse#getTypeDesc()} method.
*/
class _LogonResponseTest {
		
    @Test
    void __testTypeDesc(){
        assertNotNull(mygrid.web.LogonResponse.typeDesc);
    }
    
    @Test
    void getTypeDesc(){
        assertEquals("_LogonResponse",mygrid.web.LogonResponse.getTypeDesc().getValue());
    }
    
}