// Test case for getTypeDesc() method
public class _GetEngineResponseTest {

    @Test
    public void testGetTypeDesc() {
        // Test case 1: getTypeDesc() should return a non-null TypeDesc object
        assertNotNull(_GetEngineResponse.getTypeDesc());

        // Test case 2: getTypeDesc() should return a TypeDesc object with the correct XML type name
        assertEquals("GetEngineResponse", _GetEngineResponse.getTypeDesc().getXmlType().getLocalPart());

        // Test case 3: getTypeDesc() should return a TypeDesc object with the correct namespace URI
        assertEquals("http://mygrid/web/", _GetEngineResponse.getTypeDesc().getXmlType().getNamespaceURI());

        // Test case 4: getTypeDesc() should return a TypeDesc object with the correct Java class name
        assertEquals("_GetEngineResponse", _GetEngineResponse.getTypeDesc().getJavaType().getName());

        // Test case 5: getTypeDesc() should return a TypeDesc object with the correct serializer class name
        assertEquals("org.apache.axis.encoding.ser.BeanSerializer", _GetEngineResponse.getTypeDesc().getSerializerClass().getName());

        // Test case 6: getTypeDesc() should return a TypeDesc object with the correct deserializer class name
        assertEquals("org.apache.axis.encoding.ser.BeanDeserializer", _GetEngineResponse.getTypeDesc().getDeserializerClass().getName());

        // Test case 7: getTypeDesc() should return a TypeDesc object with the correct number of elements
        assertEquals(1, _GetEngineResponse.getTypeDesc().getElementDescs().length);

        // Test case 8: getTypeDesc() should return a TypeDesc object with the correct element name
        assertEquals("getEngineResult", _GetEngineResponse.getTypeDesc().getElementDescs()[0].getName());

        // Test case 9: getTypeDesc() should return a TypeDesc object with the correct element type
        assertEquals(org.apache.axis.description.ElementDesc.TYPE_QNAME, _GetEngineResponse.getTypeDesc().getElementDescs()[0].getType());

        // Test case 10: getTypeDesc() should return a TypeDesc object with the correct element namespace URI
        assertEquals("http://mygrid/web/", _GetEngineResponse.getTypeDesc().getElementDescs()[0].getXmlType().getNamespaceURI());
    }
}