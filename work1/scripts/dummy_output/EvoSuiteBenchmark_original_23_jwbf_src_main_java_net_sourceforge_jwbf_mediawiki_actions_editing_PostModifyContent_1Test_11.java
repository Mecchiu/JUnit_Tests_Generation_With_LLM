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
		/**
		* @param e
		*/
		@Test
		public void postModifyContent_1_1_1() {
if (log.isInfoEnabled()) log.traceEntry(_postModifyContent_1_1_1_1);
		// An interaction with a wiki should throw NoSuchPageException
        // An intersection of content and this wiki should contain the article containing the current content
		final Set<String> wikiContent = new HashSet<>();
		// The same set of article containing the current
		// content with the same set of articles
		String sameContent = "The content can be edited.";
		final Set<String> sameCurrentContent = new HashSet<>();
		sameCurrentContent.add(SimpleArticle.getText(getCurrentWiki() + "/" + SimpleArticle.getText(getCurrentWiki() + "/edit_of")));
		final Set<String> sameArticle = new HashSet<>();
		final Set<String> sameArticleContent = new HashSet<>();
		// Different wiki
		Get wikiWithSameContent = new Get(getWikiWithSameContent(wikiContent, getVersion(), sameCurrentContent, sameArticleContent));
		Post wikiOnlyContent = new Post(wikiWithSameContent);
        Post wikiWithSameContent_2 = new Post(wikiWithSameContent.getId(), getVersion());
		test(wikiOnlyContent);
		test(wikiWithSameContent_2);
		// Different wiki
		Get wikiWithSameContent_3 = new Get(getWikiWithSameContent(wikiContent, getVersion(), sameContent, sameArticle));
		Post wikiOnlyContent_2 = new Post(wikiWithSameContent_3);
        Post wikiWithSameContent_3_2 = new Post(wikiWithSameContent.getId(), getVersion());
        Post wikiOnlyContent_3_2 = new Post(wikiWithSameContent_3_2.getId(), getVersion());
		test(wikiOnlyContent);
		test(wikiOnlyContent_2);
		test(wikiOnlyContent_3);
		test(wikiOnlyContent_3_2);
	}
		/**
		* @param testWiki
		* @param testVersion
		* @param wikiContent
		* @param wikiContent_2
		* @param wikiContent_3
		* @param wikiContent_4
		* @param wikiContent_5
		* @param wikiContent
		* @param wikiContent
		* @param wikiContent_2
		* @param wikiContent_3
		* @param wikiContent_4
		* @param wikiContent_5
		* @see net.sourceforge.jwbf.mediawiki.actions.actions.ActionTestHelper
		*/
		public void test(String testWiki) {
		if (log.isInfoEnabled()) log.traceEntry(testWiki);
		// An interaction with and without current version
		assertFalse(PostModifyContent.isIntersectionEmpty(wikiContent, getWikiContent()));
		assertTrue(PostModifyContent.isIntersectionEmpty(wikiContent, testWiki));
}
}