// Test case for URLContent class
public class URLContentTest {

    // Test case 1: Test if openStream() method returns an InputStream object
    @Test
    public void testOpenStreamReturnsInputStream() throws IOException {
        URL url = new URL("http://www.example.com");
        URLContent urlContent = new URLContent(url);
        InputStream inputStream = urlContent.openStream();
        assertNotNull(inputStream);
    }

    // Test case 2: Test if openStream() method throws IOException when URL is invalid
    @Test
    public void testOpenStreamThrowsIOExceptionForInvalidURL() {
        URL url = null;
        URLContent urlContent = new URLContent(url);
        assertThrows(IOException.class, () -> urlContent.openStream());
    }

    // Test case 3: Test if openStream() method throws IOException when URL is unreachable
    @Test
    public void testOpenStreamThrowsIOExceptionForUnreachableURL() {
        URL url = null;
        try {
            url = new URL("http://unreachableurl.com");
        } catch (MalformedURLException e) {
            fail("MalformedURLException should not be thrown");
        }
        URLContent urlContent = new URLContent(url);
        assertThrows(IOException.class, () -> urlContent.openStream());
    }

    // Test case 4: Test if openStream() method returns the correct content length
    @Test
    public void testOpenStreamReturnsCorrectContentLength() throws IOException {
        URL url = new URL("http://www.example.com");
        URLContent urlContent = new URLContent(url);
        InputStream inputStream = urlContent.openStream();
        int contentLength = inputStream.available();
        assertEquals(1270, contentLength);
    }

    // Test case 5: Test if openStream() method returns the correct content type
    @Test
    public void testOpenStreamReturnsCorrectContentType() throws IOException {
        URL url = new URL("http://www.example.com");
        URLContent urlContent = new URLContent(url);
        InputStream inputStream = urlContent.openStream();
        String contentType = URLConnection.guessContentTypeFromStream(inputStream);
        assertEquals("text/html", contentType);
    }

    // Test case 6: Test if openStream() method returns the correct content encoding
    @Test
    public void testOpenStreamReturnsCorrectContentEncoding() throws IOException {
        URL url = new URL("http://www.example.com");
        URLContent urlContent = new URLContent(url);
        InputStream inputStream = urlContent.openStream();
        String contentEncoding = URLConnection.getContentEncoding(inputStream);
        assertEquals("gzip", contentEncoding);
    }

    // Test case 7: Test if openStream() method returns the correct last modified date
    @Test
    public void testOpenStreamReturnsCorrectLastModifiedDate() throws IOException {
        URL url = new URL("http://www.example.com");
        URLContent urlContent = new URLContent(url);
        InputStream inputStream = urlContent.openStream();
        long lastModified = URLConnection.getLastModified(inputStream);
        assertEquals(1626844800000L, lastModified);
    }

    // Test case 8: Test if openStream() method returns the correct expiration date
    @Test
    public void testOpenStreamReturnsCorrectExpirationDate() throws IOException {
        URL url = new URL("http://www.example.com");
        URLContent urlContent = new URLContent(url);
        InputStream inputStream = urlContent.openStream();
        long expiration = URLConnection.getExpiration(inputStream);
        assertEquals(1626931200000L, expiration);
    }

    // Test case 9: Test if openStream() method returns the correct content language
    @Test
    public void testOpenStreamReturnsCorrectContentLanguage() throws IOException {
        URL url = new URL("http://www.example.com");
        URLContent urlContent = new URLContent(url);
        InputStream inputStream = urlContent.openStream();
        String contentLanguage = URLConnection.getContentLanguage(inputStream);
        assertEquals("en", contentLanguage);
    }

    // Test case 10: Test if openStream() method returns the correct content disposition
    @Test
    public void testOpenStreamReturnsCorrectContentDisposition() throws IOException {
        URL url = new URL("http://www.example.com");
        URLContent urlContent = new URLContent(url);
        InputStream inputStream = urlContent.openStream();
        String contentDisposition = URLConnection.getContentDisposition(inputStream);
        assertEquals("attachment; filename=\"example.html\"", contentDisposition);
    }
}