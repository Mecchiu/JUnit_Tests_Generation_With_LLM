I can help you write the test cases for the `ClientProperties` class. Here's an example of how you can write a test case:

```
@Test
void testGetProperty() {
    ClientProperties properties = new ClientProperties();
    String value = properties.getProperty("elementName");
    assertEquals("", value, "Expected empty string when fileError is true");
}
```

You can write similar test cases for other scenarios, such as when the element name is not found in the properties file, when the properties file is not found, or when the properties file is not readable.