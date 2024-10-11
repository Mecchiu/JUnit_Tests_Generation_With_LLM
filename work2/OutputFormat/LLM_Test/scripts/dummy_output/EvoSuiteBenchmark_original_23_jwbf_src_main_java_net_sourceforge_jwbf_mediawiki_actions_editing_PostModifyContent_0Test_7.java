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
* It contains one unit test case for the {@link PostModifyContent#hasMoreMessages()} method.
*/
class PostModifyContent_0Test {
		/**
		* This test case contains one test case for the {@link PostModifyContent#hasMoreMessages()} method.
		*/
		@Test
    	@Slf4j
    	public void hasMoreMessages_postModifyContent_1_01() {
			// the message must be stored on article
			HashSet<String> messages = new HashSet();
			{
				PostPostPageAction postPostPostPageAction = new PostPostPageAction();
				// set the article
				postPostPostPageAction.setArticle(new SimpleArticle("title"));
				// action must return false
				boolean hasMoreMessages = postPostPostPageAction.hasMoreMessages();
				log.trace("hasMoreMessages = {}", hasMoreMessages);
				assertEquals(false, hasMoreMessages);
			}
		}

		/**
		* This test case contains one test case for the {@link PostModifyContent#hasMoreMessages()} method.
		*/
		@Test
    	@Slf4j
    	public void hasMoreMessages_postModifyContent_2() {
			// the message must be stored on article
			HashSet<String> messages = new HashSet();
			{
				PostPostPageAction postPostPostPageAction = new PostPostPageAction();
				postPostPostPageAction.setArticle(new SimpleArticle("title 1", "content 1"));
				// set the article
				postPostPostPageAction.setArticle(new SimpleArticle("title 1", "content 2"));
				// action must return true
				boolean hasMoreMessages = postPostPostPageAction.hasMoreMessages();
				log.trace("hasMoreMessages = {}", hasMoreMessages);
				assertTrue(hasMoreMessages);
				messages.add("title 1");
				messages.add("title 2");
			}
		}

		/**
		* This test case contains one test case for the {@link PostModifyContent#hasMoreMessages()} method.
		*/
		@Test
    	@Slf4j
    	public void hasMoreMessages_postModifyContent_3() {
			// the message must be stored on article
			HashSet<String> messages = new HashSet();

			PostPostPageAction postPostPostPageAction = new PostPostPageAction();
			postPostPostPageAction.setArticle(new SimpleArticle("title", "content"));
			// set the article
			postPostPostPageAction.setArticle(new SimpleArticle("title", "content 2"));

			boolean hasMoreMessages = postPostPostPageAction.hasMoreMessages();
			log.trace("hasMoreMessages = {}", hasMoreMessages);
			assertTrue(hasMoreMessages);
			messages.add("title");
			messages.add("title");
			messages.add("content");
			messages.add("content");
		}

}