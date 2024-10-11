@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_LogonResponse.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_LogonResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return the same instance every time it is called
    assertSame(_LogonResponse.getTypeDesc(), _LogonResponse.getTypeDesc());

    // Test case 4: getTypeDesc() should have a valid XML type name
    assertNotNull(_LogonResponse.getTypeDesc().getXmlType());

    // Test case 5: getTypeDesc() should have a valid SOAP encoding style
    assertNotNull(_LogonResponse.getTypeDesc().getXmlType().getSoapEncodingStyle());

    // Test case 6: getTypeDesc() should have a valid namespace URI
    assertNotNull(_LogonResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 7: getTypeDesc() should have a valid Java class name
    assertNotNull(_LogonResponse.getTypeDesc().getJavaType());

    // Test case 8: getTypeDesc() should have a valid serializer
    assertNotNull(_LogonResponse.getTypeDesc().getSerializer(null, null, null));

    // Test case 9: getTypeDesc() should have a valid deserializer
    assertNotNull(_LogonResponse.getTypeDesc().getDeserializer(null, null, null));

    // Test case 10: getTypeDesc() should have a valid type mapping
    assertNotNull(_LogonResponse.getTypeDesc().getTypeMapping(null));
}
}