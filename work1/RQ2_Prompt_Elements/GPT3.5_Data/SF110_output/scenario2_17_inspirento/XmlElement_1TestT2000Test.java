// Test case 1: Test if getElement() returns null for empty path
@Test
public void testGetElement_emptyPath() {
    XmlElement element = new XmlElement();
    assertNull(element.getElement(""));
}

// Test case 2: Test if getElement() returns null for non-existent path
@Test
public void testGetElement_nonExistentPath() {
    XmlElement element = new XmlElement();
    assertNull(element.getElement("non.existent.path"));
}

// Test case 3: Test if getElement() returns correct element for single level path
@Test
public void testGetElement_singleLevelPath() {
    XmlElement element = new XmlElement();
    element.addElement(new XmlElement("child1"));
    element.addElement(new XmlElement("child2"));
    XmlElement child = element.getElement("child1");
    assertNotNull(child);
    assertEquals("child1", child.getName());
}

// Test case 4: Test if getElement() returns correct element for multi-level path
@Test
public void testGetElement_multiLevelPath() {
    XmlElement element = new XmlElement();
    XmlElement child1 = new XmlElement("child1");
    XmlElement child2 = new XmlElement("child2");
    XmlElement grandchild = new XmlElement("grandchild");
    child1.addElement(grandchild);
    element.addElement(child1);
    element.addElement(child2);
    XmlElement result = element.getElement("child1.grandchild");
    assertNotNull(result);
    assertEquals("grandchild", result.getName());
}

// Test case 5: Test if getElement() returns first element for duplicate names
@Test
public void testGetElement_duplicateNames() {
    XmlElement element = new XmlElement();
    XmlElement child1 = new XmlElement("child");
    XmlElement child2 = new XmlElement("child");
    element.addElement(child1);
    element.addElement(child2);
    XmlElement result = element.getElement("child");
    assertNotNull(result);
    assertEquals(child1, result);
}

// Test case 6: Test if getElement() returns correct element for path with leading dot
@Test
public void testGetElement_leadingDot() {
    XmlElement element = new XmlElement();
    element.addElement(new XmlElement("child"));
    XmlElement result = element.getElement(".child");
    assertNotNull(result);
    assertEquals("child", result.getName());
}

// Test case 7: Test if getElement() returns correct element for path with trailing dot
@Test
public void testGetElement_trailingDot() {
    XmlElement element = new XmlElement();
    element.addElement(new XmlElement("child"));
    XmlElement result = element.getElement("child.");
    assertNotNull(result);
    assertEquals("child", result.getName());
}

// Test case 8: Test if getElement() returns correct element for path with multiple dots
@Test
public void testGetElement_multipleDots() {
    XmlElement element = new XmlElement();
    XmlElement child1 = new XmlElement("child1");
    XmlElement child2 = new XmlElement("child2");
    XmlElement grandchild = new XmlElement("grandchild");
    child1.addElement(grandchild);
    element.addElement(child1);
    element.addElement(child2);
    XmlElement result = element.getElement("child1.grandchild.");
    assertNotNull(result);
    assertEquals("grandchild", result.getName());
}

// Test case 9: Test if getElement() returns correct element for path with only dots
@Test
public void testGetElement_onlyDots() {
    XmlElement element = new XmlElement();
    element.addElement(new XmlElement("child"));
    XmlElement result = element.getElement("...");
    assertNull(result);
}

// Test case 10: Test if getElement() returns correct element for path with spaces
@Test
public void testGetElement_spaces() {
    XmlElement element = new XmlElement();
    element.addElement(new XmlElement("child"));
    XmlElement result = element.getElement(" child ");
    assertNotNull(result);
    assertEquals("child", result.getName());
}
}