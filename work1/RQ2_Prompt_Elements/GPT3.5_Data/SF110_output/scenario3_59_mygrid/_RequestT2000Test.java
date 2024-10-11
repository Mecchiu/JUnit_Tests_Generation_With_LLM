@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_Request.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_Request.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return a TypeDesc object with the correct type name
    assertEquals("Request", _Request.getTypeDesc().getXmlType().getLocalPart());

    // Test case 4: getTypeDesc() should return a TypeDesc object with the correct namespace URI
    assertEquals("http://mygrid/web", _Request.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 5: getTypeDesc() should return a TypeDesc object with the correct element name
    assertEquals("request", _Request.getTypeDesc().getElementName().getLocalPart());

    // Test case 6: getTypeDesc() should return a TypeDesc object with the correct element namespace URI
    assertEquals("http://mygrid/web", _Request.getTypeDesc().getElementName().getNamespaceURI());

    // Test case 7: getTypeDesc() should return a TypeDesc object with the correct serializer class name
    assertEquals("mygrid.web._RequestSerializer", _Request.getTypeDesc().getSerializerClass().getName());

    // Test case 8: getTypeDesc() should return a TypeDesc object with the correct deserializer class name
    assertEquals("mygrid.web._RequestDeserializer", _Request.getTypeDesc().getDeserializerClass().getName());

    // Test case 9: getTypeDesc() should return a TypeDesc object with the correct type mapping
    assertEquals(org.apache.axis.encoding.ser.BeanSerializerFactory.class, _Request.getTypeDesc().getTypeMapping().getSerializer(_Request.class).getClass());
    assertEquals(org.apache.axis.encoding.ser.BeanDeserializerFactory.class, _Request.getTypeDesc().getTypeMapping().getDeserializer(_Request.class).getClass());

    // Test case 10: getTypeDesc() should return a TypeDesc object with the correct property descriptors
    assertEquals(0, _Request.getTypeDesc().getPropertyDescriptors().length);
}
}