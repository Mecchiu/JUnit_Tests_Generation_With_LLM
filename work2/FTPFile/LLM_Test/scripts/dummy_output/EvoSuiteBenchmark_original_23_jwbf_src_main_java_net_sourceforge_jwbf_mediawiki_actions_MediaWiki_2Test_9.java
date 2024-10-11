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
		
	@Test
	void singleStringValue() throws UnsupportedEncodingException {
		String test = "foobar";
		String expect = URLEncoder.encode("foobar");
		assertEquals(expect, MediaWiki.decode(test));
	}
	
	@Test
	void multiValue1() throws UnsupportedEncodingException {
		HashSet<String> test = new HashSet<String>();
		test.add("foo");
		test.add("bar");
		
		Set<String> expect = new HashSet<String>();
		expect.add(URLEncoder.encode("foo"));
		expect.add(URLEncoder.encode("bar"));
		
		String result = MediaWiki.decode(test);
		Set<String> result2 = MediaWiki.decodeSet(result);
		assertTrue(result2.equals(expect));
	}
	
	@Test
	void multiValue2() throws UnsupportedEncodingException {
		HashSet<String> test = new HashSet<String>();
		test.add("foo");
		test.add("bar");
		test.add("baz");
		test.add("quux");
		test.add("toot");
		
		Set<String> expect = new HashSet<String>();
		Set<String> result1 = MediaWiki.decodeSet(test);
		assertTrue(result1.equals(expect));
		
		Set<String> result2 = MediaWiki.decodeSet(test.toString(), "=");
		assertTrue(result2.equals(expect));
		HashSet<String> result3 = MediaWiki.decodeSet(result2.toString(), "=");
		assertTrue(result3.equals(expect));
	}
}