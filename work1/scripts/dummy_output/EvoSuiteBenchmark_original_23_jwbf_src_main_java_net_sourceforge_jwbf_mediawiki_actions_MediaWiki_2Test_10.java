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
	 * Test method for {@link MediaWiki#decode(String)}.
	 * @throws UnsupportedEncodingException unused Exception
	 * @throws URLEncoderException unused Exception
	 */
	@Test
	public void testDecode() throws UnsupportedEncodingException, URLEncoderException {
		
		final MediaWiki me = new MediaWiki();
		me.setEncoding("UTF-8");
		me.setTitle("Test");
		me.setHomePage("http://www.mediawiki.org/");
		final String response = me.decode("<?xml version=1.0 encoding=UTF-8?><home><article>Foo</article>Bar</home>");
		assertEquals("xml decoding failed",
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?><home><article>FooBar</article></home>",
				response);
		
		final Set<String> expectedLinks = new HashSet<String>();
		expectedLinks.add("Foo");
		expectedLinks.add("Bar");

		final Set<String> actualLinks = new HashSet<String>();
		actualLinks.add("Foo");
		actualLinks.add("Bar");

		assertEquals("actual and expected links are equal", expectedLinks, actualLinks);

	}


	/**
	 * Test method for {@link MediaWiki#setTitle(String)}.
	 * @throws UnsupportedEncodingException unused Exception
	 * @throws URLEncoderException unused Exception
	 */
	@Test
	public void testSetTitle() throws UnsupportedEncodingException, URLEncoderException {
		
		final MediaWiki me = new MediaWiki();
		me.setEncoding("UTF-8");
		me.setTitle("Test");
		assertEquals("test", me.getTitle());
		
		me.setTitle("Foo");
		assertEquals("Foo", me.getTitle());

	}
}
// MediaWiki_2Test.java