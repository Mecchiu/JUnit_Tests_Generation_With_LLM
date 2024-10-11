// MediaWiki_1Test.java
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
class MediaWiki_1Test {

	/**
	 * Test method for {@link MediaWiki#encode(String)}.
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	void testEncode() throws UnsupportedEncodingException {
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", MediaWiki.encode("äöüßÄÖÜß"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", MediaWiki.CHARSET));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "UTF-8"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "UTF8"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "UTF-16"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "UTF16"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-1"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_1"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-15"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_15"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-16"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_16"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-2"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_2"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-3"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_3"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-4"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_4"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-5"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_5"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-6"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_6"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-7"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_7"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-8"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_8"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-9"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_9"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-13"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_13"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-14"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_14"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-10"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_10"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-11"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_11"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-12"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_12"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-15"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_15"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-16"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_16"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-17"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_17"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-18"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_18"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO-8859-19"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder.encode("äöüßÄÖÜß", "ISO8859_19"));
		assertEquals("%C3%A4%C3%B6%C3%BC%C3%9F%C3%84%C3%96%C3%9C%C3%9F", URLEncoder