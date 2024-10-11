// PostModifyContent_0Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PostModifyContent}.
* It contains ten unit test cases for the {@link PostModifyContent#hasMoreMessages()} method.
*/
class PostModifyContent_0Test {

		private MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages_2() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages_3() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages_4() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages_5() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages_6() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages_7() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages_8() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages_9() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages_10() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages_11() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasMoreMessages_12() throws ActionException, ProcessException {
			
			SimpleArticle a = new SimpleArticle();
			a.setTitle("Test");
			a.setText("Test");
			
			PostModifyContent pmc = new PostModifyContent(bot, a);
			
			assertTrue(pmc.hasMoreMessages());
			
			HttpAction ha = pmc.getNextMessage();
			
			assertTrue(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertTrue(pmc.hasMoreMessages());
			
			ha = pmc.getNextMessage();
			
			assertFalse(pmc.hasMoreMessages());
			
			pmc.processReturningText(bot.getPage(ha), ha);
			
			assertFalse(pmc.hasMoreMessages());
			
		}
		
		/**
		 * Test method for {@link PostModifyContent#hasMoreMessages()}.
		 * @throws ActionException 
		 *