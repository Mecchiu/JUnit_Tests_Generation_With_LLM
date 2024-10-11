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
		
	/**
	 * Test method for {@link HtmlContentParser#extractPlainText(java.io.InputStream)}.
	 */
	@Test
	void testExtractPlainText() {
		
	
	}

	/**
	* Test method for {@link HtmlContentParser#extractText(java.io.InputStream)}.
	*/
	@Test
	void testExtractText() {
		
	
	}

	/**
	* test method for {@link HtmlContentParser#setInputContentStream(InputStream)}.
	* 1.  setInputContentStream must set URL.
	* 2.  If it does not set URL it will throw IOException.
	*/
	
	@Test
	void testHtmlContentParser_1() {
		
	
		
		InputStream in = null;
		String test = null;
		try {
			in = new Source("http://www.gotoanyhere.com").getInputContentStream();
			test = extractPlainText(in);
		} catch (IOException e) {
			assertTrue( "IOException should not be thrown.", false); 
		}
		
		assertNotNull("Exception not thrown.", test);
		
	}
		
	

}