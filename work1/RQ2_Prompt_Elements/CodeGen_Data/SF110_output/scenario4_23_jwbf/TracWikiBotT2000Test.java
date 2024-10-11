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
* It contains one unit test case for the {@link TracWikiBot#readContent(String)} method.
*/
class TracWikiBotTest {
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
     * @param url
     *          wikihosturl like "http://trac.edgewall.org/wiki/"
     * @throws MalformedURLException
     *           if param url does not represent a well-formed url
     */
    public TracWikiBot(String url) throws MalformedURLException {
    }

    /**
     * @param name
     *          of article in a tracwiki like "TracWiki", the main page is
     *          "WikiStart"
     * @return a content representation of requested article, never null
     * @throws ActionException
     *           on problems with http, cookies and io
     * @throws ProcessException
     *           on access problems
     * @see GetRevision
     */
    public synchronized Article readContent(final String name) throws ActionException, ProcessException;

    public void login(String user, String passwd);

    public void writeContent(ContentAccessable sa) throws ActionException, ProcessException;

    public void postDelete(String title) throws ActionException, ProcessException;

    public Article readContent(String label, int properties) throws ActionException, ProcessException;

    public SimpleArticle readData(String name, int properties);

    public Userinfo getUserinfo() throws ActionException, ProcessException;

    public String getWikiType();

    public SimpleArticle readData(String name);

    public void writeContent(SimpleArticle sa);

    public void delete(String title);
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
* It contains one unit test case for the {@link TracWikiBot#readContent(String)} method.
*/
class TracWikiBotTest {
		private TracWikiBot a;

		private int id = 0;
		private String title;
			private Article aa;

			@BeforeAll
			public void setUp(){
				id = 1;
				title = "TracWiki" + id;
				aaa = new SimpleArticle(title + "_a", "Some other title");
				aaa.setOwner(id);
				a = new TracWikiBot("https://www.mytrac.org/TRAC/wiki/" + title);
			}

			@AfterAll
			public void tearDown() {
				a = null;
			}

			@Test
			public void testReadContent() {
				a.login("dummyUser", "dummyPasswd");
				a.writeContent(aaa);
				Article a2 = a.readContent("aaa");
				assertTrue(aaa.equals(a2));
			}

			@Test
			public void testReadContent2() {
				a.login("dummyUser", "dummyPasswd");
				a.delete("aaa");
				String newTitle = "MyTracTitle+1";
				a.writetitle(newTitle);
				Article newArt = a.readContent(newTitle);
				getUserinfo();
				Article a1 = a.readContent(newTitle);
				getUserinfo();
				assertTrue(newArt.equals(a1));
			}

			@Test
			public void testReadContent3() throws ActionException, ProcessException {
				a.login("dummyUser", "dummyPasswd");
				a.login("maintainer", "maintainerPasswd");
				a.writeContent(aaa);
				ActionException lastException = null;
				try {
					aaa.setOwner(0);
					aaa.setOwner(1);
					aaa.setOwner(2);
					aaa.setOwner(3);
					aaa.setOwner(4);
					Article data = a.readContent("aaa");
					assertTrue(data instanceof SimpleArticle);
				} catch (ActionException e) {
					lastException = e;
				}
				String msg = "getUserinfo";
				assertTrue(lastException!= null);
				assertEquals(msg, lastException.getMessage());
				assertEquals(lastException.getCode(), 200);
				assertTrue(aaa.getTitle().startsWith("aaa"));
				assertTrue(aaa.getTitle().endsWith("_maintainer"));
			}

			@Test
			public void testReadContent2() throws ActionException, ProcessException {
				a.login("dummyUser", "dummyPasswd");
				a.login("maintainer", "maintainerPasswd");
				a.writetitle("MyTracTitle+1");
				ActionException lastException = null;
				try {
					a.delete("aaa");
					SimpleArticle newArt = new SimpleArticle(title, title);
					aaa.setOwner(0);
					aaa.setOwner(1);
					aaa.setOwner(2);
					aaa.setOwner(3);
					aaa.setOwner(4);
					aaa.setOwner(1);
					aaa.setOwner(2);
					aaa.setOwner(3);
					aaa.setOwner(4);
					newArt.setOwner(3);
					aaa.setTitle("MyTracTitle");
					aaa.setTitle("MyTracTitle");
					aaa.setTitle("MyTracTitle");
					aaa.addContent(newArt);
					aaa.addContent(newArt);
					aaa.addContent(newArt);
					aaa.addContent(newArt);
					aaa.addContent(newArt);
					Article data = a.readContent("aaa");
					assertFalse(data instanceof SimpleArticle);
					assertTrue(aaa.equals(data));
				} catch (ActionException e) {
					lastException = e;
				}
				assertTrue(lastException!= null);
				assertEquals(lastException.getMessage(), "Title does not specify a wikilink.");
			}

			@Test
			public void testReadContent3() throws ActionException, ProcessException {
				a.writetitle("MyTracTitle");
				String title = "MyTracTitle";
				a.writeContent(new Article(title, title));
				String title2 = "MyTracTitle";
				a.writeContent(new Article(title2, title2));
				String title3 = "MyTracTitle2";
				a.writeContent(new Article(title3, title3));
				String title4 = "MyTracTitle3";
				Article newArt = new Article(title4);
				aaa.setTitle(title