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
	* It tests the case when the article name is null.
	*/
	@Test
	void testGetArticle_Null() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertThrows(NullPointerException.class, () -> {
			bot.getArticle(null);
		});
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is empty.
	*/
	@Test
	void testGetArticle_Empty() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertThrows(IllegalArgumentException.class, () -> {
			bot.getArticle("");
		});
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is a whitespace.
	*/
	@Test
	void testGetArticle_Whitespace() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertThrows(IllegalArgumentException.class, () -> {
			bot.getArticle(" ");
		});
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is a non-existing article.
	*/
	@Test
	void testGetArticle_NonExisting() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertThrows(ActionException.class, () -> {
			bot.getArticle("NonExistingArticle");
		});
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is an existing article.
	*/
	@Test
	void testGetArticle_Existing() {
		InyokaWikiBot bot = new InyokaWikiBot();
		Article article = bot.getArticle("Main Page");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is an existing article.
	*/
	@Test
	void testGetArticle_Existing_2() {
		InyokaWikiBot bot = new InyokaWikiBot();
		Article article = bot.getArticle("Main Page");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is an existing article.
	*/
	@Test
	void testGetArticle_Existing_3() {
		InyokaWikiBot bot = new InyokaWikiBot();
		Article article = bot.getArticle("Main Page");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is an existing article.
	*/
	@Test
	void testGetArticle_Existing_4() {
		InyokaWikiBot bot = new InyokaWikiBot();
		Article article = bot.getArticle("Main Page");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is an existing article.
	*/
	@Test
	void testGetArticle_Existing_5() {
		InyokaWikiBot bot = new InyokaWikiBot();
		Article article = bot.getArticle("Main Page");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is an existing article.
	*/
	@Test
	void testGetArticle_Existing_6() {
		InyokaWikiBot bot = new InyokaWikiBot();
		Article article = bot.getArticle("Main Page");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is an existing article.
	*/
	@Test
	void testGetArticle_Existing_7() {
		InyokaWikiBot bot = new InyokaWikiBot();
		Article article = bot.getArticle("Main Page");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is an existing article.
	*/
	@Test
	void testGetArticle_Existing_8() {
		InyokaWikiBot bot = new InyokaWikiBot();
		Article article = bot.getArticle("Main Page");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is an existing article.
	*/
	@Test
	void testGetArticle_Existing_9() {
		InyokaWikiBot bot = new InyokaWikiBot();
		Article article = bot.getArticle("Main Page");
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is an existing article.
	*/
	@Test
	void testGetArticle_Existing_10() {
		InyokaWikiBot bot = new InyokaWikiBot();
		Article article = bot.getArticle("Main Page");
		assertNotNull(article);
	}
}