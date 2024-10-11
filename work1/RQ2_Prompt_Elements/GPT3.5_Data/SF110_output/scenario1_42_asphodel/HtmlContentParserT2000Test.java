// Here's an example implementation of the HtmlContentParserTest class with ten unit test cases for the extractPlainText method:

package org.asphodel.parser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HtmlContentParserTest {

    @Test
    void testExtractPlainTextWithEmptyString() throws ContentParserException {
        HtmlContentParser parser = new HtmlContentParser();
        String result = parser.extractPlainText("");
        assertEquals("", result);
    }

    @Test
    void testExtractPlainTextWithSimpleHtml() throws ContentParserException {
        HtmlContentParser parser = new HtmlContentParser();
        String result = parser.extractPlainText("<html><body><h1>Hello World!</h1></body></html>");
        assertEquals("Hello World!", result);
    }

    @Test
    void testExtractPlainTextWithNestedHtml() throws ContentParserException {
        HtmlContentParser parser = new HtmlContentParser();
        String result = parser.extractPlainText("<html><body><h1>Hello <em>World</em>!</h1></body></html>");
        assertEquals("Hello World!", result);
    }

    @Test
    void testExtractPlainTextWithSpecialCharacters() throws ContentParserException {
        HtmlContentParser parser = new HtmlContentParser();
        String result = parser.extractPlainText("<html><body><p>&copy; 2021</p></body></html>");
        assertEquals("© 2021", result);
    }

    @Test
    void testExtractPlainTextWithScriptTags() throws ContentParserException {
        HtmlContentParser parser = new HtmlContentParser();
        String result = parser.extractPlainText("<html><body><script>alert('Hello World!');</script></body></html>");
        assertEquals("", result);
    }

    @Test
    void testExtractPlainTextWithStyleTags() throws ContentParserException {
        HtmlContentParser parser = new HtmlContentParser();
        String result = parser.extractPlainText("<html><head><style>body { background-color: yellow; }</style></head><body><h1>Hello World!</h1></body></html>");
        assertEquals("Hello World!", result);
    }

    @Test
    void testExtractPlainTextWithComments() throws ContentParserException {
        HtmlContentParser parser = new HtmlContentParser();
        String result = parser.extractPlainText("<html><!-- This is a comment --><body><h1>Hello World!</h1></body></html>");
        assertEquals("Hello World!", result);
    }

    @Test
    void testExtractPlainTextWithEntities() throws ContentParserException {
        HtmlContentParser parser = new HtmlContentParser();
        String result = parser.extractPlainText("<html><body><p>&lt;Hello World!&gt;</p></body></html>");
        assertEquals("<Hello World!>", result);
    }

    @Test
    void testExtractPlainTextWithMultipleSpaces() throws ContentParserException {
        HtmlContentParser parser = new HtmlContentParser();
        String result = parser.extractPlainText("<html><body><p>Hello     World!</p></body></html>");
        assertEquals("Hello World!", result);
    }

    @Test
    void testExtractPlainTextWithNewLines() throws ContentParserException {
        HtmlContentParser parser = new HtmlContentParser();
        String result = parser.extractPlainText("<html><body><p>Hello\nWorld!</p></body></html>");
        assertEquals("Hello World!", result);
    }
}