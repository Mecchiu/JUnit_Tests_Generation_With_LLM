// _FailTest.java
package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Fail}.
* It contains ten unit test cases for the {@link _Fail#getTypeDesc()} method.
*/
class _FailTest {
    
    /**
     * Test case for getTypeDesc method when typeDesc is null.
     */
    @Test
    void testGetTypeDescWhenTypeDescIsNull() {
        assertNull(_Fail.getTypeDesc());
    }
    
    /**
     * Test case for getTypeDesc method when typeDesc is not null.
     */
    @Test
    void testGetTypeDescWhenTypeDescIsNotNull() {
        assertNotNull(_Fail.getTypeDesc());
    }
    
    /**
     * Test case for getTypeDesc method when typeDesc is an instance of TypeDesc.
     */
    @Test
    void testGetTypeDescWhenTypeDescIsInstanceOfTypeDesc() {
        assertTrue(_Fail.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);
    }
    
    /**
     * Test case for getTypeDesc method when typeDesc has the correct namespace.
     */
    @Test
    void testGetTypeDescWhenTypeDescHasCorrectNamespace() {
        assertEquals("http://mygrid.web", _Fail.getTypeDesc().getXmlTypeNamespace());
    }
    
    /**
     * Test case for getTypeDesc method when typeDesc has the correct name.
     */
    @Test
    void testGetTypeDescWhenTypeDescHasCorrectName() {
        assertEquals("_Fail", _Fail.getTypeDesc().getXmlTypeName());
    }
    
    /**
     * Test case for getTypeDesc method when typeDesc has the correct element name.
     */
    @Test
    void testGetTypeDescWhenTypeDescHasCorrectElementName() {
        assertEquals("fail", _Fail.getTypeDesc().getElementName());
    }
    
    /**
     * Test case for getTypeDesc method when typeDesc has the correct element namespace.
     */
    @Test
    void testGetTypeDescWhenTypeDescHasCorrectElementNamespace() {
        assertEquals("http://mygrid.web", _Fail.getTypeDesc().getElementQName().getNamespaceURI());
    }
    
    /**
     * Test case for getTypeDesc method when typeDesc has the correct element local part.
     */
    @Test
    void testGetTypeDescWhenTypeDescHasCorrectElementLocalPart() {
        assertEquals("fail", _Fail.getTypeDesc().getElementQName().getLocalPart());
    }
    
    /**
     * Test case for getTypeDesc method when typeDesc has the correct type mapping.
     */
    @Test
    void testGetTypeDescWhenTypeDescHasCorrectTypeMapping() {
        assertEquals(org.apache.axis.encoding.XMLType.AXIS_VOID, _Fail.getTypeDesc().getXmlType());
    }
}