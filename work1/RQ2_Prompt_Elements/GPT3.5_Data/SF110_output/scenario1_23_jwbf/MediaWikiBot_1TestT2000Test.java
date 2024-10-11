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
    void testGetArticle() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String articleText = "This is a test article.";
        bot.writeContent(articleName, articleText);
        String retrievedText = bot.readContent(articleName).getText();
        assertEquals(articleText, retrievedText);
        bot.delete(articleName);
    }

    @Test
    void testGetArticleWithNonExistingArticle() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "NonExistingArticle";
        assertNull(bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithEmptyArticleName() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "";
        assertNull(bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithNullArticleName() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = null;
        assertNull(bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithInvalidCredentials() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("invalidUsername", "invalidPassword");
        String articleName = "TestArticle";
        assertNull(bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithEmptyCredentials() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("", "");
        String articleName = "TestArticle";
        assertNull(bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithNullCredentials() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login(null, null);
        String articleName = "TestArticle";
        assertNull(bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithInvalidURL() {
        MediaWikiBot bot = new MediaWikiBot("http://invalidurl/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        assertNull(bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithEmptyURL() {
        MediaWikiBot bot = new MediaWikiBot("");
        bot.login("username", "password");
        String articleName = "TestArticle";
        assertNull(bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithNullURL() {
        MediaWikiBot bot = new MediaWikiBot(null);
        bot.login("username", "password");
        String articleName = "TestArticle";
        assertNull(bot.readContent(articleName));
    }
}