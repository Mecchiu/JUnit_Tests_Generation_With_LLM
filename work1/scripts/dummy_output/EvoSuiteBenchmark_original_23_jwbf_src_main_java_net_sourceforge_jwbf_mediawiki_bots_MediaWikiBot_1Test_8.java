// MediaWikiBot_1Test.java
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
* It contains one unit test case for the {@link MediaWikiBot#getArticle(String)} method.
*/
class MediaWikiBot_1Test {
		/**
		* @param s the name of the article
		* @return a content representation of requested article, never null
		* @see GetRevision
		*/
		synchronized Article getArticle(String s);
}

/**
 * This class is a unit test for the
* {@link net.sourceforge.jwbf.core.bots.MediaWikiBot} class
* in the package
 * {net.sourceforge.jwbf.core.bots.MediaWikiBot}.
 * Because this test class is abstract the
* {@link net.sourceforge.jwbf.core.bots.MediaWikiBot#getArticle(String)} method
* returns null. Consequently, that method shall not be call in
* the base class but it should be in the subclass it belongs to.
*/
@Slf4j
class MediaWikiBot_Test extends MediaWikiBot_1Test {
	boolean passed;
	private URL wikiUrl;
	
	@Inject
	private MediaWiki mediawiki;

	/**
	* It should create a {@link MediaWikiBot} object with a proper
	* {@link GetRevision} action for each test class.
	* @see net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot
	*/
	@Test
	public void testActionsGetRevision() throws ContentProcessable, InterruptedException,  ActionException {
		this.wikiUrl = new URL("http://www.wikipedia.org/");
		this.passed = false;
		final HttpActionClient actionClient = this.mediawiki.getActionClient("getRevision");
}
}