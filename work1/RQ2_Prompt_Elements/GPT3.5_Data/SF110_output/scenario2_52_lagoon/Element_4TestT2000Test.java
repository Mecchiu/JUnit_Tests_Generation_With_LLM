// Test case 1: Test with valid index
@Test
void testGetAttributeType_validIndex() {
    Element element = new Element();
    element.addAttribute("name", "value", "type");
    String attributeType = element.getAttributeType(0);
    assertEquals("type", attributeType);
}

// Test case 2: Test with invalid index
@Test
void testGetAttributeType_invalidIndex() {
    Element element = new Element();
    assertThrows(IndexOutOfBoundsException.class, () -> {
        element.getAttributeType(-1);
    });
}

// Test case 3: Test with empty attribute list
@Test
void testGetAttributeType_emptyList() {
    Element element = new Element();
    String attributeType = element.getAttributeType(0);
    assertNull(attributeType);
}

// Test case 4: Test with multiple attributes
@Test
void testGetAttributeType_multipleAttributes() {
    Element element = new Element();
    element.addAttribute("name1", "value1", "type1");
    element.addAttribute("name2", "value2", "type2");
    String attributeType = element.getAttributeType(1);
    assertEquals("type2", attributeType);
}

// Test case 5: Test with attribute list containing null values
@Test
void testGetAttributeType_nullValues() {
    Element element = new Element();
    element.addAttribute("name1", null, "type1");
    element.addAttribute("name2", "value2", null);
    String attributeType = element.getAttributeType(1);
    assertNull(attributeType);
}

// Test case 6: Test with attribute list containing empty values
@Test
void testGetAttributeType_emptyValues() {
    Element element = new Element();
    element.addAttribute("name1", "", "type1");
    element.addAttribute("name2", "value2", "");
    String attributeType = element.getAttributeType(1);
    assertEquals("", attributeType);
}

// Test case 7: Test with attribute list containing only one attribute
@Test
void testGetAttributeType_singleAttribute() {
    Element element = new Element();
    element.addAttribute("name", "value", "type");
    String attributeType = element.getAttributeType(0);
    assertEquals("type", attributeType);
}

// Test case 8: Test with attribute list containing duplicate attribute names
@Test
void testGetAttributeType_duplicateNames() {
    Element element = new Element();
    element.addAttribute("name", "value1", "type1");
    element.addAttribute("name", "value2", "type2");
    String attributeType = element.getAttributeType(1);
    assertEquals("type2", attributeType);
}

// Test case 9: Test with attribute list containing special characters
@Test
void testGetAttributeType_specialCharacters() {
    Element element = new Element();
    element.addAttribute("name1", "value1&<>\"'", "type1");
    element.addAttribute("name2", "value2", "type2");
    String attributeType = element.getAttributeType(0);
    assertEquals("type1", attributeType);
}

// Test case 10: Test with attribute list containing long values
@Test
void testGetAttributeType_longValues() {
    Element element = new Element();
    String longValue = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    element.addAttribute("name1", longValue, "type1");
    element.addAttribute("name2", "value2", "type2");
    String attributeType = element.getAttributeType(0);
    assertEquals("type1", attributeType);
}