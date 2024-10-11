// HtmlContentParserTest.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlContentParser}.
* It contains one unit test case for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {
		private Log log = LogFactory.getLog(getClass());
	
    @Test
    public void testExtractPlainText() throws IOException, ContentParserException {
        String textContent = "hello";
        HtmlContentParser parser = new HtmlContentParser(Source.NONE);
        String result = parser.extractPlainText(textContent);
		assertEquals("<div id=\"1\"><h2>Hello</h2></div>", result);
        log.debug( "===========================================");
        assertEquals(textContent.split("&")[0], "Hello");
        assertEquals(textContent.split("&")[1], "");
		log.debug(textContent);
    }

    @Test
    public void testExtractText() throws IOException, ContentParserException {
        String textContent = "Hello";
        HtmlContentParser parser = new HtmlContentParser(Source.NONE);
        String result = parser.extractText(textContent);
        assertEquals(-1, result.indexOf("<h1>Hello</h1>"));
        assertEquals(-1, result.indexOf("<strong>Hello</strong>"));
        assertEquals(-1, result.indexOf("<h3>Hello</h3>"));
        assertEquals(-1, result.indexOf("</h1>"));
        assertEquals(-1, result.indexOf("<strong>Hello</strong>"));
        assertEquals(-1, result.indexOf("&lt;h1>Hello&lt;/h1&gt;"));
        assertEquals(-1, result.indexOf("&lt;h1&gt;Hello&lt;/h1&gt;"));
        assertEquals(-1, result.indexOf("&lt;strong>Hello</strong>"));
        assertEquals(-1, result.indexOf("&lt;h3>Hello</h3>"));
        assertEquals(-1, result.indexOf("</h1>"));
        assertEquals(-1, result.indexOf("&lt;strong&gt;Hello&lt;/strong&gt;"));
        assertEquals(-1, result.indexOf("</h3>"));
        assertEquals(-1, result.indexOf("&lt;h3&gt;Hello&lt;/h3&gt;"));
        assertEquals(-1, result.indexOf("&lt;h3&gt;Hello&lt;/h3&gt;"));
        assertEquals(-1, result.indexOf("&lt;h3&gt;Hello</h3&gt;"));
        assertEquals(-1, result.indexOf("&lt;h3&gt;Hello&lt;/h3&gt;"));
        assertEquals(-1, result.indexOf("&lt;h3&gt;Hello&lt;h3)&gt;"));
        assertEquals(-1, result.indexOf("&lt;h3&gt;Hello&lt;h3)&gt;"));
        assertEquals(-1, result.indexOf("&lt;h3&gt;Hello&lt;h3)&gt;"));
    }
}