// InyokaWikiBotTest.java
package net.sourceforge.jwbf.inyoka.bots;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.inyoka.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InyokaWikiBot}.
* It contains ten unit test cases for the {@link InyokaWikiBot#getArticle(String)} method.
*/
class InyokaWikiBotTest {

    @Test
    void testGetArticle() throws ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot();
        Article article = bot.getArticle("Test");
        assertNotNull(article);
        assertEquals("Test", article.getTitle());
    }

    @Test
    void testGetArticleWithRevision() throws ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot();
        Article article = bot.getArticle("Test", 1);
        assertNotNull(article);
        assertEquals("Test", article.getTitle());
        assertEquals(1, article.getRevisionId());
    }

    @Test
    void testGetArticleWithNonExistingTitle() {
        InyokaWikiBot bot = new InyokaWikiBot();
        assertThrows(ActionException.class, () -> bot.getArticle("NonExistingTitle"));
    }

    @Test
    void testGetArticleWithMalformedUrl() {
        InyokaWikiBot bot = new InyokaWikiBot();
        assertThrows(MalformedURLException.class, () -> bot.setBaseUrl("invalid url"));
    }

    @Test
    void testGetArticleWithNullTitle() {
        InyokaWikiBot bot = new InyokaWikiBot();
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(null));
    }

    @Test
    void testGetArticleWithEmptyTitle() {
        InyokaWikiBot bot = new InyokaWikiBot();
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle(""));
    }

    @Test
    void testGetArticleWithWhitespaceTitle() {
        InyokaWikiBot bot = new InyokaWikiBot();
        assertThrows(IllegalArgumentException.class, () -> bot.getArticle("   "));
    }

    @Test
    void testGetArticleWithInvalidRevision() {
        InyokaWikiBot bot = new InyokaWikiBot();
        assertThrows(ActionException.class, () -> bot.getArticle("Test", -1));
    }

    @Test
    void testGetArticleWithUserinfo() throws ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot();
        Userinfo userinfo = bot.getUserinfo();
        assertNotNull(userinfo);
        assertNotNull(userinfo.getUsername());
    }

    @Test
    void testGetArticleWithSimpleArticle() throws ActionException, ProcessException {
        InyokaWikiBot bot = new InyokaWikiBot();
        SimpleArticle simpleArticle = bot.getSimpleArticle("Test");
        assertNotNull(simpleArticle);
        assertEquals("Test", simpleArticle.getTitle());
    }
}