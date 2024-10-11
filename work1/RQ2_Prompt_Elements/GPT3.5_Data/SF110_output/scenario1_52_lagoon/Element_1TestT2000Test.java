@Test
void testNumberOfAttributesWithNoAttributes() {
    Element element = new Element("test");
    assertEquals(0, element.numberOfAttributes());
}

@Test
void testNumberOfAttributesWithOneAttribute() {
    Element element = new Element("test");
    element.addAttribute("attr1", "value1");
    assertEquals(1, element.numberOfAttributes());
}

@Test
void testNumberOfAttributesWithMultipleAttributes() {
    Element element = new Element("test");
    element.addAttribute("attr1", "value1");
    element.addAttribute("attr2", "value2");
    element.addAttribute("attr3", "value3");
    assertEquals(3, element.numberOfAttributes());
}

@Test
void testNumberOfAttributesWithDuplicateAttributes() {
    Element element = new Element("test");
    element.addAttribute("attr1", "value1");
    element.addAttribute("attr1", "value2");
    assertEquals(1, element.numberOfAttributes());
}

@Test
void testNumberOfAttributesWithNamespaceAttributes() {
    Element element = new Element("test");
    element.addAttribute("xmlns", "http://www.example.com");
    element.addAttribute("xmlns:foo", "http://www.example.com/foo");
    assertEquals(2, element.numberOfAttributes());
}

@Test
void testNumberOfAttributesWithNullAttributes() {
    Element element = new Element("test");
    element.addAttribute(null, null);
    assertEquals(1, element.numberOfAttributes());
}

@Test
void testNumberOfAttributesWithEmptyAttributes() {
    Element element = new Element("test");
    element.addAttribute("", "");
    assertEquals(1, element.numberOfAttributes());
}

@Test
void testNumberOfAttributesWithWhitespaceAttributes() {
    Element element = new Element("test");
    element.addAttribute("   ", "   ");
    assertEquals(1, element.numberOfAttributes());
}

@Test
void testNumberOfAttributesWithMixedAttributes() {
    Element element = new Element("test");
    element.addAttribute("attr1", "value1");
    element.addAttribute(null, null);
    element.addAttribute("", "");
    element.addAttribute("attr2", "value2");
    element.addAttribute("   ", "   ");
    assertEquals(3, element.numberOfAttributes());
}

@Test
void testNumberOfAttributesWithSpecialCharacters() {
    Element element = new Element("test");
    element.addAttribute("attr1", "<>&\"'");
    assertEquals(1, element.numberOfAttributes());
}
}