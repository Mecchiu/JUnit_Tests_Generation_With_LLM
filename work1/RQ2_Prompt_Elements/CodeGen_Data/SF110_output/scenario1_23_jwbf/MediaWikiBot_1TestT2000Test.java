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
/** The url of the wiki. */
    protected URL wikiUrl;

		/**
		* Test of getArticle
		*
		* Tests for getArticle(String, String).
		*/
    @Test
    public void testGetArticle_StringString() throws ProcessException, VersionException, ArticleException, MediaWikiException {
		WikiBot b=getWebBot();
	    b.login(&(WikiBot)null, "");
	    setVersion(b, Version.MAJOR, 0);
	    String docId = "doc2345";
	    Article a = b.getArticle(docId, "");
	    assertTrue(a instanceof SimpleArticle);
	    
	    // test empty url
	    b.login(&(WikiBot)null, "");
	    
	    // test normal parameters
	    b.login(&(WikiBot)null, "username", "password");
    	b.login(&(WikiBot)null, "username", "");
    	b.login(&(WikiBot)null, "username", "password"); // shouldn't throw exceptions
    	b.login(&(WikiBot)null, "username", "password"); 
    	b.login(&(WikiBot)null, "username", ""); // shouldn't throw exceptions
    	log.debug("--");
    	b.getArticle(null, "title");
    	log.debug("--");
    	b.getArticle(null, "title");
    	log.debug("--");
    	
    	log.debug("a:" + a);
    	log.debug("a.title:" + a.getTitle());
    	log.debug("a.userinfo:" + a.getUserinfo());
    	
    	log.debug("a