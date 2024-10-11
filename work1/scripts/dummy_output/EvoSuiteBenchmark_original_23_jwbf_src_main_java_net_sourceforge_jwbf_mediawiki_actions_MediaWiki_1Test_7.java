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
	  public void test_encoding() throws UnsupportedEncodingException {
	    Set<String> params = new HashSet() {
	      { add("mediaWiki"); add("image"); add("http://purl.org/dc/elements/1.1/"); add("http://purl.org/dc/metadata/dc.xml"); add("http://purl.org/dc/style/black"); add("http://purl.org/dc/style/white"); add("http://purl.org/dc/style/bold"); }
	    };
	    String s = "https://mediawiki.org/wiki/Main_Page\\n" +
	             "<p>This page can be edited so long as the content" +
	             " for the content starts with a title";

	    assertEquals("https://mediawiki.org/wiki/Main_Page\\n<p>This page can be edited so long as the content" +
	             " for the content starts with a title",
	             MediaWiki.encode(s));

	    s =
	    "https://mediawiki.org/wiki/File:MediaWiki.gif";
	    assertEquals("https://mediawiki.org/wiki/File:MediaWiki.gif", MediaWiki.encode(s));
	    params.add("image");
	    s =
	     "https://mediawiki.org/wiki/File:MediaWiki.gif";
	    s = MediaWiki.encode(s, "ISO-8859-1");
	    assertEquals("https://mediawiki.org/wiki/File:MediaWiki.gif", s);
	    params.add("image");
	    params.add("image");
	    s = "https://mediawiki.org/wiki/File:MediaWiki.pdf";
	    assertEquals("https://mediawiki.org/wiki/File:MediaWiki.pdf", MediaWiki.encode(s, "iso-8859-1"));

	    // Invalid Inputs
	    params.add("mediaWiki");
	    params.add("image");
	    assertTrue("Error while handling a valid HTTP request:\n" +
	               "Could not encode \"image\"\n\n" +
	               "Inline comments: Image", MediaWiki.encode("image", "UTF-8", 'h'))
	      .equals("Could not encode \"image\"\n\n" +
	               "Inline comments: Image");

	    params.clear();
	  }
}