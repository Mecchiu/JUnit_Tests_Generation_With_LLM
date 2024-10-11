// MediaWikiBot_1Test.java
package net.sourceforge.jwbf.mediawiki.bots;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MediaWikiBot}.
 * It contains ten unit test cases for the {@link MediaWikiBot#getArticle(String)} method.
 */
class MediaWikiBot_1Test {

    @Test
    void testGetArticleWithValidTitle() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        String title = "Main_Page";
        String expectedText = "Welcome to the wiki!";
        assertEquals(expectedText, bot.getArticle(title).getText());
    }

    @Test
    void testGetArticleWithInvalidTitle() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        String title = "Invalid_Title";
        String expectedText = "";
        assertEquals(expectedText, bot.getArticle(title).getText());
    }

    @Test
    void testGetArticleWithNullTitle() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        String title = null;
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(title));
    }

    @Test
    void testGetArticleWithEmptyTitle() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        String title = "";
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(title));
    }

    @Test
    void testGetArticleWithWhitespaceTitle() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        String title = "   ";
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(title));
    }

    @Test
    void testGetArticleWithNonexistentUrl() {
        MediaWikiBot bot = new MediaWikiBot("http://nonexistenturl.com/wiki/");
        String title = "Main_Page";
        assertThrows(JwbfException.class, () -> bot.getArticle(title));
    }

    @Test
    void testGetArticleWithInvalidUrl() {
        MediaWikiBot bot = new MediaWikiBot("invalidurl");
        String title = "Main_Page";
        assertThrows(JwbfException.class, () -> bot.getArticle(title));
    }

    @Test
    void testGetArticleWithNullUrl() {
        String url = null;
        assertThrows(IllegalArgumentException.class, () -> new MediaWikiBot(url));
    }

    @Test
    void testGetArticleWithEmptyUrl() {
        String url = "";
        assertThrows(IllegalArgumentException.class, () -> new MediaWikiBot(url));
    }

    @Test
    void testGetArticleWithWhitespaceUrl() {
        String url = "   ";
        assertThrows(IllegalArgumentException.class, () -> new MediaWikiBot(url));
    }
}