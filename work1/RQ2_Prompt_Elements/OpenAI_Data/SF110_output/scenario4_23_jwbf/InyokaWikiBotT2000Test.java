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

	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the {@link InyokaWikiBot#getArticle(String)} method with a valid article name.
	* The expected result is a non-null {@link Article} object.
	*/
	@Test
	void testGetArticleWithValidArticleName() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			fail("MalformedURLException thrown");
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite");
		} catch (ActionException e) {
			fail("ActionException thrown");
		} catch (ProcessException e) {
			fail("ProcessException thrown");
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the {@link InyokaWikiBot#getArticle(String)} method with an invalid article name.
	* The expected result is a {@link ProcessException} object.
	*/
	@Test
	void testGetArticleWithInvalidArticleName() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			fail("MalformedURLException thrown");
		}
		Article article = null;
		try {
			article = bot.getArticle("InvalidArticleName");
		} catch (ActionException e) {
			fail("ActionException thrown");
		} catch (ProcessException e) {
			assertNotNull(e);
		}
		assertNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the {@link InyokaWikiBot#getArticle(String)} method with a null article name.
	* The expected result is a {@link NullPointerException} object.
	*/
	@Test
	void testGetArticleWithNullArticleName() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			fail("MalformedURLException thrown");
		}
		Article article = null;
		try {
			article = bot.getArticle(null);
		} catch (ActionException e) {
			fail("ActionException thrown");
		} catch (ProcessException e) {
			fail("ProcessException thrown");
		} catch (NullPointerException e) {
			assertNotNull(e);
		}
		assertNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the {@link InyokaWikiBot#getArticle(String)} method with an empty article name.
	* The expected result is a {@link ProcessException} object.
	*/
	@Test
	void testGetArticleWithEmptyArticleName() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			fail("MalformedURLException thrown");
		}
		Article article = null;
		try {
			article = bot.getArticle("");
		} catch (ActionException e) {
			fail("ActionException thrown");
		} catch (ProcessException e) {
			assertNotNull(e);
		}
		assertNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the {@link InyokaWikiBot#getArticle(String)} method with a valid article name and a valid properties value.
	* The expected result is a non-null {@link Article} object.
	*/
	@Test
	void testGetArticleWithValidArticleNameAndValidProperties() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			fail("MalformedURLException thrown");
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", 0);
		} catch (ActionException e) {
			fail("ActionException thrown");
		} catch (ProcessException e) {
			fail("ProcessException thrown");
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the {@link InyokaWikiBot#getArticle(String)} method with a valid article name and an invalid properties value.
	* The expected result is a {@link ProcessException} object.
	*/
	@Test
	void testGetArticleWithValidArticleNameAndInvalidProperties() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			fail("MalformedURLException thrown");
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", -1);
		} catch (ActionException e) {
			fail("ActionException thrown");
		} catch (ProcessException e) {
			assertNotNull(e);
		}
		assertNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the {@link InyokaWikiBot#getArticle(String)} method with an invalid article name and a valid properties value.
	* The expected result is a {@link ProcessException} object.
	*/
	@Test
	void testGetArticleWithInvalidArticleNameAndValidProperties() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			fail("MalformedURLException thrown");
		}
		Article article = null;
		try {
			article = bot.getArticle("InvalidArticleName", 0);
		} catch (ActionException e) {
			fail("ActionException thrown");
		} catch (ProcessException e) {
			assertNotNull(e);
		}
		assertNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the {@link InyokaWikiBot#getArticle(String)} method with a null article name and a valid properties value.
	* The expected result is a {@link NullPointerException} object.
	*/
	@Test
	void testGetArticleWithNullArticleNameAndValidProperties() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot