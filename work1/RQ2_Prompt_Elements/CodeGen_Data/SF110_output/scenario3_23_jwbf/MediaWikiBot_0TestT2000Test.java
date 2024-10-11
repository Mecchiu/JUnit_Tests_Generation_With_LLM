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
static final String TEST_USERINFO = "testUserinfo";
	@Inject
			private HttpActionClient httpActionClient;
	@Inject
			private MediaWiki wiki;
	@Inject
	private HttpBot_0 httpBot;
	@Inject
	private WikiBot_0 wikitextBot;
	private MediaWikiAdapterAdapterAdapter mediaWikiAdapterAdapter;

	/**
	 * Test method for
	 * {@link net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot#getArticle(java.lang.String, int)}.
	 * @throws ProcessException on failure to complete the action.
	 * @throws VersionException test failed because we have to update the version.
	 */
	@Test
	void testGetArticle() throws ProcessException, VersionException {

		// test get article when userinfo is available
		log.debug("testGetArticle");
		final Userinfo userinfo = new Userinfo(TEST_USERINFO);
		assertNotNull(getArticle(null, -1));
		assertNotNull(getArticle(userinfo, Version.NONE.ordinal()));
		
		// test get article when version is supported
		final Version version = Version.parse("2.0");
		log.debug("testGetArticle with version");
		assertNotNull(getArticle(null, version));
		
		assertNotNull(getArticle(userinfo, version));
		
		// test get article when revision is supported
		final Revision revision = new Revision("2.0");
		final Version finalVersion = version;
		log.