// Test case 1: Adding a sub element to an empty XmlElement
@Test
public void testAddSubElementToEmptyElement() {
    XmlElement element = new XmlElement("root");
    XmlElement subElement = element.addSubElement("child");
    assertNotNull(subElement);
    assertEquals("child", subElement.getName());
    assertEquals(1, element.getElements().size());
    assertTrue(element.getElements().contains(subElement));
}

// Test case 2: Adding a sub element to an existing element
@Test
public void testAddSubElementToExistingElement() {
    XmlElement element = new XmlElement("root");
    XmlElement child1 = new XmlElement("child1");
    element.addElement(child1);
    XmlElement subElement = element.addSubElement("child1.grandchild");
    assertNotNull(subElement);
    assertEquals("grandchild", subElement.getName());
    assertEquals(1, child1.getElements().size());
    assertTrue(child1.getElements().contains(subElement));
}

// Test case 3: Adding a sub element with multiple levels
@Test
public void testAddSubElementWithMultipleLevels() {
    XmlElement element = new XmlElement("root");
    XmlElement subElement = element.addSubElement("child1.grandchild1.greatgrandchild1");
    assertNotNull(subElement);
    assertEquals("greatgrandchild1", subElement.getName());
    assertEquals(1, element.getElements().size());
    assertTrue(element.getElements().contains(subElement.getParent().getParent()));
}

// Test case 4: Adding a sub element with empty name
@Test
public void testAddSubElementWithEmptyName() {
    XmlElement element = new XmlElement("root");
    XmlElement subElement = element.addSubElement("child1..grandchild1");
    assertNull(subElement);
    assertEquals(0, element.getElements().size());
}

// Test case 5: Adding a sub element with path starting with "/"
@Test
public void testAddSubElementWithPathStartingWithSlash() {
    XmlElement element = new XmlElement("root");
    XmlElement subElement = element.addSubElement("/child1/grandchild1");
    assertNotNull(subElement);
    assertEquals("grandchild1", subElement.getName());
    assertEquals(1, element.getElements().size());
    assertTrue(element.getElements().contains(subElement.getParent()));
}

// Test case 6: Adding a sub element with path ending with "."
@Test
public void testAddSubElementWithPathEndingWithDot() {
    XmlElement element = new XmlElement("root");
    XmlElement subElement = element.addSubElement("child1.grandchild1.");
    assertNull(subElement);
    assertEquals(0, element.getElements().size());
}

// Test case 7: Adding a sub element with path containing only dots
@Test
public void testAddSubElementWithPathContainingOnlyDots() {
    XmlElement element = new XmlElement("root");
    XmlElement subElement = element.addSubElement("....");
    assertNull(subElement);
    assertEquals(0, element.getElements().size());
}

// Test case 8: Adding a sub element with path containing spaces
@Test
public void testAddSubElementWithPathContainingSpaces() {
    XmlElement element = new XmlElement("root");
    XmlElement subElement = element.addSubElement("child1. grandchild1");
    assertNotNull(subElement);
    assertEquals("grandchild1", subElement.getName());
    assertEquals(1, element.getElements().size());
    assertTrue(element.getElements().contains(subElement.getParent()));
}

// Test case 9: Adding a sub element with path containing special characters
@Test
public void testAddSubElementWithPathContainingSpecialCharacters() {
    XmlElement element = new XmlElement("root");
    XmlElement subElement = element.addSubElement("child1.grandchild1!@#$%^&*()");
    assertNotNull(subElement);
    assertEquals("grandchild1!@#$%^&*()", subElement.getName());
    assertEquals(1, element.getElements().size());
    assertTrue(element.getElements().contains(subElement.getParent()));
}

// Test case 10: Adding a sub element with path containing non-ASCII characters
@Test
public void testAddSubElementWithPathContainingNonASCIICharacters() {
    XmlElement element = new XmlElement("root");
    XmlElement subElement = element.addSubElement("child1.grandchild1.日本語");
    assertNotNull(subElement);
    assertEquals("日本語", subElement.getName());
    assertEquals(1, element.getElements().size());
    assertTrue(element.getElements().contains(subElement.getParent()));
}
}