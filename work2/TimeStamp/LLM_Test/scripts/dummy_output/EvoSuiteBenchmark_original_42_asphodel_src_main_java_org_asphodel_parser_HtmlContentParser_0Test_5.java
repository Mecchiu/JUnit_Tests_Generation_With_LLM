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
		
    private static Log log = LogFactory.getLog(HtmlContentParser_0Test.class);
    private HtmlContentParser parser = new HtmlContentParser();

    @Test
    public void test() throws Exception {
        Source source = new Source();
        source.setUrl("http://www.w3.org/TR/html4/");

        String htmlContent = parser.extractPlainText(source.getStream());
        assertNotNull(htmlContent);
        System.out.println(htmlContent);
        assertNotNull(htmlContent.startsWith("<"));
        System.out.println(htmlContent);

        Source contentSource = new Source(htmlContent);
        String plainHtmlContent = parser.extractText(contentSource.getStream());
        assertNotNull(plainHtmlContent);
        System.out.println(plainHtmlContent);
        assertNotNull(plainHtmlContent.startsWith("<"));
        System.out.println(plainHtmlContent);
    }

    @Test
    public void test_Url() throws Exception {
        Source source = new Source();
        source.setUrl("http://www.w3.org");
        String plainHtmlContent = parser.extractText(source.getStream());
        assertNotNull(plainHtmlContent);
        System.out.println(plainHtmlContent);
        assertNotNull(plainHtmlContent.startsWith("<"));
        System.out.println(plainHtmlContent);

        Source contentSource = new Source(plainHtmlContent);
        String htmlContent = parser.extractText(contentSource.getStream());
        String plainHtmlContent = parser.extractText(htmlContent);
        assertNotNull(plainHtmlContent);
        assertFalse(plainHtmlContent.startsWith("<"));
        System.out.println(plainHtmlContent);
        assertNotNull(plainHtmlContent.startsWith("<"));
        System.out.println(plainHtmlContent);
    }
}