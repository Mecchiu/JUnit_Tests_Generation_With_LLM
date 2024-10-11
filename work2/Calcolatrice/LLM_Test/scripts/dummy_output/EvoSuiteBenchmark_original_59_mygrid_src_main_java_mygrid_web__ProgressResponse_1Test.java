package mygrid.web;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class _ProgressResponse_1Test {

    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_ProgressResponse.getTypeDesc());
    }

    @Test
    void testGetTypeDescXmlType() {
        assertEquals("http://tempuri.org/", _ProgressResponse.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals(">ProgressResponse", _ProgressResponse.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    void testGetSerializerNotNull() {
        assertNotNull(_ProgressResponse.getSerializer("", _ProgressResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">ProgressResponse")));
    }

    @Test
    void testGetDeserializerNotNull() {
        assertNotNull(_ProgressResponse.getDeserializer("", _ProgressResponse.class, new javax.xml.namespace.QName("http://tempuri.org/", ">ProgressResponse")));
    }
}
