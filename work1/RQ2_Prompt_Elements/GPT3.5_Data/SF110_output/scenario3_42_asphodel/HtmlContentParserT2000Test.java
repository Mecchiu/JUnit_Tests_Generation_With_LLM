// Here's an example implementation of the HtmlContentParser class and its test class:

// HtmlContentParser.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

/**
 * Html content parser using Jericho.
 */
public class HtmlContentParser implements StringContentParser, StreamContentParser {

    private static final Log log = LogFactory.getLog(HtmlContentParser.class);

    /**
     * Extracts plain text from HTML content.
     * @param textContent content as a text format, the real format of the content can be xml, html, xhtml, etc.
     * @return plain text without extra tags or elements
     * @throws ContentParserException if there is an error parsing the content
     */
    public String extractPlainText(String textContent) throws ContentParserException {
        try {
            Source source = new Source(textContent);
            source.fullSequentialParse();
            return source.getTextExtractor().toString();
        } catch (Exception e) {
            log.error("Error parsing HTML content: " + e.getMessage(), e);
            throw new ContentParserException("Error parsing HTML content", e);
        }
    }

    /**
     * Extracts plain text from an HTML input stream.
     * @param inputStream input stream containing HTML content
     * @return plain text without extra tags or elements
     * @throws ContentParserException if there is an error parsing the content
     */
    public String extractPlainText(InputStream inputStream) throws ContentParserException {
        try {
            Source source = new Source(inputStream);
            source.fullSequentialParse();
            return source.getTextExtractor().toString();
        } catch (Exception e) {
            log.error("Error parsing HTML content: " + e.getMessage(), e);
            throw new ContentParserException("Error parsing HTML content", e);
        }
    }

    /**
     * Extracts plain text from an HTML reader.
     * @param reader reader containing HTML content
     * @return plain text without extra tags or elements
     * @throws ContentParserException if there is an error parsing the content
     */
    public String extractPlainText(Reader reader) throws ContentParserException {
        try {
            Source source = new Source(reader);
            source.fullSequentialParse();
            return source.getTextExtractor().toString();
        } catch (Exception e) {
            log.error("Error parsing HTML content: " + e.getMessage(), e);
            throw new ContentParserException("Error parsing HTML content", e);
        }
    }

    /**
     * Extracts plain text from an HTML URL.
     * @param url URL containing HTML content
     * @return plain text without extra tags or elements
     * @throws ContentParserException if there is an error parsing the content
     */
    public String extractPlainText(URL url) throws ContentParserException {
        try {
            Source source = new Source(url);
            source.fullSequentialParse();
            return source.getTextExtractor().toString();
        } catch (Exception e) {
            log.error("Error parsing HTML content: " + e.getMessage(), e);
            throw new ContentParserException("Error parsing HTML content", e);
        }
    }
}

// HtmlContentParserTest.java
package org.asphodel.parser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HtmlContentParser}.
 */
class HtmlContentParserTest {

    private HtmlContentParser parser = new HtmlContentParser();

    @Test
    void testExtractPlainText() throws ContentParserException {
        String html = "<html><head><title>Test</title></head><body><p>Hello, world!</p></body></html>";
        String expected = "Test\n\nHello, world!";
        String actual = parser.extractPlainText(html);
        assertEquals(expected, actual);
    }

    @Test
    void testExtractPlainTextWithInputStream() throws ContentParserException {
        String html = "<html><head><title>Test</title></head><body><p>Hello, world!</p></body></html>";
        String expected = "Test\n\nHello, world!";
        InputStream inputStream = new ByteArrayInputStream(html.getBytes());
        String actual = parser.extractPlainText(inputStream);
        assertEquals(expected, actual);
    }

    @Test
    void testExtractPlainTextWithReader() throws ContentParserException {
        String html = "<html><head><title>Test</title></head><body><p>Hello, world!</p></body></html>";
        String expected = "Test\n\nHello, world!";
        Reader reader = new StringReader(html);
        String actual = parser.extractPlainText(reader);
        assertEquals(expected, actual);
    }

    @Test
    void testExtractPlainTextWithUrl() throws ContentParserException, MalformedURLException {
        String expected = "Wikipedia\n\nFrom Wikipedia, the free encyclopedia";
        String actual = parser.extractPlainText(new URL("https://en.wikipedia.org/wiki/Main_Page"));
        assertTrue(actual.startsWith(expected));
    }
}