@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_AvailableJobsResponse.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_AvailableJobsResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return the same instance every time it is called
    assertSame(_AvailableJobsResponse.getTypeDesc(), _AvailableJobsResponse.getTypeDesc());

    // Test case 4: getTypeDesc() should have a valid XML type name
    assertEquals("AvailableJobsResponse", _AvailableJobsResponse.getTypeDesc().getXmlType().getLocalPart());

    // Test case 5: getTypeDesc() should have a valid XML namespace
    assertEquals("http://mygrid/web", _AvailableJobsResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 6: getTypeDesc() should have a valid SOAP encoding style
    assertEquals(org.apache.axis.Constants.URI_SOAP11_ENC, _AvailableJobsResponse.getTypeDesc().getXmlType().getEncodingStyle());

    // Test case 7: getTypeDesc() should have a valid SOAP binding style
    assertEquals(org.apache.axis.constants.Style.DOCUMENT, _AvailableJobsResponse.getTypeDesc().getXmlType().getStyle());

    // Test case 8: getTypeDesc() should have a valid SOAP use
    assertEquals(org.apache.axis.constants.Use.LITERAL, _AvailableJobsResponse.getTypeDesc().getXmlType().getUse());

    // Test case 9: getTypeDesc() should have a valid element description
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getElementDesc());

    // Test case 10: getTypeDesc() should have a valid type description
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getTypeDesc());
}
}