// Test class of ConfigurationManager
class ConfigurationManagerTest {

    // Test case 1: Test getting a valid property
    @Test
    void testGetPropertyValid() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String result = config.getProperty("window.size");
        assertEquals("800x600", result);
    }

    // Test case 2: Test getting a property with invalid key
    @Test
    void testGetPropertyInvalidKey() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String result = config.getProperty("invalid.key");
        assertNull(result);
    }

    // Test case 3: Test getting a property with null key
    @Test
    void testGetPropertyNullKey() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String result = config.getProperty(null);
        assertNull(result);
    }

    // Test case 4: Test getting a property with empty key
    @Test
    void testGetPropertyEmptyKey() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String result = config.getProperty("");
        assertNull(result);
    }

    // Test case 5: Test getting a property with whitespace key
    @Test
    void testGetPropertyWhitespaceKey() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String result = config.getProperty("   ");
        assertNull(result);
    }

    // Test case 6: Test getting a property with valid key but invalid value
    @Test
    void testGetPropertyInvalidValue() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String result = config.getProperty("window.invalid");
        assertNull(result);
    }

    // Test case 7: Test getting a property with valid key but missing value
    @Test
    void testGetPropertyMissingValue() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String result = config.getProperty("window.location");
        assertNull(result);
    }

    // Test case 8: Test getting a property with valid key but missing element in XML file
    @Test
    void testGetPropertyMissingElement() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String result = config.getProperty("missing.element");
        assertNull(result);
    }

    // Test case 9: Test getting a property with valid key but missing XML file
    @Test
    void testGetPropertyMissingFile() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String result = config.getProperty("missing.file");
        assertNull(result);
    }

    // Test case 10: Test getting a property with valid key but invalid XML file
    @Test
    void testGetPropertyInvalidFile() {
        ConfigurationManager config = ConfigurationManager.getInstance();
        String result = config.getProperty("invalid.file");
        assertNull(result);
    }
}