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
	void test_1() throws UnsupportedEncodingException {
		// Arrange
		final String s = "MediaWiki.mediawiki";

								Set<String> sset = new HashSet<String>();



							sset.add("MyMediaWiki.mediawiki");
							sset.add("MyMediaWiki.test.wikipedia.org");

							Set<String> d = new HashSet<String>();

							d.add("mymediawiki");
							d.add("mytest.wikipedia.org");

							// Act
							Set<String> ssetOut = MediaWiki.encode(sset);

								// Assert

						final Set<String> ssetOut1 = MediaWiki.encode(d);

								assertTrue(ssetOut1.equals(ssetOut));
						}
	}