@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null TypeDesc object
    assertNotNull(ArrayOfString.getTypeDesc());

    // Test case 2: getTypeDesc() returns an instance of TypeDesc
    assertTrue(ArrayOfString.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() returns a TypeDesc object with the correct type name
    assertEquals("ArrayOfString", ArrayOfString.getTypeDesc().getTypeName());

    // Test case 4: getTypeDesc() returns a TypeDesc object with the correct namespace URI
    assertEquals("http://mygrid/web", ArrayOfString.getTypeDesc().getXmlTypeNamespaceURI());

    // Test case 5: getTypeDesc() returns a TypeDesc object with the correct namespace prefix
    assertEquals("ns1", ArrayOfString.getTypeDesc().getXmlTypePrefix());

    // Test case 6: getTypeDesc() returns a TypeDesc object with the correct element name
    assertEquals("ArrayOfString", ArrayOfString.getTypeDesc().getElementName());

    // Test case 7: getTypeDesc() returns a TypeDesc object with the correct element namespace URI
    assertEquals("http://mygrid/web", ArrayOfString.getTypeDesc().getElementQName().getNamespaceURI());

    // Test case 8: getTypeDesc() returns a TypeDesc object with the correct element local part
    assertEquals("ArrayOfString", ArrayOfString.getTypeDesc().getElementQName().getLocalPart());

    // Test case 9: getTypeDesc() returns a TypeDesc object with the correct element QName
    assertEquals("{http://mygrid/web}ArrayOfString", ArrayOfString.getTypeDesc().getElementQName().toString());

    // Test case 10: getTypeDesc() returns a TypeDesc object with the correct XML type
    assertEquals(org.apache.axis.encoding.ser.ArraySerializerFactory.class, ArrayOfString.getTypeDesc().getXmlType());
}
}