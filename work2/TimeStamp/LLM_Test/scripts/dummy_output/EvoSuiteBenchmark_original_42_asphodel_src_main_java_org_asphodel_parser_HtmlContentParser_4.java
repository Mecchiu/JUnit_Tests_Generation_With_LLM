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
		
    private static static final Log log = LogFactory.getLog(HtmlContentParserTest.class);
    
	/**
	 * Test method for {@link org.asphodel.parser.HtmlContentParser#extractPlainText(java.io.Reader)}.
	 * @throws org.asphodel.parser.ContentParserException
	 */
    @Test
    public void testExtractPlainText() throws ContentParserException {
    	
        String text = "Hello, this is the first line.";
        Source source = Source.parse("content", "", "test", "");

        source.setUrl(new URL("http://a.a.a.a/content/"));

        source.setLanguage("en");
        source.setEncoding("UTF-8");

        source.setSource(text);

        Source sourceRaw = Source.parse("content", "raw-text", "test", "");

        sourceRaw.setUrl(new URL("http://a.a.a.a/content/raw-text/"));

        sourceRaw.setLanguage("en");
        sourceRaw.setEncoding("UTF-8");

        sourceRaw.setSource(text);
		
        return;
    }

    @Test
    public void testExtractPlainTextWithExtraTags() throws ContentParserException {
    	
        String text = "Hello, this is the first line.";
        Source source = Source.parse("content", "", "test", "");

        source.setUrl(new URL("http://a.a.a.a/content/"));

        source.setLanguage("en");
        source.setEncoding("UTF-8");
        source.setInnerTags("<br>");

        source.setSource(text);

        Source sourceRaw = Source.parse("content", "raw-text", "test", "");

        sourceRaw.setUrl(new URL("http://a.a.a.a/content/raw-text/"));

        sourceRaw.setLanguage("en");
        sourceRaw.setEncoding("UTF-8");
        sourceRaw.setInnerTags("<br></br>");

        sourceRaw.setSource(text);
		
        return;
    }

    /**
     * Test method for {@link org.asphodel.parser.StreamContentParser#extractText(java.io.Reader)}.
     */
    @Test
    public void testExtractText() throws ContentParserException {
    	
        InputStream inputStream = null;
        String text = null;

}
}