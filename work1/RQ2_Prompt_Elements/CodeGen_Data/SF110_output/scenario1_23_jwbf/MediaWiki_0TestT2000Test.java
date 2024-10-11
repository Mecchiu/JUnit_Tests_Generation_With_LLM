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
private final String url;
		private final Set<String> toCheck = new HashSet<>();

		public MediaWiki_0Test(String url) {
			this.url = url;
		}
		
		@Test
		public void testUrlEncoded() throws UnsupportedEncodingException {
			// getCharset()
			assertEquals(
				"",
				MediaWiki.getCharset().toString().substring(0, URL_LEN));

			// getCharset()
			String testPage = "en:wikipedia.org";
			String testReplacedUrl = "en:wikipedia.org?page=%1$s";
			toCheck.add(createUrl(testPage, testReplacedUrl));

			// the same URL should not be converted
			assertFalse(toCheck.contains("en:wikipedia.org?" + testPage));
		}

		@Test
		public void testUrl()
			throws UnsupportedEncodingException, IllegalArgumentException {
			// getCharset()
			assertEquals(
				"UTF-8",
				MediaWiki.getCharset().toString().substring(0, UTF_LEN
					+ URL_LEN));

			String testPage = "en:wikipedia.org?page=%E8%BE&page=%E5%85%84";
			String testReplacedUrl = "en:wikipedia.org?page=%E8%BE";
			toCheck.add(createUrl(testPage, testReplacedUrl));

			// the same URL should not be converted
			assertFalse(toCheck.contains("en:wikipedia.org?"
				+ createUrl(testPage, testReplacedUrl)));
		}

		private String createUrl(String page, String replacement)
			throws UnsupportedEncodingException {
			return "page="
				+ URLEncoder
						.encode(
							page.replaceAll("\\+", "%20"),
							CHARSET)
				+ "&replaced="
				+ URLEncoder.encode(replacement, CHARSET)
				+ ";";
		}
}

// MediaWiki.java
