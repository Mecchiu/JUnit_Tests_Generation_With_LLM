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
		* Basic method to write a set of simple articles from another set.
		*/
	private final Set<SimpleArticle> createInput() {
		final Set<SimpleArticle> set = new HashSet<>();
		set.add(new SimpleArticle(((Hashtable<String, Object>) new HashSet.hashSet((HashSet<String>) set)).toArray((Object[]) new Object[0])));
		return set;
	}

	private final Hashtable<String, Set<SimpleArticle>> createTestData() {
		// The article should be added one word in each article before it's written.
		final Hashtable<String, Set<SimpleArticle>> set = new Hashtable<>();
		set.put(getText("testData1"), getInput());
		return set;
	}

	private final Set<SimpleArticle> getInput() {
		return new HashSet<>();
	}


	@Test
        void test_isIntersectionEmpty_whenCreateInput_isEmpty()  throws VersionException,
                ActionException,
                ProcessException,
                LombokConfigurationException,
                JwbfException {
		final MediaWiki mediawiki = MediaWiki.findMediaWiki();
		final MediaWikiBot bot = mediawiki.findBot("Bot 1");
		final MediaWikiBot mediawikiBot = mediawikiBot(bot);

		final PostModifyContent postModifyContent = new PostModifyContent();

		assertFalse(postModifyContent.isIntersectionEmpty(null, createInput()));

		try {
			assertEquals(postModifyContent.isIntersectionEmpty(createInput(), createInput() ), false);
		}
		catch (PostModifyContent.VersionException e) {
			fail(e);
		}
	}

	@Test
        void test_isIntersectionEmpty_whenCreateInput_setDifferenceDifferentSize()
                throws VersionException, ActionException,
                ProcessException,
                LombokConfigurationException,
                JwbfException {
		final MediaWiki mediawiki = MediaWiki.findMediaWiki();
		final MediaWikiBot bot = mediawiki.findBot("Bot 1");
		final MediaWikiBot mediawikiBot = mediawikiBot(bot);

		final Set<SimpleArticle> article1 = getInput();
		final Set<SimpleArticle> article2 = createTestData();
		final Set<SimpleArticle> article3 = createInput();

		try {
			assertTrue(postModifyContent.isIntersectionEmpty(createInput(), article1));
		}
		catch (LombokConfigurationException e) {
			fail(e);
		}
}
}