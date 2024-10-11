@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_GetEngineResponse.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_GetEngineResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return a TypeDesc object with the correct type name
    assertEquals("GetEngineResponse", _GetEngineResponse.getTypeDesc().getTypeName());

    // Test case 4: getTypeDesc() should return a TypeDesc object with the correct namespace URI
    assertEquals("http://mygrid/web", _GetEngineResponse.getTypeDesc().getXmlTypeNamespaceURI());

    // Test case 5: getTypeDesc() should return a TypeDesc object with the correct namespace prefix
    assertEquals("ns1", _GetEngineResponse.getTypeDesc().getXmlTypePrefix());

    // Test case 6: getTypeDesc() should return a TypeDesc object with the correct element name
    assertEquals("getEngineResponse", _GetEngineResponse.getTypeDesc().getElementName());

    // Test case 7: getTypeDesc() should return a TypeDesc object with the correct element namespace URI
    assertEquals("http://mygrid/web", _GetEngineResponse.getTypeDesc().getElementQName().getNamespaceURI());

    // Test case 8: getTypeDesc() should return a TypeDesc object with the correct element local name
    assertEquals("getEngineResponse", _GetEngineResponse.getTypeDesc().getElementQName().getLocalPart());

    // Test case 9: getTypeDesc() should return a TypeDesc object with the correct serializer/deserializer class
    assertEquals(org.apache.axis.encoding.ser.BeanSerializer.class, _GetEngineResponse.getTypeDesc().getSerializerClass());
    assertEquals(org.apache.axis.encoding.ser.BeanDeserializer.class, _GetEngineResponse.getTypeDesc().getDeserializerClass());

    // Test case 10: getTypeDesc() should return a TypeDesc object with the correct fields
    org.apache.axis.description.ElementDesc[] fields = _GetEngineResponse.getTypeDesc().getElementDescs();
    assertEquals(0, fields.length);
}
}