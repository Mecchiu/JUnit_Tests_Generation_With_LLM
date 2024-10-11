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
		
    protected Log getLog() {
        return LogFactory.getLog(getClass());
    }
    
	public static void main(String args[]) {
		String filePath = "./TestContent.html";
		HtmlContentParser parser = null;
		try {
			parser = new HtmlContentParser();
			StringBuilder testContent = new StringBuilder();
			testContent.append("<html>\n");
			testContent.append("<head><title></title><link rel=\"stylesheet\" type=\"text/css\" href=\\\"http://www.fasterxml.com/styles/css/test.css\\\" /></head>\n");
			testContent.append("<body>Hello World!</body>\n");
			testContent.append("</html>\n");

            InputStream inputStream = null;
			try {
				inputStream = parser.extractText(new Source(new URL(filePath)));
			} catch (IOException ex) {
				getLog().error(ex);
			} finally {
				if (InputStream.class.isInstance(inputStream)) {
					try {
						inputStream.close();
					} catch (IOException e) {}
				}
				if (inputStream!= null) {
					try {
						inputStream.close();
					} catch (IOException e) {}
				}
			}
			System.out.println(testContent);
		}
		catch (Exception e) {
			getLog().error(e);
		}
    }

}