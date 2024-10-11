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
    void getCharset_returns_UTF8Encoding();

    @Test
    void getCharset_raises_UnsupportedEncodingException_if_nonSupportedEncoder_is_unset() {
        assertThrows(UnsupportedEncodingException.class, () -> {
            assertEquality(MediaWiki.getCharset(), UTF8Encoding.class.getName());
        })
        
        // if charset() returns UNSUPPORTED_ENCODING_NAME, it must return the set UTF8Encoding
        MediaWiki wiki = new MediaWiki(
                "test.wikipedia.org/",
                12345,
                false
        );
        String charset = wiki.getCharset();

        assertEquality(UTF8Encoding.class, charset);

    }
}