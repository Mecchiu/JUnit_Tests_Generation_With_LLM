```java
class URLContentTest {
    
    @Test
    void testOpenStream() {
        URL url = null;
        try {
            url = new URL("https://www.example.com/test.txt");
        } catch (MalformedURLException e) {
            fail("Malformed URL");
        }
        URLContent urlContent = new URLContent(url);
        
        try (InputStream inputStream = urlContent.openStream()) {
            assertNotNull(inputStream);
        } catch (IOException e) {
            fail("Failed to open stream");
        }
    }
    
    @Test
    void testOpenStreamWithInvalidURL() {
        URL url = null;
        try {
            url = new URL("https://www.invalidurl.com/test.txt");
        } catch (MalformedURLException e) {
            fail("Malformed URL");
        }
        URLContent urlContent = new URLContent(url);
        
        assertThrows(IOException.class, () -> urlContent.openStream());
    }
    
    // Add more test cases for the openStream method
    
}
```
```