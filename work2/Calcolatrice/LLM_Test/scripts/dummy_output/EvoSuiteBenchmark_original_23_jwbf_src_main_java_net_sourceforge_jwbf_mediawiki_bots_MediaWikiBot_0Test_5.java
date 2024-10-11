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
		
    private static final @Nonnull GetVersion version = (GetVersion) (ActionException) ActionExceptionFactory
           .create(GetVersion.class, Collections.<String, Set<String>>emptyMap());

    private static final @Nonnull GetRevision revision = (GetRevision) ActionExceptionFactory
       .create(GetRevision.class, Collections.<String, Set<String>>emptyMap());

    private static final @Nonnull ContentProcessable content = (ContentProcessable) ActionExceptionFactory
           .create(ContentProcessable.class, Collections.<String, Set<String>>emptyMap());

    @Inject
    MediaWikiBot_0 target;

    @Test
    public void testGetArticle() {
        assertNotNull(target);
    }

    @Test
    public void testPostDelete() {
        assertNotNull(target);
    }

    @Test
    public void testLogin() {
        assertNotNull(target);
    }

    @Test
    public void testPostModifyContent() throws ContentProcessable, ProcessException {
        getVersion();
        setVersion(Version.OLD_VERSIONS);

        assertNotNull(target);
    }

    @Test
    public void testPostLoginOld() {
        assertNotNull(target);
    }

    @Test
    public void testLoginOld() {
        setVersion(Version.OLD_VERSIONS);

        assertNotNull(target);
    }

    @Test
    public void testPostLogin() {
        setVersion(Version.OLD_VERSIONS);

        assertNotNull(target);
    }

}