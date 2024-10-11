@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_CompleteResponse.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_CompleteResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return the same instance every time it is called
    assertSame(_CompleteResponse.getTypeDesc(), _CompleteResponse.getTypeDesc());

    // Test case 4: getTypeDesc() should have a valid XML type name
    assertEquals("CompleteResponse", _CompleteResponse.getTypeDesc().getXmlType().getLocalPart());

    // Test case 5: getTypeDesc() should have a valid XML namespace
    assertEquals("http://mygrid/web", _CompleteResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 6: getTypeDesc() should have a valid SOAP encoding style
    assertEquals(org.apache.axis.Constants.URI_SOAP11_ENC, _CompleteResponse.getTypeDesc().getXmlType().getEncodingStyle());

    // Test case 7: getTypeDesc() should have a valid SOAP array type
    assertEquals("ArrayOfCompleteResponse", _CompleteResponse.getTypeDesc().getXmlType().getLocalPart() + "[]");

    // Test case 8: getTypeDesc() should have a valid SOAP array namespace
    assertEquals("http://mygrid/web", _CompleteResponse.getTypeDesc().getXmlType().getNamespaceURI() + "[]");

    // Test case 9: getTypeDesc() should have a valid SOAP array encoding style
    assertEquals(org.apache.axis.Constants.URI_SOAP11_ENC, _CompleteResponse.getTypeDesc().getXmlType().getEncodingStyle() + "[]");

    // Test case 10: getTypeDesc() should have a valid SOAP array type for a single instance
    assertEquals("CompleteResponse", _CompleteResponse.getTypeDesc().getXmlType().getLocalPart() + "[1]");

}
}