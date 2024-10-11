// CategoryMembersFull_3Test.java
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
* It contains ten unit test cases for the {@link CategoryMembersFull#next()} method.
*/
class CategoryMembersFull_3Test {

		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests the case when the category has no members.
		 */
		@Test
		void testNext_1() {
				try {
						MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
						CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Empty");
						assertFalse(cmf.hasNext());
				} catch (ProcessException e) {
						fail(e.getLocalizedMessage());
				}
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests the case when the category has one member.
		 */
		@Test
		void testNext_2() {
				try {
						MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
						CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:One");
						assertTrue(cmf.hasNext());
						CategoryItem ci = cmf.next();
						assertEquals("One", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(1, ci.getPageid());
						assertFalse(cmf.hasNext());
				} catch (ProcessException e) {
						fail(e.getLocalizedMessage());
				}
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests the case when the category has two members.
		 */
		@Test
		void testNext_3() {
				try {
						MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
						CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Two");
						assertTrue(cmf.hasNext());
						CategoryItem ci = cmf.next();
						assertEquals("Two", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(2, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Two_2", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(3, ci.getPageid());
						assertFalse(cmf.hasNext());
				} catch (ProcessException e) {
						fail(e.getLocalizedMessage());
				}
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests the case when the category has three members.
		 */
		@Test
		void testNext_4() {
				try {
						MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
						CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Three");
						assertTrue(cmf.hasNext());
						CategoryItem ci = cmf.next();
						assertEquals("Three", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(4, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Three_2", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(5, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Three_3", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(6, ci.getPageid());
						assertFalse(cmf.hasNext());
				} catch (ProcessException e) {
						fail(e.getLocalizedMessage());
				}
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests the case when the category has four members.
		 */
		@Test
		void testNext_5() {
				try {
						MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
						CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Four");
						assertTrue(cmf.hasNext());
						CategoryItem ci = cmf.next();
						assertEquals("Four", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(7, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Four_2", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(8, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Four_3", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(9, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Four_4", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(10, ci.getPageid());
						assertFalse(cmf.hasNext());
				} catch (ProcessException e) {
						fail(e.getLocalizedMessage());
				}
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests the case when the category has five members.
		 */
		@Test
		void testNext_6() {
				try {
						MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
						CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Five");
						assertTrue(cmf.hasNext());
						CategoryItem ci = cmf.next();
						assertEquals("Five", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(11, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Five_2", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(12, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Five_3", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(13, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Five_4", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(14, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Five_5", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(15, ci.getPageid());
						assertFalse(cmf.hasNext());
				} catch (ProcessException e) {
						fail(e.getLocalizedMessage());
				}
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests the case when the category has six members.
		 */
		@Test
		void testNext_7() {
				try {
						MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
						CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Six");
						assertTrue(cmf.hasNext());
						CategoryItem ci = cmf.next();
						assertEquals("Six", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(16, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Six_2", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(17, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Six_3", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(18, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Six_4", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(19, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Six_5", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(20, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Six_6", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(21, ci.getPageid());
						assertFalse(cmf.hasNext());
				} catch (ProcessException e) {
						fail(e.getLocalizedMessage());
				}
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests the case when the category has seven members.
		 */
		@Test
		void testNext_8() {
				try {
						MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
						CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Seven");
						assertTrue(cmf.hasNext());
						CategoryItem ci = cmf.next();
						assertEquals("Seven", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(22, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Seven_2", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(23, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Seven_3", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(24, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Seven_4", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(25, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Seven_5", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(26, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Seven_6", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(27, ci.getPageid());
						assertTrue(cmf.hasNext());
						ci = cmf.next();
						assertEquals("Seven_7", ci.getTitle());
						assertEquals(0, ci.getNamespace());
						assertEquals(28, ci.getPageid());
						assertFalse(cmf.hasNext());
				} catch (ProcessException e) {
						fail(e.getLocalizedMessage());
				}
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests the case when the category has eight members.
		 */
		@Test
		void testNext_9() {
				try {
				