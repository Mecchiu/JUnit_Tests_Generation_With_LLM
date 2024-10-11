// HtmlContentParser_0Test.java
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
class HtmlContentParser_0Test {
		
	/**
	 * Test method for {@link org.apache.commons.lang3.text.ContentParser#parse(java.net.InputStream)}
	 *.
	 */
	@Test
	public void testParse01() {
		try {
			HTMLParserContentParser parser = new HTMLParserContentParser(new ReaderInputStream("<html><head><title>Title</title></head><body><h1>Title<h2>h1</h2></body></html>".getBytes()));
			final String result = parser.parse("<h1>Title</h1><h2>h1</h2>");

			assertEquals("The content should be parsed as html", "http://www.asph.edu.au/wish/asph-c/wish/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c", result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Test method for {@link org.apache.commons.lang3.text.ContentParser#parse(java.net.InputStream)}
	 *.
	 * Test fails in this case because {@link HtmlParserContentParser#extractText(URL)}
	 * can't handle any given url.
	 */
	@Test
	public void testParse02() {
		try {
			HTMLParserContentParser parser = new HTMLParserContentParser(new ReaderInputStream("<html><head><title>Title</title></head><body><div>This is a div</div></body></html>".getBytes()));
			final String result = parser.parse("<div>This is a div</div>");

			assertEquals("The content should be parsed as html", "http://www.asph.edu.au/wish/asph-c/wish/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c", result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Test method for {@link org.apache.commons.lang3.text.ContentParser#parse(java.net.InputStream)}
	 *.
	 * Test fails in this case because url.getURL() can't handle any given url.
	 */
	@Test
	public void testParse03() {
		try {
			HTMLParserContentParser parser = new HTMLParserContentParser(new ReaderInputStream("<html><head><title>Title</title></head><body><h1>Title<h2>h1</h2></body></html>".getBytes()));
			final String result = parser.parse("<h1>Title</h1><h2>h1</h2>");

			assertEquals("The content should be parsed as html", "http://www.asph.edu.au/wish/asph-c/wish/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/asph-c/>", result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link org.apache.commons.lang3.text.ContentParser#parseURL(java.net.URL)}.
	 */
	@Test
	public void testParseURL01() {
		try {
			HTMLParserContentParser parser = new HTMLParserContentParser(new InputStreamReader(getClass()
						.getResourceAsStream("url.html"), "UTF-8"));
			Source contentSource = new Source(parser.parseURL("http://asph.edu.au/wish/asph-c?a=b")) ;

			final String result = contentSource.toString();
			assertEquals("The content should be parsed as html", "http://www.asph.edu.au/wish/asph-c?a=b", result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Test method for {@link org.apache.commons.lang3.text.ContentParser#parseURL(java.net.URL)}.
	 */
	@Test
	public void testParseURL02() {
}
}