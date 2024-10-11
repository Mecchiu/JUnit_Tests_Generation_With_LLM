@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null object
    assertNotNull(_Progress.getTypeDesc());

    // Test case 2: getTypeDesc() returns an object of TypeDesc class
    assertTrue(_Progress.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() returns an object with correct type name
    assertEquals("Progress", _Progress.getTypeDesc().getTypeName());

    // Test case 4: getTypeDesc() returns an object with correct namespace URI
    assertEquals("http://mygrid/web", _Progress.getTypeDesc().getXmlTypeNamespaceURI());

    // Test case 5: getTypeDesc() returns an object with correct namespace prefix
    assertEquals("ns1", _Progress.getTypeDesc().getXmlTypePrefix());

    // Test case 6: getTypeDesc() returns an object with correct element name
    assertEquals("progress", _Progress.getTypeDesc().getElementName());

    // Test case 7: getTypeDesc() returns an object with correct serializer factory class name
    assertEquals("org.apache.axis.encoding.ser.BeanSerializerFactory", _Progress.getTypeDesc().getSerializerFactory().getClass().getName());

    // Test case 8: getTypeDesc() returns an object with correct deserializer factory class name
    assertEquals("org.apache.axis.encoding.ser.BeanDeserializerFactory", _Progress.getTypeDesc().getDeserializerFactory().getClass().getName());

    // Test case 9: getTypeDesc() returns an object with correct type mapping class
    assertEquals(org.apache.axis.encoding.ser.BeanSerializer.class, _Progress.getTypeDesc().getTypeMapping(org.apache.axis.encoding.SerializationContext.getSerializationContext()).getSerializerClass());

    // Test case 10: getTypeDesc() returns an object with correct deserializer class
    assertEquals(org.apache.axis.encoding.ser.BeanDeserializer.class, _Progress.getTypeDesc().getTypeMapping(org.apache.axis.encoding.SerializationContext.getSerializationContext()).getDeserializerClass());
    }
}