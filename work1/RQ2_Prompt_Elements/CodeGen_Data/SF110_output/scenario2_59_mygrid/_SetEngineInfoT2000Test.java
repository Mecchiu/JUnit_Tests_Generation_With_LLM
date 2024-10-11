// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {

    /**
     * Test method for {@link java.lang.String#toString()}.
     * Test return type metadata object.
     */
    @Test
    public void testToString() {
        assertEquals("MyGridWeb.SetEngineInfoTest", "java.lang.String", new _SetEngineInfo().getTypeDesc().getName());
    }
	
}
