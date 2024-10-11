// Test case 1: Test adding a new attribute to an empty XmlElement
@Test
public void testAddAttributeToEmptyXmlElement() {
    XmlElement xmlElement = new XmlElement();
    Object oldValue = xmlElement.addAttribute("name", "value");
    assertNull(oldValue);
}

// Test case 2: Test adding a new attribute to an XmlElement with existing attributes
@Test
public void testAddAttributeToXmlElementWithExistingAttributes() {
    XmlElement xmlElement = new XmlElement();
    xmlElement.addAttribute("name1", "value1");
    xmlElement.addAttribute("name2", "value2");
    Object oldValue = xmlElement.addAttribute("name3", "value3");
    assertNull(oldValue);
}

// Test case 3: Test adding a new attribute with a null name to an XmlElement
@Test
public void testAddAttributeWithNullNameToXmlElement() {
    XmlElement xmlElement = new XmlElement();
    Object oldValue = xmlElement.addAttribute(null, "value");
    assertNull(oldValue);
}

// Test case 4: Test adding a new attribute with a null value to an XmlElement
@Test
public void testAddAttributeWithNullValueToXmlElement() {
    XmlElement xmlElement = new XmlElement();
    Object oldValue = xmlElement.addAttribute("name", null);
    assertNull(oldValue);
}

// Test case 5: Test adding a new attribute with an empty name to an XmlElement
@Test
public void testAddAttributeWithEmptyNameToXmlElement() {
    XmlElement xmlElement = new XmlElement();
    Object oldValue = xmlElement.addAttribute("", "value");
    assertNull(oldValue);
}

// Test case 6: Test adding a new attribute with an empty value to an XmlElement
@Test
public void testAddAttributeWithEmptyValueToXmlElement() {
    XmlElement xmlElement = new XmlElement();
    Object oldValue = xmlElement.addAttribute("name", "");
    assertNull(oldValue);
}

// Test case 7: Test adding a new attribute with a duplicate name to an XmlElement
@Test
public void testAddAttributeWithDuplicateNameToXmlElement() {
    XmlElement xmlElement = new XmlElement();
    xmlElement.addAttribute("name", "value1");
    Object oldValue = xmlElement.addAttribute("name", "value2");
    assertEquals("value1", oldValue);
}

// Test case 8: Test adding a new attribute with a name that contains whitespace to an XmlElement
@Test
public void testAddAttributeWithWhitespaceInNameToXmlElement() {
    XmlElement xmlElement = new XmlElement();
    Object oldValue = xmlElement.addAttribute("name with spaces", "value");
    assertNull(oldValue);
}

// Test case 9: Test adding a new attribute with a value that contains whitespace to an XmlElement
@Test
public void testAddAttributeWithWhitespaceInValueToXmlElement() {
    XmlElement xmlElement = new XmlElement();
    Object oldValue = xmlElement.addAttribute("name", "value with spaces");
    assertNull(oldValue);
}

// Test case 10: Test adding a new attribute with a name and value that contain special characters to an XmlElement
@Test
public void testAddAttributeWithSpecialCharactersToXmlElement() {
    XmlElement xmlElement = new XmlElement();
    Object oldValue = xmlElement.addAttribute("<name>", "value&");
    assertNull(oldValue);
}
}