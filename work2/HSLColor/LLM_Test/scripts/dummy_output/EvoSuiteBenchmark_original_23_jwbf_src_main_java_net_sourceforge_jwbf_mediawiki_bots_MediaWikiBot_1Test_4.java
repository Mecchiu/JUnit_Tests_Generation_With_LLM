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
		@Nonnull
		private @Inject
		HttpActionClient _serverActionClient;
		@Nonnull
        private @Inject
        HttpBot _serverBrowser;

		@Test
		public void getArticle_noParams(){
			assertEquals("Main Page", getArticle(null).getContent().getIdentifier());
			assertEquals(null, getArticle(""));
		}

        @Test
        public void getArticle_okParam(){
            assertEquals("Main Page", getArticle("Main Page").getContent().getIdentifier());
        }

		@Nonnull
		private ActionProcessable _getRevision(String version) {
			return new GetRevision() {
				@Override
				public boolean process(ContentProcessable contentProcessable) throws ProcessException {
					assertNotNull(contentProcessable);
					
					return (contentProcessable instanceof MediaWiki.GetRevision) 
							&& ((MediaWiki)contentProcessable).getVersion() == Version.V1_5_2_19;
				}
			};
		}
		
       @Nonnull
       private ContentProcessable _postLogout(LoginData loginData, Version version) throws ProcessException {
           return new PostLogout(null) { // TODO make _postLogout do not throw exceptions
           public <C> void process(ContentProcessable<C> contentProcessable) throws ProcessException {
              assertNotNull(contentProcessable);
              
              return (contentProcessable instanceof MediaWiki.PostLogout)
                     ? ((MediaWiki)contentProcessable).process(version, loginData) : null;
           }
           };
       }
       
}