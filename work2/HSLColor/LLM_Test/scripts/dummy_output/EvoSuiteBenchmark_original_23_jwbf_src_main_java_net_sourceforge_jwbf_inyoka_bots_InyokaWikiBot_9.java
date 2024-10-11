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
		private void assertGetArticle(int expected) throws ActionException, ProcessException {
			getArticle("TestArticle");
		}

	@Test
    public void getArticle() throws ActionException, ProcessException {
    	assertGetArticle(0);
    }

		@Test
    public void getArticleAsync() throws ActionException, ProcessException {
			getArticle("TestArticleAsync");
		}

		@Test
    public void getArticleAsyncWithRetries() throws ActionException, ProcessException {
			getArticle("TestArticleAsyncWithRetries");
		}

		@Test
    public void getWiki() throws ActionException, ProcessException {
    	assertGetArticle(0);
    }

		@Test
    public void getWikiAsync() throws ActionException, ProcessException {
			getWiki("TestWiki");
		}

		@Test
    public void getWikiAsyncWithRetries() throws ActionException, ProcessException {
			getWiki("TestWikiAsyncWithRetries");
		}

		@Test
    public void getRevision() throws ActionException, ProcessException {
    	assertGetRevision(0,"TestRevision");
    }

		@Test
    public void getRevisionAsync() throws ActionException, ProcessException {
			getRevision("TestRevisionAsync");
		}

		@Test
    public void getRevisionAsyncWithRetries() throws ActionException, ProcessException {
			getRevision("TestRevisionAsyncWithRetries");
		}

	@Test
    public void delete() throws ProcessException, ActionException {
    	delete("TestArticle");
    	delete("TestArticleAsync");
    	delete("TestWiki");
    }

	@Test
    public void deleteAsync() throws ActionException, ProcessException {
		delete("TestArticleAsync");
	}
}