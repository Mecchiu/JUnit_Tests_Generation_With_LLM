@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_LogonResponse.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_LogonResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return a TypeDesc object with the correct type name
    assertEquals("LogonResponse", _LogonResponse.getTypeDesc().getTypeName());

    // Test case 4: getTypeDesc() should return a TypeDesc object with the correct namespace URI
    assertEquals("http://mygrid/web", _LogonResponse.getTypeDesc().getXmlTypeNamespaceURI());

    // Test case 5: getTypeDesc() should return a TypeDesc object with the correct namespace prefix
    assertEquals("ns1", _LogonResponse.getTypeDesc().getXmlTypePrefix());

    // Test case 6: getTypeDesc() should return a TypeDesc object with the correct element name
    assertEquals("logonResponse", _LogonResponse.getTypeDesc().getElementName());

    // Test case 7: getTypeDesc() should return a TypeDesc object with the correct element namespace URI
    assertEquals("http://mygrid/web", _LogonResponse.getTypeDesc().getElementQName().getNamespaceURI());

    // Test case 8: getTypeDesc() should return a TypeDesc object with the correct element namespace prefix
    assertEquals("ns1", _LogonResponse.getTypeDesc().getElementQName().getPrefix());

    // Test case 9: getTypeDesc() should return a TypeDesc object with the correct element local name
    assertEquals("logonResponse", _LogonResponse.getTypeDesc().getElementQName().getLocalPart());

    // Test case 10: getTypeDesc() should return a TypeDesc object with the correct type serializer
    assertEquals(org.apache.axis.encoding.ser.BeanSerializer.class, _LogonResponse.getTypeDesc().getSerializerClass());
}
}