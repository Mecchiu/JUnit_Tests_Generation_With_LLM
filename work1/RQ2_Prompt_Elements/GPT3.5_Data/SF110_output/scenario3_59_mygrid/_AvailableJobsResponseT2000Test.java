@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() should not return null
    assertNotNull(_AvailableJobsResponse.getTypeDesc());

    // Test case 2: getTypeDesc() should return an instance of TypeDesc
    assertTrue(_AvailableJobsResponse.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() should return a TypeDesc object with the correct name
    assertEquals("AvailableJobsResponse", _AvailableJobsResponse.getTypeDesc().getXmlType().getLocalPart());

    // Test case 4: getTypeDesc() should return a TypeDesc object with the correct namespace
    assertEquals("http://mygrid/web/", _AvailableJobsResponse.getTypeDesc().getXmlType().getNamespaceURI());

    // Test case 5: getTypeDesc() should return a TypeDesc object with the correct serializer
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getSerializer(null, null));

    // Test case 6: getTypeDesc() should return a TypeDesc object with the correct deserializer
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getDeserializer(null, null));

    // Test case 7: getTypeDesc() should return a TypeDesc object with the correct type
    assertEquals(_AvailableJobsResponse.class, _AvailableJobsResponse.getTypeDesc().getTypeClass());

    // Test case 8: getTypeDesc() should return a TypeDesc object with the correct metadata
    assertNotNull(_AvailableJobsResponse.getTypeDesc().getElementDesc());

    // Test case 9: getTypeDesc() should return a TypeDesc object with the correct metadata for the response element
    assertEquals("return", _AvailableJobsResponse.getTypeDesc().getElementDesc().getName());

    // Test case 10: getTypeDesc() should return a TypeDesc object with the correct metadata for the response element type
    assertEquals(org.apache.axis.encoding.XMLType.AXIS_VOID, _AvailableJobsResponse.getTypeDesc().getElementDesc().getType());
}
}