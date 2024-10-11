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
		private static final int maxContentBody = 500;
	
	/**
	 * @test
	 * @jira_ticket JWBF-841
	 * @test_category issue
	 * @test_description Check that a content access for a simple article is properly read.
	 */
	@Test
	public void testReadContentSimple() throws MalformedURLException, ActionException, ProcessException {
		WikiBot wb = new WikiBot();
		TracWikiBot r = new TracWikiBot(
//				 new URL("http://trac.edgewall.org/" + wb.getWikiType() + "/")
							new URL("http://trac.edgewall.org/wiki/" + wb.getWikiType() + "/")
		);
		String title = "TODO" + ":" + (String) wb.readData(null, 0);
		assertNotNull(title);
		String content = r.readContent(title);
		assertNotNull(content);
//		System.out.println( "content:\n\t" + content );
	}

	/**
	 * @test
	 * @jira_ticket JWBF-841
	 * @test_category issue
	 * @test_description Check that a content access for a wiki is properly read.
	 */
	@Test
	public void testReadWiki() throws MalformedURLException, ActionException {
		WikiBot wb = new WikiBot();
		TracWikiBot r = new TracWikiBot(
				 new URL("http://trac.edgewall.org/" + wb.getWikiType() + "/")
		);
		Userinfo u1 = r.getUserinfo();
		String title = "GitHub" + ":" + (String) wb.readData(null, 0);
		assertNotNull(title);
		String content = r.readContent(title); // this should return a wiki as a wiki
		assertNotNull(content);
		Userinfo u2 = new Userinfo( u1.getUsername(), u1.getName(), u1.getEmail(), true, u1.getAvatarUrl(), u1.getLanguage(), u1.getDisplayName(title), u1.getOrganization(), u1.getAvatarUrl( null), u1.getDisplayName(null), u1.getAvatarUrl( null), u1.getLanguage("en"), u1.getOrganization("trac-sourceforge"), u1.getAvatarUrl("trac"));
		assertTrue(u1.getAvatarURL( title ).equals(u2.getAvatarURL( null ))); // this should be in a different format than from the wiki.
		assertTrue(u1.getAvatarURL( title ).endsWith( "?url=" + u1.getUrl( null ) ) );

//		String content = r.readContent( title );
//		assertTrue( content.endsWith("\n"+ title) );
	}
}