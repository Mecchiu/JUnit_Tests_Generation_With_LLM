@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null object
    assertNotNull(_AvailableJobs.getTypeDesc());

    // Test case 2: getTypeDesc() returns an object of TypeDesc class
    assertTrue(_AvailableJobs.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() returns an object with correct type name
    assertEquals("AvailableJobs", _AvailableJobs.getTypeDesc().getTypeName());

    // Test case 4: getTypeDesc() returns an object with correct namespace URI
    assertEquals("http://mygrid/web", _AvailableJobs.getTypeDesc().getXmlTypeNamespaceURI());

    // Test case 5: getTypeDesc() returns an object with correct element name
    assertEquals("availableJobs", _AvailableJobs.getTypeDesc().getXmlTypeLocalName());

    // Test case 6: getTypeDesc() returns an object with correct element namespace URI
    assertEquals("http://mygrid/web", _AvailableJobs.getTypeDesc().getXmlTypeNamespaceURI());

    // Test case 7: getTypeDesc() returns an object with correct element type
    assertEquals(org.apache.axis.encoding.ser.BeanSerializer.class, _AvailableJobs.getTypeDesc().getSerializerClass());

    // Test case 8: getTypeDesc() returns an object with correct element type
    assertEquals(org.apache.axis.encoding.ser.BeanDeserializer.class, _AvailableJobs.getTypeDesc().getDeserializerClass());

    // Test case 9: getTypeDesc() returns an object with correct element type
    assertEquals(_AvailableJobs.class, _AvailableJobs.getTypeDesc().getJavaType());

    // Test case 10: getTypeDesc() returns an object with correct element type
    assertTrue(_AvailableJobs.getTypeDesc().isElement());
}
}