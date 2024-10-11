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

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText2() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText3() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText4() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText5() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p><p>test5</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4 test5", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText6() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p><p>test5</p><p>test6</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4 test5 test6", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText7() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p><p>test5</p><p>test6</p><p>test7</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4 test5 test6 test7", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText8() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p><p>test5</p><p>test6</p><p>test7</p><p>test8</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4 test5 test6 test7 test8", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText9() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p><p>test5</p><p>test6</p><p>test7</p><p>test8</p><p>test9</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4 test5 test6 test7 test8 test9", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText10() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p><p>test5</p><p>test6</p><p>test7</p><p>test8</p><p>test9</p><p>test10</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4 test5 test6 test7 test8 test9 test10", plainText);
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

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText2() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText3() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText4() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText5() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p><p>test5</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4 test5", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText6() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p><p>test5</p><p>test6</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4 test5 test6", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText7() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p><p>test5</p><p>test6</p><p>test7</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4 test5 test6 test7", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText8() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p><p>test5</p><p>test6</p><p>test7</p><p>test8</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4 test5 test6 test7 test8", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText9() {
				HtmlContentParser parser = new HtmlContentParser();
				String content = "<html><head><title>test</title></head><body><p>test</p><p>test2</p><p>test3</p><p>test4</p><p>test5</p><p>test6</p><p>test7</p><p>test8</p><p>test9</p></body></html>";
				String plainText = parser.extractPlainText(content);
				assertEquals("test test test2 test3 test4 test5 test6 test7 test8 test9", plainText);
		}

		/**
		 * Test method for {@link HtmlContentParser#extractPlainText(String)}.
		 */
		@Test
		public void testExtractPlainText10() {
				HtmlContentParser parser