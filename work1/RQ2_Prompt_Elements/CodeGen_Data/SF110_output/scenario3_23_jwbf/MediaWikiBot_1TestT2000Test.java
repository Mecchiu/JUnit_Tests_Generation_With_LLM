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
     * This is a fake content rep. With a <pre>ContentProcessable&#64;process()</pre>
     * the processor has to be called.
     * It has 1 parameter, which should be a String containing the request.
     */
    public static final ContentProcessable ContentProcessable = new ContentProcessable();
    
    private static final String USER = "USER";
    private static final String AUTH = "Basic ";
    private static final String PASSWORD = "secret";
    
    private static final URL url = new URL("https://api.mediawiki.org");
    private static final String[] PARAM_SINGLE_PARAM_WITH_PARAM = {
            "action",
            "edit",
    };
    
    private static final String TEXT = "Some text which contains '\"'";
    private static final String TEXT_PARAM = "&quot;";
    private static final String TEXT2 = "Text 2 which contains \"\"";
    private static final String TEXT2_PARAM  = "&amp;";
    private static final String TEXT3 = "\"Text 3\" which contains \"\"";
    private static final String TEXT3_PARAM  = "&quot;";
    private static final String TEXT4 = "Text 4 which contains \"\"";
    private static final String TEXT4_PARAM  = "&amp;";
    
    @Inject
    private UrlProcessor urlProcessor;
    
	private final HTTPActionClient httpActionClient = new HTTPActionClient();
    private final HttpBot mediawiki = new HttpBot();
    private final MediaWiki mediawiki = new MediaWiki();
