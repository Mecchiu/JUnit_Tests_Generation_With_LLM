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
		    
	@Test
    void testContent(){
		   log.info("extractPlainText(content, reader)");
		   Source htmlContentSource = new Source();
		   Source contentSource = new Source("<html>This is a test content.</html>");
		   contentSource.setURL(new URL("http://some.url"));
		   String plainText = htmlContentSource.createText(contentSource);
		   StringReader stringReader = new StringReader(plainText);
		   InputStream inputStream = stringReader;
		   System.out.println("content=");
		   String content = extractPlainText(inputStream);
	}
	
	@Test
    void testContentUsingReader(){
		   log.info("extractPlainText(content)");
		   InputStream inputStream = getClass().getResourceAsStream("/au/id/jericho/lib/html/htmlContentParser.xml");
		   String plainText = extractPlainText(inputStream);
	}
}