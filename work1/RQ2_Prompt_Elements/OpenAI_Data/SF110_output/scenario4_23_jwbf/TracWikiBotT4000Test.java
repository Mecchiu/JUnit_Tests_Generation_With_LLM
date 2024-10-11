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

	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* It tests if the method returns a valid {@link Article} object.
	*/
	@Test
	void testReadContent() throws MalformedURLException, ActionException, ProcessException {
		WikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* It tests if the method returns a valid {@link Article} object.
	*/
	@Test
	void testReadContent2() throws MalformedURLException, ActionException, ProcessException {
		WikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* It tests if the method returns a valid {@link Article} object.
	*/
	@Test
	void testReadContent3() throws MalformedURLException, ActionException, ProcessException {
		WikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* It tests if the method returns a valid {@link Article} object.
	*/
	@Test
	void testReadContent4() throws MalformedURLException, ActionException, ProcessException {
		WikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* It tests if the method returns a valid {@link Article} object.
	*/
	@Test
	void testReadContent5() throws MalformedURLException, ActionException, ProcessException {
		WikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* It tests if the method returns a valid {@link Article} object.
	*/
	@Test
	void testReadContent6() throws MalformedURLException, ActionException, ProcessException {
		WikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* It tests if the method returns a valid {@link Article} object.
	*/
	@Test
	void testReadContent7() throws MalformedURLException, ActionException, ProcessException {
		WikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* It tests if the method returns a valid {@link Article} object.
	*/
	@Test
	void testReadContent8() throws MalformedURLException, ActionException, ProcessException {
		WikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* It tests if the method returns a valid {@link Article} object.
	*/
	@Test
	void testReadContent9() throws MalformedURLException, ActionException, ProcessException {
		WikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* It tests if the method returns a valid {@link Article} object.
	*/
	@Test
	void testReadContent10() throws MalformedURLException, ActionException, ProcessException {
		WikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
}