@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null object
    assertNotNull(_Request.getTypeDesc());

    // Test case 2: getTypeDesc() returns an object of TypeDesc class
    assertTrue(_Request.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() returns an object with correct type name
    assertEquals("Request", _Request.getTypeDesc().getTypeName());

    // Test case 4: getTypeDesc() returns an object with correct namespace URI
    assertEquals("http://mygrid/web", _Request.getTypeDesc().getXmlTypeNamespaceURI());

    // Test case 5: getTypeDesc() returns an object with correct element name
    assertEquals("request", _Request.getTypeDesc().getXmlTypeLocalPart());

    // Test case 6: getTypeDesc() returns an object with correct serializer
    assertNotNull(_Request.getTypeDesc().getSerializer(null, null));

    // Test case 7: getTypeDesc() returns an object with correct deserializer
    assertNotNull(_Request.getTypeDesc().getDeserializer(null, null));

    // Test case 8: getTypeDesc() returns an object with correct type mapping
    assertNotNull(_Request.getTypeDesc().getTypeMapping(null));

    // Test case 9: getTypeDesc() returns an object with correct type
    assertEquals(_Request.class, _Request.getTypeDesc().getType());

    // Test case 10: getTypeDesc() returns the same object every time it is called
    assertSame(_Request.getTypeDesc(), _Request.getTypeDesc());
}
}