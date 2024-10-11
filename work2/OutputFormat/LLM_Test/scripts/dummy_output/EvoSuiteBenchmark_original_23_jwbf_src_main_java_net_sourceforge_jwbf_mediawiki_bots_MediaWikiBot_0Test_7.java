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
    private MediaWiki bot;
	
	@Inject
    private UrlMaker urlMaker;
    
    @Test
    void getArticle_Basic() {
        assertNull(getArticle("MyPage", MediaWiki.VERSION));
        assertNull(getArticle("MyPage", 0));
        assertNull(getArticle("MyPage", null));
        assertNull(getArticle("MyPage", -1));
        assertNotNull(getArticle("MyPage", ""));
        assertNotNull(getArticle("MyPage", 0));
        assertNotNull(getArticle("MyPage", null));
    }
    
    @Test
    void getArticle_Wiki() {
        assertEquals("Main Page", getArticle("Main Page", 1));
        assertEquals("Main Page", getArticle("Main Page", MediaWiki.VERSION));
        assertEquals("Main Page", getArticle("Main Page", MediaWiki.V1));
        assertNull(getArticle("Main Page", MediaWiki.V1d1));
        assertNull(getArticle("Main Page", MediaWiki.V1d1));
    }
    
    @Test
    void getUserinfo_Basic() {
        try {
            Userinfo u = bot.getUserinfo("testuser");
            assertNotNull(u);
            assertEquals("The User", u.getUser());
        } catch (ProcessException e) {
            fail("Could not get the user-info");
        }
        
}
}