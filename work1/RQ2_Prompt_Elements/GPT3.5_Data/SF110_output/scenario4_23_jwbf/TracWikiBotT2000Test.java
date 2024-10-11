// TracWikiBotTest.java
package net.sourceforge.jwbf.trac.bots;

import java.net.MalformedURLException;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.trac.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TracWikiBot}.
* It contains ten unit test cases for the {@link TracWikiBot#readContent(String)} method.
*/
class TracWikiBotTest {

    @Test
    void testReadContent() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracWiki");
        assertNotNull(article);
        assertEquals("TracWiki", article.getTitle());
    }

    @Test
    void testReadContentWithNonExistingArticle() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("NonExistingArticle");
        assertNotNull(article);
        assertEquals("NonExistingArticle", article.getTitle());
        assertTrue(article.getText().isEmpty());
    }

    @Test
    void testReadContentWithSpecialCharacters() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracWiki#Special Characters");
        assertNotNull(article);
        assertEquals("TracWiki#Special Characters", article.getTitle());
    }

    @Test
    void testReadContentWithRedirect() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracGuide");
        assertNotNull(article);
        assertEquals("TracGuide", article.getTitle());
        assertFalse(article.isRedirect());
    }

    @Test
    void testReadContentWithSection() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracWiki#Section Editing");
        assertNotNull(article);
        assertEquals("TracWiki#Section Editing", article.getTitle());
    }

    @Test
    void testReadContentWithProperties() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracWiki", GetRevision.CONTENT);
        assertNotNull(article);
        assertEquals("TracWiki", article.getTitle());
        assertNotNull(article.getRevisionId());
    }

    @Test
    void testReadContentWithInvalidProperties() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        Article article = bot.readContent("TracWiki", 123);
        assertNotNull(article);
        assertEquals("TracWiki", article.getTitle());
        assertNull(article.getRevisionId());
    }

    @Test
    void testReadContentWithNullTitle() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        assertThrows(IllegalArgumentException.class, () -> bot.readContent(null));
    }

    @Test
    void testReadContentWithEmptyTitle() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        assertThrows(IllegalArgumentException.class, () -> bot.readContent(""));
    }

    @Test
    void testReadContentWithWhitespaceTitle() throws MalformedURLException, ActionException, ProcessException {
        TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
        assertThrows(IllegalArgumentException.class, () -> bot.readContent("  "));
    }
}