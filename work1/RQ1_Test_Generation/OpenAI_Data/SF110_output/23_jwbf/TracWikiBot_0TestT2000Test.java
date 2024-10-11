// TracWikiBot_0Test.java
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
class TracWikiBot_0Test {

	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_0() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("WikiStart");
		assertEquals("WikiStart", article.getTitle());
		assertEquals("Welcome to the Trac Wiki", article.getText().substring(0, 27));
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_1() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracWiki");
		assertEquals("TracWiki", article.getTitle());
		assertEquals("Trac is a minimalistic approach to web-based management of software projects.", article.getText().substring(0, 75));
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_2() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracGuide");
		assertEquals("TracGuide", article.getTitle());
		assertEquals("Trac is a minimalistic approach to web-based management of software projects.", article.getText().substring(0, 75));
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_3() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracSupport");
		assertEquals("TracSupport", article.getTitle());
		assertEquals("Trac is a minimalistic approach to web-based management of software projects.", article.getText().substring(0, 75));
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_4() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracPlugins");
		assertEquals("TracPlugins", article.getTitle());
		assertEquals("Trac is a minimalistic approach to web-based management of software projects.", article.getText().substring(0, 75));
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_5() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracDevelopment");
		assertEquals("TracDevelopment", article.getTitle());
		assertEquals("Trac is a minimalistic approach to web-based management of software projects.", article.getText().substring(0, 75));
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_6() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracFaq");
		assertEquals("TracFaq", article.getTitle());
		assertEquals("Trac is a minimalistic approach to web-based management of software projects.", article.getText().substring(0, 75));
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_7() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracLinks");
		assertEquals("TracLinks", article.getTitle());
		assertEquals("Trac is a minimalistic approach to web-based management of software projects.", article.getText().substring(0, 75));
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_8() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracTimeline");
		assertEquals("TracTimeline", article.getTitle());
		assertEquals("Trac is a minimalistic approach to web-based management of software projects.", article.getText().substring(0, 75));
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)}.
	* @throws MalformedURLException if the url is malformed
	* @throws ActionException if the action cannot be performed
	* @throws ProcessException if the process cannot be performed
	*/
	@Test
	void testReadContent_9() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://trac.edgewall.org/wiki/");
		Article article = bot.readContent("TracRoadmap");
		assertEquals("TracRoadmap", article.getTitle());
		assertEquals("Trac is a minimalistic approach to web-based management of software projects.", article.getText().substring(0, 75));
	}
	
}