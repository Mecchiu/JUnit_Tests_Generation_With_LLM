@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_SetEngineInfoResponse.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_SetEngineInfoResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return a TypeDesc object with the correct type name
    assertEquals("SetEngineInfoResponse", _SetEngineInfoResponse.getTypeDesc().getXmlType().getLocalPart());

    // Test case 4: getTypeDesc() should return a TypeDesc object with the correct namespace URI
    assertEquals("http://mygrid/web/", _SetEngineInfoResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 5: getTypeDesc() should return a TypeDesc object with the correct element name
    assertEquals("setEngineInfoResponse", _SetEngineInfoResponse.getTypeDesc().getElementName().getLocalPart());

    // Test case 6: getTypeDesc() should return a TypeDesc object with the correct element namespace URI
    assertEquals("http://mygrid/web/", _SetEngineInfoResponse.getTypeDesc().getElementName().getNamespaceURI());

    // Test case 7: getTypeDesc() should return a TypeDesc object with the correct serializer class name
    assertEquals("_SetEngineInfoResponseSerializer", _SetEngineInfoResponse.getTypeDesc().getSerializerClass());

    // Test case 8: getTypeDesc() should return a TypeDesc object with the correct deserializer class name
    assertEquals("_SetEngineInfoResponseDeserializer", _SetEngineInfoResponse.getTypeDesc().getDeserializerClass());

    // Test case 9: getTypeDesc() should return a TypeDesc object with the correct type metadata
    assertNotNull(_SetEngineInfoResponse.getTypeDesc().getTypeMetadata());

    // Test case 10: getTypeDesc() should return a TypeDesc object with the correct type metadata class name
    assertEquals("_SetEngineInfoResponseTypeMetaData", _SetEngineInfoResponse.getTypeDesc().getTypeMetadata().getClass().getSimpleName());
}
}