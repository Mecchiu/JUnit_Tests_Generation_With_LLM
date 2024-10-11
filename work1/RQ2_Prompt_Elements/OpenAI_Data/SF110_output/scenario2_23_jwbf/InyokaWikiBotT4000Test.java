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
	* It tests the case when the article name is not empty.
	*/
	@Test
	void testGetArticle_NotEmpty() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertNotNull(bot.getArticle("Test"));
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is not empty.
	*/
	@Test
	void testGetArticle_NotEmpty2() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertNotNull(bot.getArticle("Test2"));
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is not empty.
	*/
	@Test
	void testGetArticle_NotEmpty3() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertNotNull(bot.getArticle("Test3"));
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is not empty.
	*/
	@Test
	void testGetArticle_NotEmpty4() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertNotNull(bot.getArticle("Test4"));
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is not empty.
	*/
	@Test
	void testGetArticle_NotEmpty5() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertNotNull(bot.getArticle("Test5"));
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is not empty.
	*/
	@Test
	void testGetArticle_NotEmpty6() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertNotNull(bot.getArticle("Test6"));
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is not empty.
	*/
	@Test
	void testGetArticle_NotEmpty7() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertNotNull(bot.getArticle("Test7"));
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is not empty.
	*/
	@Test
	void testGetArticle_NotEmpty8() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertNotNull(bot.getArticle("Test8"));
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is not empty.
	*/
	@Test
	void testGetArticle_NotEmpty9() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertNotNull(bot.getArticle("Test9"));
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is not empty.
	*/
	@Test
	void testGetArticle_NotEmpty10() {
		InyokaWikiBot bot = new InyokaWikiBot();
		assertNotNull(bot.getArticle("Test10"));
	}
}