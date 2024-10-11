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
		Source contentSource;
    
  @Test
    public void test_0() throws Exception {
		HtmlContentParser thisParser = new HtmlContentParser(this.contentSource);
		String extractPlainText = thisParser.extractPlainText(this.contentSource.getContentStream());
		checkNotEmpty(extractPlainText,"Extract text failed. content was empty");
		assertNotNull(extractPlainText);
		assertFalse(extractPlainText.startsWith("<html"));
		assertFalse(extractPlainText.startsWith("<?xml"));
		assertFalse(extractPlainText.startsWith("<body"));
		assertFalse(extractPlainText.startsWith("<script"));
        }
  void checkNotEmpty(String contentString, String errorMessage) {
		if (log.isWarnEnabled()) {
	        log.warn(contentString + " should contain '\\n' to be skipped by Tomcat", errorMessage);
    	}
	}

	@Test
	public void test_1() throws Exception {
		InputStream inputStream = this.contentSource.getInputStream();
		try {
			String content = IOUtil.toString(inputStream);
			checkNotEmpty(content, "Content is empty at first");
            assertNotNull(content);
        } finally {
	        inputStream.close();
        }  
    }


    public void assertNoDuplicate(String actual, String expected) {
        assertFalse(actual.contains(expected));
    }
 
  void assertEquals(int expected, int actual) {
        if (expecteds == actual) return;
        assertEquals(expecteds, actual, "Expected: " + expected + "\nActual: " + actual);
  } 

}