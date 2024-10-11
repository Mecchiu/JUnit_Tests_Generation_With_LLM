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
		
        @Test
        public void test1() {
                String mwActionName = "PostModifyContent.PostModifyContent"; //
                try {
                        new PostModifyContent().hasMoreMessages();
                }
                catch (ActionException ex) {
                        // TODO: Handle exception
                }
        }

        @Test
        public void test2() throws NoSuchMethodException, InstantiationException,
                IllegalAccessException, ClassNotFoundException,
                ProcessException, JwbfException {

                // No implementation in base class
                // No implementation in base class
                log.info("Testing " + mwActionName);
                MediaWiki mediaWiki = new MediaWiki();
                MediaWiki action1 = mediaWiki.getActionByName(mwActionName);

        }
}

public class PostModifyContent_0Test implements PostModifyContent {

    /** {@inheritDoc} */
    @Override
    public  Boolean hasMoreMessages() {
        log.info("check if there are more messages");
        Set<SimpleArticle> list = new HashSet<SimpleArticle>();
        for (SimpleArticle article : mediaWiki.getAllArticle()) {
            if (article.isLatestContent()) {
                // TODO: implement this
                break;
            }
            else {
                list.add(article);
            }
        }
        log.info("check if there is {0}", list.size());
            log.info("check if there are at least {0}", list.size()); //
            return list.size() < MW1_12? true : false;
    }

    /** {@inheritDoc} */
    @Override
    public void postModifyContent(Long version, String subject, String body) throws ActionException {
        log.info("create new article {}", subject);
        for (SimpleArticle article : mediaWiki.createArticle()) {
            log.info("create new article {}", article.getTitle());
            article.setBody(body);
            log.info("create new article {}", article.getTitle());
            // article.setCreated(new Date());
            // article.setCreated(article.getCreated());
            // article.setContentType(article.getContentType());
            // article.setTitle(article.getTitle());
            // article.setTitle(article.getTitle());
            // article.setTitle(article.getTitle());
            article.setUser(LoggedInUser.getNewUser());
            LoggedInUser.getNewUser().addArticle(article);
        }
        ContentAccessable article = new SimpleArticle();
        article.setTitle("Test");
        article.setBody("Test Body");
        article.setUser(LoggedInUser.getNewUser());
        LoggedInUser.getNewUser().addArticle(article);
        Set<SimpleArticle> list = new HashSet<SimpleArticle>();
        list.add(article);
        mediaWiki.setArticle(list);
    }

    /** {@inheritDoc} */
    @Override
    public  Boolean getMoreMessages() {
        return hasMoreMessages();
    }
}