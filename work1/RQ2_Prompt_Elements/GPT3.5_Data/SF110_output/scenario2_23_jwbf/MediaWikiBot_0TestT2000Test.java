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
    void testGetArticleWithInvalidName() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "InvalidArticleName";
        assertThrows(IllegalArgumentException.class, () -> bot.readContent(articleName));
    }

    @Test
    void testGetArticleWithInvalidProperties() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String articleText = "This is a test article.";
        bot.writeContent(articleName, articleText);
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(articleName, -1));
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
    void testGetArticleWithNoContent() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        bot.writeContent(articleName, "");
        String retrievedText = bot.readContent(articleName).getText();
        assertEquals("", retrievedText);
        bot.delete(articleName);
    }

    @Test
    void testGetArticleWithRedirect() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String redirectName = "RedirectArticle";
        String articleText = "This is a test article.";
        bot.writeContent(articleName, articleText);
        bot.createRedirect(redirectName, articleName);
        String retrievedText = bot.readContent(redirectName).getText();
        assertEquals(articleText, retrievedText);
        bot.delete(articleName);
        bot.delete(redirectName);
    }

    @Test
    void testGetArticleWithSection() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String articleText = "This is a test article.\n\n==Section 1==\nThis is section 1.\n\n==Section 2==\nThis is section 2.";
        bot.writeContent(articleName, articleText);
        String sectionText = bot.readContent(articleName, 2).getText();
        assertEquals("This is section 1.", sectionText);
        bot.delete(articleName);
    }

    @Test
    void testGetArticleWithTemplate() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String templateName = "TestTemplate";
        String articleText = "{{" + templateName + "}}";
        String templateText = "This is a test template.";
        bot.writeContent(articleName, articleText);
        bot.writeContent("Template:" + templateName, templateText);
        String retrievedText = bot.readContent(articleName).getText();
        assertEquals(templateText, retrievedText);
        bot.delete(articleName);
        bot.delete("Template:" + templateName);
    }

    @Test
    void testGetArticleWithExternalLink() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String articleText = "This is a test article.\n\n[http://www.example.com Example website]";
        bot.writeContent(articleName, articleText);
        String retrievedText = bot.readContent(articleName).getText();
        assertEquals(articleText, retrievedText);
        bot.delete(articleName);
    }

    @Test
    void testGetArticleWithImage() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String imageName = "TestImage.png";
        String articleText = "This is a test article.\n\n[[File:" + imageName + "]]";
        bot.writeContent(articleName, articleText);
        String retrievedText = bot.readContent(articleName).getText();
        assertEquals(articleText, retrievedText);
        bot.delete(articleName);
    }

    @Test
    void testGetArticleWithCategory() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost/wiki/");
        bot.login("username", "password");
        String articleName = "TestArticle";
        String categoryName = "TestCategory";
        String articleText = "This is a test article.\n\n[[Category:" + categoryName + "]]";
        bot.writeContent(articleName, articleText);
        String retrievedText = bot.readContent(articleName).getText();
        assertEquals(articleText, retrievedText);
        bot.delete(articleName);
    }
}