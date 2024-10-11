// Test case 1: Adding a sub element with valid name and data
@Test
public void testAddSubElement_validNameAndData() {
    XmlElement element = new XmlElement();
    XmlElement subElement = element.addSubElement("subElement", "data");
    assertNotNull(subElement);
}

// Test case 2: Adding a sub element with null name
@Test
public void testAddSubElement_nullName() {
    XmlElement element = new XmlElement();
    XmlElement subElement = element.addSubElement(null, "data");
    assertNull(subElement);
}

// Test case 3: Adding a sub element with empty name
@Test
public void testAddSubElement_emptyName() {
    XmlElement element = new XmlElement();
    XmlElement subElement = element.addSubElement("", "data");
    assertNull(subElement);
}

// Test case 4: Adding a sub element with null data
@Test
public void testAddSubElement_nullData() {
    XmlElement element = new XmlElement();
    XmlElement subElement = element.addSubElement("subElement", null);
    assertNotNull(subElement);
}

// Test case 5: Adding a sub element with empty data
@Test
public void testAddSubElement_emptyData() {
    XmlElement element = new XmlElement();
    XmlElement subElement = element.addSubElement("subElement", "");
    assertNotNull(subElement);
}

// Test case 6: Adding a sub element with name containing invalid characters
@Test
public void testAddSubElement_invalidName() {
    XmlElement element = new XmlElement();
    XmlElement subElement = element.addSubElement("<subElement>", "data");
    assertNull(subElement);
}

// Test case 7: Adding a sub element with data containing invalid characters
@Test
public void testAddSubElement_invalidData() {
    XmlElement element = new XmlElement();
    XmlElement subElement = element.addSubElement("subElement", "<data>");
    assertNotNull(subElement);
}

// Test case 8: Adding a sub element with name and data containing invalid characters
@Test
public void testAddSubElement_invalidNameAndData() {
    XmlElement element = new XmlElement();
    XmlElement subElement = element.addSubElement("<subElement>", "<data>");
    assertNull(subElement);
}

// Test case 9: Adding multiple sub elements with valid names and data
@Test
public void testAddSubElement_multipleValid() {
    XmlElement element = new XmlElement();
    XmlElement subElement1 = element.addSubElement("subElement1", "data1");
    XmlElement subElement2 = element.addSubElement("subElement2", "data2");
    assertNotNull(subElement1);
    assertNotNull(subElement2);
}

// Test case 10: Adding multiple sub elements with some invalid names and data
@Test
public void testAddSubElement_multipleInvalid() {
    XmlElement element = new XmlElement();
    XmlElement subElement1 = element.addSubElement("subElement1", "data1");
    XmlElement subElement2 = element.addSubElement("<subElement2>", "<data2>");
    assertNotNull(subElement1);
    assertNull(subElement2);
}
}