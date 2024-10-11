// MediaWiki.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;

/**
 * This class provides utility methods for interacting with a MediaWiki installation.
 */
public final class MediaWiki {

    private static final String CHARSET = "UTF-8";

    /**
     * Returns the character set used by MediaWiki.
     *
     * @return the character set used by MediaWiki
     */
    public static String getCharset() {
        return CHARSET;
    }
}

// MediaWikiTest.java
package net.sourceforge.jwbf.mediawiki.actions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link MediaWiki}.
 */
class MediaWikiTest {

    @Test
    void testGetCharset() {
        assertEquals("UTF-8", MediaWiki.getCharset());
    }
}