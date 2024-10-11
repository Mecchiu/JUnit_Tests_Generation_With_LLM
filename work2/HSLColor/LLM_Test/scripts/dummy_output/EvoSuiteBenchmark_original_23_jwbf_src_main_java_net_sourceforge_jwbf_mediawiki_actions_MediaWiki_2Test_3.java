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
     * @param s the string to decode
     * @return the string
     */
    private static String decode(final String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        } catch (final UnsupportedEncodingException e) {
        }
        if (!s.isEmpty()) {
            return new String(s.getBytes("UTF-8"));
        } else {
            return "";
        }
    }
	
    @Test
    public void testEncode() {
        final Set<String> expected = new HashSet<String>();
        expected.add("dgfjdafjd");
        expected.add("dgfjdafjdj");
        expected.add("dgfjd");
        expected.add("dgfjdafjdj");
        expected.add("dg");
        final String encoding = "UTF-8";
        
        final String actual = new MediaWiki().decode("dgfjdafjd");
        assertEquals(expected, actual);
    }
}