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
	MediaWiki mediawiki;
    @Inject
    HttpActionClient httpaction;

    @Test
    void basicGet() throws ContentProcessable, ActionException {
        assertEquals(getTitle(), "MediaWiki", null);
        assertEquals(getContentUrl(), null);
        assertEquals(getContentTitle(), null);
        assertEquals(getContentContentType(), null);
        assertEquals(getAuthor(), null);
        assertEquals(getModifiedArticle(), null);
        assertEquals(getPublishedArticle(), null);
        assertEquals(getContentAccessInfo(), null);
    }
    
	@Test
    void basicGetByName() throws ContentProcessable, ActionException, ContentException {
        assertEquals(getTitle(), "MediaWiki", null);
        assertEquals(getContentURL(), null);
        assertEquals(getContentTitle(), null);
        assertEquals(getContentContentType(), null);
        assertEquals(getAuthor(), null);
        assertEquals(getModifiedArticle(), null);
        assertEquals(getPublishedArticle(), null);
        // check if the article was found by the name
        assertEquals("Main Page", getContentAccessInfo());
    }
    
	@Test
    void basicPostLoginOld() throws ContentProcessable, ActionException {
        // post on version 1.0: no post link in the content
        Userinfo u = new Userinfo("", "", "");
        Version v = new Version(1, 0, 0);
        LoginData ld