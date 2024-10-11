// MediaWiki_2Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MediaWiki}.
 * It contains ten unit test cases for the {@link MediaWiki#decode(String)} method.
 */
class MediaWiki_2Test {

    @Test
    void testDecode() {
        String encoded = "This%20is%20an%20encoded%20string%21";
        String decoded = "This is an encoded string!";
        assertEquals(decoded, MediaWiki.decode(encoded));
    }

    @Test
    void testDecodeEmptyString() {
        String encoded = "";
        String decoded = "";
        assertEquals(decoded, MediaWiki.decode(encoded));
    }

    @Test
    void testDecodeNull() {
        String encoded = null;
        assertThrows(NullPointerException.class, () -> MediaWiki.decode(encoded));
    }

    @Test
    void testDecodeInvalidEncoding() {
        String encoded = "This%20is%20an%20invalid%20%encoding";
        assertThrows(IllegalArgumentException.class, () -> MediaWiki.decode(encoded));
    }

    @Test
    void testDecodeMixedEncoding() {
        String encoded = "This%20is%20a%20mixed%20%25%20encoding";
        String decoded = "This is a mixed % encoding";
        assertEquals(decoded, MediaWiki.decode(encoded));
    }

    @Test
    void testDecodeUnicode() {
        String encoded = "%E2%98%83";
        String decoded = "☃";
        assertEquals(decoded, MediaWiki.decode(encoded));
    }

    @Test
    void testDecodeMultipleEncodings() {
        String encoded = "This%20is%20%2520a%2520mixed%2520%2525%2520encoding";
        String decoded = "This is %20a mixed % encoding";
        assertEquals(decoded, MediaWiki.decode(encoded));
    }

    @Test
    void testDecodePlusSign() {
        String encoded = "This+is+a+plus+sign";
        String decoded = "This is a plus sign";
        assertEquals(decoded, MediaWiki.decode(encoded));
    }

    @Test
    void testDecodeNonAscii() {
        String encoded = "This%20is%20a%20non-ascii%20string%3F";
        String decoded = "This is a non-ascii string?";
        assertEquals(decoded, MediaWiki.decode(encoded));
    }
}