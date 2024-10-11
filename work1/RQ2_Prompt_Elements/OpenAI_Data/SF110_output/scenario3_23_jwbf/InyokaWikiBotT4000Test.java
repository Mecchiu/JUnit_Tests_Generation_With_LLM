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
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Null() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle(null);
		assertNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Empty() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("");
		assertNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is not valid.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Invalid() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Invalid");
		assertNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_Empty() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_Empty");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is not empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_NotEmpty() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_NotEmpty");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is not empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_NotEmpty_WithSpaces() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_NotEmpty_WithSpaces");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is not empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_NotEmpty_WithSpecialCharacters() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_NotEmpty_WithSpecialCharacters");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is not empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_NotEmpty_WithSpecialCharacters_WithSpaces() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_NotEmpty_WithSpecialCharacters_WithSpaces");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is not empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_NotEmpty_WithSpecialCharacters_WithSpaces_WithNumbers() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_NotEmpty_WithSpecialCharacters_WithSpaces_WithNumbers");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is not empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_NotEmpty_WithSpecialCharacters_WithSpaces_WithNumbers_WithUmlauts() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_NotEmpty_WithSpecialCharacters_WithSpaces_WithNumbers_WithUmlauts");
		assertNotNull(article);
	}
}

// InyokaWikiBot.java
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

/**
 * This class helps you to interact with each wiki as part of <a
 * href="http://ubuntuusers.de" target="_blank">Inyoka</a>. This class offers a
 * set of methods which are defined in the package
 * net.sourceforge.jwbf.actions.inyoka.*
 *
 * @author Thomas Stock
 */
public class InyokaWikiBot extends HttpBot implements WikiBot {

    /**
     * @param name of article
     * @return a content representation of requested article, never null
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     * @see GetRevision
     */
    public synchronized Article getArticle(final String name) throws ActionException, ProcessException {
        if (name == null || name.isEmpty()) {
            return null;
        }
        return new GetRevision(name).getArticle(this);
    }
}

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
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Null() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle(null);
		assertNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Empty() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("");
		assertNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is not valid.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Invalid() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Invalid");
		assertNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_Empty() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_Empty");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is not empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_NotEmpty() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_NotEmpty");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is not empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_NotEmpty_WithSpaces() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_NotEmpty_WithSpaces");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is not empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_NotEmpty_WithSpecialCharacters() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_NotEmpty_WithSpecialCharacters");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is not empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_NotEmpty_WithSpecialCharacters_WithSpaces() throws MalformedURLException, ActionException, ProcessException {
		InyokaWikiBot bot = new InyokaWikiBot("http://localhost/");
		Article article = bot.getArticle("Valid_NotEmpty_WithSpecialCharacters_WithSpaces");
		assertNotNull(article);
	}
	
	/**
	 * Test case for {@link InyokaWikiBot#getArticle(String)} method.
	 * It tests the case when the article name is valid and the article is not empty.
	 * @throws MalformedURLException
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	void testGetArticle_Valid_NotEmpty_WithSpecialCharacters_WithSpaces_WithNumbers