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
		static {
		URL url = new URL("https://trac.edgewall.org/wiki/" + System.getProperty("user.name"));
		System.out.println(url);
	}

	/**
	 * Unit test of TracWikiBot.
	 * @throws MalformedURLException
	 *           if url does not represent a well-formed url, throws
	 *           {@link MalformedURLException}
	 */
	@Test
	public void readContent() throws MalformedURLException {
		TracWikiBot bot = new TracWikiBot("http://test.tac.kamoom.net/wiki");
		ContentAccessable content = bot.readContent("TracWiki");
		assertSame(ContentAccessable.class, content.getClass());
		assertEquals("Test Title", content.getTitle());
		assertEquals("Test Author", content.getAuthor());
		assertNotNull(content.getAuthor());

		assertEquals(new SimpleArticle("hello"), content.getContent());
		content = bot.readContent("TracWiki2");
		assertSame(ContentAccessable.class, content.getClass());
		assertEquals("Tac.kamoom.net", content.getSource());
		assertNotNull(content.getAuthor());

	}

	/**
	 * Unit test for {@link TracWikiBot#writeContent(ContentAccessable sa)}.
	 * The method should not be called before {@link TracWikiBot#login} method.
	 * @throws MalformedURLException
	 *             if url does not represent a well-formed url, throws
	 *             {@link MalformedURLException}
	 * @throws ProcessException
	 *             if something goes wrong
	 */
	@Test
	public void writeContent() throws MalformedURLException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://test.tac.kamoom.net/wiki");
		ContentAccessable content = bot.readContent("Tac.kamoom.net");
		boolean result = content.put("Tac.kamoom.net", "hello", System.currentTimeMillis());
		assertEquals("Result1", "Result2", result);

        assertTrue(content.getSource().startsWith("Tac.kamoom.net"));
		TracWikiBot.readContent(content);
		bot.login(System.getProperty("user.name"), System.getProperty("user.passwd"));
		content = bot.readContent("Tac.kamoom.net");
        bot.logout();
	}

	/**
	 * Unit test of {@link TracWikiBot#delete(String)}.
	 * The method should not be called before {@link TracWikiBot#login} method.
	 * @throws MalformedURLException
	 *             if url does not represent a well-formed url, throws
	 *             {@link MalformedURLException}
	 * @throws ProcessException
	 *             if something goes wrong
	 */
	@Test
	public void delete() throws MalformedURLException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://test.tac.kamoom.net/wiki");
		assertTrue(bot.delete("Tac.kamoom.net"));
		TracWikiBot.readContent(bot.readContent("Tac.kamoom.net"));
		assertFalse(bot.delete("Tac.kamoom.net"));
		TracWikiBot.readContent(bot.readContent("Test Author"));
		TracWikiBot.readContent(bot.readContent("Author not registered"));
		assertFalse(bot.login(System.getProperty("user.name"), System.getProperty("user.passwd")));

	}

	/**
	 * Unit test of {@link TracWikiBot#postDelete(String)}.
	 * The method should not be called before {@link TracWikiBot#login} method.
	 * @throws MalformedURLException
	 *             if url does not represent a well-formed url, throws
	 *             {@link MalformedURLException}
	 * @throws ProcessException
	 *             if something goes wrong
	 */
	@Test
	public void postDelete() throws MalformedURLException, ProcessException {
		TracWikiBot bot = new TracWikiBot("http://test.tac.kamoom.net/wiki");
		TracWikiBot.readContent(bot.readContent("Tac.kamoom.net"));
}
}