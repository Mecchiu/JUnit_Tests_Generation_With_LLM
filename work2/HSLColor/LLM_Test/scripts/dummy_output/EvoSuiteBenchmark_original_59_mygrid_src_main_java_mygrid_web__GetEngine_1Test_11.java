// _GetEngine_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngine_1Test {
		
    java.lang.String _GetEngine__getTypeDesc_QName() {
        return null;
    }
    java.lang.String _GetEngine__getName() {
        return null;
    }
    java.lang.String _GetEngine__getTypeName() {
        return null;
    }

    @Test
    public void testGetTypeDescJAXBElementQName() {
        String returnObject;
        {
            java.lang.String returnValue = null;
            returnObject = _GetEngine__getTypeDesc_QName().getJavaClass().getName();
        }
        assertEquals("TypeDesc(type: " + returnObject + ")", typeDesc.getQName().getLocalPart());
    }

    @Test
    public void testGetNameJAXBElement() {
        String returnObject;
        {
            java.lang.String returnValue = null;
            returnObject = _GetEngine__getName().getJavaClass().getName();
            returnValue = returnObject.intern();
        }
        assertEquals("FooService", returnValue);
    }
    @Test
    public void testGetTypeNameJAXBElement() {
        String returnObject;
        {
            java.lang.String returnValue = null;
            returnObject = _GetEngine__getName().getLocalPart();
            returnValue = returnObject.intern();
        }
        assertEquals("FooServiceType", returnObject);
    }
}