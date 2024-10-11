// _GetEngineResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponseTest {
		
	@Test
    public void testgetTypeDesc()
    {
        String expected = "mygrid.web.Engine";
        String returnValue = mygrid.web.Engine.getTypeDesc();
        
        assertEquals( expected, returnValue );
    }
}