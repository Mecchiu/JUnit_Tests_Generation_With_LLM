package mygrid.web;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class _AvailableJobsResponse_1Test {

    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_AvailableJobsResponse.getTypeDesc());
    }

    @Test
    void testGetTypeDescXmlType() {
        assertEquals("http://tempuri.org/", _AvailableJobsResponse.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals(">AvailableJobsResponse", _AvailableJobsResponse.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    void testGetTypeDescFieldNotNull() {
        assertNotNull(_AvailableJobsResponse.getTypeDesc().getField("availableJobsResult"));
    }

    @Test
    void testGetTypeDescFieldXmlName() {
        assertEquals("http://tempuri.org/", _AvailableJobsResponse.getTypeDesc().getField("availableJobsResult").getXmlName().getNamespaceURI());
        assertEquals("AvailableJobsResult", _AvailableJobsResponse.getTypeDesc().getField("availableJobsResult").getXmlName().getLocalPart());
    }

    @Test
    void testGetTypeDescFieldXmlType() {
        assertEquals("http://tempuri.org/", _AvailableJobsResponse.getTypeDesc().getField("availableJobsResult").getXmlType().getNamespaceURI());
        assertEquals("ArrayOfJob", _AvailableJobsResponse.getTypeDesc().getField("availableJobsResult").getXmlType().getLocalPart());
    }

    @Test
    void testGetSerializerNotNull() {
        assertNotNull(_AvailableJobsResponse.getSerializer("", _AvailableJobsResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">AvailableJobsResponse")));
    }

    @Test
    void testGetDeserializerNotNull() {
        assertNotNull(_AvailableJobsResponse.getDeserializer("", _AvailableJobsResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">AvailableJobsResponse")));
    }
}
