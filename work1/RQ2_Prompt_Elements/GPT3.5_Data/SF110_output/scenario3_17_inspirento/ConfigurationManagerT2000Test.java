// Test case 1: Test getting an existing property
@Test
void testGetProperty_existingProperty() {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    String result = configManager.getProperty("window.size");
    assertEquals("800x600", result);
}

// Test case 2: Test getting a non-existing property
@Test
void testGetProperty_nonExistingProperty() {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    String result = configManager.getProperty("nonExistingProperty");
    assertNull(result);
}

// Test case 3: Test getting a property with empty value
@Test
void testGetProperty_emptyValue() {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    String result = configManager.getProperty("emptyValueProperty");
    assertEquals("", result);
}

// Test case 4: Test getting a property with whitespace value
@Test
void testGetProperty_whitespaceValue() {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    String result = configManager.getProperty("whitespaceValueProperty");
    assertEquals("   ", result);
}

// Test case 5: Test getting a property with special characters
@Test
void testGetProperty_specialCharacters() {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    String result = configManager.getProperty("specialCharactersProperty");
    assertEquals("<>&\"'", result);
}

// Test case 6: Test getting a property with escaped characters
@Test
void testGetProperty_escapedCharacters() {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    String result = configManager.getProperty("escapedCharactersProperty");
    assertEquals("\\t\\n\\r\\f\\b\\\\\\'", result);
}

// Test case 7: Test getting a property with multiple values
@Test
void testGetProperty_multipleValues() {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    String result = configManager.getProperty("multipleValuesProperty");
    assertEquals("value1,value2,value3", result);
}

// Test case 8: Test getting a property with leading/trailing whitespace
@Test
void testGetProperty_leadingTrailingWhitespace() {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    String result = configManager.getProperty("leadingTrailingWhitespaceProperty");
    assertEquals("   value   ", result);
}

// Test case 9: Test getting a property with UTF-8 characters
@Test
void testGetProperty_UTF8Characters() {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    String result = configManager.getProperty("UTF8CharactersProperty");
    assertEquals("日本語", result);
}

// Test case 10: Test getting a property with null key
@Test
void testGetProperty_nullKey() {
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    assertThrows(NullPointerException.class, () -> {
        configManager.getProperty(null);
    });
}