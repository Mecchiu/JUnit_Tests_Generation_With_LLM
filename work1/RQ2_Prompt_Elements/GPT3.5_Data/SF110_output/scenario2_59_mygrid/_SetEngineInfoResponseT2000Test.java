@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_SetEngineInfoResponse.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_SetEngineInfoResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return the same instance every time it is called
    assertSame(_SetEngineInfoResponse.getTypeDesc(), _SetEngineInfoResponse.getTypeDesc());

    // Test case 4: getTypeDesc() should have a valid XML type name
    assertEquals("SetEngineInfoResponse", _SetEngineInfoResponse.getTypeDesc().getXmlType());

    // Test case 5: getTypeDesc() should have a valid SOAP encoding style
    assertEquals(org.apache.axis.Constants.URI_SOAP11_ENC, _SetEngineInfoResponse.getTypeDesc().getXmlEncoding());

    // Test case 6: getTypeDesc() should have a valid SOAP element namespace
    assertEquals("http://mygrid/web", _SetEngineInfoResponse.getTypeDesc().getXmlName().getNamespaceURI());

    // Test case 7: getTypeDesc() should have a valid SOAP element local name
    assertEquals("SetEngineInfoResponse", _SetEngineInfoResponse.getTypeDesc().getXmlName().getLocalPart());

    // Test case 8: getTypeDesc() should have a valid SOAP element QName
    assertEquals(new javax.xml.namespace.QName("http://mygrid/web", "SetEngineInfoResponse"), _SetEngineInfoResponse.getTypeDesc().getXmlName());

    // Test case 9: getTypeDesc() should have a valid SOAP element type
    assertEquals(org.apache.axis.encoding.ser.BeanSerializerFactory.class, _SetEngineInfoResponse.getTypeDesc().getSerializerClass());

    // Test case 10: getTypeDesc() should have a valid SOAP element type
    assertEquals(org.apache.axis.encoding.ser.BeanDeserializerFactory.class, _SetEngineInfoResponse.getTypeDesc().getDeserializerClass());
}
}