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
* It contains ten unit test cases for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {
private static Log log = LogFactory.getLog(HtmlContentParserTest.class);

		private HtmlContentParser parser = new HtmlContentParser();

		@Test
		public void testExtractPlainText() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello World</p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}

		@Test
		public void testExtractPlainTextWithHtmlTag() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello <b>World</b></p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}

		@Test
		public void testExtractPlainTextWithHtmlTagAndAttribute() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello <b class=\"test\">World</b></p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}

		@Test
		public void testExtractPlainTextWithHtmlTagAndAttributeAndValue() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello <b class=\"test\">World</b></p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}

		@Test
		public void testExtractPlainTextWithHtmlTagAndAttributeAndValueAndComment() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello <b class=\"test\">World</b></p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}

		@Test
		public void testExtractPlainTextWithHtmlTagAndAttributeAndValueAndCommentAndCdata() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello <b class=\"test\">World</b></p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}

		@Test
		public void testExtractPlainTextWithHtmlTagAndAttributeAndValueAndCommentAndCdataAndEntity() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello <b class=\"test\">World</b></p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}

		@Test
		public void testExtractPlainTextWithHtmlTagAndAttributeAndValueAndCommentAndCdataAndEntityAndProcessingInstruction() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello <b class=\"test\">World</b></p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}

		@Test
		public void testExtractPlainTextWithHtmlTagAndAttributeAndValueAndCommentAndCdataAndEntityAndProcessingInstructionAndDoctype() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello <b class=\"test\">World</b></p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}

		@Test
		public void testExtractPlainTextWithHtmlTagAndAttributeAndValueAndCommentAndCdataAndEntityAndProcessingInstructionAndDoctypeAndXmlDeclaration() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello <b class=\"test\">World</b></p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}
}

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
 * @author : sunwj
 * @since 0.1
 *        Date: Mar 31, 2007
 *        Time: 10:03:07 PM
 *        <p/>
 *        html content parser using Jericho
 * todo does it need to devided into 2 different implementation?
 */
public class HtmlContentParser implements StringContentParser, StreamContentParser {

    private static Log log = LogFactory.getLog(HtmlContentParser.class);

    /**
     * @param textContent content as a text format,the real format of the content can be xml,html,xhtml....
     * @return plain text without extra tags or elements
     */
    public String extractPlainText(String textContent) throws ContentParserException;

    /**
     */
    public String extractText(Reader reader) throws ContentParserException;

    public String extractText(InputStream inputStream) throws ContentParserException;

    public String extractText(URL url) throws ContentParserException;
}

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
* It contains ten unit test cases for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {
		private static Log log = LogFactory.getLog(HtmlContentParserTest.class);

		private HtmlContentParser parser = new HtmlContentParser();

		@Test
		public void testExtractPlainText() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello World</p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}

		@Test
		public void testExtractPlainTextWithHtmlTag() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello <b>World</b></p></body></html>";
				String text = parser.extractPlainText(html);
				assertEquals("Hello World", text);
		}

		@Test
		public void testExtractPlainTextWithHtmlTagAndAttribute() throws ContentParserException {
				String html = "<html><head><title>Test</title></head><body><p>Hello <b class=\"test\">World</b></p></body></html>";
				String text = parser.extractPlainText(html);
			