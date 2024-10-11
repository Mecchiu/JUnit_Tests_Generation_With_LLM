// _SetEngineInfoTest.java
package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains ten unit test cases for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {
    
    /**
     * Test case for getTypeDesc method when the type description object is not null.
     */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_SetEngineInfo.getTypeDesc());
    }
    
    /**
     * Test case for getTypeDesc method when the type description object is of TypeDesc class.
     */
    @Test
    void testGetTypeDescType() {
        assertEquals(org.apache.axis.description.TypeDesc.class, _SetEngineInfo.getTypeDesc().getClass());
    }
    
    /**
     * Test case for getTypeDesc method when the type description object has the correct XML namespace.
     */
    @Test
    void testGetTypeDescNamespace() {
        assertEquals("http://mygrid/web", _SetEngineInfo.getTypeDesc().getXmlTypeNamespace());
    }
    
    /**
     * Test case for getTypeDesc method when the type description object has the correct XML name.
     */
    @Test
    void testGetTypeDescName() {
        assertEquals("_SetEngineInfo", _SetEngineInfo.getTypeDesc().getXmlTypeName());
    }
    
    /**
     * Test case for getTypeDesc method when the type description object has the correct element name.
     */
    @Test
    void testGetTypeDescElementName() {
        assertEquals("_setEngineInfo", _SetEngineInfo.getTypeDesc().getElementName());
    }
    
    /**
     * Test case for getTypeDesc method when the type description object has the correct element namespace.
     */
    @Test
    void testGetTypeDescElementNamespace() {
        assertEquals("http://mygrid/web", _SetEngineInfo.getTypeDesc().getElementQName().getNamespaceURI());
    }
    
    /**
     * Test case for getTypeDesc method when the type description object has the correct element local name.
     */
    @Test
    void testGetTypeDescElementLocalName() {
        assertEquals("_setEngineInfo", _SetEngineInfo.getTypeDesc().getElementQName().getLocalPart());
    }
    
    /**
     * Test case for getTypeDesc method when the type description object has the correct element type.
     */
    @Test
    void testGetTypeDescElementType() {
        assertEquals(org.apache.axis.description.ElementDesc.class, _SetEngineInfo.getTypeDesc().getElementDesc("_setEngineInfo").getClass());
    }
    
    /**
     * Test case for getTypeDesc method when the type description object has the correct element type name.
     */
    @Test
    void testGetTypeDescElementTypeName() {
        assertEquals("_setEngineInfo", _SetEngineInfo.getTypeDesc().getElementDesc("_setEngineInfo").getXmlName());
    }
    
    /**
     * Test case for getTypeDesc method when the type description object has the correct element type namespace.
     */
    @Test
    void testGetTypeDescElementTypeNamespace() {
        assertEquals("http://mygrid/web", _SetEngineInfo.getTypeDesc().getElementDesc("_setEngineInfo").getXmlTypeNamespace());
    }
}