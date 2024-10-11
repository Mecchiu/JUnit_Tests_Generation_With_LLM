// Test case 1: Test if getElement() returns null for empty path
@Test
public void testGetElementEmptyPath() {
    XmlElement element = new XmlElement();
    assertNull(element.getElement(""));
}

// Test case 2: Test if getElement() returns null for non-existent path
@Test
public void testGetElementNonExistentPath() {
    XmlElement element = new XmlElement();
    assertNull(element.getElement("non.existent.path"));
}

// Test case 3: Test if getElement() returns the root element for single path "."
@Test
public void testGetElementSinglePath() {
    XmlElement element = new XmlElement();
    assertEquals(element, element.getElement("."));
}

// Test case 4: Test if getElement() returns the correct child element for single level path
@Test
public void testGetElementSingleLevelPath() {
    XmlElement element = new XmlElement();
    XmlElement childElement = new XmlElement();
    element.addChild(childElement);
    assertEquals(childElement, element.getElement("child"));
}

// Test case 5: Test if getElement() returns the correct grandchild element for two level path
@Test
public void testGetElementTwoLevelPath() {
    XmlElement element = new XmlElement();
    XmlElement childElement = new XmlElement();
    XmlElement grandchildElement = new XmlElement();
    element.addChild(childElement);
    childElement.addChild(grandchildElement);
    assertEquals(grandchildElement, element.getElement("child.grandchild"));
}

// Test case 6: Test if getElement() returns the correct element for path with multiple children with same name
@Test
public void testGetElementMultipleChildrenSameName() {
    XmlElement element = new XmlElement();
    XmlElement childElement1 = new XmlElement();
    XmlElement childElement2 = new XmlElement();
    element.addChild(childElement1);
    element.addChild(childElement2);
    assertEquals(childElement1, element.getElement("child"));
}

// Test case 7: Test if getElement() returns the correct element for path with multiple grandchildren with same name
@Test
public void testGetElementMultipleGrandchildrenSameName() {
    XmlElement element = new XmlElement();
    XmlElement childElement = new XmlElement();
    XmlElement grandchildElement1 = new XmlElement();
    XmlElement grandchildElement2 = new XmlElement();
    childElement.addChild(grandchildElement1);
    childElement.addChild(grandchildElement2);
    element.addChild(childElement);
    assertEquals(grandchildElement1, element.getElement("child.grandchild"));
}

// Test case 8: Test if getElement() returns the correct element for path with multiple children and grandchildren with same name
@Test
public void testGetElementMultipleChildrenAndGrandchildrenSameName() {
    XmlElement element = new XmlElement();
    XmlElement childElement1 = new XmlElement();
    XmlElement childElement2 = new XmlElement();
    XmlElement grandchildElement1 = new XmlElement();
    XmlElement grandchildElement2 = new XmlElement();
    childElement1.addChild(grandchildElement1);
    childElement2.addChild(grandchildElement2);
    element.addChild(childElement1);
    element.addChild(childElement2);
    assertEquals(childElement1, element.getElement("child"));
}

// Test case 9: Test if getElement() returns the correct element for path with spaces
@Test
public void testGetElementPathWithSpaces() {
    XmlElement element = new XmlElement();
    XmlElement childElement = new XmlElement();
    element.addChild(childElement);
    assertEquals(childElement, element.getElement(" child "));
}

// Test case 10: Test if getElement() returns the correct element for path with mixed case
@Test
public void testGetElementPathWithMixedCase() {
    XmlElement element = new XmlElement();
    XmlElement childElement = new XmlElement();
    element.addChild(childElement);
    assertEquals(childElement, element.getElement("cHiLd"));
}
}