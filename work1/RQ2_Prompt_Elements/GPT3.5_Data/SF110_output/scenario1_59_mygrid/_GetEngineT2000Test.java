@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null TypeDesc object
    assertNotNull(_GetEngine.getTypeDesc());

    // Test case 2: getTypeDesc() returns an instance of TypeDesc
    assertTrue(_GetEngine.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() returns a TypeDesc object with the correct type name
    assertEquals("GetEngine", _GetEngine.getTypeDesc().getXmlType().getLocalPart());

    // Test case 4: getTypeDesc() returns a TypeDesc object with the correct namespace URI
    assertEquals("http://mygrid/web", _GetEngine.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 5: getTypeDesc() returns a TypeDesc object with the correct element name
    assertEquals("getEngine", _GetEngine.getTypeDesc().getElementName());

    // Test case 6: getTypeDesc() returns a TypeDesc object with the correct element namespace URI
    assertEquals("http://mygrid/web", _GetEngine.getTypeDesc().getElementQName().getNamespaceURI());

    // Test case 7: getTypeDesc() returns a TypeDesc object with the correct element local name
    assertEquals("getEngine", _GetEngine.getTypeDesc().getElementQName().getLocalPart());

    // Test case 8: getTypeDesc() returns a TypeDesc object with the correct type serializer
    assertNotNull(_GetEngine.getTypeDesc().getXmlType().getTypeSerializer());

    // Test case 9: getTypeDesc() returns a TypeDesc object with the correct type deserializer
    assertNotNull(_GetEngine.getTypeDesc().getXmlType().getTypeDeserializer());

    // Test case 10: getTypeDesc() returns a TypeDesc object with the correct type class
    assertEquals(_GetEngine.class, _GetEngine.getTypeDesc().getTypeClass());
}
}