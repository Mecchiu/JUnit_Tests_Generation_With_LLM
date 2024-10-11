// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {
		 
	@org.junit.jupiter.api.Test
    public void testGetTypeDesc() {
        assertEquals(org.apache.axis.description.TypeDesc.valueOf("_SetEngineInfo"), new _SetEngineInfo().getTypeDesc());
    }
        
}