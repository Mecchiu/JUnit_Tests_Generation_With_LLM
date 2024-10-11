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
	 * Test method for {@link TracWikiBot#readContent(String)}.
	 * @throws MalformedURLException on problems with url
	 * @throws ActionException on problems with http, cookies and io
	 * @throws ProcessException on access problems
	 */
	@Test
	void testReadContent() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article a = bot.readContent("WikiStart");
		assertNotNull(a);
		assertTrue(a.getText().contains("Welcome to Trac"));
	}
}

// TracWikiBot.java
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

/**
 * /**
 *
 * This class helps you to interact with each wiki as part of <a
 * href="http://trac.edgewall.org/" target="_blank">Trac</a>. This class offers
 * a set of methods which are defined in the package
 * net.sourceforge.jwbf.actions.trac.*
 *
 * @author Thomas Stock
 */
public class TracWikiBot extends HttpBot implements WikiBot {

    /**
     * @param name of article in a tracwiki like "TracWiki" , the main page is
     *          "WikiStart"
     * @return a content representation of requested article, never null
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     * @see GetRevision
     */
    public synchronized Article readContent(final String name) throws ActionException, ProcessException {
        return readContent(name, 0);
    }
}

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
	 * Test method for {@link TracWikiBot#readContent(String)}.
	 * @throws MalformedURLException on problems with url
	 * @throws ActionException on problems with http, cookies and io
	 * @throws ProcessException on access problems
	 */
	@Test
	void testReadContent() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article a = bot.readContent("WikiStart");
		assertNotNull(a);
		assertTrue(a.getText().contains("Welcome to Trac"));
	}
}

// TracWikiBot.java
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

/**
 * /**
 *
 * This class helps you to interact with each wiki as part of <a
 * href="http://trac.edgewall.org/" target="_blank">Trac</a>. This class offers
 * a set of methods which are defined in the package
 * net.sourceforge.jwbf.actions.trac.*
 *
 * @author Thomas Stock
 */
public class TracWikiBot extends HttpBot implements WikiBot {

    /**
     * @param name of article in a tracwiki like "TracWiki" , the main page is
     *          "WikiStart"
     * @return a content representation of requested article, never null
     * @throws ActionException on problems with http, cookies and io
     * @throws ProcessException on access problems
     * @see GetRevision
     */
    public synchronized Article readContent(final String name) throws ActionException, ProcessException {
        return readContent(name, 0);
    }
}

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
	 * Test method for {@link TracWikiBot#readContent(String)}.
	 * @throws MalformedURLException on problems with url
	 * @throws ActionException on problems with http, cookies and io
	 * @throws ProcessException on access problems
	 */
	@Test
	void testReadContent() throws MalformedURLException, ActionException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://localhost:8080/trac/");
		Article a = bot.readContent("WikiStart");
		assertNotNull(a);
		assertTrue(a.getText().contains("Welcome to Trac"));
	}
}

// TracWikiBot.java
package net.sourceforge.jwbf.trac.bots;
