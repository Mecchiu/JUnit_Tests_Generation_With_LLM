@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null TypeDesc object
    assertNotNull(_GetEngineResponse.getTypeDesc());

    // Test case 2: getTypeDesc() returns a TypeDesc object with the correct class name
    assertEquals("mygrid.web._GetEngineResponse", _GetEngineResponse.getTypeDesc().getXmlType().getLocalPart());

    // Test case 3: getTypeDesc() returns a TypeDesc object with the correct namespace URI
    assertEquals("http://web.mygrid/", _GetEngineResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 4: getTypeDesc() returns a TypeDesc object with the correct element name
    assertEquals("_getEngineResponse", _GetEngineResponse.getTypeDesc().getElementName().getLocalPart());

    // Test case 5: getTypeDesc() returns a TypeDesc object with the correct namespace URI for the element name
    assertEquals("http://web.mygrid/", _GetEngineResponse.getTypeDesc().getElementName().getNamespaceURI());

    // Test case 6: getTypeDesc() returns a TypeDesc object with the correct SOAP array type name
    assertEquals("mygrid.web._GetEngineResponse[]", _GetEngineResponse.getTypeDesc().getXmlType().getLocalPart() + "[]");

    // Test case 7: getTypeDesc() returns a TypeDesc object with the correct SOAP array type namespace URI
    assertEquals("http://web.mygrid/", _GetEngineResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 8: getTypeDesc() returns a TypeDesc object with the correct SOAP array element name
    assertEquals("_getEngineResponse", _GetEngineResponse.getTypeDesc().getXmlType().getLocalPart());

    // Test case 9: getTypeDesc() returns a TypeDesc object with the correct SOAP array element namespace URI
    assertEquals("http://web.mygrid/", _GetEngineResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 10: getTypeDesc() returns the same TypeDesc object every time it is called
    assertSame(_GetEngineResponse.getTypeDesc(), _GetEngineResponse.getTypeDesc());
}
}