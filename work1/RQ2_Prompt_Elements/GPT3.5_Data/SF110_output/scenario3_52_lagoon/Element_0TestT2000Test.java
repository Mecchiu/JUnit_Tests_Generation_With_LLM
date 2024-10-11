// Test case 1: Test with valid namespaceURI and localName
@Test
void testLookupAttribute_valid() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns", "attr", "value");
    int index = element.lookupAttribute("http://example.com/ns", "attr");
    assertEquals(0, index);
}

// Test case 2: Test with invalid namespaceURI and valid localName
@Test
void testLookupAttribute_invalidNamespaceURI() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns", "attr", "value");
    int index = element.lookupAttribute("http://invalid.com/ns", "attr");
    assertEquals(-1, index);
}

// Test case 3: Test with valid namespaceURI and invalid localName
@Test
void testLookupAttribute_invalidLocalName() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns", "attr", "value");
    int index = element.lookupAttribute("http://example.com/ns", "invalid");
    assertEquals(-1, index);
}

// Test case 4: Test with empty namespaceURI and valid localName
@Test
void testLookupAttribute_emptyNamespaceURI() {
    Element element = new Element();
    element.addAttribute("", "attr", "value");
    int index = element.lookupAttribute("", "attr");
    assertEquals(0, index);
}

// Test case 5: Test with valid namespaceURI and empty localName
@Test
void testLookupAttribute_emptyLocalName() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns", "", "value");
    int index = element.lookupAttribute("http://example.com/ns", "");
    assertEquals(0, index);
}

// Test case 6: Test with multiple attributes with same name
@Test
void testLookupAttribute_multipleAttributes() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns", "attr", "value1");
    element.addAttribute("http://example.com/ns", "attr", "value2");
    int index = element.lookupAttribute("http://example.com/ns", "attr");
    assertEquals(0, index);
}

// Test case 7: Test with no attributes
@Test
void testLookupAttribute_noAttributes() {
    Element element = new Element();
    int index = element.lookupAttribute("http://example.com/ns", "attr");
    assertEquals(-1, index);
}

// Test case 8: Test with null namespaceURI
@Test
void testLookupAttribute_nullNamespaceURI() {
    Element element = new Element();
    element.addAttribute(null, "attr", "value");
    int index = element.lookupAttribute(null, "attr");
    assertEquals(0, index);
}

// Test case 9: Test with null localName
@Test
void testLookupAttribute_nullLocalName() {
    Element element = new Element();
    element.addAttribute("http://example.com/ns", null, "value");
    int index = element.lookupAttribute("http://example.com/ns", null);
    assertEquals(0, index);
}

// Test case 10: Test with null namespaceURI and localName
@Test
void testLookupAttribute_nullNamespaceURIAndLocalName() {
    Element element = new Element();
    element.addAttribute(null, null, "value");
    int index = element.lookupAttribute(null, null);
    assertEquals(0, index);
}