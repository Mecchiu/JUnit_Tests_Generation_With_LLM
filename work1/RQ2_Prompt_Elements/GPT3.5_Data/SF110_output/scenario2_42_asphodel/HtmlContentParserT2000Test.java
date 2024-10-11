// Here's an example implementation of the HtmlContentParser and its test class:

// HtmlContentParser.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Html content parser using Jericho.
 */
public class HtmlContentParser implements StringContentParser {

    /**
     * Extracts plain text from HTML content.
     *
     * @param textContent content as a text format, the real format of the content can be xml, html, xhtml, etc.
     * @return plain text without extra tags or elements
     * @throws ContentParserException if there is an error parsing the content
     */
    public String extractPlainText(String textContent) throws ContentParserException {
        Source contentSource = new Source(textContent);
        return contentSource.extractText();
    }
}

// HtmlContentParserTest.java
package org.asphodel.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class of {@link HtmlContentParser}.
 */
class HtmlContentParserTest {

    private final HtmlContentParser parser = new HtmlContentParser();

    @Test
    void testExtractPlainText() throws ContentParserException {
        String html = "<html><head><title>Test</title></head><body><p>Hello, world!</p></body></html>";
        String expected = "Test\n\nHello, world!";
        String actual = parser.extractPlainText(html);
        assertEquals(expected, actual);
    }

    @Test
    void testExtractPlainTextWithEmptyContent() throws ContentParserException {
        String html = "";
        String expected = "";
        String actual = parser.extractPlainText(html);
        assertEquals(expected, actual);
    }

    @Test
    void testExtractPlainTextWithNullContent() {
        assertThrows(ContentParserException.class, () -> parser.extractPlainText(null));
    }

    @Test
    void testExtractPlainTextWithInvalidHtml() {
        String html = "<html><head><title>Test</title></head><body><p>Hello, world!</body></html>";
        assertThrows(ContentParserException.class, () -> parser.extractPlainText(html));
    }

    @Test
    void testExtractPlainTextWithScriptTag() throws ContentParserException {
        String html = "<html><head><title>Test</title></head><body><script>alert('Hello, world!');</script></body></html>";
        String expected = "Test\n\n";
        String actual = parser.extractPlainText(html);
        assertEquals(expected, actual);
    }

    @Test
    void testExtractPlainTextWithStyleTag() throws ContentParserException {
        String html = "<html><head><title>Test</title><style>body { font-size: 12px; }</style></head><body><p>Hello, world!</p></body></html>";
        String expected = "Test\n\nHello, world!";
        String actual = parser.extractPlainText(html);
        assertEquals(expected, actual);
    }

    @Test
    void testExtractPlainTextWithComment() throws ContentParserException {
        String html = "<html><head><title>Test</title></head><body><!-- This is a comment --><p>Hello, world!</p></body></html>";
        String expected = "Test\n\nHello, world!";
        String actual = parser.extractPlainText(html);
        assertEquals(expected, actual);
    }

    @Test
    void testExtractPlainTextWithSpecialCharacters() throws ContentParserException {
        String html = "<html><head><title>Test</title></head><body><p>&lt;Hello&gt;, &amp;world!</p></body></html>";
        String expected = "Test\n\n<Hello>, &world!";
        String actual = parser.extractPlainText(html);
        assertEquals(expected, actual);
    }

    @Test
    void testExtractPlainTextWithMultipleSpaces() throws ContentParserException {
        String html = "<html><head><title>Test</title></head><body><p>Hello,    world!</p></body></html>";
        String expected = "Test\n\nHello, world!";
        String actual = parser.extractPlainText(html);
        assertEquals(expected, actual);
    }

    @Test
    void testExtractPlainTextWithMultipleNewlines() throws ContentParserException {
        String html = "<html><head><title>Test</title></head><body><p>Hello,\n\nworld!</p></body></html>";
        String expected = "Test\n\nHello,\n\nworld!";
        String actual = parser.extractPlainText(html);
        assertEquals(expected, actual);
    }
}