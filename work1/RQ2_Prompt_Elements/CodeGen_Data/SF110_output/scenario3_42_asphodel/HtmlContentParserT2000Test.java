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
/** {@link Log} - to  logger. */
		private final static Log logger = LogFactory.getLog(HtmlContentParserTest.class);
		
                private HtmlContentParser parser = new HtmlContentParser();
     
        private final static String SOURCE = "{http://asphodel.org/source/xml/}";
 
        
        /** test case 1. Test parser with no html or text content */
        @Test
        void testEmptySource() throws IOException {
                doTest(SOURCE);
        }
                
        /** test case 1. Test parser with text Content */
        @Test
        void testTextContent() throws IOException {
                logger.debug("test textContent");

                InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("parser_test_content.xml");
                Reader out = Thread.currentThread().getContextClassLoader().getResourceAsReader("p_test.html");
                assertTrue("parser.extractPlainText(".concat(SOURCE))",parser.extractPlainText(SOURCE).startsWith("<"));
        }
 
        /** test case 2. Test parser with text content and no html */
        @Test
        void testTextContentAndNoHtml() throws IOException {
                        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("parser_test_content.xml");
                        assertNotNull(in);

                logger.debug("test text content and no html");

                Reader reader = new InputStreamReader(in) {
                        @Override
                        public int read() throws java.io.IOException {
                                  throw new IOException("No stream could be retrieved");
                        }
                        @Override
                        public void close() throws java.io.IOException {
                        }
                };
                Source result = Source.parse(reader);
                                                 
                assertNotNull("result null",result);
                assertEquals("result not parsed", "html", result.getElement());
        }
 
        /** test case 3. Test parser with html content and no html */
        @Test
        void testHtmlContentAndNoHtml() throws IOException {
                        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("parser_test_content.xml");
                        assertNotNull(in);

                logger.debug("test html content and no html");

                //no html content
                InputStreamReader inReader = new InputStreamReader(in);
                                                           
                Source result = Source.parse(inReader);
                                                           
                assertNotNull("result null",result);
                assertEquals("result not parsed", "text", result.getElement());
        }
 
        
        /** test case 4. Test parser with html and text content */
        @Test
        void testHtmlAndText() throws IOException {
                logger.debug("test html and text");

                InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("parser_test_content.xml");
                Reader reader = new InputStreamReader(in);
                Result result = parser.extractPlainText(reader);
                                                 
                assertEquals("result not parsed", "text", result.getElement());
        }

    
        @Test
        void testNotFoundSource() throws IOException {
                logger.debug("test not found source");
                
                InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("parser_test_content.xml");
                InputStream source = Thread.currentThread().getContextClassLoader().getResourceAsStream("parser_test_not_text.xml");
                                  
                Source result = Source.parse(source);
                                   
                assertEquals("result wrong", "text", result.getElement());
        }
 
}
