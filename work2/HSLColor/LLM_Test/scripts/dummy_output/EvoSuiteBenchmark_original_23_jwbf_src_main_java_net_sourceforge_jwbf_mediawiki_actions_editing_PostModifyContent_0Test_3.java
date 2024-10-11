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
		* @throws ActionException
		* Just a placeholder for a more real implementation
		*/
	@Test
    public void testPostModify_01HasMoreMessages() throws ActionException {
		// Create a single ContentAccessable object
		MockContentAccessor contentAccessor = new MockContentAccessor(1, 3, 5, 4, 3, 4, 0, 1, 0, 0, 0, 5);

		MockMediaWikiBot wikiBot = new MockMediaWikiBot();

		// Construct a MediaWikiBot containing a MockBot for testing purposes
		WebWikiBot webBot = new MediaWikiBot(new MediaWikiBot[] {new MediaWikiBot(), wikiBot});

		// Construct a GetAction and add the expected parameters
		SimpleArticle article1 = new SimpleArticle();
		article1.addText("hello");
		article1.addText("world");
		MockSimpleArticle articleMock = new MockSimpleArticle(article1, 0, 1, "hello wiki");

		Get get = new Get(articleMock);

		// Prepare the action
		PostAction postAction = new PostModifyContent(null, 0, null, 0, null, null);
		postAction.addGetAction(get);

		// Perform the action
		boolean result = postAction.hasMoreMessages();

		// Validate the result
		assertNotNull(result);
		assertTrue(result);

		// Verify the call parameters
		// Expected is article1 (0)
		Set expected = new HashSet();
		expected.add(articleMock);

		assertEquals(expected, postAction.getGetActionsParameter());

		// Create an action set with 2 articles, which should be processed by the method
		Hashtable actions = new Hashtable(); actions.put(0, postAction);
		actions.put(1, articleMock);

		// The result has a new Hashtable as output
		Set actual = new HashSet();
		// The test will validate that the Hashtable is correct
		postAction.postActions(actual);
		// Validate that the result contains no ArticleMock objects
		assertTrue(actual.isEmpty());
	}

	@Test
    public void testPostModify_02HasMoreMessages() throws ActionException {
		// Create a single ContentAccessor object
		MockContentAccessor contentAccessor = new MockContentAccessor(2, 3, 5, 4, 3, 4, 0, 1, 0, 0, 0, 5);

		MockMediaWikiBot wikiBot = new MockMediaWikiBot();

		// Construct a MediaWikiBot containing a MockBot for testing purposes
		WebWikiBot webBot = new MediaWikiBot(new MediaWikiBot[] {new MediaWikiBot(), wikiBot});

		// Construct a GetAction and add the expected parameters
		SimpleArticle article1 = new SimpleArticle();
		article1.addText("hello");
		article1.addText("world");
		MockSimpleArticle articleMock = new MockSimpleArticle(article1, 0, 1, "hello wiki");

		Get get = new Get(articleMock);

		// Prepare the action
		PostAction postAction = new PostModifyContent(null, 0, null, 0, null, null);
		postAction.addGetAction(get);
}
}