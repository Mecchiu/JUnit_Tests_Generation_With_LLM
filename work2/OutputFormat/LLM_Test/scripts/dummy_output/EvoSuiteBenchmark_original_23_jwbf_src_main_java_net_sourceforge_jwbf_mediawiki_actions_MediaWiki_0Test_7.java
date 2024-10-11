// MediaWiki_0Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains one unit test case for the {@link MediaWiki#getCharset()} method.
*/
class MediaWiki_0Test {
		
	/**
	 * @throws UnsupportedEncodingException 
	 * @see String
	 * @see MediaWiki#getCharset()
	 */
    @Test
	void getCharset() throws UnsupportedEncodingException {
		String result = MediaWiki.getCharset();
		assertNotNull(result);
		assertEquals(getEncoded(result), result);
	}

	/**
	* @throws UnsupportedEncodingException 
	* @see String
	* @see MediaWiki#getCharset()
	* @see MediaWiki#getCharset(String)
	* @see MediaWiki#getEncoded(String)
	*/
	@Test
	void getEncodingCharset() throws UnsupportedEncodingException {
		Set<String> encodings = new HashSet<>();
		encodings.add("UTF-8");
		encodings.add("UTF-16");
		encodings.add("UTF-16BE");
		encodings.add("UTF-16LE");
        encodings.add("UTF-16");
		String result = MediaWiki.getEncodingCharset(encodings);
		assertNotNull(result);
		assertEquals(result, "UTF-8");
                
	}

	private static String getEncoded(String result) throws UnsupportedEncodingException {
		return URLUtil.encode(result);
	}

	private String getEncoded(String encodedCharset) {
                    return URLUtil.encode(encodedCharset);
                }
}