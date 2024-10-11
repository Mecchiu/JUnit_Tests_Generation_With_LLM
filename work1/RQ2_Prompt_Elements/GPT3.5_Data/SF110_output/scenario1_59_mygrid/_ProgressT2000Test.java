@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null TypeDesc object
    assertNotNull(_Progress.getTypeDesc());

    // Test case 2: getTypeDesc() returns an instance of TypeDesc
    assertTrue(_Progress.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() returns a TypeDesc object with the correct type name
    assertEquals("Progress", _Progress.getTypeDesc().getXmlType().getLocalPart());

    // Test case 4: getTypeDesc() returns a TypeDesc object with the correct namespace URI
    assertEquals("http://mygrid/web", _Progress.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 5: getTypeDesc() returns a TypeDesc object with the correct element name
    assertEquals("progress", _Progress.getTypeDesc().getElementName().getLocalPart());

    // Test case 6: getTypeDesc() returns a TypeDesc object with the correct namespace URI
    assertEquals("http://mygrid/web", _Progress.getTypeDesc().getElementName().getNamespaceURI());

    // Test case 7: getTypeDesc() returns a TypeDesc object with the correct serializer class name
    assertEquals("_ProgressSerializer", _Progress.getTypeDesc().getSerializerClass().getName());

    // Test case 8: getTypeDesc() returns a TypeDesc object with the correct deserializer class name
    assertEquals("_ProgressDeserializer", _Progress.getTypeDesc().getDeserializerClass().getName());

    // Test case 9: getTypeDesc() returns a TypeDesc object with the correct type mapping
    assertEquals(org.apache.axis.encoding.ser.BeanSerializerFactory.class, _Progress.getTypeDesc().getTypeMapping().getSerializer(_Progress.class).getClass());
    assertEquals(org.apache.axis.encoding.ser.BeanDeserializerFactory.class, _Progress.getTypeDesc().getTypeMapping().getDeserializer(_Progress.class).getClass());

    // Test case 10: getTypeDesc() returns the same TypeDesc object every time it is called
    assertSame(_Progress.getTypeDesc(), _Progress.getTypeDesc());
}
}