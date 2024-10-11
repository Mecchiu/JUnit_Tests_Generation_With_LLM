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
		public static final String HTML="<html></html>";

//	final InputStream in = HtmlContentParser_0Test.class.getResourceAsStream("/HTML_ContentParser_Test.html");

	final Reader in = HtmlContentParser_0Test.class.getResourceAsReader("/HTML_ContentParser_Test.html");

	final static Log log = LogFactory.getLog(HtmlContentParser_0Test.class);
	private static final Class<?> getClass(InputStream from, Class<?> superclass) {
		assertTrue("Should return superclass",superclass.equals(StringContentParser.class));
		return (Class<?>) from.read(); 
	}

	@Test
	public void getClassTest() throws Exception {
		String readString = extractPlainText(in);
		assertNotNull(getClass(HtmlContentParser.class.getResourceAsStream("/ContentParser_Test.html"), HtmlContentParser.class));
		assertNotNull(getClass(HtmlContentParser_0Test.class.getResourceAsStream("/HTML_ContentParser_Test.html"), HtmlContentParser_0Test.class));
	}

	@Test
	public void extractPlainText() throws Exception {
    	assertEquals(HTML,"<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    }
}