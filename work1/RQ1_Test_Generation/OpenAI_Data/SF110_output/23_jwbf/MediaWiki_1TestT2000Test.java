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
	}
}

// MediaWiki_2Test.java
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
class MediaWiki_2Test {
		
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
	}
}

// MediaWiki_3Test.java
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
class MediaWiki_3Test {
		