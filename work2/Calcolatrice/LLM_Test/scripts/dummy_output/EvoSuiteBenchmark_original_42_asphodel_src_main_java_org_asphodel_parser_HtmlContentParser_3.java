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
		
    public HtmlContentParserTest(){	}

    @Test
    public void extractPlainText_Stream() throws Exception {
        Reader reader= new StringReader("<html>\n" +
                                          "<head>\n" +
                                            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                                          "</head>\n" +
                                          "<body>\n" +
                                            "<b>First tag</b>\n" +
                                          "</body>\n" +
                                          "</html>");
        Source s= Source.init("http://localhost");
        assertEquals("First tag", HtmlContentParser.extractPlainText(reader, s));
    }

    @Test
    public void extractPlainText_Source() throws Exception {
        Reader reader= new StringReader("<html>\n" +
                                          "<head>\n" +
                                            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                                          "</head>\n" +
                                          "<body>\n" +
                                            "<b>First tag</b>\n" +
                                          "</body>\n" +
                                          "</html>");
        Source s= Source.init("http://localhost");

        assertEquals("First tag", HtmlContentParser.extractPlainText(reader, s));
    }

    @Test
    public void extractPlainText_url() throws Exception {
        InputStream is= new URL("http://localhost").openStream();
        Reader reader= new StringReader("<html>\n" +
                                          "<head>\n" +
                                            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                                          "</head>\n" +
                                          "<body>\n" +
                                            "<b>First tag</b>\n" +
                                          "</body>\n" +
                                          "</html>");
        Source s= Source.init("http://localhost");

        assertEquals("First tag", HtmlContentParser.extractPlainText(reader, s));
    }

    @Test
    public void extractPlainText_URL() throws Exception {
        InputStream is= new URL("http://localhost").openStream();
        Reader reader= new InputStreamReader(is);
        Source s= Source.init("http://localhost");

        assertEquals("First tag", HtmlContentParser.extractPlainText(reader, s));
    }

    @Test
    public void extractPlainText_File() throws Exception {
        File file = new File("file-name-of-the-html-file.html");
        Reader reader= new FileReader(file);
        Source s= Source.init("http://localhost");

        assertEquals("First tag", HtmlContentParser.extractPlainText(reader, s));
    }

    @Test
    public void extractPlainText_InputStream() throws Exception {
        Reader reader= new InputStreamReader(new UrhiloIo());
        Source s= Source.init("http://localhost");

        assertEquals("First tag", HtmlContentParser.extractPlainText(reader, s));
    }

    @Test
    public void extractTextFromInputStreamToTextSource() throws Exception {
        Reader reader= new InputStreamReader(new UrhiloIo());
        Source s= Source.init("http://localhost");

        assertEquals("First tag", HtmlContentParser.extractText(reader, s));
    }

    /**
     * @param aText content as a text format, the real format of the content can be xml,html,xhtml....
     * @return plain text without extra tags or elements
     */
    public String extractPlainText(Source aText) throws ContentParserException {
        return HtmlContentParser.extractPlainText(aText);
    }

    /**
     */
    public String extractText(Source aSource) throws ContentParserException{
        return HtmlContentParser.extractText(aSource);
    }

    /**
     */
    public String extractText(String aText) throws ContentParserException {
        return HtmlContentParser.extractText(aText);
    }

    /**
     */
    public String extractText(URL aURL) throws ContentParserException {
        return HtmlContentParser.extractText(aURL);
    }

    /**
     */
    public String extractText(InputStream aInputStream) throws ContentParserException {
        return HtmlContentParser.extractText(aInputStream);
    }
}