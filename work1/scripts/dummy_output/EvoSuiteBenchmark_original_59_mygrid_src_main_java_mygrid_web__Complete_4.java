// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {
		
    /**
     * getTypeDesc() unittest.
     * 
     * @throws java.lang.Exception
     */
    @Test
    public void testGetTypeDesc() throws java.lang.Exception {
        final _Complete o = new _Complete();
        assertEquals("o.getTypeDesc() unit test", o.getTypeDesc().getNamespaceURI(), null);
        assertEquals("o.getTypeDesc() unit test", o.getTypeDesc().getLocalName(), null);
    }
  
}