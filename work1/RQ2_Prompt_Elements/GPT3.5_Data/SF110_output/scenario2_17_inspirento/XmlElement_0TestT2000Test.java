// Test case 1: Test adding a new attribute with a valid name and value
@Test
public void testAddAttribute_validNameAndValue() {
    XmlElement element = new XmlElement();
    Object oldValue = element.addAttribute("name", "value");
    assertNull(oldValue);
}

// Test case 2: Test adding a new attribute with a null name
@Test
public void testAddAttribute_nullName() {
    XmlElement element = new XmlElement();
    Object oldValue = element.addAttribute(null, "value");
    assertNull(oldValue);
}

// Test case 3: Test adding a new attribute with a null value
@Test
public void testAddAttribute_nullValue() {
    XmlElement element = new XmlElement();
    Object oldValue = element.addAttribute("name", null);
    assertNull(oldValue);
}

// Test case 4: Test adding a new attribute with a null name and value
@Test
public void testAddAttribute_nullNameAndValue() {
    XmlElement element = new XmlElement();
    Object oldValue = element.addAttribute(null, null);
    assertNull(oldValue);
}

// Test case 5: Test adding a new attribute with an empty name
@Test
public void testAddAttribute_emptyName() {
    XmlElement element = new XmlElement();
    Object oldValue = element.addAttribute("", "value");
    assertNull(oldValue);
}

// Test case 6: Test adding a new attribute with an empty value
@Test
public void testAddAttribute_emptyValue() {
    XmlElement element = new XmlElement();
    Object oldValue = element.addAttribute("name", "");
    assertNull(oldValue);
}

// Test case 7: Test adding a new attribute with an empty name and value
@Test
public void testAddAttribute_emptyNameAndValue() {
    XmlElement element = new XmlElement();
    Object oldValue = element.addAttribute("", "");
    assertNull(oldValue);
}

// Test case 8: Test adding a new attribute with a name that already exists
@Test
public void testAddAttribute_existingName() {
    XmlElement element = new XmlElement();
    element.addAttribute("name", "value1");
    Object oldValue = element.addAttribute("name", "value2");
    assertEquals("value1", oldValue);
}

// Test case 9: Test adding a new attribute with a value that already exists
@Test
public void testAddAttribute_existingValue() {
    XmlElement element = new XmlElement();
    element.addAttribute("name1", "value");
    Object oldValue = element.addAttribute("name2", "value");
    assertNull(oldValue);
}

// Test case 10: Test adding a new attribute with a name and value that already exist
@Test
public void testAddAttribute_existingNameAndValue() {
    XmlElement element = new XmlElement();
    element.addAttribute("name", "value");
    Object oldValue = element.addAttribute("name", "value");
    assertEquals("value", oldValue);
}
}