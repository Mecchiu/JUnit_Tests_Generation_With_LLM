@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_AvailableJobsResponse.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_AvailableJobsResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return the same instance every time it is called
    assertSame(_AvailableJobsResponse.getTypeDesc(), _AvailableJobsResponse.getTypeDesc());

    // Test case 4: getTypeDesc() should have a valid XML type name
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getXmlType());

    // Test case 5: getTypeDesc() should have a valid XML namespace URI
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 6: getTypeDesc() should have a valid Java class name
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getJavaType());

    // Test case 7: getTypeDesc() should have a valid SOAP encoding style
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getXmlType().getEncodingStyle());

    // Test case 8: getTypeDesc() should have a valid SOAP array name
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getXmlType().getLocalPart());

    // Test case 9: getTypeDesc() should have a valid SOAP array namespace URI
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 10: getTypeDesc() should have a valid SOAP array type name
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getXmlType().getPrefix());
}
}