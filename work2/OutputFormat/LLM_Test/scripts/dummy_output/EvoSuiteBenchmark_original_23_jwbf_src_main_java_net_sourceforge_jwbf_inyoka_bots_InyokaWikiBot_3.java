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
* It contains one unit test case for the {@link InyokaWikiBot#getArticle(String)} method.
*/
class InyokaWikiBotTest {
		
	@Test
    public void testGetArticle() throws MalformedURLException {
    	
    	String title = "Test Case #1";
    	WikiBot wikiBot = new InyokaWikiBot("http://test.ubuntuusers.de/Startseite?action=export&format=raw&");
		Article resultArticle = wikiBot.getArticle(title, GET_TYPE, DEFAULT);
		
		assertEquals(title, (String)resultArticle.getTitle());
    }

	@Test
    public void testGetArticleExists() throws MalformedURLException, ActionException {
		
        String title = "Test Case #2";
        WikiBot wikiBot = new InyokaWikiBot("http://test.ubuntuusers.de/Startseite?action=export&format=raw&");
		// Check if article already in use with this URL
		try (ActionException ae = wikiBot.createIfNotAlreadyExist(title, GET_TYPE, DEFAULT)) {
			try (ProcessException pe = ae.unwrapProcessException()) {
				System.err.println("ActionException on Exists");
			}
		}

		// Try reading existing article
        Article resultArticle = wikiBot.getArticle(title, GET_TYPE, DEFAULT);
        assertNotNull(resultArticle);
        
        String resultPage = resultArticle.getPage();
		assertFalse("Article already exist", resultArticle.isContentExist(resultPage));

		// Delete article
		try (ActionException ae = wikiBot.delete(title)) {
			assertNotNull(ae);
		}
    }

	@Test
    public void testGetUserinfo() throws ActionException {
		WikiBot wikiBot = new InyokaWikiBot("http://test.ubuntuusers.de/Startseite?action=export&format=raw&");
		Article resultArticle = wikiBot.getUserinfo();
		
        String resultPage = resultArticle.getPage();
		assertNotNull("Article not created", resultArticle);
		
		SimpleArticle resultSimpleArticle = resultArticle.getFirstSimpleArticle();
	    Set<String> set = resultSimpleArticle.getUserinfo().getUserNames().getNames();
	    assertFalse("Article not contained in set", set.isEmpty());
    }

    @Test
    public void testGetArticleContent() throws MalformedURLException, ActionException, ProcessException {
    	
    	String title = "Test Case #1";
    	WikiBot wikiBot = new InyokaWikiBot("http://test.ubuntuusers.de/Startseite?action=export&format=raw&");
		String content = wikiBot.getPage("Test Case #1");
		Article resultArticle = wikiBot.getArticle(title, GET_TYPE, DEFAULT);
		
		// Check if article already exist with correct content
		assertEquals(content, resultArticle.getContent());
		
		// Get a content that doesn't exist
		try (ActionException ae = wikiBot.getPage("Test Case #2")) {
			assertNotNull(ae);
		}
    }

	@Test
    public void testDelete() throws MalformedURLException, ActionException, ProcessException {
    	
    	String title = "Test Case #1";
    	WikiBot wikiBot = new InyokaWikiBot("http://test.ubuntuusers.de/Startseite?action=export&format=raw&");
		// Check if article already exist with correct content
		assertFalse("Article already exist with correct content", wikiBot.getArticle(title, GET_TYPE, DEFAULT).isContentExist(title));

		// Add article and verify
		wikiBot.createIfNotAlreadyExist(title, GET_TYPE, DEFAULT);
		Article resultArticle = wikiBot.getArticle(title, GET_TYPE, DEFAULT);

		// Deleting article should replace it
		try (ActionException ae = wikiBot.delete(title)) {
			assertNotNull(ae);
		}
    }
}