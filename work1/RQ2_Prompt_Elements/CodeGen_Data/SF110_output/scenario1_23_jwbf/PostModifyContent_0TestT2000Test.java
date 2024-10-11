// PostModifyContent_0Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PostModifyContent}.
* It contains one unit test case for the {@link PostModifyContent#hasMoreMessages()} method.
*/
class PostModifyContent_0Test {

    /**
    * Creates a MediaWiki and uses it with the {@link PostModifyContent} class.
    * @see https://www.mediawiki.org/wiki/WikiBT/Using_Modifying_Content
    */
    @Test
    public void canCreateAndUseMediaWikiButNoMoreMessages() throws ProcessException {
        final MediaWiki mwe = MediaWikiBot.launch(MediaWiki.class, MediaWikiBot.PARAM_VERSION, "2.0");
        
        final SimpleArticle article_0 = mwe.get("/Article").post(
        new SimpleArticle(
        "article", 
		"Test article", 
		"",
		"Test article", 
		"a")); // post string
        
        /**
        * The test wiki also has 2 articles which need to be processed:
        * 1. The first article after creation.
        * The second article is added after creation.
        * So a post, with an article created before, can't be posted.
        */
        Set<SimpleArticle> articles_a = new HashSet<SimpleArticle>();
		for (SimpleArticle article : article_0.articles) {
		    if (article.title.equals("Test article")) {
		    	article_a.add(article);
		    }
			if (article.title.equals("Article a")) {
				articles_a.add(article);
			}
		}
        
        final Set<String> titles = new HashSet<String>();
        titles.add("article_0");
        titles.add("article_1");

        final Get get = new Get(titles);
        get.firstArticle(
        new ContentAccessable(article_0, "first")
        );
        get.firstArticle(
        new ContentAccessable(article_1, "first")
        );

        get.firstArticle(
        new ContentAccessable(article_0, ("Article first"))
        );

        get.firstArticle(
        new ContentAccessable(article_1, ("Article second"))
        );

        return;
        
    }
    
    @Test
    public void canCreateAndUseMediaWikiAndPostMore() throws ProcessException, ActionException, VersionException {
        final MediaWiki mwe0 = MediaWikiBot.launch(MediaWiki.class, MediaWikiBot.PARAM_VERSION, "2.0");
        final MediaWiki mwe1 = MediaWikiBot.launch(MediaWiki.class, MediaWikiBot.PARAM_VERSION, "2.1");
        final MediaWiki mwe2 = MediaWikiBot.launch(MediaWiki.class, MediaWikiBot.PARAM_VERSION, "2.2");
        final MediaWiki mwe3 = MediaWikiBot.launch(MediaWiki.class, MediaWikiBot.PARAM_VERSION, "2.3");

        /**
        * @tests can create and still read next articles (when new one is available)
        */
        final Hashtable<String, String> properties = new Hashtable<String, String>();

        /**
        * The first post creates an article from a template article.
        */
        properties.put(Post.PARAM_TEMPLATE, "a");
        final String actual_4 = mwe0.create(
