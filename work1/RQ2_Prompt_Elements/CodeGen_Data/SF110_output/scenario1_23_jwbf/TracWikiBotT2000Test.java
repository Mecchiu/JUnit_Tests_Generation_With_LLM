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
    public void testReadContent() throws MalformedURLException {
    	String url = "http://trac.edgewall.org/repos/jwbf/trac/trac.org";

				String content = getContent("http://trac.edgewall.org/repos/jwbf/trac/trac.org", url);
				Article retrievedArticle = readContent(content);
				assertEquals(article("http://trac.edgewall.org/repos/jwbf/trac/trac.org", "trac.org", new Userinfo("jwbf")), retrievedArticle);
			}

				@Test
			public void testReadContentFromArticle() throws MalformedURLException {
    	String articleContent = articleContent("http://trac.edgewall.org/repos/jwbf/trac/trac.org", "trac.org");

				String content = getContent(articleContent, "http://trac.edgewall.org/repos/jwbf/trac/trac.org");
				Article retrievedArticle = readContent(content);
				assertEquals(articleContent("http://trac.edgewall.org/repos/jwbf/trac/trac.org", "trac.org", new Userinfo("jwbf")), retrievedArticle);


	}

			@Test
      public void testGetRevision() throws MalformedURLException, ProcessException, ActionException {
				String content  = articleContent("http://trac.edgewall.org/repos/jwbf/trac/trac.org", "trac.org");

				String url = "http://trac.edgewall.org/repos/jwbf/trac/trac.org";

				GetRevision getRevision = new GetRevision(getContent(content, url));
				getRevision.execute();
				Article returnedArticle = getRevision.getReplaced().get(0);
				assertEquals(article("http://trac.edgewall.org/repos/jwbf/trac/trac.org", "trac.org", new Userinfo("jwbf")), returnedArticle);


			}

		}
