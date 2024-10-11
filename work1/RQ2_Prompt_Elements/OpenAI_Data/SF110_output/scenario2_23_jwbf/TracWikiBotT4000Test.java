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
	* It tests the case when the article name is null.
	* It expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testReadContent_NullArticleName() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		assertThrows(IllegalArgumentException.class, () -> {
			bot.readContent(null);
		});
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is empty.
	* It expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testReadContent_EmptyArticleName() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		assertThrows(IllegalArgumentException.class, () -> {
			bot.readContent("");
		});
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is invalid.
	* It expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testReadContent_InvalidArticleName() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		assertThrows(IllegalArgumentException.class, () -> {
			bot.readContent("InvalidArticleName");
		});
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is valid.
	* It expects an {@link Article} to be returned.
	*/
	@Test
	void testReadContent_ValidArticleName() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is valid.
	* It expects an {@link Article} to be returned.
	*/
	@Test
	void testReadContent_ValidArticleName2() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is valid.
	* It expects an {@link Article} to be returned.
	*/
	@Test
	void testReadContent_ValidArticleName3() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is valid.
	* It expects an {@link Article} to be returned.
	*/
	@Test
	void testReadContent_ValidArticleName4() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is valid.
	* It expects an {@link Article} to be returned.
	*/
	@Test
	void testReadContent_ValidArticleName5() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is valid.
	* It expects an {@link Article} to be returned.
	*/
	@Test
	void testReadContent_ValidArticleName6() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is valid.
	* It expects an {@link Article} to be returned.
	*/
	@Test
	void testReadContent_ValidArticleName7() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is valid.
	* It expects an {@link Article} to be returned.
	*/
	@Test
	void testReadContent_ValidArticleName8() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is valid.
	* It expects an {@link Article} to be returned.
	*/
	@Test
	void testReadContent_ValidArticleName9() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("WikiStart");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link TracWikiBot#readContent(String)} method.
	* It tests the case when the article name is valid.
	* It expects an {@link Article} to be returned.
	*/
	@Test
	void testReadContent_ValidArticleName10() {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article article = bot.readContent("TracWiki");
		assertNotNull(article);
	}
}