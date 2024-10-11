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
		 * Test the
		 * {@link MediaWiki#getCharset()}
		 * method for {@link MediaWiki#setCharset(String)}
		 * and {@link MediaWiki#getCharset()}
		* @throws UnsupportedEncodingException
		* @throws UnsupportedEncodingException
		*/
		@Test
		public void testGetCharset() {
			String target = "mediawiki/default/charset=UTF-8";
			String result = MediaWiki.getCharset().trim();
			if (result.equalsIgnoreCase(target)) {
				assertTrue(result.equals(target));
			} else {
				assertEquals(target, result);
			}
			try {
				MediaWiki.setCharset(null);
				assertTrue(MediaWiki.getCharset().equalsIgnoreCase("UTF-8"));
			} catch (UnsupportedEncodingException expected) {
				assertTrue(false);
			}
			String badTarget = "jwt/bad/path=path";
			if (badTarget.equals("mediawiki/default/charset=UTF-8")) {
				assertTrue(MediaWiki.getCharset().equalsIgnoreCase("UTF-8"));
			}
		}

		/**
		 * Test the
		 * {@link MediaWiki#getCharset()}
		 * method for {@link MediaWiki#setCharset(String)}
		 * and {@link MediaWiki#getCharset()}
		 *
		 * @throws UnsupportedEncodingException
		 * @throws UnsupportedEncodingException
		 */
		@Test
		public void testSetCharset() {

			String target = "hello=world";
			try {
				MediaWiki.setCharset("hello");
				assertTrue(false);
			} catch (UnsupportedEncodingException expected) {
				assertTrue(true);
			}
			String badTarget = "jwt/bad/path=path";
			if (badTarget.equals("hello|JWTPATH")) {
				assertTrue(MediaWiki.setCharset(null).equalsIgnoreCase("UTF-8"));
			}
			String url = "jwt/path=path/meh";
			// String text = "#jwt";
			// String encodedText = MediaWiki.encodedText(text);
			// String uri = MediaWiki.getMediaObject(encodedText);
			// assertTrue("hello=world", MediaWiki.matches(uri, "hello=world"));

			String charset = MediaWiki.getCharset();
			Set<String> charsetSet = new HashSet<>();
			if(charset.equals("UTF-8")) {
				charsetSet.add("UTF-8");
			} else if (charset.startsWith("GBK")) {
				charsetSet.add("GBK");
			} else if (charset.startsWith("Shift_JIS")) {
				charsetSet.add("Shift_JIS");
			} else if (charset.startsWith("UTF-16")) {
				charsetSet.add("UTF-16");
			}
			for(String tmp : charsetSet) {
				if (charset.equals(tmp)) {
					throw new Exception();
				}
			}
			assertFalse(charsetSet.contains("GBK"));
			assertFalse(charsetSet.contains("UTF-8"));
			assertFalse(charsetSet.contains("UTF-16"));
			charsetSet = new HashSet<>(1, 1);
			assertFalse(charsetSet.contains("GBK"));
			assertFalse(charsetSet.contains("UTF-8"));
			assertFalse(charsetSet.contains("UTF-16"));
			System.out.println(charsetSet);
			if (charsetSet.size() > 0) {
				throw new Exception();
			}
			// System.out.println(charsetSet);
			assertTrue("jwt/bad/path=path//meh", MediaWiki.matches(url, "jwt/bad/path=path//meh"));
			// // TODO: need a different test - see MediaWikiTest
			// assertTrue("hello=world", MediaWiki.matches("hello=world", new String[]{"jwtpath","hello","jwtpath"}));
		}

}