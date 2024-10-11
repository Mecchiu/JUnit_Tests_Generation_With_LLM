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
		private Tracker tracker = TrackerFactory.getTracker();

		/**
	 * @throws MalformedURLException
	 */
		@Test
		public void testReadContent() throws MalformedURLException {
			// Try it to read a wiki page and a simple HTML. The test will fail because
			// of a malformed page
			String wikiPageName = "WikiStart";

			// get a tracker instance and retrieve the wiki
			tracker = new Tracker();
			tracker.start(false);

			// obtain a WikiBot and log into that
			WikiBot wiki = new WikiBot(wikiPageName);
			wiki.login("user", System.getProperty("testing.admin.user"));

			// this should fail
			assertEquals(wiki.readContent(null), null);
		}

		/**
	 * @throws MalformedURLException
	 */
		@Test
		public void testLogin() throws MalformedURLException {
			// get a tracker instance and retrieve the wiki
			tracker = new Tracker();
			tracker.start(false);

			// obtain a WikiBot and log into that
			WikiBot wiki = new WikiBot(null);
			wiki.login("user", System.getProperty("testing.admin.user"));

			// this should fail
			assertEquals(wiki.login(null), null);

			// login should succeed
			assertEquals(wiki.login("user", null), null);
			String wikiData = wiki.readData(wikiPageName);
			assertEquals(wikiData, "/wiki/" + wikiPageName);

			// if a user is logged in, getVersion should return null
			assertNull(wiki.getVersion());
		}

		/**
	 * @throws ActionException
	 */
		@Test
		public void testAction() throws ActionException {

			// read the content
			String wikiData = null;
			try {
				wikiData = wiki.readData(null);
			} catch (ProcessException e) {
			}
			assertNull(wikiData);

			// access a simple wiki.
			wikiData = wiki.readContent(null);
			Article data = wiki.readData(wikiData);
			// should be a simple content
			assertFalse(wikiData.contains("<h1>"));
			// get a tracker instance and retrieve the wiki
			tracker = new Tracker();
			tracker.start(false);

			// obtain a WikiBot and log into that
			WikiBot wiki = new WikiBot(wikiData);
			wiki.login(null);

			assertEquals(wiki.getWikiType(), "Wiki"); // wiki's type is "Wiki"
			// wiki is ready to read and write content - so we should see "Wiki"
			String wikiContent = wiki.readContent(data.getName());
			assertEquals(wikiContent, wikiData);
		}

		/**
	 * @throws MalformedURLException
	 */
		@Test
		public void testAction2() throws MalformedURLException {

			// reading data
			String wikiData = null;
			try {
				wikiData = wiki.readData(wikiPagingUrl);
			} catch (ProcessException e) {
			}
			assertNull(wikiData);

			// writing content
			wikiData = "123456\n234567\n12345678";
			try {
				wiki.writeContent(new SimpleArticle(wikiData));
			} catch (ProcessException e) {
			}
			// wiki contains a new document

			String wikiContent = wiki.writeData(wikiData);

			// read the content
			wikiData = null;
			try {
				wikiData = wiki.readContent(null);
			} catch (ProcessException e) {
			}
			// try to access a non existing document

			assertEquals(null, wiki.readContent("non_existant_id"));
		}

		/**
	 * @throws ProcessException
	 */
		@Test
		public void testPostDelete() throws ProcessException {

			String wikiData = null;
			try {
				wikiData = wiki.writeContent(new SimpleArticle(wikiData));
			} catch (ActionException e) {
			}

			// delete a content
			String wikiData1 = null;
			wikiData1 = getWikiType() + "/wiki/" + wikiData;
}
}