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

    /**
	 * Test method for {@link MediaWiki#encode(String)}.
	 */
    @Test
    public void testEncode() {
	MediaWiki m = new MediaWiki();
	Set<String> res = m.encode("");
	assertNotNull("Res is null", res);
	res = m.encode("#comment");
	assertNotNull("Res is null", res);
	res = m.encode("#comment#");
	assertNotNull("Res is null", res);
	res = m.encode("#c");
	assertNotNull("Res is null", res);
	res = m.encode("#c#");
	assertNotNull("Res is null", res);
	res = m.encode("#c##this is for #comment");
	assertNotNull("Res is null", res);
	res = m.encode("#c##the #in #c");
	assertNotNull("Res is null", res);
	res = m.encode("#c##the #in #c##this is for #comment");
	assertNotNull("Res is null", res);
	res = m.encode("#c##the #in #c###this is #c#");
	assertNotNull("Res is null", res);
	res = m.encode("##a#c");
	assertNotNull("Res is null", res);
    }

}
// MediaWiki.java