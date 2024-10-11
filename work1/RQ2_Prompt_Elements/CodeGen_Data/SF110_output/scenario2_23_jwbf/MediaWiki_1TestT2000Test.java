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
        Set<String> set = new HashSet<>();
        set.add("");
        set.add("a");
        set.add("/");
        set.add("a");
        set.add("\\");
        set.add("a");
        set.add("c");
        set.add("\\");
        set.add("c");
        set.add("a/c");
        set.add("a//");
        set.add("a\\");
        set.add("a\\a");
        set.add("a\\\\c");
        set.add("a\\\\c\\c");
        
        assertEquals("", MediaWiki.encode(""));
        assertEquals("\\", MediaWiki.encode("\\"));
        assertEquals("\\a", MediaWiki.encode("a"));
        assertEquals("\\\\", MediaWiki.encode("\\"));
        assertEquals("\\\\a", MediaWiki.encode("a"));
        assertEquals("\\\\\\", MediaWiki.encode("\\"));
        assertEquals("\\\\a\\", MediaWiki.encode("a"));
        assertEquals("\\b", MediaWiki.encode("b"));
        assertEquals("\\", MediaWiki.encode("~"));
        assertEquals("\\a/b", MediaWiki.encode("a/b"));
        assertEquals("a\\c", MediaWiki.encode("a / c"));
        assertEquals("a\\b c", MediaWiki.encode("a\"b c"));
        assertEquals("a\\b c", MediaWiki.encode("\"a\\ b c"));
        assertEquals("a\\b c", MediaWiki.encode("\"a b c"));
        assertEquals("a\\b c", MediaWiki.encode("\"a\"b \"c\"\""));
        assertEquals("a\\b c", MediaWiki.encode("a" + MediaWiki.CHARSET + "\"b c\"\"")); // UTF-8 --> GB18030 --> GB18032
        assertEquals("a\\b c", MediaWiki.encode("a\xe9\xc3\xa9\xc3\xa9\xc3\xa9 c\"\""));
        assertEquals("a\\b c", MediaWiki.encode("aA\xc9\xc3\xa9\xc3\xa9\xc3b\xc3\xa9\xc3\xa9 \"c\"\""));
        
        assertEquals("ABCDEFGH", MediaWiki.encode("ABCDEFGH"));

        assertEquals("<b>", MediaWiki.encode("<b>"));
        assertEquals("<b>", MediaWiki.encode("<b></b>"));
        
        assertEquals("<b>abc<b>  <b> def  <b>  ghi<b>", MediaWiki.encode("<b>abc<b>  <b> def  <b>  ghi<b>"));

        assertEquals(
            "<b>a<b/>   c<b/></b>  h   g<b/></b>",
            MediaWiki.encode("<b>a <b/>   c</b>  h   g<b/>"));
    }
}
