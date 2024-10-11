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
* It contains one unit test case for the {@link TracWikiBot#readContent(String)} method.
*/
class TracWikiBotTest {
		
	@Test
	void readContentBadContent() throws MalformedURLException, ProcessException, ActionException {
        String title = "TracWiki";
        int properties = SimpleArticle.Property.PROPS_TITLE;
        Article test = TracWikiBot.readContent(title, properties);
        assertNull("null content", test);
	}
	@Test
	void readContentGoodContent() throws MalformedURLException, ProcessException, ActionException {
		String title = "TracWiki";
        String user = "joe";
        String passwd = "test";
        int properties = SimpleArticle.Property.PROPS_TITLE;
        Article test = TracWikiBot.readContent(title, properties, user, passwd);
        assertNotNull("content not available", test);
        assertTrue("content should be an article", test instanceof Article);
	}
	@Test
	void readContentFromWikiRoot()  throws MalformedURLException, ProcessException, ActionException {
		String title = "TracWiki";
        String user = "joe";
        String passwd = "test";
        int properties = SimpleArticle.Property.PROPS_TITLE;
        String test = TracWikiBot.readContent(title, properties, null, user, passwd);
        assertNotNull("content not available", test);
        assertTrue("content should be an article", test instanceof Article);
	}
	@Test
	void readContentFromWikiSite() throws MalformedURLException {
		String title = "TracWiki";
        String user = "joe";
        String passwd = "test";
        int properties = SimpleArticle.Property.PROPS_TITLE;
        String test = TracWikiBot.readContent(title, properties, null);
        assertNotNull("content not available", test);
        assertTrue("content should be an article",
        		test instanceof SimpleArticle);
	}
	@Test
	void readContentFromWikiPage() throws MalformedURLException, ProcessException {
		String title = "TracWiki";
        String user = "joe";
        String passwd = "test";
        int properties = SimpleArticle.Property.PROPS_TITLE;
        String test = TracWikiBot.readContent(title, properties, null, user, passwd);
        assertNotNull("content not available", test);
        assertTrue("content should be an article",
        		test instanceof SimpleArticle);
	}
	@Test
	void readDataFromWikiPage()  throws MalformedURLException, ProcessException {
		String title = "TracWiki";
        String user = "joe";
        String passwd = "test";
        int properties = Article.Property.PROPS_CONTENT;
        Article test = TracWikiBot.readData(title, properties, null);
        assertNotNull("data not available", test);
        assertTrue("content should be a simple article",
        		test instanceof Article);
	}
	@Test
	void readDataFromWikiPageFromSite() throws MalformedURLException {
		String title = "TracWiki";
        String user = "joe";
        String passwd = "test";
        int properties = Article.Property.PROPS_CONTENT;
        Article test = TracWikiBot.readData(title, properties, null);
        assertNotNull("data not available", test);
        assertTrue("content should be a simple article",
        		test instanceof Article);
	}
	@Test
	void readDataFromWikiPageFromSiteByName() throws MalformedURLException {
		String title = "TracWiki";
        String user = "joe";
        String passwd = "test";
        int properties = Article.Property.PROPS_CONTENT;
        Article test = TracWikiBot.readData(title, PageContent.PageContentProperty.PROPS_CONTENT, null);
        assertNotNull("data not available", test);
        assertTrue("content should be a simple article",
        		test instanceof Article);
	}
	@Test
	void readDataFromWikiPageFromWikiRoot()  throws MalformedURLException, ProcessException {
		String title = "TracWiki";
        String user = "joe";
        String passwd = "test";
        int properties = Article.Property.PROPS_CONTENT;
        String data = TracWikiBot.readData(title, properties);
        assertNotNull("data not available", data);
        assertTrue("data should be an article",
        		data instanceof Article);
	}
}