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
static final String contentFileName = "/content/content.xml";
		static final String contentFileLocation = "content/content.xml";

		@Test
		public void test1() throws Exception {
			Source src = new Source(getClass().getClassLoader().getResourceAsStream(contentFileLocation));
			assertNotNull(src);
			try {
				HttpParser parser = new HtmlContentParser(src);
				String extracted = parser.extractPlainText("<html></html>");
				assertEquals("<html>", extracted);
				assertFalse(parser.hasContentOfType(Source.Tag));
				assertFalse(parser.hasContentOfType(Source.Attributes));
				assertFalse(parser.hasContentOfType(Source.Text));

				src = new Source(getClass().getClassLoader().getResourceAsStream(contentFileLocation));
				parser = new HtmlContentParser(src);
				extracted = parser.extractPlainText("<html><a href=\"http://www.asphodes.org\">http://www.asphodes.org</a></html>");
				assertEquals("<html><a href=\"http://www.asphodes.org\">http://www.asphodes.org</a></html>", extracted);
				assertFalse(parser.hasContentOfType(Source.Tag));
				assertTrue(parser.hasContentOfType(Source.Attributes));
				assertFalse(parser.hasContentOfType(Source.Text));

				src = new Source(getClass().getClassLoader().getResourceAsStream(contentFileLocation));
				parser = new HtmlContentParser(src);
				extracted = parser.extractPlainText("<html><a href=\"\" type=\"text/html\">text</a></html>");
				assertEquals("<html><a href=\"\" type=\"text/html\">text</a></html>", extracted);
				assertTrue(parser.hasContentOfType(Source.Tag));
				assertFalse(parser.hasContentOfType(Source.Attributes));
				assertFalse(parser.hasContentOfType(Source.Text));

				src = new Source(getClass().getClassLoader().getResourceAsStream(contentFileLocation));
				parser = new HtmlContentParser(src);
				extracted = parser.extractPlainText("<html><a data-type=\"text/html\">text</a></html>");
				assertEquals("<html><a data-type=\"text/html\">text</a></html>", extracted);
				assertFalse(parser.hasContentOfType(Source.Tag));
				assertTrue(parser.hasContentOfType(Source.Attributes));
				assertFalse(parser.hasContentOfType(Source.Text));

				src = new Source(getClass().getClassLoader().getResourceAsStream(contentFileLocation));
				parser = new HtmlContentParser(src);
				extracted = parser.extractPlainText("<html>text
<img src='" 
		+ getClass().getClassLoader().getResourceAsStream("img/jquery.min.png"))
		
				+ "</img>
		
x</html>");
				assertEquals("<html>text
<img src='" 
		+ getClass().getClassLoader().getResourceAsStream("img/jquery.min.png"))
		
			+ "</img>
		
x</html>", extracted);
			}finally {
				parser.dispose();
			}


    }
		
}
