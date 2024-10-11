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
    public void testGetTypeDesc(){
        assertTrue(_LogonResponse.getTypeDesc()!= null);
    }
    
    private org.apache.axis.description.TypeDesc typeDesc;

    public org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    
}