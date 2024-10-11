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
private static final Log log = LogFactory.getLog(HtmlContentParserTest.class);

		private static final String HTML_CONTENT = "<html><head><title>Test</title></head><body><p>This is a test.</p></body></html>";
		private static final String PLAIN_TEXT = "Test This is a test.";

		private static final String HTML_CONTENT_WITH_COMMENT = "<html><head><title>Test</title></head><body><p>This is a test.</p><!-- This is a comment. --></body></html>";
		private static final String PLAIN_TEXT_WITH_COMMENT = "Test This is a test.";

		private static final String HTML_CONTENT_WITH_SCRIPT = "<html><head><title>Test</title></head><body><p>This is a test.</p><script>This is a script.</script></body></html>";
		private static final String PLAIN_TEXT_WITH_SCRIPT = "Test This is a test.";

		private static final String HTML_CONTENT_WITH_STYLE = "<html><head><title>Test</title></head><body><p>This is a test.</p><style>This is a style.</style></body></html>";
		private static final String PLAIN_TEXT_WITH_STYLE = "Test This is a test.";

		private static final String HTML_CONTENT_WITH_TAG = "<html><head><title>Test</title></head><body><p>This is a test.</p><tag>This is a tag.</tag></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG = "Test This is a test. This is a tag.";

		private static final String HTML_CONTENT_WITH_ENTITY = "<html><head><title>Test</title></head><body><p>This is a test.</p><tag>This is a tag.</tag><p>This is a &lt;entity&gt;.</p></body></html>";
		private static final String PLAIN_TEXT_WITH_ENTITY = "Test This is a test. This is a tag. This is a <entity>.";

		private static final String HTML_CONTENT_WITH_ENTITY_REFERENCE = "<html><head><title>Test</title></head><body><p>This is a test.</p><tag>This is a tag.</tag><p>This is a &lt;entity&gt;.</p><p>This is a &#60;entity&#62;.</p></body></html>";
		private static final String PLAIN_TEXT_WITH_ENTITY_REFERENCE = "Test This is a test. This is a tag. This is a <entity>. This is a <entity>.";

		private static final String HTML_CONTENT_WITH_CDATA = "<html><head><title>Test</title></head><body><p>This is a test.</p><tag>This is a tag.</tag><p>This is a &lt;entity&gt;.</p><p>This is a &#60;entity&#62;.</p><p><![CDATA[This is a <cdata>.]]></p></body></html>";
		private static final String PLAIN_TEXT_WITH_CDATA = "Test This is a test. This is a tag. This is a <entity>. This is a <entity>. This is a <cdata>.";

		private static final String HTML_CONTENT_WITH_UNICODE_CHARACTER = "<html><head><title>Test</title></head><body><p>This is a test.</p><tag>This is a tag.</tag><p>This is a &lt;entity&gt;.</p><p>This is a &#60;entity&#62;.</p><p><![CDATA[This is a <cdata>.]]></p><p>This is a \u00A9.</p></body></html>";
		private static final String PLAIN_TEXT_WITH_UNICODE_CHARACTER = "Test This is a test. This is a tag. This is a <entity>. This is a <entity>. This is a <cdata>. This is a \u00A9.";

		private static final String HTML_CONTENT_WITH_UNICODE_CHARACTER_REFERENCE = "<html><head><title>Test</title></head><body><p>This is a test.</p><tag>This is a tag.</tag><p>This is a &lt;entity&gt;.</p><p>This is a &#60;entity&#62;.</p><p><![CDATA[This is a <cdata>.]]></p><p>This is a \u00A9.</p><p>This is a &#169;.</p></body></html>";
		private static final String PLAIN_TEXT_WITH_UNICODE_CHARACTER_REFERENCE = "Test This is a test. This is a tag. This is a <entity>. This is a <entity>. This is a <cdata>. This is a \u00A9. This is a \u00A9.";

		private static final String HTML_CONTENT_WITH_UNICODE_CHARACTER_REFERENCE_IN_ATTRIBUTE = "<html><head><title>Test</title></head><body><p>This is a test.</p><tag>This is a tag.</tag><p>This is a &lt;entity&gt;.</p><p>This is a &#60;entity&#62;.</p><p><![CDATA[This is a <cdata>.]]></p><p>This is a \u00A9.</p><p>This is a &#169;.</p><p>This is a <a href=\"http://www.example.com/\u00A9\">link</a>.</p></body></html>";
		private static final String PLAIN_TEXT_WITH_UNICODE_CHARACTER_REFERENCE_IN_ATTRIBUTE = "Test This is a test. This is a tag. This is a <entity>. This is a <entity>. This is a <cdata>. This is a \u00A9. This is a \u00A9. This is a link.";

		private static final String HTML_CONTENT_WITH_UNICODE_CHARACTER_REFERENCE_IN_ATTRIBUTE_VALUE = "<html><head><title>Test</title></head><body><p>This is a test.</p><tag>This is a tag.</tag><p>This is a &lt;entity&gt;.</p><p>This is a &#60;entity&#62;.</p><p><![CDATA[This is a <cdata>.]]></p><p>This is a \u00A9.</p><p>This is a &#169;.</p><p>This is a <a href=\"http://www.example.com/\u00A9\">link</a>.</p><p>This is a <a href=\"http://www.example.com/&#169;\">link</a>.</p></body></html>";
		private static final String PLAIN_TEXT_WITH_UNICODE_CHARACTER_REFERENCE_IN_ATTRIBUTE_VALUE = "Test This is a test. This is a tag. This is a <entity>. This is a <entity>. This is a <cdata>. This is a \u00A9. This is a \u00A9. This is a link. This is a link.";

		private static final String HTML_CONTENT_WITH_UNICODE_CHARACTER_REFERENCE_IN_ATTRIBUTE_VALUE_SURROUNDED_BY_WHITESPACE = "<html><head><title>Test</title></head><body><p>This is a test.</p><tag>This is a tag.</tag><p>This is a &lt;entity&gt;.</p><p>This is a &#60;entity&#62;.</p><p><![CDATA[This is a <cdata>.]]></p><p>This is a \u00A9.</p><p>This is a &#169;.</p><p>This is a <a href=\"http://www.example.com/\u00A9\">link</a>.</p><p>This is a <a href=\"http://www.