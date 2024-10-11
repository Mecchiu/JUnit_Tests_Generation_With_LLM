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
* It contains ten unit test cases for the {@link MediaWiki#decode(String)} method.
*/
class MediaWiki_2Test {

	/**
	 * Test method for {@link MediaWiki#decode(String)}.
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	void testDecode() throws UnsupportedEncodingException {
		
		String s = "&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;";
		String expected = "äöüßÄÖÜ¤°€";
		String actual = MediaWiki.decode(s);
		assertEquals(expected, actual);
		
		s = "&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;";
		expected = "äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€";
		actual = MediaWiki.decode(s);
		assertEquals(expected, actual);
		
		s = "&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;";
		expected = "äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€";
		actual = MediaWiki.decode(s);
		assertEquals(expected, actual);
		
		s = "&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;";
		expected = "äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€";
		actual = MediaWiki.decode(s);
		assertEquals(expected, actual);
		
		s = "&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;";
		expected = "äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€";
		actual = MediaWiki.decode(s);
		assertEquals(expected, actual);
		
		s = "&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;";
		expected = "äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€";
		actual = MediaWiki.decode(s);
		assertEquals(expected, actual);
		
		s = "&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;";
		expected = "äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€";
		actual = MediaWiki.decode(s);
		assertEquals(expected, actual);
		
		s = "&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;";
		expected = "äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€";
		actual = MediaWiki.decode(s);
		assertEquals(expected, actual);
		
		s = "&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;&#x00E4;&#x00F6;&#x00FC;&#x00DF;&#x00C4;&#x00D6;&#x00DC;&#x00A7;&#x00B0;&#x20AC;";
		expected = "äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°€äöüßÄÖÜ¤°