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
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        String title = "Main Page";
        String expectedText = "WELCOME TO WIKIPEDIA,";
        String actualText = bot.getArticle(title).getText();
        assertTrue(actualText.contains(expectedText));
    }

    @Test
    void testGetArticleWithInvalidTitle() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        String title = "Invalid Title";
        String expectedText = "";
        String actualText = bot.getArticle(title).getText();
        assertEquals(expectedText, actualText);
    }

    @Test
    void testGetArticleWithNullTitle() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        String title = null;
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(title));
    }

    @Test
    void testGetArticleWithEmptyTitle() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        String title = "";
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(title));
    }

    @Test
    void testGetArticleWithWhitespaceTitle() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        String title = "   ";
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(title));
    }

    @Test
    void testGetArticleWithNonexistentWikiUrl() {
        MediaWikiBot bot = new MediaWikiBot("https://nonexistentwiki.org/w/");
        String title = "Main Page";
        assertThrows(JwbfException.class, () -> bot.getArticle(title));
    }

    @Test
    void testGetArticleWithInvalidWikiUrl() {
        MediaWikiBot bot = new MediaWikiBot("invalidurl");
        String title = "Main Page";
        assertThrows(JwbfException.class, () -> bot.getArticle(title));
    }

    @Test
    void testGetArticleWithNullWikiUrl() {
        assertThrows(IllegalArgumentException.class, () -> new MediaWikiBot(null));
    }

    @Test
    void testGetArticleWithEmptyWikiUrl() {
        assertThrows(IllegalArgumentException.class, () -> new MediaWikiBot(""));
    }

    @Test
    void testGetArticleWithWhitespaceWikiUrl() {
        assertThrows(IllegalArgumentException.class, () -> new MediaWikiBot("   "));
    }
}