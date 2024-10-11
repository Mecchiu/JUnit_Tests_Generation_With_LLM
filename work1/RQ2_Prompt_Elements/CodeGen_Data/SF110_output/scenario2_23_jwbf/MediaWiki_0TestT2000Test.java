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
* It contains one unit test case for the {@link MediaWiki#getCharset()} method.
*/
class MediaWiki_0Test {

	@Test
	void testGetCharset() throws UnsupportedEncodingException {
        final String charSet = MediaWiki.getCharset();
        Set<Character> supportedChars = new HashSet<>();
        supportedChars.add('q');
        assertTrue(
                charSet +".UTF-8".equals(charset)
                || charSet +".UTF-16".equals(charset)
                );
		
		assertEquals(MediaWiki.charset, charSet);
	}

	
	/**

	 * The following test method contains an empty set by
	 * setting the 'charset' attribute with the current value of
	 * the static constant 'MediaWiki.CHARSET'.
	 * 
	 */
	@Test
	void testGetCharsetAfterSetCharset() {
		final String charSet = MediaWiki.getCharset();
		
		Set<Character> supportedChars = new HashSet<>();
		assertEquals(MediaWiki.charset, charSet);
		
		// Set 'charset' value to 'UTF-8'.
		final MediaWiki wiki = new MediaWiki();
		wiki.setLanguage("en");
		wiki.setCharset(MediaWiki.CHARSET);
		
		mediaWikiAction(wiki).setParams("language=en&charset=UTF-8")
			.run();
			
		String result = mediaWikiAction(wiki).getParams();
		
		assertEquals("UTF-8", result);
		
		Set<Character> resultCharset = new HashSet<>();
		result = mediaWikiAction(wiki).getParams();
		
		assertTrue(result!=null);
		
		if (!result.contains("UTF-8")) {
			resultCharset.clear();
		}
		
		// Test the character set.
		// Check the charSet name is not supported in the media wiki.
		result = mediaWikiAction(wiki).getParams();
		assertTrue(result.contains(MediaWiki.getCharset()));
		
		// Set new value of charSet constant MediaWiki.CHARSET.
		mediaWikiAction(wiki).setParams("language=en&charset=" + MediaWiki.getCharset());
		
		assertEquals(MediaWiki.CHARSET, wiki.getCharset());
		
		result = mediaWikiAction(wiki).getParams();
		assertTrue(result!=null);
		
		assertEquals(MediaWiki.getCharset(), result);

	}
		
	
	@Test
    public void testGetCharsetWithInvalidInput() {
	    // String input which contains an invalid char-set.

	    // Should fail because the "character-set" attribute is not supported.
		mediaWikiAction(new MediaWiki()).setParams("language=en&charset=this-is-not-a-valid-charset").run();
		
		final MediaWiki wiki = new MediaWiki();
		
		Set<Character> result = new HashSet<>();
		mediaWikiAction(wiki).getParams().forEach(
                (charset) -> {
                	if (charset == MediaWiki.getCharset()) {
                		result.add(charset);
                	}
                }
                
        );
		
    	assertFalse(result.isEmpty());
    	
        String resultCharset = result.iterator().next().toString();
        assertEquals(MediaWiki.getCharset(), resultCharset);
        
    }
	
}