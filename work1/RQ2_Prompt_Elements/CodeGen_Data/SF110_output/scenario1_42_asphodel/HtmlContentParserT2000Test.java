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
Log log = LogFactory.getLog(this.getClass().getName());
		TestCase tcase;

		public HtmlContentParserTest() {
		}

    
		@Test
		public void test() throws IOException {
            String url = "http://idl.idlh.org/IDL/html/element.html#e1d2fa4d6b00f8dc8c9e085d0e17f31e";
			tcase = new TestCase(url, "html content");
			log.info(tcase.getMethodName());
			String result;
			try {
				InputStream reader = this.getClass().getResourceAsStream("test.txt");
				Reader r = new com.asphodel.parser.parser.IDLContentParser2().getInputStreamReader(reader);
				result = this.extractPlainText(tcase.getRequestInfo().getRequestUrl().openStream());
				tcase.tearDown();
			} catch (Throwable t) {
				tcase.tearDown();
				t.printStackTrace();
				fail(t.getMessage());
			}
			assertEquals( result, tcase.getExpected(), tcase.getErrorMessage());
    }
}
