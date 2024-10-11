@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null TypeDesc object
    assertNotNull(_SetEngineInfo.getTypeDesc());

    // Test case 2: getTypeDesc() returns an instance of TypeDesc
    assertTrue(_SetEngineInfo.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() returns a TypeDesc object with the correct type name
    assertEquals("SetEngineInfo", _SetEngineInfo.getTypeDesc().getXmlType().getLocalPart());

    // Test case 4: getTypeDesc() returns a TypeDesc object with the correct namespace URI
    assertEquals("http://mygrid/web", _SetEngineInfo.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 5: getTypeDesc() returns a TypeDesc object with the correct element name
    assertEquals("setEngineInfo", _SetEngineInfo.getTypeDesc().getElementName().getLocalPart());

    // Test case 6: getTypeDesc() returns a TypeDesc object with the correct namespace URI for the element
    assertEquals("http://mygrid/web", _SetEngineInfo.getTypeDesc().getElementName().getNamespaceURI());

    // Test case 7: getTypeDesc() returns a TypeDesc object with the correct SOAP encoding style
    assertEquals(org.apache.axis.Constants.URI_DEFAULT_SOAP_ENC, _SetEngineInfo.getTypeDesc().getXmlType().getEncodingStyle());

    // Test case 8: getTypeDesc() returns a TypeDesc object with the correct serializer class
    assertEquals(org.apache.axis.encoding.ser.BeanSerializer.class, _SetEngineInfo.getTypeDesc().getSerializerClass());

    // Test case 9: getTypeDesc() returns a TypeDesc object with the correct deserializer class
    assertEquals(org.apache.axis.encoding.ser.BeanDeserializer.class, _SetEngineInfo.getTypeDesc().getDeserializerClass());

    // Test case 10: getTypeDesc() returns a TypeDesc object with the correct type metadata
    assertEquals(0, _SetEngineInfo.getTypeDesc().getType().getMetaData().size());
}
}