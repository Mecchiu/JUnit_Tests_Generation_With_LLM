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
* It contains ten unit test cases for the {@link MediaWiki#getCharset()} method.
*/
class MediaWiki_0Test {

		/**
		 * Test method for {@link MediaWiki#getCharset()}.
		 */
		@Test
		void testGetCharset() {
				assertEquals("UTF-8", MediaWiki.getCharset());
		}
		
		/**
		 * Test method for {@link MediaWiki#encode(String)}.
		 * @throws UnsupportedEncodingException 
		 */
		@Test
		void testEncode() throws UnsupportedEncodingException {
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
				assertEquals(URLEncoder.encode("%", MediaWiki.getCharset()), MediaWiki.encode("%"));
				assertEquals(URLEncoder.encode("&", MediaWiki.getCharset()), MediaWiki.encode("&"));
				assertEquals(URLEncoder.encode("+", MediaWiki.getCharset()), MediaWiki.encode("+"));
				assertEquals(URLEncoder.encode("=", MediaWiki.getCharset()), MediaWiki.encode("="));
				assertEquals(URLEncoder.encode("?", MediaWiki.getCharset()), MediaWiki.encode("?"));
				assertEquals(URLEncoder.encode("#", MediaWiki.getCharset()), MediaWiki.encode("#"));
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
		}
		
		/**
		 * Test method for {@link MediaWiki#decode(String)}.
		 */
		@Test
		void testDecode() {
				assertEquals(" ", MediaWiki.decode("%20"));
				assertEquals("%", MediaWiki.decode("%25"));
				assertEquals("&", MediaWiki.decode("%26"));
				assertEquals("+", MediaWiki.decode("%2B"));
				assertEquals("=", MediaWiki.decode("%3D"));
				assertEquals("?", MediaWiki.decode("%3F"));
				assertEquals("#", MediaWiki.decode("%23"));
				assertEquals(" ", MediaWiki.decode("%20"));
				assertEquals(" ", MediaWiki.decode("%20"));
				assertEquals(" ", MediaWiki.decode("%20"));
		}
		
		/**
		 * Test method for {@link MediaWiki#getCharset()}.
		 */
		@Test
		void testGetCharset_0() {
				assertEquals("UTF-8", MediaWiki.getCharset());
		}
		
		/**
		 * Test method for {@link MediaWiki#encode(String)}.
		 * @throws UnsupportedEncodingException 
		 */
		@Test
		void testEncode_0() throws UnsupportedEncodingException {
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
				assertEquals(URLEncoder.encode("%", MediaWiki.getCharset()), MediaWiki.encode("%"));
				assertEquals(URLEncoder.encode("&", MediaWiki.getCharset()), MediaWiki.encode("&"));
				assertEquals(URLEncoder.encode("+", MediaWiki.getCharset()), MediaWiki.encode("+"));
				assertEquals(URLEncoder.encode("=", MediaWiki.getCharset()), MediaWiki.encode("="));
				assertEquals(URLEncoder.encode("?", MediaWiki.getCharset()), MediaWiki.encode("?"));
				assertEquals(URLEncoder.encode("#", MediaWiki.getCharset()), MediaWiki.encode("#"));
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
		}
		
		/**
		 * Test method for {@link MediaWiki#decode(String)}.
		 */
		@Test
		void testDecode_0() {
				assertEquals(" ", MediaWiki.decode("%20"));
				assertEquals("%", MediaWiki.decode("%25"));
				assertEquals("&", MediaWiki.decode("%26"));
				assertEquals("+", MediaWiki.decode("%2B"));
				assertEquals("=", MediaWiki.decode("%3D"));
				assertEquals("?", MediaWiki.decode("%3F"));
				assertEquals("#", MediaWiki.decode("%23"));
				assertEquals(" ", MediaWiki.decode("%20"));
				assertEquals(" ", MediaWiki.decode("%20"));
				assertEquals(" ", MediaWiki.decode("%20"));
		}
		
		/**
		 * Test method for {@link MediaWiki#getCharset()}.
		 */
		@Test
		void testGetCharset_1() {
				assertEquals("UTF-8", MediaWiki.getCharset());
		}
		
		/**
		 * Test method for {@link MediaWiki#encode(String)}.
		 * @throws UnsupportedEncodingException 
		 */
		@Test
		void testEncode_1() throws UnsupportedEncodingException {
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
				assertEquals(URLEncoder.encode("%", MediaWiki.getCharset()), MediaWiki.encode("%"));
				assertEquals(URLEncoder.encode("&", MediaWiki.getCharset()), MediaWiki.encode("&"));
				assertEquals(URLEncoder.encode("+", MediaWiki.getCharset()), MediaWiki.encode("+"));
				assertEquals(URLEncoder.encode("=", MediaWiki.getCharset()), MediaWiki.encode("="));
				assertEquals(URLEncoder.encode("?", MediaWiki.getCharset()), MediaWiki.encode("?"));
				assertEquals(URLEncoder.encode("#", MediaWiki.getCharset()), MediaWiki.encode("#"));
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki