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
* It contains one unit test case for the {@link MediaWiki#encode(String)} method.
*/
class MediaWiki_1Test {
		@Test
		public void test() throws UnsupportedEncodingException {
				assertEquals("%D0%9F-%A9%84%AC%B8%AD%9F", new MediaWiki().encode("Провор"));
				assertEquals("%D0%9F-%A9%84%AC%B8%AD%00%D0%9F-%A9%84%AC%B8%AD%00%D0%9F-%A9%84%AC%B8%AD%00%5C%8D%B8", new MediaWiki().encode("Тогсийск"));
	}

	public static class MediaWiki extends MediaWiki_1Test {

		public static MediaWiki getInstance() {
			return new MediaWiki();
		}

		@Override
		public String encode(String text) throws UnsupportedEncodingException {
			if (text == null) return null;
			final char delimiter = text.charAt(0);
			final Set<String> encodings = new HashSet<>();

			if (delimiter > 0) {
				if (delimiter == '+') {
					encodings.add("text/plain;charset=UTF-8");
					encodings.add("text/html;charset=UTF-8");
				} else if (delimiter == '%') {
					encodings.add("text/plain;charset=UTF-8");
					encodings.add("text/html;charset=UTF-8");
					encodings.add("application/x-www-form-urlencoded;charset=UTF-8");
				} else if (delimiter == '$') {
					encodings.add("text/plain;charset=UTF-8");
					encodings.add("application/x-www-form-urlencoded;charset=UTF-8");
				} else if (delimiter == '_') {
					encodings.add("application/x-www-form-urlencoded;charset=UTF-8");
				} else if (delimiter == '*') {
					encodings.add("application/x-www-form-urlencoded;charset=UTF-8");
					encodings.add("application/xmlbob;charset=UTF-8");
				} else if (delimiter == '%' && text.length() >= 2) {
					encodings.add("application/xmlbob;charset=UTF-8");
					encodings.add("application/xmlbob2;charset=UTF-8");
					encodings.add("application/url-vnd.Microsoft.xapuniversity;charset=UTF-8");
				} else if (delimiter == ':' && text.length() >= 3) {
					encodings.add("application/rss-2;charset=UTF-8");
					encodings.add("application/atom+xml;charset=UTF-8");
					encodings.add("text/plain;charset=UTF-8");
				} else if (delimiter == '?' && text.length() >= 4) {
					encodings.add("application/cbr-1;charset=UTF-8");
					encodings.add("application/cbr+;charset=UTF-8");
				} else if (delimiter == '>') {
					encodings.add("application/rss+xml;charset=UTF-8");
				} else if ((delimiter >= 'a' && delimiter <= 'z') || (delimiter >= 'A' && delimiter <= 'Z')) {
					encodings.add(URLEncoder.encode(text, "UTF-8"));
				} else {
					throw new RuntimeException(String.format("Invalid unicode value: %s", text));
				}

			} else {
				try {
					encodings.add("text/html;charset=UTF-8");
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException("Charset for encoded text should be UTF-8");
				}
			}

			return delimiter.toString() + URLEncoder.encode(String.join(",", encodings), "UTF-8");
		}
	}
}