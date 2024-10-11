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
		
	private static final Version MAX_MEDIAWIKI_VERSION = Version.valueOf(MW1_16);
	private static final Version EMPTY_MEDIAWIKI_VERSION = Version.MEDIAWIKI_EMPTY;
	private static final Version BSD_MEDIAWIKI_VERSION = Version.MEDIAWIKI_BSD;
	
	/*
	 * This version must be supported by MediaWiki. It also must include this mediawiki version.
	 */
	private final static Version VERSION = Version.MEDIAWIKI_MEDIAWIKI_VERSION;
	
	private final MediaWiki mediaWiki = new MediaWiki();
	
	private final String title = "test" + " title";
	private final String text = "test" + " text";
	
	@Test
	void isIntersectionEmpty() throws VersionException, ProcessException, ActionException, JwbfException {
		Set<String> mediaWikiIDs = new HashSet<>();
		mediaWikiIDs.add(mediaWiki.getWikiID());
		setMediaWikiIDs(mediaWikiIDs);
		// Set the version and the versions of mediaWiki to be empty.
		mediaWiki.setVersion(Version.MEDIAWIKI_EMPTY);
		Version emptyMediaWikiVersion = mediaWiki.getVersion();
		assertNull(mediaWiki.getVersion());
		
		// Post on the MediaWiki instance.
		Set<String> params = new HashSet<>();
		params.add("format=" + MediaWiki.Format.TEXT.getIdentifier());
		params.add("title=" + title);
		params.add("text=" + text);
		Post post = new Post(params, null, false);
		post.post();
		Get act = mediaWiki.get(0);
		assertFalse(act.hasNext());
		assertFalse(act.hasPrev());
		
		// Check after the first POST.
		post = new Post(params, null, false);
		post.post();
		assertEquals(1, act.hasNext());
		Set<String> pageContentToInclude = new HashSet<>();
		// Assert that content is as expected.
		Get pageAgo = new Get(pageContentToInclude, null);
		pageAgo.page(0);
		pageAgo.get(); // firstpage
		pageContentToInclude.add("lastpage");
		Get pageContent = new Get(pageContentToInclude, null);
		assertEquals(new SimpleArticle(text), pageContent);
		pageContent.page(new SimpleArticle("content"));
		assertTrue(new HashSet<>(pageContent.getResults()).remove(new SimpleArticle("lastpage"))); // pageContent should not have been filtered out.
		assertNull(pageContent.hasResult());
		PostPageAction postPageAction = new PostPageAction(null, mediaWiki);
		assertNotNull(postPageAction.getPage(post)); // postPage is correct.
		postPageAction.run();
}
}