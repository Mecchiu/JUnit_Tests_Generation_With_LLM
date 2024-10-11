// Test case 1: Adding a valid attribute
@Test
public void testAddAttribute_validAttribute() {
    XmlElement element = new XmlElement();
    Object returnValue = element.addAttribute("name", "John");
    assertEquals(null, returnValue);
}

// Test case 2: Adding an attribute with null value
@Test
public void testAddAttribute_nullValue() {
    XmlElement element = new XmlElement();
    Object returnValue = element.addAttribute("name", null);
    assertEquals(null, returnValue);
}

// Test case 3: Adding an attribute with null name
@Test
public void testAddAttribute_nullName() {
    XmlElement element = new XmlElement();
    Object returnValue = element.addAttribute(null, "John");
    assertEquals(null, returnValue);
}

// Test case 4: Adding an attribute with empty name
@Test
public void testAddAttribute_emptyName() {
    XmlElement element = new XmlElement();
    Object returnValue = element.addAttribute("", "John");
    assertEquals(null, returnValue);
}

// Test case 5: Adding an attribute with empty value
@Test
public void testAddAttribute_emptyValue() {
    XmlElement element = new XmlElement();
    Object returnValue = element.addAttribute("name", "");
    assertEquals(null, returnValue);
}

// Test case 6: Adding an attribute with existing name
@Test
public void testAddAttribute_existingName() {
    XmlElement element = new XmlElement();
    element.addAttribute("name", "John");
    Object returnValue = element.addAttribute("name", "Doe");
    assertEquals("John", returnValue);
}

// Test case 7: Adding multiple attributes
@Test
public void testAddAttribute_multipleAttributes() {
    XmlElement element = new XmlElement();
    element.addAttribute("name", "John");
    element.addAttribute("age", "30");
    element.addAttribute("gender", "male");
    assertEquals(3, element.getAttributes().size());
}

// Test case 8: Adding attributes with special characters
@Test
public void testAddAttribute_specialCharacters() {
    XmlElement element = new XmlElement();
    element.addAttribute("name", "John & Doe");
    element.addAttribute("age", "30 < 40");
    assertEquals("John & Doe", element.getAttributes().get("name"));
    assertEquals("30 < 40", element.getAttributes().get("age"));
}

// Test case 9: Adding attributes with Unicode characters
@Test
public void testAddAttribute_unicodeCharacters() {
    XmlElement element = new XmlElement();
    element.addAttribute("name", "Jöhn");
    element.addAttribute("age", "30");
    assertEquals("Jöhn", element.getAttributes().get("name"));
    assertEquals("30", element.getAttributes().get("age"));
}

// Test case 10: Adding attributes with empty XmlElement
@Test
public void testAddAttribute_emptyXmlElement() {
    XmlElement element = new XmlElement();
    assertEquals(null, element.getAttributes().get("name"));
}