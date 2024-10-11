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
		static class MediaWikiBot_0_Testcase extends MediaWikiBot_0Test {
			public MediaWikiBot_0_Testcase(String name) {
				super(name);
			}
			@Override
			public synchronized Article getArticle(String name, int properties) throws ProcessException {
				return super.getArticle(page.replaceAll("Page", Page + " (page.*)"), properties);
			}
		}
		// Create the wiki-bot...
		@Inject
		private MediaWikiBot _wbBot;

		@Test
		public final void testGetArticle() throws ProcessException {
			// Initial set of tests...
			//
			final SimpleArticle article = new SimpleArticle();
			article.setMediaWikiRootPage(Page);
			article.setTitle("A new article");
			article.setContent("This is an interesting content!");
			article.setText("Some content");
			article.setUserinfo(new Userinfo("a"));
			final Article rval = _wbBot.getArticle(article);
			if (rval!=null) {
				log.error("This should fail as article is already in the database!");
				throw new ProcessException("This should fail");
			}
			assertEquals("Should not fail.", Collections.<String>emptySet(), rval.getNamespace());
			assertEquals("Should not fail.", Collections.<String>emptySet(), rval.getNamespace());
			assertEquals("Should not fail.", Collections.<String>emptySet(), rval.getNamespace());
}
}