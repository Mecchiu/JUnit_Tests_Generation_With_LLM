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
		
    /**
     * Hmtl for plain ContentParserTest.java
     */
    public static final String PLAIN_CONTENT_CONTENT = "<html></html>";

	private ContentParser contentParser;

    /**
     * Main
     */
    public HtmlContentParserTest() {
		this.contentParser = new HtmlContentParser();
    }

	@Test
    public void test() throws IOException {
		// Test contentParser.extractPlainText(PLAIN_CONTENT_CONTENT)
                assertEquals(PLAIN_CONTENT_CONTENT, this.contentParser.extractPlainText(
                        PLAIN_CONTENT_CONTENT));

                this.contentParser.extractPlainText("<link></link>");

                // if not found, then it will fail
                assertNotEquals(null, this.contentParser.extractPlainText("<link/>"));

	}

	// HTMLContentParserTest.java

	/**
	* The contentParser test will only test contentParser
	* and parser for HTML.
	*/
	public interface ContentParser {

        public String extractPlainText(String contentString) throws UnknownHtmlContentException,
                ContentParserException;

        public String extractText(Reader reader) throws ContentParserException;

        public String extractText(InputStream inputStream) throws ContentParserException;

        public String extractText(URL url) throws ContentParserException;

	}

	// HTMLTest.java

	/**
	 * Test with HTML content parser.
	 */
	public class HtmlContentParserTestHtmlParser extends HtmlContentParserTest {

        public void test() {
                super.test();
        }
	}

}