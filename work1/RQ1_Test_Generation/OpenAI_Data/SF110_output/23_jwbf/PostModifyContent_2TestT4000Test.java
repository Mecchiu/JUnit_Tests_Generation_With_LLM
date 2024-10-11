// PostModifyContent_2Test.java
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
* It contains ten unit test cases for the {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
*/
class PostModifyContent_2Test {

	/**
	 * Test method for {@link PostModifyContent#isIntersectionEmpty(Set, Set)}.
	 */
	@Test
	void testIsIntersectionEmpty() {
		Set<String> a = new HashSet<String>();
		Set<String> b = new HashSet<String>();
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("b");
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("b");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("a");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("c");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("c");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("d");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("d");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("e");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("e");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("f");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("f");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("g");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("g");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("h");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("h");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("i");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("i");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("j");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("j");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("k");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("k");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("l");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("l");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("m");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("m");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("n");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("n");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("o");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("o");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("p");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("p");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("q");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("q");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("r");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("r");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("s");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("s");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("t");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("t");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("u");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("u");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("v");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("v");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("w");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("w");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("x");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("x");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("y");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("y");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("z");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("z");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
	}
}

// PostModifyContentTest.java
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
* It contains ten unit test cases for the {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
*/
class PostModifyContentTest {
		
	/**
	 * Test method for {@link PostModifyContent#isIntersectionEmpty(Set, Set)}.
	 */
	@Test
	void testIsIntersectionEmpty() {
		Set<String> a = new HashSet<String>();
		Set<String> b = new HashSet<String>();
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("b");
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("b");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("a");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("c");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("c");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("d");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("d");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("e");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("e");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("f");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("f");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("g");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("g");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("h");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("h");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("i");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("i");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("j");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("j");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("k");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("k");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("l");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("l");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("m");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("m");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("n");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("n");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("o");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("o");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("p");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("p");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("q");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("q");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("r");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("r");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("s");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("s");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("t");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("t");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("u");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("u");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("v");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("v");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("w");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("w");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("x");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("x");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("y");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("y");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		a.add("z");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
		b.add("z");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
	}
}

// PostModifyContentTest.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.source