// Test case 1: Test if method returns null for empty path
@Test
public void testGetElement_emptyPath() {
    XmlElement element = new XmlElement();
    assertNull(element.getElement(""));
}

// Test case 2: Test if method returns null for non-existent element
@Test
public void testGetElement_nonExistentElement() {
    XmlElement element = new XmlElement();
    assertNull(element.getElement("nonExistent"));
}

// Test case 3: Test if method returns correct element for single level path
@Test
public void testGetElement_singleLevelPath() {
    XmlElement element = new XmlElement();
    XmlElement subElement = new XmlElement();
    subElement.setName("subElement");
    element.addSubElement(subElement);
    assertEquals(subElement, element.getElement("subElement"));
}

// Test case 4: Test if method returns correct element for multi-level path
@Test
public void testGetElement_multiLevelPath() {
    XmlElement element = new XmlElement();
    XmlElement subElement1 = new XmlElement();
    subElement1.setName("subElement1");
    XmlElement subElement2 = new XmlElement();
    subElement2.setName("subElement2");
    subElement1.addSubElement(subElement2);
    element.addSubElement(subElement1);
    assertEquals(subElement2, element.getElement("subElement1.subElement2"));
}

// Test case 5: Test if method returns correct element for path with leading dot
@Test
public void testGetElement_leadingDotPath() {
    XmlElement element = new XmlElement();
    XmlElement subElement = new XmlElement();
    subElement.setName("subElement");
    element.addSubElement(subElement);
    assertEquals(subElement, element.getElement(".subElement"));
}

// Test case 6: Test if method returns correct element for path with multiple leading dots
@Test
public void testGetElement_multipleLeadingDotsPath() {
    XmlElement element = new XmlElement();
    XmlElement subElement = new XmlElement();
    subElement.setName("subElement");
    element.addSubElement(subElement);
    assertEquals(subElement, element.getElement("..subElement"));
}

// Test case 7: Test if method returns correct element for path with trailing dot
@Test
public void testGetElement_trailingDotPath() {
    XmlElement element = new XmlElement();
    XmlElement subElement = new XmlElement();
    subElement.setName("subElement");
    element.addSubElement(subElement);
    assertEquals(subElement, element.getElement("subElement."));
}

// Test case 8: Test if method returns correct element for path with multiple trailing dots
@Test
public void testGetElement_multipleTrailingDotsPath() {
    XmlElement element = new XmlElement();
    XmlElement subElement = new XmlElement();
    subElement.setName("subElement");
    element.addSubElement(subElement);
    assertEquals(subElement, element.getElement("subElement.."));
}

// Test case 9: Test if method returns correct element for path with leading and trailing dots
@Test
public void testGetElement_leadingAndTrailingDotsPath() {
    XmlElement element = new XmlElement();
    XmlElement subElement = new XmlElement();
    subElement.setName("subElement");
    element.addSubElement(subElement);
    assertEquals(subElement, element.getElement(".subElement."));
}

// Test case 10: Test if method returns correct element for path with multiple leading and trailing dots
@Test
public void testGetElement_multipleLeadingAndTrailingDotsPath() {
    XmlElement element = new XmlElement();
    XmlElement subElement = new XmlElement();
    subElement.setName("subElement");
    element.addSubElement(subElement);
    assertEquals(subElement, element.getElement("..subElement.."));
}
}