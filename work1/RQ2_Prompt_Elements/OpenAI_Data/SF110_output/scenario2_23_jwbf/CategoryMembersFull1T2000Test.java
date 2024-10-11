// CategoryMembersFullTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.CategoryItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CategoryMembersFull}.
* It contains ten unit test cases for the {@link CategoryMembersFull#hasNext()} method.
*/
class CategoryMembersFullTest {

	/**
	 * Test method for {@link CategoryMembersFull#hasNext()}.
	 * This test case tests the {@link CategoryMembersFull#hasNext()} method with a category that contains
	 * one page.
	 */
	@Test
	void testHasNextOnePage() {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
		assertTrue(cmf.hasNext());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#hasNext()}.
	 * This test case tests the {@link CategoryMembersFull#hasNext()} method with a category that contains
	 * two pages.
	 */
	@Test
	void testHasNextTwoPages() {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#hasNext()}.
	 * This test case tests the {@link CategoryMembersFull#hasNext()} method with a category that contains
	 * three pages.
	 */
	@Test
	void testHasNextThreePages() {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#hasNext()}.
	 * This test case tests the {@link CategoryMembersFull#hasNext()} method with a category that contains
	 * four pages.
	 */
	@Test
	void testHasNextFourPages() {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#hasNext()}.
	 * This test case tests the {@link CategoryMembersFull#hasNext()} method with a category that contains
	 * five pages.
	 */
	@Test
	void testHasNextFivePages() {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#hasNext()}.
	 * This test case tests the {@link CategoryMembersFull#hasNext()} method with a category that contains
	 * six pages.
	 */
	@Test
	void testHasNextSixPages() {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#hasNext()}.
	 * This test case tests the {@link CategoryMembersFull#hasNext()} method with a category that contains
	 * seven pages.
	 */
	@Test
	void testHasNextSevenPages() {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#hasNext()}.
	 * This test case tests the {@link CategoryMembersFull#hasNext()} method with a category that contains
	 * eight pages.
	 */
	@Test
	void testHasNextEightPages() {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#hasNext()}.
	 * This test case tests the {@link CategoryMembersFull#hasNext()} method with a category that contains
	 * nine pages.
	 */
	@Test
	void testHasNextNinePages() {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
		cmf.next();
		assertTrue(cmf.hasNext());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#hasNext()}.
	 * This test case tests the {@link CategoryMembersFull#hasNext()} method with a category that contains
	 * ten pages.
	 */
	@Test
	void testHasNextTenPages() {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
		assertTrue(cmf.hasNext());
		cmf