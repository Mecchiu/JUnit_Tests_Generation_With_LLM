// _RequestTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains one unit test case for the {@link _Request#getTypeDesc()} method.
*/
class _RequestTest {
		
    /**
     * Run the Object getTypeDesc() ture.
     */
    @Test
    public void testGetTypeDesc() {
        java.lang.String xg = null;
        java.lang.String result = _Request.getTypeDesc(org.apache.axis2.client.ServiceClient, java.lang.String, java.lang.String);
        assertEquals("getTypeDesc", "string_", result);
    }
}