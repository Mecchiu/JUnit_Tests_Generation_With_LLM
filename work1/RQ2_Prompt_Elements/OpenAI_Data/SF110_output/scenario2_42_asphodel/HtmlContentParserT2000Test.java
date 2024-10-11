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
		private static final String HTML_CONTENT_WITH_SCRIPT = "<html><head><title>Test</title></head><body><p>This is a test.</p><script type=\"text/javascript\">var a = 1;</script></body></html>";
		private static final String PLAIN_TEXT_WITH_SCRIPT = "Test This is a test.";
		private static final String HTML_CONTENT_WITH_STYLE = "<html><head><title>Test</title></head><body><p>This is a test.</p><style type=\"text/css\">body {background-color: #ffffff;}</style></body></html>";
		private static final String PLAIN_TEXT_WITH_STYLE = "Test This is a test.";
		private static final String HTML_CONTENT_WITH_TAG = "<html><head><title>Test</title></head><body><p>This is a test.</p><a href=\"http://www.google.com\">Google</a></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG = "Test This is a test. Google";
		private static final String HTML_CONTENT_WITH_TAG_AND_ATTRIBUTE = "<html><head><title>Test</title></head><body><p>This is a test.</p><a href=\"http://www.google.com\" title=\"Google\">Google</a></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG_AND_ATTRIBUTE = "Test This is a test. Google";
		private static final String HTML_CONTENT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE = "<html><head><title>Test</title></head><body><p>This is a test.</p><a href=\"http://www.google.com\" title=\"Google\">Google</a></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE = "Test This is a test. Google";
		private static final String HTML_CONTENT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_COMMENT = "<html><head><title>Test</title></head><body><p>This is a test.</p><a href=\"http://www.google.com\" title=\"Google\">Google</a><!-- This is a comment. --></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_COMMENT = "Test This is a test. Google";
		private static final String HTML_CONTENT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_SCRIPT = "<html><head><title>Test</title></head><body><p>This is a test.</p><a href=\"http://www.google.com\" title=\"Google\">Google</a><script type=\"text/javascript\">var a = 1;</script></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_SCRIPT = "Test This is a test. Google";
		private static final String HTML_CONTENT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_STYLE = "<html><head><title>Test</title></head><body><p>This is a test.</p><a href=\"http://www.google.com\" title=\"Google\">Google</a><style type=\"text/css\">body {background-color: #ffffff;}</style></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_STYLE = "Test This is a test. Google";
		private static final String HTML_CONTENT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_COMMENT_AND_SCRIPT = "<html><head><title>Test</title></head><body><p>This is a test.</p><a href=\"http://www.google.com\" title=\"Google\">Google</a><!-- This is a comment. --><script type=\"text/javascript\">var a = 1;</script></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_COMMENT_AND_SCRIPT = "Test This is a test. Google";
		private static final String HTML_CONTENT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_COMMENT_AND_STYLE = "<html><head><title>Test</title></head><body><p>This is a test.</p><a href=\"http://www.google.com\" title=\"Google\">Google</a><!-- This is a comment. --><style type=\"text/css\">body {background-color: #ffffff;}</style></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_COMMENT_AND_STYLE = "Test This is a test. Google";
		private static final String HTML_CONTENT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_SCRIPT_AND_STYLE = "<html><head><title>Test</title></head><body><p>This is a test.</p><a href=\"http://www.google.com\" title=\"Google\">Google</a><script type=\"text/javascript\">var a = 1;</script><style type=\"text/css\">body {background-color: #ffffff;}</style></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_SCRIPT_AND_STYLE = "Test This is a test. Google";
		private static final String HTML_CONTENT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_COMMENT_AND_SCRIPT_AND_STYLE = "<html><head><title>Test</title></head><body><p>This is a test.</p><a href=\"http://www.google.com\" title=\"Google\">Google</a><!-- This is a comment. --><script type=\"text/javascript\">var a = 1;</script><style type=\"text/css\">body {background-color: #ffffff;}</style></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_COMMENT_AND_SCRIPT_AND_STYLE = "Test This is a test. Google";
		private static final String HTML_CONTENT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_COMMENT_AND_SCRIPT_AND_STYLE_AND_TAG = "<html><head><title>Test</title></head><body><p>This is a test.</p><a href=\"http://www.google.com\" title=\"Google\">Google</a><!-- This is a comment. --><script type=\"text/javascript\">var a = 1;</script><style type=\"text/css\">body {background-color: #ffffff;}</style><a href=\"http://www.yahoo.com\">Yahoo</a></body></html>";
		private static final String PLAIN_TEXT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_COMMENT_AND_SCRIPT_AND_STYLE_AND_TAG = "Test This is a test. Google Yahoo";
		private static final String HTML_CONTENT_WITH_TAG_AND_ATTRIBUTE_AND_VALUE_AND_COMMENT_AND_SCRIPT_AND_STYLE_AND_