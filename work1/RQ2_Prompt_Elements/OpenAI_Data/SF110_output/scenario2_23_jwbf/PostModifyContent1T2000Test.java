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
	 * Test case for the case when both sets are null.
	 */
	@Test
	void testIsIntersectionEmpty_BothSetsNull() {
		Set<String> a = null;
		Set<String> b = null;
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Test case for the case when first set is null.
	 */
	@Test
	void testIsIntersectionEmpty_FirstSetNull() {
		Set<String> a = null;
		Set<String> b = new HashSet<String>();
		b.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Test case for the case when second set is null.
	 */
	@Test
	void testIsIntersectionEmpty_SecondSetNull() {
		Set<String> a = new HashSet<String>();
		a.add("a");
		Set<String> b = null;
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Test case for the case when both sets are empty.
	 */
	@Test
	void testIsIntersectionEmpty_BothSetsEmpty() {
		Set<String> a = new HashSet<String>();
		Set<String> b = new HashSet<String>();
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Test case for the case when first set is empty.
	 */
	@Test
	void testIsIntersectionEmpty_FirstSetEmpty() {
		Set<String> a = new HashSet<String>();
		Set<String> b = new HashSet<String>();
		b.add("a");
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Test case for the case when second set is empty.
	 */
	@Test
	void testIsIntersectionEmpty_SecondSetEmpty() {
		Set<String> a = new HashSet<String>();
		a.add("a");
		Set<String> b = new HashSet<String>();
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Test case for the case when both sets are not empty and have no common elements.
	 */
	@Test
	void testIsIntersectionEmpty_BothSetsNotEmptyNoCommonElements() {
		Set<String> a = new HashSet<String>();
		a.add("a");
		Set<String> b = new HashSet<String>();
		b.add("b");
		assertTrue(PostModifyContent.isIntersectionEmpty(a, b));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Test case for the case when both sets are not empty and have one common element.
	 */
	@Test
	void testIsIntersectionEmpty_BothSetsNotEmptyOneCommonElement() {
		Set<String> a = new HashSet<String>();
		a.add("a");
		Set<String> b = new HashSet<String>();
		b.add("a");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Test case for the case when both sets are not empty and have more than one common element.
	 */
	@Test
	void testIsIntersectionEmpty_BothSetsNotEmptyMoreThanOneCommonElement() {
		Set<String> a = new HashSet<String>();
		a.add("a");
		a.add("b");
		Set<String> b = new HashSet<String>();
		b.add("a");
		b.add("b");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
	}
	
	/**
	 * Test case for {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
	 * Test case for the case when both sets are not empty and have more than one common element.
	 */
	@Test
	void testIsIntersectionEmpty_BothSetsNotEmptyMoreThanOneCommonElement2() {
		Set<String> a = new HashSet<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		Set<String> b = new HashSet<String>();
		b.add("a");
		b.add("b");
		b.add("c");
		assertFalse(PostModifyContent.isIntersectionEmpty(a, b));
	}
}