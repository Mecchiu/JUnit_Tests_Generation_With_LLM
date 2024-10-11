@Test
void testGetTypeDesc() {
    // Test case 1: getTypeDesc() returns a non-null TypeDesc object
    assertNotNull(SearchResult.getTypeDesc());

    // Test case 2: getTypeDesc() returns an instance of TypeDesc
    assertTrue(SearchResult.getTypeDesc() instanceof org.apache.axis.description.TypeDesc);

    // Test case 3: getTypeDesc() returns a TypeDesc object with the correct type name
    assertEquals("SearchResult", SearchResult.getTypeDesc().getTypeName());

    // Test case 4: getTypeDesc() returns a TypeDesc object with the correct namespace URI
    assertEquals("http://org.merlot.fedsearch/type", SearchResult.getTypeDesc().getXmlTypeNamespaceURI());

    // Test case 5: getTypeDesc() returns a TypeDesc object with the correct namespace prefix
    assertEquals("ns1", SearchResult.getTypeDesc().getXmlTypePrefix());

    // Test case 6: getTypeDesc() returns a TypeDesc object with the correct element name
    assertEquals("searchResult", SearchResult.getTypeDesc().getElementName());

    // Test case 7: getTypeDesc() returns a TypeDesc object with the correct element namespace URI
    assertEquals("http://org.merlot.fedsearch/type", SearchResult.getTypeDesc().getXmlTypeNamespaceURI());

    // Test case 8: getTypeDesc() returns a TypeDesc object with the correct element namespace prefix
    assertEquals("ns1", SearchResult.getTypeDesc().getXmlTypePrefix());

    // Test case 9: getTypeDesc() returns a TypeDesc object with the correct serializer/deserializer class
    assertEquals(org.apache.axis.encoding.ser.BeanSerializer.class, SearchResult.getTypeDesc().getSerializerClass());
    assertEquals(org.apache.axis.encoding.ser.BeanDeserializer.class, SearchResult.getTypeDesc().getDeserializerClass());

    // Test case 10: getTypeDesc() returns a TypeDesc object with the correct fields
    assertEquals(0, SearchResult.getTypeDesc().getFields().length);
}
}