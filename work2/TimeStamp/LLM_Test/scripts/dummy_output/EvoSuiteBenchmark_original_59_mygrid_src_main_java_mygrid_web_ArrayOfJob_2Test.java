package mygrid.web;
java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class ArrayOfJob_2Test {

    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(ArrayOfJob.getTypeDesc());
    }

    @Test
    void testGetTypeDescXmlType() {
        assertEquals("http://tempuri.org/", ArrayOfJob.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals("ArrayOfJob", ArrayOfJob.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    void testGetTypeDescFieldNotNull() {
        assertNotNull(ArrayOfJob.getTypeDesc().getFieldByFieldName("job"));
    }

    @Test
    void testGetTypeDescFieldXmlName() {
        assertEquals("http://tempuri.org/", ArrayOfJob.getTypeDesc().getFieldByFieldName("job").getXmlName().getNamespaceURI());
        assertEquals("Job", ArrayOfJob.getTypeDesc().getFieldByFieldName("job").getXmlName().getLocalPart());
    }

    @Test
    void testGetTypeDescFieldXmlType() {
        assertEquals("http://tempuri.org/", ArrayOfJob.getTypeDesc().getFieldByFieldName("job").getXmlType().getNamespaceURI());
        assertEquals("Job", ArrayOfJob.getTypeDesc().getFieldByFieldName("job").getXmlType().getLocalPart());
    }

    @Test
    void testGetSerializerNotNull() {
        assertNotNull(ArrayOfJob.getSerializer(null, ArrayOfJob.class, null));
    }

    @Test
    void testGetDeserializerNotNull() {
        assertNotNull(ArrayOfJob.getDeserializer(null, ArrayOfJob.class, null));
    }
}
