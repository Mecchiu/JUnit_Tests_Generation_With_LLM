@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null TypeDesc object
    assertNotNull(_Request.getTypeDesc());

    // Test case 2: getTypeDesc() returns a TypeDesc object with the correct class name
    assertEquals("mygrid.web._Request", _Request.getTypeDesc().getXmlType().getLocalPart());

    // Test case 3: getTypeDesc() returns a TypeDesc object with the correct namespace URI
    assertEquals("http://mygrid/web", _Request.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 4: getTypeDesc() returns a TypeDesc object with the correct element name
    assertEquals("request", _Request.getTypeDesc().getElementName());

    // Test case 5: getTypeDesc() returns a TypeDesc object with the correct element namespace URI
    assertEquals("http://mygrid/web", _Request.getTypeDesc().getElementQName().getNamespaceURI());

    // Test case 6: getTypeDesc() returns a TypeDesc object with the correct element local part
    assertEquals("request", _Request.getTypeDesc().getElementQName().getLocalPart());

    // Test case 7: getTypeDesc() returns a TypeDesc object with the correct type name
    assertEquals("Request", _Request.getTypeDesc().getTypeName());

    // Test case 8: getTypeDesc() returns a TypeDesc object with the correct type namespace URI
    assertEquals("http://mygrid/web", _Request.getTypeDesc().getTypeQName().getNamespaceURI());

    // Test case 9: getTypeDesc() returns a TypeDesc object with the correct type local part
    assertEquals("Request", _Request.getTypeDesc().getTypeQName().getLocalPart());

    // Test case 10: getTypeDesc() returns the same TypeDesc object every time it is called
    assertSame(_Request.getTypeDesc(), _Request.getTypeDesc());
}
}