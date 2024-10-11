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
		* @param a a
		* @param b a
		* @return true if one or both sets are <code>null</code> or the intersection of sets is empty.
		*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean isIntersectionEmpty(Set<?> a, Set<?> b);

	@Test
	public void shouldReturnTrueForBodies() throws PostActionException, ProcessException, VersionException {
		// given
		int i = 1;
		// when
		Set<String> bodies = PostModifyContent.isIntersectionEmpty(new HashSet<>(getBodyDictionaries("body1")), getBodyDictionaries("body2"));
		// then
		assertNotNull(bodies);
		assertTrue(bodies.size() == 1);
		assertTrue(bodies.contains("body1"));
		assertTrue(bodies.contains("body2"));
		assertFalse(bodies.contains("body3"));
		Set<String> bodies2 = PostModifyContent.isIntersectionEmpty(new HashSet<>(getBodyDictionaries("body3")), getBodyDictionaries("body4"));
		log.info("Bodies2: " + bodies2);
		assertTrue(bodies.size() == 2);
		assertTrue(bodies2.isEmpty());
	}

	@Test
	public void shouldReturnFalseForText() throws PostActionException, ProcessException, VersionException {
		// given
		int i = 0;
		// when
		Set<String> bodies = PostModifyContent.isIntersectionEmpty(new HashSet<>(getBodyDictionaries("body1")), getBodyDictionaries("body3"));
		// then
		assertNotNull(bodies);
		assertTrue(bodies.size() == 1);
		assertFalse(bodies.contains("body3"));
		assertFalse(bodies.contains("body2"));
		Set<String> bodies2 = PostModifyContent.isIntersectionEmpty(new HashSet<>(getBodyDictionaries("body3")), getBodyDictionaries("body1"));
		log.info("Bodies2: " + bodies2);
		assertTrue(bodies2.size() == 1);
		assertFalse(bodies2.contains("body1"));
		Set<String> bodies3 = PostModifyContent.isIntersectionEmpty(new HashSet<>(getBodyDictionaries("body3")), getBodyDictionaries("body4"));
		log.info("Bodies3: " + bodies3);
		assertTrue(bodies.size() == 2);
		assertTrue(bodies3.isEmpty());
	}

	@Test
	public void shouldHandleNonStandardBodies() throws PostActionException, ProcessException, VersionException {
		// given
		int i = 0;
		Post post1 = PostPost.create("PostPost 1", "", "", i);
}
}