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
		private MediaWiki<Integer> mediaWiki;

		@Inject
		MediaWikiBot _this;

		@Inject
		HttpBot _httpBot;

		@Test
		void testGet_0() throws ActionException, ProcessException {
				_httpBot.execute(new PostLoginOld(new LoginData("Username", "Password", "test.org", null, null)));
				_httpBot.execute(new PostLogin(new LoginData("Username", "Password", "test.org", null, null)));
				_httpBot.execute(new PostLoginOld(new LoginData("Username", "Password", "test.org", null, null)));
				_this.checkGet_0();
		}

		private void checkGet_0() throws Error {
				// assert:
				// assert
				// assert:
				// assert
				// assert
				// assert
				// assert
				// assert
				// assert
				// assert
				Article article = _httpBot.execute(new PostLoginOld(new LoginData("Username", "Password",
									 "test.org", null, null)));
				assertEquals("Main Page", article.getTitle());
				// assert:
				article = _httpBot.execute(new GetVersion(Version.MEDIAWIKIBOT_0_0));
				assertNotNull(article);
				assertEquals(1, article.getVersions().size());
				assertEquals(1, article.getVersions().get(0).getVersion().getVersionId().intValue());
}
}