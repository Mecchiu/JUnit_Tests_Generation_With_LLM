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
	void testIsIntersectionEmpty() {
		
		PostModifyContent self = new PostModifyContent();
		
		assertFalse(self.isIntersectionEmpty(null, null));
		assertFalse(self.isIntersectionEmpty(null, Set.of(null)));
		assertFalse(self.isIntersectionEmpty(null, Set.of("")));
		assertTrue(self.isIntersectionEmpty(new HashSet<ContentAccessable>(), new HashSet<ContentAccessable>()));
		assertTrue(self.isIntersectionEmpty(new HashSet<ContentAccessable>(), new HashSet<SimpleArticle>()));
		assertFalse(self.isIntersectionEmpty(new HashSet<ContentAccessable>(), new HashSet<Boolean>()));
		assertTrue(self.isIntersectionEmpty(Set.<ContentAccessable> of(null), new HashSet<ContentAccessable>()));
		assertTrue(self.isIntersectionEmpty(Set.<ContentAccessable> of(null), new HashSet<Boolean>()));
		
		assertEqual(new HashSet<ContentAccessable>(), self.isIntersectionEmpty(new HashSet<ContentAccessable>(), new HashSet<SimpleArticle>()));
		assertEqual(new HashSet<SimpleArticle>(), self.isIntersectionEmpty(new HashSet<ContentAccessable>(), new HashSet<Boolean>()));
		assertEqual(new HashSet<Boolean>(), self.isIntersectionEmpty(new HashSet<ContentAccessable>(), new HashSet<ContentAccessable>()));
		assertEqual(new HashSet<ContentAccessable>(), self.isIntersectionEmpty(new HashSet<SimpleArticle>(), new HashSet<ContentAccessable>()));
		assertEqual(new HashSet<ContentAccessable>(), self.isIntersectionEmpty(new HashSet<SimpleArticle>(), new HashSet<Boolean>()));
		assertTrue(self.isIntersectionEmpty(new HashSet<ContentAccessable>(), new HashSet<SimpleArticle>()));
		assertTrue(self.isIntersectionEmpty(new HashSet<ContentAccessable>(), new HashSet<Boolean>()));
		assertTrue(self.isIntersectionEmpty(new HashSet<SimpleArticle>(), new HashSet<ContentAccessable>()));
		assertFalse(self.isIntersectionEmpty(new HashSet<SimpleArticle>(), new HashSet<Boolean>()));
		
		assertFalse(self.isIntersectionEmpty(new HashSet<SimpleArticle>(), new HashSet<ContentAccessable>()));
		assertTrue(self.isIntersectionEmpty(new HashSet<SimpleArticle>(), new HashSet<Boolean>()));
	}
	
	public static void main(String... args) {
		checkMain(PostModifyContent_1Test.class);
	}
}