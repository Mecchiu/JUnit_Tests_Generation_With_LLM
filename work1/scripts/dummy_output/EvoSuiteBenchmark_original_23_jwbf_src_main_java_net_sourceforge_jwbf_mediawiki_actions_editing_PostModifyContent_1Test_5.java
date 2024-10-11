// PostModifyContent_1Test.java
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
* It contains one unit test case for the {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
*/
class PostModifyContent_1Test {
		
	@Test
    void testPostModifyContent() throws VersionException, ProcessException, JwbfException {
    	/* Test preconditions with default mediaWiki version */
        final Hashtable<String, String> table = new Hashtable<>();

        table.put("_Version", ActionUtil.getVersion().toString());

        final Hashtable<String, String> actionSet = new Hashtable<>();
        table.put(ActionUtil.ACTION_SETNAME, "testaction");
        actionSet.put(ActionUtil.ACTION_SETNAME, "dummyaction");
        table.put(ActionUtil.ACTION_SET1, actionSet);

        final SimpleArticle s_an_a_article = new SimpleArticle();

        table.put("_Title", "An article");
        final SimpleArticle dummyArticle = new SimpleArticle("dummyarticle", s_an_a_article, null);

        table.put("_Summary", "Lorem ipsum dolor sit amet");

        final String[] sCategories = new String[1];
        
        sCategories[0] = "nest";

        final String[] sSummary = new String[1];

        final SimpleArticle[] sArticles = new SimpleArticle[3];

        for (int i = 0; i < 3; ++i) {
            
            sArticles[i] = dummyArticle;
        }

        table.put("_Category", sCategories);

        final Set<String> sArticleSet = new HashSet<>();

        sArticleSet.add("dummyarticle");

        table.put(ActionUtil.ARTICLE, sArticleSet);
        try {
            final ContentAccessable c_article = new ContentAccessable(new MediaWiki(), table);

            final HashSet<String> s_articleSet = new HashSet<>();

            c_article.add(s_articleSet);
        } catch (VersionException | JwbfException | ProcessException e) {
            log.error("Exception caught:", e);
        }
        
        final SimpleArticle originalArticle = new SimpleArticle(dummyArticle);
        final SimpleArticle modifiedArticle = new SimpleArticle("article.modified", originalArticle.getAsArticle(), originalArticle.getVersion());
        
        final SimpleArticle[][] d_article = new SimpleArticle[2][2];

        d_article[0][0] = new SimpleArticle("article.1", modifiedArticle.getAsArticle(), modifiedArticle.getVersion());
        d_article[0][1] = new SimpleArticle("article.2", modifiedArticle.getAsArticle(), modifiedArticle.getVersion());
        d_article[1][0] = new SimpleArticle("article.3", originalArticle.getAsArticle(), originalArticle.getVersion());

        final ContentAccessable[] d_article2 = new ContentAccessable[2];

        d_article2[0] = new ContentAccessable(d_article[0]);
        d_article2[1] = new ContentAccessable(d_article[1]);
}
}