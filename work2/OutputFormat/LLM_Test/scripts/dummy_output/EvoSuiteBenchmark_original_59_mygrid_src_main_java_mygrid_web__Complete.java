// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {
		
    @org.junit.jupiter.api.Test
    public void testGetTypeDesc() {
        {
            mygrid.web.TypeDesc _typeDesc = mygrid.web.TypeDesc.valueOf("{com.google.gxp.map.client.map.Complete}");
            assertEquals( _typeDesc,mygrid.web.TypeDesc.valueOf("{com.google.gxp.map.client.map.Complete}") );
        }
    }
}