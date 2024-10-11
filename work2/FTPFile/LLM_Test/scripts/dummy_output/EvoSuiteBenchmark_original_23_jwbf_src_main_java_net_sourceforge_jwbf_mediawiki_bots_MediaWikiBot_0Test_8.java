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
		
    @Inject
    WikiBot wikiBot;

    @Inject
    HttpActionClient actionClient;
	private boolean successCalled;
	private boolean isDeleted;
	private boolean isModified;

	private String target = "http://www.mediawiki.org";
	
	private MediaWiki bot;
	private int version;
	
	@Test
	void getArticle_withEmptyArticleWithVersionReturnsAnEmptyArticle() throws ActionException {

        int articleVersion = 4;

        try {
            // Create a new MediaWiki bot and set it up.
            bot = new MediaWiki(target);
        } catch (ContentProcessableException e) {
            // An article with this version can't be created.
            throw new ActionException("Cannot create a Content Processable", e);
        }
        bot.wiki().putMwVersion("", articleVersion);

        // Perform the HTTP request.
        actionClient.executeAction("getArticle");

        // We should receive a ContentProcessable which is just the article.
        successCalled = true;

        // Check if the article was succesfully created.
        assertEquals(1, successCalled);

        // Check that the returned article was an article.
        Article article = bot.getArticle(target, version);

        // Return the article.
        assertNotNull(article);
        assertNotNull(article.getContent());
        assertNotNull(article.getContent());
        assertNotNull(article.getVersion() == version);

        // Check if the returned revision is our version revision.
}
}