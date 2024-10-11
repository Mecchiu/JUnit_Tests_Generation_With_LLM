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
		static final Set<String> DATE_PATTERN = new HashSet<String>();
						// Note the pattern to include the current date and time
		static {
				// 1st testcase is all white space
				// 2nd testcase is date time format
				// 3rd testcase is date
				// 4th test case is no regex in MediaWiki: http://wiki.mediawiki.net/
				DATE_PATTERN.add("yyyy-MM-dd");
				// 5th testcase is a non-empty regex
				// 5th testcase is a date (with a time stamp)

		}

	/**
	 * Test method for {@link MediaWiki#encode(String)}.
	 */
	@Test
	public void testEncode() {
    String str = MediaWiki.encode(null);
		System.out.println(str);
        assertEquals("&lt;","<");
		str = MediaWiki.encode("");
		System.out.println(str);
		assertEquals("&amp;lt;","&");
		str = MediaWiki.encode("aaa");
		System.out.println(str);
		assertEquals("&amp;a;bbb;", "&a;bb;;");
/*
		str = MediaWiki.encode("\"&lt;");
		System.out.println(str);
		assertEquals("&LT;", "<");
*/
		try{
			str = MediaWiki.encode("aaaa");
		}catch(UnsupportedEncodingException e) {
			fail(e.toString());
		}finally{
			assertTrue(!str.startsWith("&lt;")); 
		}
		Set<String> set = new HashSet<String>();
		set.addAll(DATE_PATTERN);
		str = MediaWiki.encode("" + set);
		System.out.println(str);
		assertEquals(set.toString(), "<");
	}
}