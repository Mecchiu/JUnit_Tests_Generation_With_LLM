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
		* Test of getCharset method, of class MediaWiki.
		*/
		@Test
		void testGetCharset() {
			System.out.println("getCharset");
			assertEquals("UTF-8", MediaWiki.getCharset());
			System.out.println("getCharset(\"UTF-8\")");
		}
		
		/**
		* Test of getCharset method, of class MediaWiki.
		*/
		@Test
		void testGetCharsetWithCustomCharset() {
			System.out.println("getCharsetWithCustomCharset");
			assertEquals("UTF-8", MediaWiki.getCharset(Content.UTF8.toString()));
			System.out.println("getCharsetWithCustomCharset(\"UTF-8\")");
		}
		
		/**
		* Test of hasCharset method, of class MediaWiki.
		*/
		@Test
		void testHasCharset() {
			System.out.println("hasCharset");
			assertFalse(MediaWiki.hasCharset("UTF-256-Cp-Uz"));
			assertFalse(MediaWiki.hasCharset("UTF-256-Uz"));
			System.out.println("hasCharset(\"UTF-128\");");
			assertTrue(MediaWiki.hasCharset("UTF-128"));
		}
		
		/**
		* Test of parseContent method, of class MediaWiki.
		*/
		@Test
		void testParseContent() {
			System.out.println("parsing a byte[] given a byte[] with content");
			assertEquals("myContent", MediaWiki.parseContent("myContent"));
			assertEquals("test", MediaWiki.parseContent("test"));
		}
		
		/**
		* Test of urlEncode method, of class MediaWiki.
		*/
		@Test
		void testUrlEncode() {
			System.out.println("urlEncode");
			assertEquals("&=_A3=_R%20O__%A4%D6=_UZ", MediaWiki._encode("test", Content.UTF8));
			assertEquals("test&=+%3ab", MediaWiki._encode("test", Content.UTF8.and(Content.UNICODE)));
			assertEquals("%2B", MediaWiki.UTF8.and(Content.UNICODE));
			Set<String> charsetSet = new HashSet<String>();
			charsetSet.add(Content.UTF8.toString());
			charsetSet.add(Content.UNICODE.toString());
			assertEquals("?=&", URLUtils.urlDecode(MediaWiki._encode("?", charsetSet)));
		}
		
		/**
		* Test of urlDecode method, of class MediaWiki.
		*/
		@Test
		void testUrlDecode() {
			System.out.println("urlDecode");
			assertEquals("?/?_Z=_X=_Y", URLUtils.urlDecode("?/%20-_-z"));
			assertEquals("?/?_Z=_X=_Y", URLUtils.urlDecode("?/--%20-_-z"));
			assertEquals("?/?_Z=_X=_Y", URLUtils.urlDecode("?//--_z"));
			Set<String> charsetSet = new HashSet<String>();
			charsetSet.add(Content.UTF8.toString());
			charsetSet.add(Content.UNICODE.toString());
			assertEquals("?/?_Z=_X=_Y", URLUtils.urlDecode(("?/?%20-_-z")));
		}
}