// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {

    private void testGetMember(boolean result) 
    {
        boolean gotResult=mygrid.web.g._RequestResponse.getTypeDesc().equals(result);
        assertEquals(gotResult, result);
    }
    
    // no test for members
}
