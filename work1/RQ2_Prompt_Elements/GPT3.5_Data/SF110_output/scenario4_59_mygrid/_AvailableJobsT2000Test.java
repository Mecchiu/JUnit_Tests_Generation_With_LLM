// Test case for getTypeDesc() method
public class _AvailableJobsTest {

    @Test
    public void testGetTypeDesc() {
        // Test case 1: getTypeDesc() should return a non-null TypeDesc object
        assertNotNull(_AvailableJobs.getTypeDesc());

        // Test case 2: getTypeDesc() should return a TypeDesc object with the correct class name
        assertEquals("_AvailableJobs", _AvailableJobs.getTypeDesc().getXmlName().getLocalPart());

        // Test case 3: getTypeDesc() should return a TypeDesc object with the correct namespace URI
        assertEquals("http://mygrid/web", _AvailableJobs.getTypeDesc().getXmlType().getNamespaceURI());

        // Test case 4: getTypeDesc() should return a TypeDesc object with the correct namespace prefix
        assertEquals("ns1", _AvailableJobs.getTypeDesc().getXmlType().getPrefix());

        // Test case 5: getTypeDesc() should return a TypeDesc object with the correct serializer class name
        assertEquals("org.apache.axis.encoding.ser.BeanSerializer", _AvailableJobs.getTypeDesc().getSerializerClass());

        // Test case 6: getTypeDesc() should return a TypeDesc object with the correct deserializer class name
        assertEquals("org.apache.axis.encoding.ser.BeanDeserializer", _AvailableJobs.getTypeDesc().getDeserializerClass());

        // Test case 7: getTypeDesc() should return a TypeDesc object with the correct type name
        assertEquals("ns1:_AvailableJobs", _AvailableJobs.getTypeDesc().getXmlType().getLocalPart());

        // Test case 8: getTypeDesc() should return a TypeDesc object with the correct type namespace URI
        assertEquals("http://mygrid/web", _AvailableJobs.getTypeDesc().getXmlType().getNamespaceURI());

        // Test case 9: getTypeDesc() should return a TypeDesc object with the correct type namespace prefix
        assertEquals("ns1", _AvailableJobs.getTypeDesc().getXmlType().getPrefix());

        // Test case 10: getTypeDesc() should return a TypeDesc object with the correct element name
        assertEquals("availableJobs", _AvailableJobs.getTypeDesc().getElementName());
    }
}