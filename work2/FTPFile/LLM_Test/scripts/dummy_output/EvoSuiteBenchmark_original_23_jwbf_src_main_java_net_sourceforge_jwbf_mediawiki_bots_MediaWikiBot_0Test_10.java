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
		
  /**
   * @param name of article in a mediawiki like "Main Page"
   * @param properties {@link GetRevision}
   * @return a content representation of requested article, never null
   * @see GetRevision
   */
  public synchronized Article getArticle(final String name, final int properties);
    
  /**
   * Creates an instance of {@link MediaWikiBot} using the default http proxy
   */
  public void createInstance() {
    // TODO this is a hack to remove the proxy, when the other way around it is implemented :)
    // see https://jira.sakaiproject.org/browse/SAC-1535 - remove after we have fixed all the other uses
    // http://www.xwiki.org/wiki/Configuring_Proxy#Secure_proxy/Tutorial:Configuring_Proxy_Secure_proxy_HTTP

    HttpActionClient client = new HttpActionClient(
        "proxy", "http://localhost", "127.0.0.1",
        new JwbfExceptionHandler(logger)
        );
    client.setConnectionRequestTimeout(5000);
    client.setProxy("");
    client.setUseDirectContent(false);
		
    // creates wikiBot via a new instance of the MediaWikiBot class 
    MediaWiki bot = new MediaWiki();
    bot.init(client);
		
    // returns the instance of a wikipedia bot  
    assertNotNull(bot);
		
}
}