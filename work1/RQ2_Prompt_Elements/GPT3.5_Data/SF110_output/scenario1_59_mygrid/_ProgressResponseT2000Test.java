@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_ProgressResponse.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_ProgressResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return the same instance every time it is called
    assertSame(_ProgressResponse.getTypeDesc(), _ProgressResponse.getTypeDesc());

    // Test case 4: getTypeDesc() should have a valid XML type name
    assertNotNull(_ProgressResponse.getTypeDesc().getXmlType());

    // Test case 5: getTypeDesc() should have a valid XML namespace
    assertNotNull(_ProgressResponse.getTypeDesc().getXmlTypeNamespaceURI());

    // Test case 6: getTypeDesc() should have a valid SOAP encoding style
    assertNotNull(_ProgressResponse.getTypeDesc().getXmlTypeEncoding());

    // Test case 7: getTypeDesc() should have a valid SOAP array name
    assertNotNull(_ProgressResponse.getTypeDesc().getXmlTypeArrayName());

    // Test case 8: getTypeDesc() should have a valid SOAP array namespace
    assertNotNull(_ProgressResponse.getTypeDesc().getXmlTypeArrayNamespaceURI());

    // Test case 9: getTypeDesc() should have a valid SOAP array encoding style
    assertNotNull(_ProgressResponse.getTypeDesc().getXmlTypeArrayEncoding());

    // Test case 10: getTypeDesc() should have a valid SOAP array type
    assertNotNull(_ProgressResponse.getTypeDesc().getXmlTypeArrayItemType());
}
}