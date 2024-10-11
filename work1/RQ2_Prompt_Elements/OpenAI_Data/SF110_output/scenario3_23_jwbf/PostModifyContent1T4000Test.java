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
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are <code>null</code>.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsNull() {
		assertTrue(PostModifyContent.isIntersectionEmpty(null, null));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * First set is <code>null</code>.
	 */
	@Test
	void testIsIntersectionEmpty_firstSetNull() {
		Set<String> set = new HashSet<String>();
		set.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(null, set));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Second set is <code>null</code>.
	 */
	@Test
	void testIsIntersectionEmpty_secondSetNull() {
		Set<String> set = new HashSet<String>();
		set.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(set, null));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are empty.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsEmpty() {
		Set<String> set = new HashSet<String>();
		assertTrue(PostModifyContent.isIntersectionEmpty(set, set));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * First set is empty.
	 */
	@Test
	void testIsIntersectionEmpty_firstSetEmpty() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set2.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(set1, set2));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Second set is empty.
	 */
	@Test
	void testIsIntersectionEmpty_secondSetEmpty() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(set1, set2));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are not empty and have no common elements.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsNotEmptyNoCommonElements() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1.add("a");
		set2.add("b");
		assertTrue(PostModifyContent.isIntersectionEmpty(set1, set2));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are not empty and have one common element.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsNotEmptyOneCommonElement() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1.add("a");
		set2.add("a");
		assertFalse(PostModifyContent.isIntersectionEmpty(set1, set2));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are not empty and have more than one common element.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsNotEmptyMoreThanOneCommonElement() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1.add("a");
		set1.add("b");
		set2.add("a");
		set2.add("b");
		assertFalse(PostModifyContent.isIntersectionEmpty(set1, set2));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are not empty and have more than one common element.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsNotEmptyMoreThanOneCommonElement2() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1.add("a");
		set1.add("b");
		set2.add("b");
		set2.add("c");
		assertFalse(PostModifyContent.isIntersectionEmpty(set1, set2));
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
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are <code>null</code>.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsNull() {
		assertTrue(PostModifyContent.isIntersectionEmpty(null, null));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * First set is <code>null</code>.
	 */
	@Test
	void testIsIntersectionEmpty_firstSetNull() {
		Set<String> set = new HashSet<String>();
		set.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(null, set));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Second set is <code>null</code>.
	 */
	@Test
	void testIsIntersectionEmpty_secondSetNull() {
		Set<String> set = new HashSet<String>();
		set.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(set, null));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are empty.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsEmpty() {
		Set<String> set = new HashSet<String>();
		assertTrue(PostModifyContent.isIntersectionEmpty(set, set));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * First set is empty.
	 */
	@Test
	void testIsIntersectionEmpty_firstSetEmpty() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set2.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(set1, set2));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Second set is empty.
	 */
	@Test
	void testIsIntersectionEmpty_secondSetEmpty() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(set1, set2));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are not empty and have no common elements.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsNotEmptyNoCommonElements() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1.add("a");
		set2.add("b");
		assertTrue(PostModifyContent.isIntersectionEmpty(set1, set2));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are not empty and have one common element.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsNotEmptyOneCommonElement() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1.add("a");
		set2.add("a");
		assertFalse(PostModifyContent.isIntersectionEmpty(set1, set2));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are not empty and have more than one common element.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsNotEmptyMoreThanOneCommonElement() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1.add("a");
		set1.add("b");
		set2.add("a");
		set2.add("b");
		assertFalse(PostModifyContent.isIntersectionEmpty(set1, set2));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are not empty and have more than one common element.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsNotEmptyMoreThanOneCommonElement2() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1.add("a");
		set1.add("b");
		set2.add("b");
		set2.add("c");
		assertFalse(PostModifyContent.isIntersectionEmpty(set1, set2));
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
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Both sets are <code>null</code>.
	 */
	@Test
	void testIsIntersectionEmpty_bothSetsNull() {
		assertTrue(PostModifyContent.isIntersectionEmpty(null, null));
	}
	
	/**
	 *