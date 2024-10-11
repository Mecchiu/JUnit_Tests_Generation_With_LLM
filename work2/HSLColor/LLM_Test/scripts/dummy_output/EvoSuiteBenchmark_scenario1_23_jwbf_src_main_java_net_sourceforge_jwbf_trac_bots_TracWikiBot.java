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
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the given page name is null.
	*/
	@Test
	void testReadContent_1() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent(null);
		assertNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the given page name is empty.
	*/
	@Test
	void testReadContent_2() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("");
		assertNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the given page name is not valid.
	*/
	@Test
	void testReadContent_3() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("!@#$%^&*()_+");
		assertNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the given page name is valid.
	*/
	@Test
	void testReadContent_4() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the given page name is valid.
	*/
	@Test
	void testReadContent_5() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the given page name is valid.
	*/
	@Test
	void testReadContent_6() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the given page name is valid.
	*/
	@Test
	void testReadContent_7() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the given page name is valid.
	*/
	@Test
	void testReadContent_8() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the given page name is valid.
	*/
	@Test
	void testReadContent_9() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the given page name is valid.
	*/
	@Test
	void testReadContent_10() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
}