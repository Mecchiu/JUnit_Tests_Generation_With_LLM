// Here's an example implementation of the HtmlContentParser interface:

public class HtmlContentParserImpl implements HtmlContentParser {

    private static Log log = LogFactory.getLog(HtmlContentParserImpl.class);

    /**
     * Extracts plain text from HTML content.
     *
     * @param textContent content as a text format, the real format of the content can be xml, html, xhtml....
     * @return plain text without extra tags or elements
     */
    public String extractPlainText(String textContent) throws ContentParserException {
        try {
            Source source = new Source(textContent);
            return source.getTextExtractor().toString();
        } catch (Exception e) {
            log.error("Error extracting plain text from HTML content", e);
            throw new ContentParserException("Error extracting plain text from HTML content", e);
        }
    }

    /**
     * Extracts plain text from a reader containing HTML content.
     *
     * @param reader reader containing HTML content
     * @return plain text without extra tags or elements
     */
    public String extractText(Reader reader) throws ContentParserException {
        try {
            Source source = new Source(reader);
            return source.getTextExtractor().toString();
        } catch (Exception e) {
            log.error("Error extracting plain text from HTML content", e);
            throw new ContentParserException("Error extracting plain text from HTML content", e);
        }
    }

    /**
     * Extracts plain text from an input stream containing HTML content.
     *
     * @param inputStream input stream containing HTML content
     * @return plain text without extra tags or elements
     */
    public String extractText(InputStream inputStream) throws ContentParserException {
        try {
            Source source = new Source(inputStream);
            return source.getTextExtractor().toString();
        } catch (Exception e) {
            log.error("Error extracting plain text from HTML content", e);
            throw new ContentParserException("Error extracting plain text from HTML content", e);
        }
    }

    /**
     * Extracts plain text from a URL pointing to HTML content.
     *
     * @param url URL pointing to HTML content
     * @return plain text without extra tags or elements
     */
    public String extractText(URL url) throws ContentParserException {
        try {
            Source source = new Source(url);
            return source.getTextExtractor().toString();
        } catch (Exception e) {
            log.error("Error extracting plain text from HTML content", e);
            throw new ContentParserException("Error extracting plain text from HTML content", e);
        }
    }
}

// And here's an example test class for the HtmlContentParserImpl implementation:

class HtmlContentParserImplTest {

    @Test
    void testExtractPlainText() throws ContentParserException {
        HtmlContentParser parser = new HtmlContentParserImpl();

        // Test case 1: empty content
        String content1 = "";
        String expected1 = "";
        String actual1 = parser.extractPlainText(content1);
        assertEquals(expected1, actual1);

        // Test case 2: content with no HTML tags
        String content2 = "This is plain text.";
        String expected2 = "This is plain text.";
        String actual2 = parser.extractPlainText(content2);
        assertEquals(expected2, actual2);

        // Test case 3: content with HTML tags
        String content3 = "<html><head><title>Test</title></head><body><p>This is <b>bold</b> text.</p></body></html>";
        String expected3 = "Test This is bold text.";
        String actual3 = parser.extractPlainText(content3);
        assertEquals(expected3, actual3);

        // Test case 4: content with invalid HTML tags
        String content4 = "<html><head><title>Test</title></head><body><p>This is <b>bold text.</p></body></html>";
        String expected4 = "Test This is bold text.";
        String actual4 = parser.extractPlainText(content4);
        assertEquals(expected4, actual4);

        // Test case 5: content with special characters
        String content5 = "<html><head><title>Test</title></head><body><p>This is &lt;bold&gt; text.</p></body></html>";
        String expected5 = "Test This is <bold> text.";
        String actual5 = parser.extractPlainText(content5);
        assertEquals(expected5, actual5);

        // Test case 6: content with non-ASCII characters
        String content6 = "<html><head><title>Test</title></head><body><p>This is é text.</p></body></html>";
        String expected6 = "Test This is é text.";
        String actual6 = parser.extractPlainText(content6);
        assertEquals(expected6, actual6);
    }
}