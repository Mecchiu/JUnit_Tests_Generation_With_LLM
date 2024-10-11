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
			assertEquals("s+", MediaWiki.encode("s").toString());
		}
	}