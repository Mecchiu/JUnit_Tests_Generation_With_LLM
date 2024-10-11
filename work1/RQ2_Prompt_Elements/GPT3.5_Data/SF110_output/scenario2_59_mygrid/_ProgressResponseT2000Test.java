@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_ProgressResponse.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_ProgressResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return the same instance every time it is called
    assertSame(_ProgressResponse.getTypeDesc(), _ProgressResponse.getTypeDesc());

    // Test case 4: getTypeDesc() should have a valid XML type name
    assertEquals("ProgressResponse", _ProgressResponse.getTypeDesc().getXmlType().getLocalPart());

    // Test case 5: getTypeDesc() should have a valid XML namespace
    assertEquals("http://mygrid/web", _ProgressResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 6: getTypeDesc() should have a valid SOAP encoding style
    assertEquals(org.apache.axis.Constants.URI_SOAP11_ENC, _ProgressResponse.getTypeDesc().getXmlType().getEncodingStyle());

    // Test case 7: getTypeDesc() should have one element descriptor
    assertEquals(1, _ProgressResponse.getTypeDesc().getElementDescs().length);

    // Test case 8: getTypeDesc() should have an element descriptor with a valid name
    assertEquals("return", _ProgressResponse.getTypeDesc().getElementDescs()[0].getXmlName().getLocalPart());

    // Test case 9: getTypeDesc() should have an element descriptor with a valid type
    assertEquals(org.apache.axis.encoding.XMLType.AXIS_VOID, _ProgressResponse.getTypeDesc().getElementDescs()[0].getType());

    // Test case 10: getTypeDesc() should have an element descriptor with a valid minOccurs value
    assertEquals(0, _ProgressResponse.getTypeDesc().getElementDescs()[0].getMinOccurs());
}
}