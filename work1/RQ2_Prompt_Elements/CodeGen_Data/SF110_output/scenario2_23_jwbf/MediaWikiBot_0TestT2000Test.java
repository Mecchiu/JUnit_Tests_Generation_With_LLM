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

  private static final Set<Version> VERSIONS = Collections.emptySet();
  private static final Set<Version> VERSIONS_UNKNOWN = Collections.emptySet();

  private static final int PRIVMSG_VERSION = 1;
  private final Set<ActionException> exceptions = Collections.synchronizedSet(new HashSet<>());
    
  private final MediaWiki mwapi = new MediaWiki();
  private final MediaWiki.Version latest_version="1";

  @Inject
  @HttpActionClient
  protected HttpBot httpBot;


  @Test(expected=ActionException.class)  
  public void readMissingVersionError() throws JwbfException, ContentProcessable {
    SimpleArticle art = new SimpleArticle("Version 1");
    postAct(PostModifyContent.class, 
           new PostModifyContent().setArticles(Collections.singletonList(art)),
           new LoginData(),
           new Version());
  }

  @Test(expected=ActionException.class)  
  public void readMissingVersionErrorOldWiki() throws JwbfException, ContentProcessable {
    SimpleArticle art = new SimpleArticle("Version 1");
    postAct(PostModifyContent.class, 
           new PostModifyContent().setArticles(Collections.singletonList(art)),
           new LoginData(),
           latest_version,
           PRIVMSG_VERSION);
  }
  
  @Test
  public void readOneVersion() throws JwbfException, Content