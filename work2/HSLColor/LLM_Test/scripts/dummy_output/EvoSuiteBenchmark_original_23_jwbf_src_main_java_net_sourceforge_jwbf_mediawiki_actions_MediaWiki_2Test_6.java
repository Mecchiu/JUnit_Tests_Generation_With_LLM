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
* It contains one unit test case for the {@link MediaWiki#decode(String)} method.
*/
class MediaWiki_2Test {
		/**
		 * Test method for {@link net.sourceforge.jwbf.mediawiki.actions.MediaWiki#MediaWiki#decode(java.lang.String)}.
		 * @throws URISyntaxException 
		 * */
		@Test
		public void testDecode() throws URISyntaxException {
//		// Get the URLs for the Wiki page to make some assertions on.

////		// Make sure the wiki page is properly encoded (in the form).

////		// Set of all the possible URLs for the Wiki page (that are not encoded).
			String[] encodedWikipages = {"wikipedia.org", "wiktionary.org"};
			Set<String> actual = new HashSet<>();
			for(int i = 0; i < encodedWikipages.length; i++) {
				String encoded = URLEncoder.encode(encodedWikipages[i], "UTF-8");
				String canonical = encoded;
				canonical = canonical.replace(encodedWikipages[i], "");
				actual.add(canonical);
			}
			for(int i = 0; i < encodedWikipages.length; i++) {
				assertNotNull("encodedWikipages[i] should not be null", encodedWikipages[i]);
				assertNotNull("encodedWikipages[i] should not be null", canonicalWikipages[i]);
				String actualEncoded = encodedWikipages[i];
				String actualCanonical = canonicalWikipages[i];
				if(actual.contains(encodedWikipages[i]))
					actual = new HashSet<>(actual);
				if(!actual.contains(actualCanonical))
					actual.add(actualCanonical);
				// The Wikipedia URI to decode.
				assertNotNull("encodedWikipages should not be null", encodedWikipages[i]);
				String encodedWikipage = URLEncoder.encode(encodedWikipages[i], "UTF-8");
				String wikipage = canonical.substring(encodedWikipages[i].length());
				assertEquals("wikipage", encodedWikipage, wikipage);
				String wikipageCanonical = canonical.substring(encodedWikipages[i].length());
				assertEquals("wikipaged canonical", encodedWikipageCanonical, wikipageCanonical);
			}
			for(int i=0; i < encodedWikipages.length; i++) { // we want to assert that it did not change.
				assertNotNull("encodedWikipages[i] should not be null", encodedWikipages[i]);
				assertNotNull("encodedWikipages[i] should not be null", canonicalWikipages[i]);
				String encodedWikipage = URLEncoder.encode(encodedWikipages[i], "UTF-8");
				String wikipage = canonical.substring(encodedWikipages[i].length());				
				assertNotNull("encodedWikipage should not be null", encodedWikipage);
				assertEquals("encodeWikipage", encodedWikipage, wikipage);
				assertNotNull("encodeWikipage should not be null", canonicalWikipages[i]);
				String canonicalWikipage = URLEncoder.encode(canonical.substring(encodedWikipages[i].length()), "UTF-8");
				assertNotNull("canonicalWikipage should not be null", canonicalWikipage);
				assertEquals("encodeCanonicalWikipage", canonicalWikipage, wikipageCanonical);
				assertEquals("equal", new Integer(encodedWikipages.length - i), codecs.toLength(canonicalWikipage));
			}
		}

//		/**
		// Test method for {@link net.sourceforge.jwbf.mediawiki.actions.MediaWiki#decode(java.lang.String[])}.
		@Test
		public void testDecode_Array_String() throws UnsupportedEncodingException {
//		// Create a Set of all the possible URLs for the Wiki page to make some assertions on.
//		String[] encodedWikipages = {"wikipedia.org", "wiktionary.org"};
//		Set<String> actual = new HashSet<>();
//		for(int i = 0; i < encodedWikipages.length; i++) {
//			assertNotNull("encodedWikipages[i] should not be null", encodedWikipages[i]);
//			assertNotNull("encodedWikipages[i] should not be null", canonicalWikipages[i]);
//			String actualEncoded = encodedWikipages[i];
//			String actualCanonical = canonicalWikipages[i];
//			if(actual.contains(encodedWikipages[i]))
//				actual = new HashSet<>(actual);
//			if(!actual.contains(actualCanonical))
//				actual.add(actualCanonical);
//			// The Wikipedia URI to decode.
//			assertNotNull("encodedWikipages should not be null", encodedWikipages[i]);
//			String encodedWikipage = URLEncoder.encode(encodedWikipages[i], "UTF-8");
//			String wikipage = canonical.substring(encodedWikipages[i].length());
//			assertEquals("wikipage", encodedWikipage, wikipage);
//			String wikipageCanonical = canonical.substring(encodedWikipages[i].length());
//			assertEquals("wikipaged canonical", encodedWikipageCanonical, wikipageCanonical);
//		}
		}
		}