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
    void encode_should_encode_an_article_with_single_link_as_author() {
        final String testString = "MediaWiki.php?action=view&content_type=article&content=Test";
        assertEquals("content", MediaWiki.encode(testString).split("&").length);
    }

    @Test
    void encode_should_encode_an_article_with_multiple_link_as_author() {
        final String testString = "MediaWiki.php?action=view&content_type=item&content=Test";
        assertEquals("content", MediaWiki.encode(testString).split("&").length);
    }

    @Test
    void encode_should_encode_an_item_with_a_link() {
        final String testString = "MediaWiki.php?action=view&content_type=item&content=";
        assertEquals("", MediaWiki.encode(testString).split("&").length);
    }

    @Test
    void encode_should_remove_the_link_character_from_content() {
        assertEquals("", MediaWiki.encode(MediaWiki.CHARSET, "MyLink").split("&").length);
        assertEquals("Content removed: MyLink", MediaWiki.encode(MediaWiki.CHARSET, "Content"));
    }

    @Test
    void encode_should_remove_the_link_character_from_article() {
        assertEquals("", MediaWiki.encode("MediaWiki.php?action=view&',';content'", MediaWiki.CHARSET));
    }

    @Test
    void should_return_new_article_encoding() {
        assertEquals("", MediaWiki.encode(MediaWiki.CHARSET, "MyLink"));
        assertEquals(1, MediaWiki.encode(MediaWiki.CHARSET, MediaWiki.CHARSET));
    }

    @Test
    void should_return_new_article_encoding_with_no_article_content() throws UnsupportedEncodingException{
        final String testString = MediaWiki.CHARSET;
        System.out.println(System.getProperty("java.version"));
        String result = new MediaWiki(testString).getContentEncoding();
        assertEquals(System.getProperty("java.version"), result);
    }

    @Test
    void should_return_new_article_encoding_with_article_content(){
        final Set<String> keys = new HashSet<>();
        for(int i=0; i<2; i++){
            keys.add("article["+i+"]");
        }

        Set<String> result = new MediaWiki().getContentEncoding(MediaWiki.CHARSET, MediaWiki.CHARSET, keys);
        assertEquals(MediaWiki.CHARSET, result.toString());
    }

    @Test
    void should_remove_the_first_link_character_from_article() {
        assertEquals("", MediaWiki.encode(MediaWiki.CHARSET, MediaWiki.CHARSET).split("&").length);
        assertEquals("article", MediaWiki.encode(MediaWiki.CHARSET, MediaWiki.CHARSET + MediaWiki.CHARSET));
    }

    private Set<String> getSet(String articleKey, String contentKey) {
        final Set<String> keys = new HashSet<>();
        keys.add(String.format("%s|%s|", articleKey, contentKey));
        return keys;
    }

    @Test
    void should_remove_from_articleKey_set(String articleKey){
        final Set<String> keys = getSet(articleKey, "content");
        // we can just use System.out because all we care about is the article key, which is always of type article
        final String contentStr = System.getProperty("java.version");
        assertTrue(System.getProperty("java.version").startsWith("1.5")); // test only supported version
        System.out.println(System.getProperty("java.version"));
        assertEquals(1, keys.size());
        assertEquals("%5C", MediaWiki.encode(MediaWiki.CHARSET, keys.iterator().next()).split("&").length);
        assertEquals("Test", MediaWiki.encode(MediaWiki.CHARSET, MediaWiki.CHARSET + "content"));
        assertEquals(MediaWiki.CHARSET, MediaWiki.encode(MediaWiki.CHARSET, "%5Ccontent"));
    }

    @Test
    void should_encode_article_with_set_of_links_and_a_link_before_article() {
        final String articleKey = MediaWiki.CHARSET*"article";
        final String contentKey = MediaWiki.CHARSET*"content";
        final Set<String> keys = getSet(articleKey, contentKey);
        final String content = "%5C";
        final String article = "%5Carticle";
        final String contentStr = MediaWiki.encode(MediaWiki.CHARSET, "%7B%5B%5Darticle%20%2Fcontent%2F", MediaWiki.CHARSET);
        assertEquals("%7B%5B%5Darticle%20%2F%3Farticle%20content%20", MediaWiki.encode(MediaWiki.CHARSET, MediaWiki.CHARSET + article + content));
        assertEquals(article + content, MediaWiki.encode(MediaWiki.CHARSET, "%7Darticle"));
    }

    @Test
    void should_encode_and_convert() {
        final String articleKey = MediaWiki.CHARSET*"article";
        final String contentKey = MediaWiki.CHARSET*"content";
        final Set<String> keys = getSet(articleKey, contentKey);
        final String article = "%5C";
        final String content = "%5Carticle";
        final String result = MediaWiki.encode(MediaWiki.CHARSET, "%7B%5B%5Darticle%20%2F%3Farticle%20content%20", MediaWiki.CHARSET);
        assertEquals("%7B%5B%5Darticle%20%2F%3Farticle%20content%20", MediaWiki.encode(MediaWiki.CHARSET, "%7Darticle"));
        final String expected = article + content;
        System.out.println("expected: "+ expected);
        assertEquals(expected, MediaWiki.encode(MediaWiki.CHARSET, "%7Darticle"));
    }
}
