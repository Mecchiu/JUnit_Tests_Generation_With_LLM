package mygrid.web;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class _Progress_1Test {

    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_Progress.getTypeDesc());
    }

    @Test
    void testGetTypeDescXmlType() {
        assertEquals("http://tempuri.org/", _Progress.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals(">Progress", _Progress.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    void testGetTypeDescFieldNotNull() {
        assertNotNull(_Progress.getTypeDesc().getField("job"));
    }

    @Test
    void testGetTypeDescFieldXmlName() {
        assertEquals("http://tempuri.org/", _Progress.getTypeDesc().getField("job").getXmlName().getNamespaceURI());
        assertEquals("job", _Progress.getTypeDesc().getField("job").getXmlName().getLocalPart());
    }

    @Test
    void testGetTypeDescFieldXmlType() {
        assertEquals("http://tempuri.org/", _Progress.getTypeDesc().getField("job").getXmlType().getNamespaceURI());
        assertEquals("Job", _Progress.getTypeDesc().getField("job").getXmlType().getLocalPart());
    }

    @Test
    void testGetTypeDescFieldMinOccurs() {
        assertEquals(0, _Progress.getTypeDesc().getField("job").getMinOccurs());
    }

    @Test
    void testGetSerializerNotNull() {
        assertNotNull(_Progress.getSerializer(null, _Progress.class, new javax.xml.namespace.QName("http://tempuri.org/", ">Progress")));
    }

    @Test
    void testGetDeserializerNotNull() {
        assertNotNull(_Progress.getDeserializer(null, _Progress.class, new javax.xml.namespace.QName("http://tempuri.org/", ">Progress")));
    }
}
