// Test case 1: Test with valid index
@Test
void testGetAttributeNamespaceURI_validIndex() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns", "attr", "value");
    String namespaceURI = element.getAttributeNamespaceURI(0);
    assertEquals("http://example.com/ns", namespaceURI);
}

// Test case 2: Test with invalid index
@Test
void testGetAttributeNamespaceURI_invalidIndex() {
    Element element = new Element();
    assertThrows(IndexOutOfBoundsException.class, () -> {
        element.getAttributeNamespaceURI(-1);
    });
}

// Test case 3: Test with no attributes
@Test
void testGetAttributeNamespaceURI_noAttributes() {
    Element element = new Element();
    assertThrows(IndexOutOfBoundsException.class, () -> {
        element.getAttributeNamespaceURI(0);
    });
}

// Test case 4: Test with multiple attributes
@Test
void testGetAttributeNamespaceURI_multipleAttributes() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns1", "attr1", "value1");
    element.addAttribute("http://example.com/ns2", "attr2", "value2");
    String namespaceURI = element.getAttributeNamespaceURI(1);
    assertEquals("http://example.com/ns2", namespaceURI);
}

// Test case 5: Test with null namespace URI
@Test
void testGetAttributeNamespaceURI_nullNamespaceURI() {
    Element element = new Element();
    element.addAttribute(null, "attr", "value");
    String namespaceURI = element.getAttributeNamespaceURI(0);
    assertNull(namespaceURI);
}

// Test case 6: Test with empty namespace URI
@Test
void testGetAttributeNamespaceURI_emptyNamespaceURI() {
    Element element = new Element();
    element.addAttribute("", "attr", "value");
    String namespaceURI = element.getAttributeNamespaceURI(0);
    assertEquals("", namespaceURI);
}

// Test case 7: Test with multiple attributes with same namespace URI
@Test
void testGetAttributeNamespaceURI_multipleAttributesSameNamespaceURI() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns", "attr1", "value1");
    element.addAttribute("http://example.com/ns", "attr2", "value2");
    String namespaceURI = element.getAttributeNamespaceURI(1);
    assertEquals("http://example.com/ns", namespaceURI);
}

// Test case 8: Test with multiple attributes with different namespace URIs
@Test
void testGetAttributeNamespaceURI_multipleAttributesDifferentNamespaceURIs() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns1", "attr1", "value1");
    element.addAttribute("http://example.com/ns2", "attr2", "value2");
    String namespaceURI = element.getAttributeNamespaceURI(1);
    assertEquals("http://example.com/ns2", namespaceURI);
}

// Test case 9: Test with index out of bounds
@Test
void testGetAttributeNamespaceURI_indexOutOfBounds() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns", "attr", "value");
    assertThrows(IndexOutOfBoundsException.class, () -> {
        element.getAttributeNamespaceURI(1);
    });
}

// Test case 10: Test with negative index
@Test
void testGetAttributeNamespaceURI_negativeIndex() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns", "attr", "value");
    assertThrows(IndexOutOfBoundsException.class, () -> {
        element.getAttributeNamespaceURI(-2);
    });
}