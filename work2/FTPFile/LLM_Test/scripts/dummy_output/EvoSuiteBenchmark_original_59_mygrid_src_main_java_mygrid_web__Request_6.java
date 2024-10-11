// _RequestTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains one unit test case for the {@link _Request#getTypeDesc()} method.
*/
class _RequestTest {
		
    protected final static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    protected final static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Test of getTypeDesc method, of class _Request.
     */
    @Test
    public void testGetTypeDesc() {
        assertEquals((java.lang.String) null, _Request.getTypeDesc());
    }

    @Test
    public void test() {
        final String MESSAGE_BOP = "BOP";
        final String MESSAGE_BOG = "BOG";
    }
}