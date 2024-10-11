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
* It contains ten unit test cases for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParser_0Test {

		private static Log log = LogFactory.getLog(HtmlContentParser_0Test.class);
		
		/**
		 * Test case for method {@link HtmlContentParser#extractPlainText(String)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractPlainText_0() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractPlainText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractPlainText(String)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractPlainText_1() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractPlainText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractPlainText(String)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractPlainText_2() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractPlainText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractPlainText(String)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractPlainText_3() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractPlainText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractPlainText(String)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractPlainText_4() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractPlainText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractPlainText(String)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractPlainText_5() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractPlainText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractPlainText(String)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractPlainText_6() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractPlainText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractPlainText(String)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractPlainText_7() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractPlainText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractPlainText(String)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractPlainText_8() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractPlainText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractPlainText(String)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractPlainText_9() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractPlainText(textContent);
				assertEquals("Test Test", result);
		}
		
}

// HtmlContentParser_1Test.java
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
* It contains ten unit test cases for the {@link HtmlContentParser#extractText(Reader)} method.
*/
class HtmlContentParser_1Test {
		
		private static Log log = LogFactory.getLog(HtmlContentParser_1Test.class);
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(Reader)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_0() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(Reader)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_1() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(Reader)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_2() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(Reader)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_3() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(Reader)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_4() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(Reader)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_5() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(Reader)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_6() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(Reader)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_7() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(Reader)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_8() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(Reader)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_9() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
}

// HtmlContentParser_2Test.java
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
* It contains ten unit test cases for the {@link HtmlContentParser#extractText(InputStream)} method.
*/
class HtmlContentParser_2Test {
		
		private static Log log = LogFactory.getLog(HtmlContentParser_2Test.class);
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(InputStream)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_0() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(InputStream)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_1() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(InputStream)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_2() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(InputStream)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_3() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new HtmlContentParser().extractText(textContent);
				assertEquals("Test Test", result);
		}
		
		/**
		 * Test case for method {@link HtmlContentParser#extractText(InputStream)}.
		 * @throws ContentParserException 
		 */
		@Test
		void testExtractText_4() throws ContentParserException {
				String textContent = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
				String result = new