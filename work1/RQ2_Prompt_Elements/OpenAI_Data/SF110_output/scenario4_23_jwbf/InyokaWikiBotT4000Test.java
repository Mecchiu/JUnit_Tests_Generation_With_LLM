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
	void testGetArticle_NullArticleName() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		assertThrows(NullPointerException.class, () -> {
			bot.getArticle(null);
		});
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is empty.
	*/
	@Test
	void testGetArticle_EmptyArticleName() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		assertThrows(IllegalArgumentException.class, () -> {
			bot.getArticle("");
		});
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is invalid.
	*/
	@Test
	void testGetArticle_InvalidArticleName() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		assertThrows(IllegalArgumentException.class, () -> {
			bot.getArticle("InvalidArticleName");
		});
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String)} method.
	* It tests the case when the article name is valid.
	*/
	@Test
	void testGetArticle_ValidArticleName() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite");
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is null.
	*/
	@Test
	void testGetArticle_NullArticleName_Properties() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		assertThrows(NullPointerException.class, () -> {
			bot.getArticle(null, 0);
		});
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is empty.
	*/
	@Test
	void testGetArticle_EmptyArticleName_Properties() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		assertThrows(IllegalArgumentException.class, () -> {
			bot.getArticle("", 0);
		});
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is invalid.
	*/
	@Test
	void testGetArticle_InvalidArticleName_Properties() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		assertThrows(IllegalArgumentException.class, () -> {
			bot.getArticle("InvalidArticleName", 0);
		});
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is valid.
	*/
	@Test
	void testGetArticle_ValidArticleName_Properties() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", 0);
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is valid and the properties are invalid.
	*/
	@Test
	void testGetArticle_ValidArticleName_InvalidProperties() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", -1);
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is valid and the properties are valid.
	*/
	@Test
	void testGetArticle_ValidArticleName_ValidProperties() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", 1);
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is valid and the properties are valid.
	*/
	@Test
	void testGetArticle_ValidArticleName_ValidProperties2() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", 2);
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is valid and the properties are valid.
	*/
	@Test
	void testGetArticle_ValidArticleName_ValidProperties3() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", 4);
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is valid and the properties are valid.
	*/
	@Test
	void testGetArticle_ValidArticleName_ValidProperties4() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", 8);
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is valid and the properties are valid.
	*/
	@Test
	void testGetArticle_ValidArticleName_ValidProperties5() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", 16);
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is valid and the properties are valid.
	*/
	@Test
	void testGetArticle_ValidArticleName_ValidProperties6() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", 32);
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is valid and the properties are valid.
	*/
	@Test
	void testGetArticle_ValidArticleName_ValidProperties7() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", 64);
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is valid and the properties are valid.
	*/
	@Test
	void testGetArticle_ValidArticleName_ValidProperties8() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", 128);
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	* Test case for {@link InyokaWikiBot#getArticle(String, int)} method.
	* It tests the case when the article name is valid and the properties are valid.
	*/
	@Test
	void testGetArticle_ValidArticleName_ValidProperties9() {
		InyokaWikiBot bot = null;
		try {
			bot = new InyokaWikiBot("http://wiki.ubuntuusers.de/Startseite?action=export&format=raw&");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Article article = null;
		try {
			article = bot.getArticle("Startseite", 256);
		} catch (ActionException e) {
			e.printStackTrace();
		} catch (ProcessException e) {
			e.printStackTrace();
		}
		assertNotNull(article);
	}
	
	/**
	