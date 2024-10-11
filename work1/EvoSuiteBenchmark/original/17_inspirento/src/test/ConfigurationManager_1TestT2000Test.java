```java
class ConfigurationManager_1Test {

    @Test
    void testGetProperty_WindowLocation() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        String windowLocation = configManager.getProperty("window.location");
        assertEquals("400,300", windowLocation);
    }

    @Test
    void testGetProperty_WindowSize() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        String windowSize = configManager.getProperty("window.size");
        assertEquals("450,300", windowSize);
    }

    // Add more test cases for other properties as needed

}
```
```