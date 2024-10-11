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

    static final String BASE_URL = "http://www.jwbf.org/mediawiki";
    static final String TARGET = "/index.php?title=MediaWiki";

    @Test
    public void run_1Get_should_encode_url() {
        String decoded = decode(TARGET);
        assertEquals("MediaWiki_TARGET", decoded);
    }
    
    @Test
    public void run_2GetAllArticles_should_encode_url() {
        Set<String> articles = new MediaWiki().getAllArticles(); 
        assertEquals("MediaWiki_GetAllArticles", articles);
    }
    
    @Test
    public void run_3Decode_should_encode_url() {
        String decoded = decode(TARGET);
        assertEquals("&amp;wv=1&amp;wv=2&amp;wv=3&amp;wv=4&amp;wv=5&amp;wv=6&amp;wv=7&amp;wv=8&amp;wv=9&amp;wv=0", decoded);
    }
    
    static final class HTMLEntities {
        private static final int WHTMLEntities =
                    URLEncoder.MAX_CODED_CHARS;
        
        static final int HTML_ENCODED_SPACE = 32;
        static final int CUSTOM_UTF8_BOM = 0xFEFF;
        static final int CUSTOM_UTF8_CHARS_A_TO_C = 0xFFFEFFFE;
        static final int HTTP_BEGIN_URL = 5;
        static final int HTTP_END_URL = 11;
        static final int HTTP_STATUS_CODE = 13;
    };

    @Test
    public void run_4HtmlEntities_should_encode_only_the_bom() {
        Set<String> entities = new MediaWiki().htmlEntities();
        for (int i = 0; i < WHTMLEntities; i++) {
            boolean found = false;
            for (String entity: entities) {
                if (entity.startsWith(CUSTOM_UTF8_CHARS_A_TO_C)) {
                    entities.clear();
                    found = true;
                } else if (entity.startsWith(CUSTOM_UTF8_BOM)) { 
                    found = true;
                }
            }
            assertTrue(found);
        }
    }
    
    @Test
    public void run_5HtmlEntities_should_unify_the_bom() {
        Set<String> entities = new MediaWiki().htmlEntities();
        for (int i = 0; i < 5; i++) {
            boolean found = false;
            for (String entity: entities) {
                if (entity.startsWith(CUSTOM_UTF8_BOM)) {
                    found = true;
                } else if (entity.startsWith(CUSTOM_UTF8_CHARS_A_TO_C)) {
                    entities.clear();
                    found = true;
                }
            }
            assertFalse(found);
        }
    }

    @Test
    public void run_6HtmlEntities_should_unify_the_bom() {
        Set<String> entities = new MediaWiki().htmlEntities();
        for (int i = 0; i < 5; i++) {
            Set<String> testSet = new HashSet<>();
            for (String entity: entities) {
                if (entity.startsWith(CUSTOM_UTF8_BOM)) {
                    for (String testEntity: testSet) {
                        if (testEntity == entity) {
                            testSet.add(entity);
                        }
                    }
                }
            }
            entities = testSet;
        }
    }

    @Test
    public void run_7Bom_should_return_charset_in_the_url() {
        String testContent = 
                "<html>\n"+ 
                "<body>\n"+
                "<p><a href=\"http://d.d.d.d\">\n"+
                "<a href=\"http://d.d.d\">\n"+
                "<a href=\"http://l.l\">\n"+
                "</a></a>\n"+
                "</p>\n"+
                "</body></html>\n"; 
        Set<String> entities = new MediaWiki().htmlEntities();
        assertEquals("encoded-with-custom-charset", entities.iterator().next());
        for (int i = 0; i < testContent.length(); i++) {
            String entity = testContent.substring(i, i+1);
            entity = HTMLEntities.unhtmlQuotes(entity);
            String testEntity = HTMLEntities.unhtmlents(entity);
            assertEquals(entity, testEntity);
        }
    }

    @Test
    public void check_1Check_with_custom_charset_for_https() {
        String testContent = "<html>\n"+
                "<body>\n"+
                "<p><a href=\"https://www.facebook.com\">\n"+
                "<a href=\"https://www.facebook.com\">\n"+
                "<a href=\"https://www.facebook.com\">\n"+
                "</a></a>\n"+
                "</p>\n"+
                "</body></html>\n"; 
        Set<String> entities = new MediaWiki().htmlEntities();
        
        assertEquals("encoded-with-custom-charset", entities.iterator().next());
    }

    @Test
    public void check_2Decode_url() {
        String testContent = "<html>\n"+ 
                "<body>\n"+
                "<p><a href=\"https://www.facebook.com\">\n"+
                "</a></p>\n"+
                "</body></html>\n"; 
        assertEquals("encoded-with-custom-charset", new MediaWiki().decode(testContent).trim());
    }

    @Test
    public void check_3Decode_url_encoded_string() {
        String expectedEncodedString = "a=b";
        String testContent = "<html>"+expectedEncodedString+"</html>";
        Set<String> entities = new MediaWiki().htmlEntities();
        assertEquals("encoded-with-custom-charset", entities.iterator().next());
        assertEquals(expectedEncodedString, 
                new MediaWiki().decode(testContent).trim());
    }
}
