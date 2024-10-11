@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null TypeDesc object
    assertNotNull(_CompleteResponse.getTypeDesc());

    // Test case 2: getTypeDesc() returns a TypeDesc object with the correct class name
    assertEquals("mygrid.web._CompleteResponse", _CompleteResponse.getTypeDesc().getXmlType().getLocalPart());

    // Test case 3: getTypeDesc() returns a TypeDesc object with the correct namespace URI
    assertEquals("http://web.mygrid/", _CompleteResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 4: getTypeDesc() returns a TypeDesc object with the correct element name
    assertEquals("completeResponse", _CompleteResponse.getTypeDesc().getElementName().getLocalPart());

    // Test case 5: getTypeDesc() returns a TypeDesc object with the correct namespace URI for the element name
    assertEquals("http://web.mygrid/", _CompleteResponse.getTypeDesc().getElementName().getNamespaceURI());

    // Test case 6: getTypeDesc() returns a TypeDesc object with the correct type mapping
    assertEquals(org.apache.axis.encoding.ser.BeanSerializer.class, _CompleteResponse.getTypeDesc().getSerializerClass());

    // Test case 7: getTypeDesc() returns a TypeDesc object with the correct deserializer mapping
    assertEquals(org.apache.axis.encoding.ser.BeanDeserializer.class, _CompleteResponse.getTypeDesc().getDeserializerClass());

    // Test case 8: getTypeDesc() returns a TypeDesc object with the correct type name
    assertEquals("completeResponse", _CompleteResponse.getTypeDesc().getTypeName());

    // Test case 9: getTypeDesc() returns a TypeDesc object with the correct type namespace URI
    assertEquals("http://web.mygrid/", _CompleteResponse.getTypeDesc().getTypeNamespace());

    // Test case 10: getTypeDesc() returns the same TypeDesc object every time it is called
    assertSame(_CompleteResponse.getTypeDesc(), _CompleteResponse.getTypeDesc());
}
}