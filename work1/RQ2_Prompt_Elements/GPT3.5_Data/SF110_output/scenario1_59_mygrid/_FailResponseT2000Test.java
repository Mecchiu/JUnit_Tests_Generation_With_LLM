// _FailResponseTest.java
package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains ten unit test cases for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {
    
    /**
    * Test case for checking if the returned TypeDesc object is not null.
    */
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_FailResponse.getTypeDesc());
    }
    
    /**
    * Test case for checking if the returned TypeDesc object is of type org.apache.axis.description.TypeDesc.
    */
    @Test
    void testGetTypeDescType() {
        assertTrue(_FailResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);
    }
    
    /**
    * Test case for checking if the returned TypeDesc object has the correct type name.
    */
    @Test
    void testGetTypeDescTypeName() {
        assertEquals("FailResponse", _FailResponse.getTypeDesc().getXmlType().getLocalPart());
    }
    
    /**
    * Test case for checking if the returned TypeDesc object has the correct namespace URI.
    */
    @Test
    void testGetTypeDescNamespaceURI() {
        assertEquals("http://mygrid/web", _FailResponse.getTypeDesc().getXmlType().getNamespaceURI());
    }
    
    /**
    * Test case for checking if the returned TypeDesc object has the correct element name.
    */
    @Test
    void testGetTypeDescElementName() {
        assertEquals("FailResponse", _FailResponse.getTypeDesc().getElementName());
    }
    
    /**
    * Test case for checking if the returned TypeDesc object has the correct element namespace URI.
    */
    @Test
    void testGetTypeDescElementNamespaceURI() {
        assertEquals("http://mygrid/web", _FailResponse.getTypeDesc().getElementQName().getNamespaceURI());
    }
    
    /**
    * Test case for checking if the returned TypeDesc object has the correct element local part.
    */
    @Test
    void testGetTypeDescElementLocalPart() {
        assertEquals("FailResponse", _FailResponse.getTypeDesc().getElementQName().getLocalPart());
    }
    
    /**
    * Test case for checking if the returned TypeDesc object has the correct serializer.
    */
    @Test
    void testGetTypeDescSerializer() {
        assertNotNull(_FailResponse.getTypeDesc().getSerializer(null, null));
    }
    
    /**
    * Test case for checking if the returned TypeDesc object has the correct deserializer.
    */
    @Test
    void testGetTypeDescDeserializer() {
        assertNotNull(_FailResponse.getTypeDesc().getDeserializer(null, null));
    }
    
    /**
    * Test case for checking if the returned TypeDesc object has the correct type mapping.
    */
    @Test
    void testGetTypeDescTypeMapping() {
        assertNotNull(_FailResponse.getTypeDesc().getTypeMapping(null));
    }
}