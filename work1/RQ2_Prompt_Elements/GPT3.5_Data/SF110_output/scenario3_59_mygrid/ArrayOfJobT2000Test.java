@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(ArrayOfJob.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(ArrayOfJob.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should have a valid QName
    assertNotNull(ArrayOfJob.getTypeDesc().getXmlType());

    // Test case 4: getTypeDesc() should have a valid element name
    assertNotNull(ArrayOfJob.getTypeDesc().getElementName());

    // Test case 5: getTypeDesc() should have a valid type name
    assertNotNull(ArrayOfJob.getTypeDesc().getTypeName());

    // Test case 6: getTypeDesc() should have a valid namespace URI
    assertNotNull(ArrayOfJob.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 7: getTypeDesc() should have a valid namespace prefix
    assertNotNull(ArrayOfJob.getTypeDesc().getXmlType().getPrefix());

    // Test case 8: getTypeDesc() should have a valid namespace prefix
    assertEquals("ns1", ArrayOfJob.getTypeDesc().getXmlType().getPrefix());

    // Test case 9: getTypeDesc() should have a valid namespace URI
    assertEquals("http://mygrid.org.uk/", ArrayOfJob.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 10: getTypeDesc() should have a valid element name
    assertEquals("ArrayOfJob", ArrayOfJob.getTypeDesc().getElementName().getLocalPart());
}
}