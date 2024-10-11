// Here's an example implementation of the test cases for the Element class:

@Test
void testGetAttributeNamespaceURI() {
    // Create a new Element object with some attributes
    Element element = new Element();
    element.addAttribute("attr1", "value1", "namespace1");
    element.addAttribute("attr2", "value2", "namespace2");
    element.addAttribute("attr3", "value3", "namespace3");

    // Test getting the namespace URI of the first attribute
    assertEquals("namespace1", element.getAttributeNamespaceURI(0));

    // Test getting the namespace URI of the second attribute
    assertEquals("namespace2", element.getAttributeNamespaceURI(1));

    // Test getting the namespace URI of the third attribute
    assertEquals("namespace3", element.getAttributeNamespaceURI(2));

    // Test getting the namespace URI of an attribute that doesn't exist
    assertThrows(IndexOutOfBoundsException.class, () -> {
        element.getAttributeNamespaceURI(3);
    });

    // Test getting the namespace URI of an attribute with a null name
    element.addAttribute(null, "value4", "namespace4");
    assertEquals("namespace4", element.getAttributeNamespaceURI(3));

    // Test getting the namespace URI of an attribute with a null namespace URI
    element.addAttribute("attr5", "value5", null);
    assertNull(element.getAttributeNamespaceURI(4));

    // Test getting the namespace URI of an attribute with a name that doesn't contain a namespace separator
    element.addAttribute("attr6", "value6", "");
    assertEquals("", element.getAttributeNamespaceURI(5));

    // Test getting the namespace URI of an attribute with a name that contains multiple namespace separators
    element.addAttribute("attr7^ns1^ns2", "value7", "namespace7");
    assertEquals("ns1^ns2", element.getAttributeNamespaceURI(6));

    // Test getting the namespace URI of an attribute with a name that starts with a namespace separator
    element.addAttribute("^ns3^ns4", "value8", "namespace8");
    assertEquals("ns3^ns4", element.getAttributeNamespaceURI(7));

    // Test getting the namespace URI of an attribute with a name that ends with a namespace separator
    element.addAttribute("attr9^ns5^", "value9", "namespace9");
    assertEquals("ns5^", element.getAttributeNamespaceURI(8));
}
}