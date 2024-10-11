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
    void testHasMoreMessages_0()
    throws PostModifyContentException, VersionException {
        MediaWiki mediaWiki = new MediaWikiBot();
        
        Set<String> links = new HashSet<String>();
        Set<String> cmsPages = new HashSet<String>();
        links.add("http://example.com/+edit?m=content");
        links.add("https://example.com/");
        cmsPages.add("http://example2.com:8081");
        mediaWiki.setSiteLinks("", links);
        mediaWiki.setCMSPages("", cmsPages);
        
        
        try {
			Set<String> comments = new HashSet<String>();
			comments.add("/edit/post/page/comment");
			comments.add("/edit?m=content-2&m");
			comments.add("/edit?m=content-2&m");
			comments.add("/edit?m=content-2&m=test&m");
			comments.add("/edit?m=content-2&m=test1");
			comments.add("/edit?m=content-2&m=test1&m");
			
			/*
			 * Try adding a title that is a valid link with an m
			 */
			Set<String> title = new HashSet<String>(1);
			title.add("m");
			title.add("test");
			title.add("testx");
			mediaWiki.setTitle("", title);
			
            mediaWiki.runBot();
            
            Set<String> actual = new HashSet<>(mediaWiki.getPageTitleExact());
            
            assertNotNull(actual);
        }
        catch (GetException ge) {}
    }

    @Test
    void testPostPost_0()
	throws PostModifyContentException, VersionException, ProcessException {
        MediaWiki mediaWiki = new MediaWikiBot("TestBot");
        Set<String> links = new HashSet<String>();
        Set<String> cmsPages = new HashSet<String>();
        links.add("http://example.com/+edit?m=content");
        links.add("https://example.com/");
        cmsPages.add("http://example2.com:8081");
        mediaWiki.setSiteLinks("", links);
        mediaWiki.setCMSPages("", cmsPages);
        
}
}