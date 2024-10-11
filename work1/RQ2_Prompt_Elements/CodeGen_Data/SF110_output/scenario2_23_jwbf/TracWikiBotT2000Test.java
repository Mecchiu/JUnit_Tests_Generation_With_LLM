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
// TracWikiBot.java
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

/**
 * /**
 *
 * This class helps you to interact with each wiki as part of <a
 * href="http://trac.edgewall.org/" target="_blank">Trac</a>. This class offers
 * a set of methods which are defined in the package
 * net.sourceforge.jwbf.actions.trac.*
 *
 * @author Thomas Stock
 */
public class TracWikiBot extends HttpBot implements WikiBot {

    /**
     * @param name of article in a tracwiki like "TracWiki", the main page is
     *          "WikiStart"
     * @return a content representation of requested article, never null
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     * @see GetRevision
     */
    public synchronized Article readContent(final String name) throws ActionException, ProcessException {
        return readContent(name, 0);
    }
}

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
	public void readContent_should_setUserinfo() throws MalformedURLException, ProcessException, ActionException, ActionException {
		WikiBot wikibot = new WikiBot();
		wikibot.setCredentials(getTokenCredentials());
		wikibot.setUsername("user");
		WikiBot ret = wikibot.readContent("TracWiki");
		assertEquals("user", ret.getUserinfo().getUsername());
	}

	@Test
	public void readContent_should_not_do_anything_when_noArticleFound() throws MalformedURLException, ProcessException, ActionException, ProcessException {
		String expected = "This is the main page";
		GetRevision getRevision = new GetRevision();
		WikiBot wikibot = new WikiBot();
		wikibot.setCredentials(getTokenCredentials());
		WikiBot ret = wikibot.callAjaxAction("trac.wikipedia.getRevision", ActionException.INVALID_REVISION, null, null);
		assertNull(ret);
	}

	@Test
	public void readContent_repositories() throws MalformedURLException, ProcessException, ActionException, ActionException {
		WikiBot wikibot = new WikiBot();
		wikibot.setCredentials(getTokenCredentials());
		WikiBot ret = wikibot.readContent("TracWiki");
		assertTrue(ret instanceof TracWikiBot);
		assertEquals("TracWiki", ((TracWikiBot)ret).getUrl());
		assertEquals(WikiBot.class, ret.getClass());
	}

	@Test
	public void readContent_without_access() throws MalformedURLException, ProcessException, ActionException, ActionException {
		WikiBot wikibot = new WikiBot();
		wikibot.setCredentials(getTokenCredentials());
		WikiBot ret = wikibot.readContent("TracWiki");
		assertNull(ret);
		assertEquals("TracWiki", ((TracWikiBot)ret).getUrl());
	}

	@Test
	public void readContent_with_access() throws MalformedURLException, ProcessException, ActionException, ProcessException {
		WikiBot wikibot = new WikiBot();
		wikibot.setCredentials(getTokenCredentials());
		wikibot.setAccessAuthorized(true);
		WikiBot ret = wikibot.readContent("TracWiki");
		assertEquals("TracWiki", ((TracWikiBot)ret).getUrl());
		assertTrue(ret instanceof TracWikiBot);
		assertEquals(WikiBot.class, ret.getClass());
	}

	@Test
	public void readContent_without_access_on_file_which_is_in_parent() throws MalformedURLException, ProcessException, ActionException, ProcessException {
		WikiBot wikibot = new WikiBot();
		wikibot.setCredentials(getTokenCredentials());
		wikibot.setAccessAuthorized(true);
		wikibot.setFilename("tracWiki.txt");
		WikiBot ret = wikibot.readContent("TracWiki");
		assertNull(ret);
		assertEquals("TracWiki", ((TracWikiBot)ret).getUrl());
		assertTrue(ret instanceof TracWikiBot);
		assertEquals(WikiBot.class, ret.getClass());
	}

	@Test
	public void readContent_with_access() throws MalformedURLException, ProcessException, ActionException, ProcessException {
		WikiBot wikibot = new WikiBot();
		wikibot.setCredentials(getTokenCredentials());
		wikibot.setAccessAuthorized(true);
		wikibot.setFilename("tracWiki.txt");
		WikiBot ret = wikibot.readContent("TracWiki");
		assertEquals("TracWiki", ((TracWikiBot)ret).getUrl());
		assertTrue(ret instanceof TracWikiBot);
		assertEquals(WikiBot.class, ret.getClass());
	}

	@Test
	public void readContent_contentAccessable_should_be_ignored() throws ProcessException, MalformedURLException, ActionException, ActionException {
		WikiBot wikibot = new WikiBot();
		WikiBot wikiTest = new WikiBot();
		wikibot.setContentAccessable(new ContentAccessable() {
			@Override
			public ContentAccessible getContent() throws MalformedURLException {
				return wikiTest;
			}

			@Override
			public ContentAccessable getContent(String contentUrl) throws MalformedURLException {
				return wikiTest;
			}
		});
		wikibot.setCredentials(getTokenCredentials());
		WikiBot ret = wikibot.readContent("TracWiki");
		fail("It is not allowed to read content on Wiki");
	}

	private ContentAccessor getContentAcrutalByName(String name, String contentUrl) throws MalformedURLException {
		return new ContentAccessor() {
			@Override
			public String getContent(ContentAccessable content) throws MalformedURLException {
				return content.getContent(contentUrl);
			}

			@Override
			public String getContent(String content) throws MalformedURLException {
				return content;
			}
		};
	}

}