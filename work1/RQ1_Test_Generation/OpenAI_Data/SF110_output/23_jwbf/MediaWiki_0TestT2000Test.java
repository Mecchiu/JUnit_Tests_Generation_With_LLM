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
		}
		
		/**
		 * Test method for {@link MediaWiki#decode(String)}.
		 */
		@Test
		void testDecode() {
				assertEquals(" ", MediaWiki.decode(" "));
		}
		
		/**
		 * Test method for {@link MediaWiki#getLast()}.
		 */
		@Test
		void testGetLast() {
				assertEquals(MediaWiki.Version.MW1_18, MediaWiki.Version.getLast());
		}
		
		/**
		 * Test method for {@link MediaWiki#getLatest()}.
		 */
		@Test
		void testGetLatest() {
				assertEquals(MediaWiki.Version.MW1_18, MediaWiki.Version.getLatest());
		}
		
		/**
		 * Test method for {@link MediaWiki#getNumber()}.
		 */
		@Test
		void testGetNumber() {
				assertEquals("1.18", MediaWiki.Version.MW1_18.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#getIntValue()}.
		 */
		@Test
		void testGetIntValue() {
				assertEquals(118, MediaWiki.Version.MW1_18.getIntValue());
		}
		
		/**
		 * Test method for {@link MediaWiki#greaterEqThen(Version)}.
		 */
		@Test
		void testGreaterEqThen() {
				assertTrue(MediaWiki.Version.MW1_18.greaterEqThen(MediaWiki.Version.MW1_17));
		}
		
		/**
		 * Test method for {@link MediaWiki#valuesStable()}.
		 */
		@Test
		void testValuesStable() {
				assertEquals(15, MediaWiki.Version.valuesStable().length);
		}
		
		/**
		 * Test method for {@link MediaWiki#BOT_GROUPS}.
		 */
		@Test
		void testBOT_GROUPS() {
				Set<String> set = new HashSet<String>();
				set.add("bot");
				assertEquals(set, MediaWiki.BOT_GROUPS);
		}
}

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
* It contains ten unit test cases for the {@link MediaWiki#getCharset()} method.
*/
class MediaWikiTest {
		
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
		}
		
		/**
		 * Test method for {@link MediaWiki#decode(String)}.
		 */
		@Test
		void testDecode() {
				assertEquals(" ", MediaWiki.decode(" "));
		}
		
		/**
		 * Test method for {@link MediaWiki#getLast()}.
		 */
		@Test
		void testGetLast() {
				assertEquals(MediaWiki.Version.MW1_18, MediaWiki.Version.getLast());
		}
		
		/**
		 * Test method for {@link MediaWiki#getLatest()}.
		 */
		@Test
		void testGetLatest() {
				assertEquals(MediaWiki.Version.MW1_18, MediaWiki.Version.getLatest());
		}
		
		/**
		 * Test method for {@link MediaWiki#getNumber()}.
		 */
		@Test
		void testGetNumber() {
				assertEquals("1.18", MediaWiki.Version.MW1_18.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#getIntValue()}.
		 */
		@Test
		void testGetIntValue() {
				assertEquals(118, MediaWiki.Version.MW1_18.getIntValue());
		}
		
		/**
		 * Test method for {@link MediaWiki#greaterEqThen(Version)}.
		 */
		@Test
		void testGreaterEqThen() {
				assertTrue(MediaWiki.Version.MW1_18.greaterEqThen(MediaWiki.Version.MW1_17));
		}
		
		/**
		 * Test method for {@link MediaWiki#valuesStable()}.
		 */
		@Test
		void testValuesStable() {
				assertEquals(15, MediaWiki.Version.valuesStable().length);
		}
		
		/**
		 * Test method for {@link MediaWiki#BOT_GROUPS}.
		 */
		@Test
		void testBOT_GROUPS() {
				Set<String> set = new HashSet<String>();
				set.add("bot");
				assertEquals(set, MediaWiki.BOT_GROUPS);
		}
}

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
* It contains ten unit test cases for the {@link MediaWiki#getCharset()} method.
*/
class MediaWikiTest {
		
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
		void testEncode() throws UnsupportedEnc