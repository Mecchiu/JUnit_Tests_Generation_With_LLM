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
		* Test-Case-Description: Test method getMoreMessages(...) of the {@link
		* net.sourceforge.jwbf.mediawiki.actions.editing.PostModifyContent} class.
		* @throws net.sourceforge.jwbf.core.bots.util.JwbfException
		*/
		@Test
		public void test_getMoreMessages() throws PostModifyContent_Exception {
			// Given/When

			// pre-condition - actions were initialized
			assertNotNull("getMoreMessages() precondition must be checked", actions);

			// action invocation (pre-condition - actions were initialized)
			PostModifyContent_0Test.this.actions.getMoreMessages(0);

			// post-condition - number of messages must be 1 in this context
			Set<Integer> expected = new HashSet<>();
			expected.add(1);
			assertTrue("getMoreMessages() post-condition (0) must be 1 in context", expected.equals(this.first.getMoreMessages(0)));
			expected = new HashSet<>();
			expected.add(1);
			assertTrue("getMoreMessages() post-condition (1) must be 1 in context", expected.equals(this.second.getMoreMessages(0)));

			// post-conditions (post-condition)

			// normal action execution
			assertFalse("getMoreMessages() post-condition (0) didn't expected", (this.first.getMoreMessages(0) == 1));
			assertFalse("getMoreMessages() post-condition (1) didn't expected", (this.second.getMoreMessages(0) == 1));

			// check if mediaWiki bot execution result
			Set<Integer> actual = getExpectedResponse(first.getMoreMessages(0));
			assertEquals("getMoreMessages() post-condition (0) mediaWiki bot didn't execute", expected, actual);

			// check if mediaWiki bot execution result
			actual = getExpectedResponse(second.getMoreMessages(0));
			assertEquals("getMoreMessages() post-condition (1) mediaWiki bot didn't execute", expected, actual);

			// check if mediaWiki action result
			actual = new HashSet<>();
			assertTrue("getMoreMessages() post-condition (0) mediaWiki bot did execute", getExpected().containsAll(actual));
			try {
				first.getMoreMessages(0);
				first = null;
				assertTrue("getMoreMessages() post-condition (0) post-condition didn't execute", false);

				// there is still an exception thrown if the mediaWikiBot execution does not fail
				assertTrue("getMoreMessages() post-condition (0) action failed on second execution", getExpected().isEmpty());
				expected.clear();
				first = new SimpleArticle();
				expected.add(1);
				actual = getExpectedResponse(first.getMoreMessages(0));
				assertFalse("getMoreMessages() post-condition (1) post-condition didn't expect", actual.equals(expected));
			} catch (ActionException e) {
				fail("getMoreMess