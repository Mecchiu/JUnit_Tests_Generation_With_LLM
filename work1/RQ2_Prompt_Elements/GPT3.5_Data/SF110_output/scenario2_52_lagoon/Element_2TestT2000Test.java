// Test case 1: Test with valid index
@Test
void testGetAttributeNamespaceURI_validIndex() {
    Element element = new Element();
    element.addAttribute("prefix^uri", "name", "value");
    String namespaceURI = element.getAttributeNamespaceURI(0);
    assertEquals("uri", namespaceURI);
}

// Test case 2: Test with invalid index
@Test
void testGetAttributeNamespaceURI_invalidIndex() {
    Element element = new Element();
    element.addAttribute("prefix^uri", "name", "value");
    assertThrows(IndexOutOfBoundsException.class, () -> {
        element.getAttributeNamespaceURI(1);
    });
}

// Test case 3: Test with empty namespace URI
@Test
void testGetAttributeNamespaceURI_emptyNamespaceURI() {
    Element element = new Element();
    element.addAttribute("prefix^", "name", "value");
    String namespaceURI = element.getAttributeNamespaceURI(0);
    assertEquals("", namespaceURI);
}

// Test case 4: Test with null namespace URI
@Test
void testGetAttributeNamespaceURI_nullNamespaceURI() {
    Element element = new Element();
    String namespaceURI = element.getAttributeNamespaceURI(-1);
    assertNull(namespaceURI);
}

// Test case 5: Test with multiple attributes
@Test
void testGetAttributeNamespaceURI_multipleAttributes() {
    Element element = new Element();
    element.addAttribute("prefix^uri1", "name1", "value1");
    element.addAttribute("prefix^uri2", "name2", "value2");
    String namespaceURI1 = element.getAttributeNamespaceURI(0);
    String namespaceURI2 = element.getAttributeNamespaceURI(1);
    assertEquals("uri1", namespaceURI1);
    assertEquals("uri2", namespaceURI2);
}

// Test case 6: Test with attribute without namespace URI
@Test
void testGetAttributeNamespaceURI_noNamespaceURI() {
    Element element = new Element();
    element.addAttribute("name", "value");
    String namespaceURI = element.getAttributeNamespaceURI(0);
    assertNull(namespaceURI);
}

// Test case 7: Test with attribute with no prefix
@Test
void testGetAttributeNamespaceURI_noPrefix() {
    Element element = new Element();
    element.addAttribute("^uri", "name", "value");
    String namespaceURI = element.getAttributeNamespaceURI(0);
    assertEquals("uri", namespaceURI);
}

// Test case 8: Test with attribute with no name
@Test
void testGetAttributeNamespaceURI_noName() {
    Element element = new Element();
    element.addAttribute("prefix^uri", "", "value");
    String namespaceURI = element.getAttributeNamespaceURI(0);
    assertEquals("uri", namespaceURI);
}

// Test case 9: Test with attribute with no value
@Test
void testGetAttributeNamespaceURI_noValue() {
    Element element = new Element();
    element.addAttribute("prefix^uri", "name", "");
    String namespaceURI = element.getAttributeNamespaceURI(0);
    assertEquals("uri", namespaceURI);
}

// Test case 10: Test with attribute with no prefix and no name
@Test
void testGetAttributeNamespaceURI_noPrefixAndNoName() {
    Element element = new Element();
    element.addAttribute("^uri", "", "value");
    String namespaceURI = element.getAttributeNamespaceURI(0);
    assertEquals("uri", namespaceURI);
}