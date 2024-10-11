// MediaWikiBot_0Test.java
package net.sourceforge.jwbf.mediawiki.bots;

import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.editing.GetRevision;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostDelete;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostModifyContent;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLogin;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLoginOld;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetUserinfo;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetVersion;
import net.sourceforge.jwbf.mediawiki.actions.meta.Siteinfo;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.contentRep.LoginData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWikiBot}.
* It contains one unit test case for the {@link MediaWikiBot#getArticle(String, int)} method.
*/
class MediaWikiBot_0Test {
		private final static String TEST_NAME = "TestName";
		private final static String TEST_META_ID = "TEST-METID";
		private final static String TEST_PREFIX = "test_prefix";
		private final static String TEST_USERNAME = "testUser";
		private final static String TEST_PASSWORD = "123456";

	@Inject(TEST_NAME)
	@Nonnull
	private MediaWiki bot;

	/**
	 * Unit test for the {@link MediaWikiBot#getArticle(String, int)} method.
	 */
	@Test
	public void test_getArticle() throws ContentProcessable, ActionException {
		assertEquals(
			"Incorrect article creation. Expected article '" + TEST_NAME + "'.",
			getArticle(TEST_NAME, 0),
			bot.getArticle(TEST_NAME, 0)
		);
	}

	/**
	 * Unit test for the {@link MediaWikiBot#getArticle(String, int)} method for invalid
	 * arguments.
	 */
	@Test(expected = ActionException.class)
	public void testGetArticleInvalidParameters() throws ContentProcessable, ActionException {
		assertNotSame("Incorrect article creation. Expected valid article.", getArticle(TEST_NAME, 1), null);
		getArticle("test-article-id", 0);
	}

}