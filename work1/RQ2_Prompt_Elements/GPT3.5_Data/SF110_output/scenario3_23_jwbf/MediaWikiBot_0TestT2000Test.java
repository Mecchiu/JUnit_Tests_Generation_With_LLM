// MediaWikiBot_0Test.java
package net.sourceforge.jwbf.mediawiki.bots;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MediaWikiBot}.
 * It contains ten unit test cases for the {@link MediaWikiBot#getArticle(String, int)} method.
 */
class MediaWikiBot_0Test {

    @Test
    void testGetArticle() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        bot.login("username", "password");
        String articleName = "Java (programming language)";
        Article article = bot.getArticle(articleName, Article.CONTENT);
        assertNotNull(article);
        assertEquals(articleName, article.getTitle());
        assertTrue(article.getText().contains("Java is a class-based, object-oriented programming language"));
    }

    @Test
    void testGetArticleWithInvalidName() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        bot.login("username", "password");
        String articleName = "InvalidArticleName";
        Article article = bot.getArticle(articleName, Article.CONTENT);
        assertNotNull(article);
        assertEquals(articleName, article.getTitle());
        assertTrue(article.getText().isEmpty());
    }

    @Test
    void testGetArticleWithInvalidProperties() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        bot.login("username", "password");
        String articleName = "Java (programming language)";
        Article article = bot.getArticle(articleName, 123456);
        assertNotNull(article);
        assertEquals(articleName, article.getTitle());
        assertTrue(article.getText().isEmpty());
    }

    @Test
    void testGetArticleWithEmptyName() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        bot.login("username", "password");
        String articleName = "";
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(articleName, Article.CONTENT));
    }

    @Test
    void testGetArticleWithNullName() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        bot.login("username", "password");
        String articleName = null;
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(articleName, Article.CONTENT));
    }

    @Test
    void testGetArticleWithoutLogin() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        String articleName = "Java (programming language)";
        assertThrows(JwbfException.class, () -> bot.getArticle(articleName, Article.CONTENT));
    }

    @Test
    void testGetArticleWithInvalidUrl() {
        MediaWikiBot bot = new MediaWikiBot("https://invalidurl.org/w/");
        bot.login("username", "password");
        String articleName = "Java (programming language)";
        assertThrows(JwbfException.class, () -> bot.getArticle(articleName, Article.CONTENT));
    }

    @Test
    void testGetArticleWithInvalidCredentials() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        bot.login("invalidUsername", "invalidPassword");
        String articleName = "Java (programming language)";
        assertThrows(JwbfException.class, () -> bot.getArticle(articleName, Article.CONTENT));
    }

    @Test
    void testGetArticleWithEmptyCredentials() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        bot.login("", "");
        String articleName = "Java (programming language)";
        assertThrows(JwbfException.class, () -> bot.getArticle(articleName, Article.CONTENT));
    }

    @Test
    void testGetArticleWithInvalidVersion() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        bot.login("username", "password");
        String articleName = "Java (programming language)";
        assertThrows(VersionException.class, () -> bot.getArticle(articleName, Article.CONTENT | Article.REVISION_ID));
    }
}