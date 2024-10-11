// MediaWikiTest.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#encode(String)} method.
*/
class MediaWikiTest {
		
	/**
	 * Test method for {@link MediaWiki#encode(String)}.
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	void testEncode() throws UnsupportedEncodingException {
		assertEquals(URLEncoder.encode(" ", "UTF-8"), MediaWiki.encode(" "));
		assertEquals(URLEncoder.encode("%", "UTF-8"), MediaWiki.encode("%"));
		assertEquals(URLEncoder.encode("+", "UTF-8"), MediaWiki.encode("+"));
		assertEquals(URLEncoder.encode("&", "UTF-8"), MediaWiki.encode("&"));
		assertEquals(URLEncoder.encode("?", "UTF-8"), MediaWiki.encode("?"));
		assertEquals(URLEncoder.encode("#", "UTF-8"), MediaWiki.encode("#"));
		assertEquals(URLEncoder.encode(" ", "UTF-8"), MediaWiki.encode(" "));
		assertEquals(URLEncoder.encode(" ", "UTF-8"), MediaWiki.encode(" "));
		assertEquals(URLEncoder.encode(" ", "UTF-8"), MediaWiki.encode(" "));
		assertEquals(URLEncoder.encode(" ", "UTF-8"), MediaWiki.encode(" "));
	}
}