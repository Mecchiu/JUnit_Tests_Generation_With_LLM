@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null TypeDesc object
    assertNotNull(ArrayOfJob.getTypeDesc());

    // Test case 2: getTypeDesc() returns an instance of TypeDesc
    assertTrue(ArrayOfJob.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() returns a TypeDesc object with the correct type name
    assertEquals("ArrayOfJob", ArrayOfJob.getTypeDesc().getXmlType().getLocalPart());

    // Test case 4: getTypeDesc() returns a TypeDesc object with the correct namespace URI
    assertEquals("http://mygrid/web", ArrayOfJob.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 5: getTypeDesc() returns a TypeDesc object with the correct element name
    assertEquals("ArrayOfJob", ArrayOfJob.getTypeDesc().getElementName());

    // Test case 6: getTypeDesc() returns a TypeDesc object with the correct element namespace URI
    assertEquals("http://mygrid/web", ArrayOfJob.getTypeDesc().getElementQName().getNamespaceURI());

    // Test case 7: getTypeDesc() returns a TypeDesc object with the correct element local name
    assertEquals("ArrayOfJob", ArrayOfJob.getTypeDesc().getElementQName().getLocalPart());

    // Test case 8: getTypeDesc() returns a TypeDesc object with the correct type class
    assertEquals(ArrayOfJob.class, ArrayOfJob.getTypeDesc().getTypeClass());

    // Test case 9: getTypeDesc() returns a TypeDesc object with the correct serializer class
    assertEquals(org.apache.axis.encoding.ser.BeanSerializer.class, ArrayOfJob.getTypeDesc().getSerializerClass());

    // Test case 10: getTypeDesc() returns a TypeDesc object with the correct deserializer class
    assertEquals(org.apache.axis.encoding.ser.BeanDeserializer.class, ArrayOfJob.getTypeDesc().getDeserializerClass());
}
}