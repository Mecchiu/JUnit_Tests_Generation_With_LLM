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
        assertThrows(IllegalArgumentException.class, () -> bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithEmptyArticleName() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "";
        assertThrows(IllegalArgumentException.class, () -> bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithNullArticleName() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = null;
        assertThrows(IllegalArgumentException.class, () -> bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithInvalidProperties() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String articleText = "This is a test article.";
        bot.writeContent(articleName, articleText);
        assertThrows(IllegalArgumentException.class, () -> bot.readContent(articleName, -1));
        bot.delete(articleName);
    }

    @Test
    void testGetArticleWithNoProperties() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String articleText = "This is a test article.";
        bot.writeContent(articleName, articleText);
        String retrievedText = bot.readContent(articleName, 0).getText();
        assertEquals(articleText, retrievedText);
        bot.delete(articleName);
    }

    @Test
    void testGetArticleWithContentOnly() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String articleText = "This is a test article.";
        bot.writeContent(articleName, articleText);
        String retrievedText = bot.readContent(articleName, ContentAccessable.CONTENT).getText();
        assertEquals(articleText, retrievedText);
        bot.delete(articleName);
    }

    @Test
    void testGetArticleWithRevisionIdOnly() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String articleText = "This is a test article.";
        bot.writeContent(articleName, articleText);
        int revisionId = bot.readContent(articleName, ContentAccessable.REVISION_ID).getRevisionId();
        assertTrue(revisionId > 0);
        bot.delete(articleName);
    }

    @Test
    void testGetArticleWithTimestampOnly() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String articleText = "This is a test article.";
        bot.writeContent(articleName, articleText);
        String timestamp = bot.readContent(articleName, ContentAccessable.TIMESTAMP).getTimestamp();
        assertNotNull(timestamp);
        bot.delete(articleName);
    }

    @Test
    void testGetArticleWithAllProperties() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String articleText = "This is a test article.";
        bot.writeContent(articleName, articleText);
        Article article = bot.readContent(articleName, ContentAccessable.ALL_PROPERTIES);
        assertNotNull(article);
        assertEquals(articleName, article.getTitle());
        assertEquals(articleText, article.getText());
        assertTrue(article.getRevisionId() > 0);
        assertNotNull(article.getTimestamp());
        bot.delete(articleName);
    }
}