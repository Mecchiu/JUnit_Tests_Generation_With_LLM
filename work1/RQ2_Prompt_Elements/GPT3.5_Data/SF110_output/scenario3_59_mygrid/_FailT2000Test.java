// _Fail.java
package mygrid.web;

import org.apache.axis.description.TypeDesc;

public class _Fail implements java.io.Serializable {

    /**
     * Return type metadata object
     */
    public static TypeDesc getTypeDesc() {
        // TODO: Implement method
        return null;
    }
}

// _FailTest.java
package mygrid.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Fail}.
* It contains ten unit test cases for the {@link _Fail#getTypeDesc()} method.
*/
class _FailTest {
    
    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_Fail.getTypeDesc());
    }
    
    @Test
    void testGetTypeDescInstanceOfTypeDesc() {
        assertTrue(_Fail.getTypeDesc() instanceof TypeDesc);
    }
    
    @Test
    void testGetTypeDescEquals() {
        TypeDesc expected = new TypeDesc("_Fail");
        expected.setXmlType(new javax.xml.namespace.QName("http://mygrid.web", "_Fail"));
        expected.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        expected.setElementName(new javax.xml.namespace.QName("http://mygrid.web", "_Fail"));
        expected.setOrder(0);
        assertEquals(expected, _Fail.getTypeDesc());
    }
    
    @Test
    void testGetTypeDescXmlTypeNotNull() {
        assertNotNull(_Fail.getTypeDesc().getXmlType());
    }
    
    @Test
    void testGetTypeDescElementNameNotNull() {
        assertNotNull(_Fail.getTypeDesc().getElementName());
    }
    
    @Test
    void testGetTypeDescOrderEquals() {
        assertEquals(0, _Fail.getTypeDesc().getOrder());
    }
    
    @Test
    void testGetTypeDescSetXmlType() {
        TypeDesc typeDesc = new TypeDesc("_Fail");
        javax.xml.namespace.QName xmlType = new javax.xml.namespace.QName("http://mygrid.web", "_Fail");
        typeDesc.setXmlType(xmlType);
        assertEquals(xmlType, typeDesc.getXmlType());
    }
    
    @Test
    void testGetTypeDescSetElementName() {
        TypeDesc typeDesc = new TypeDesc("_Fail");
        javax.xml.namespace.QName elementName = new javax.xml.namespace.QName("http://mygrid.web", "_Fail");
        typeDesc.setElementName(elementName);
        assertEquals(elementName, typeDesc.getElementName());
    }
    
    @Test
    void testGetTypeDescSetOrder() {
        TypeDesc typeDesc = new TypeDesc("_Fail");
        int order = 1;
        typeDesc.setOrder(order);
        assertEquals(order, typeDesc.getOrder());
    }
}