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
		@Inject
		@LoggedIn
		private String loggedInUser;
		@Inject
		private LoggedInUserinfo loggedInUserInfo;
	
	/**
	 * MediaWiki.java is not used
	 * Check if the correct wiki url is found
	 * @return set of all articles in a wiki as a {@link Set}
	 */
	private synchronized Set<Article> getAllAts() {
		Set<Article> allArticles = new HashSet<>();
		try {
			allArticles.add(
				new SimpleArticle(
					"Main Page",
					Collections.singletonMap("title", "Main Page"),
					Collections.singletonMap("userinfo", loggedInUser)).addAll(
					getSiteinfo()));
		} catch (ActionException | VersionException | JwbfException e) {
			log.error("caught ActionException", e);
			return Collections.emptySet();
		}
		
		if (
				new SimpleArticle(
					"Main Page",
					Collections.singletonMap("title", "Main Page"),
					Collections.singletonMap("userinfo", loggedInUser)).addAll(
				getSiteinfo())) {
			allArticles.add(
				new SimpleArticle(
					"Main Page",
					Collections.singletonMap("title", "Main Page"),
					Collections.singletonMap("userinfo", loggedInUser)).addAll(
				getSiteinfo()));
		}
		return allArticles;
	}
	
}