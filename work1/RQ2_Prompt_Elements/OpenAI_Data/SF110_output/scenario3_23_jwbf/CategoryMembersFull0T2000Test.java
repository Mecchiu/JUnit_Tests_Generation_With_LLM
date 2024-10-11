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
* It contains ten unit test cases for the {@link CategoryMembersFull#iterator()} method.
*/
class CategoryMembersFullTest {

		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an empty collection if the category is empty.
		 */
		@Test
		void testEmptyCategory() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "EmptyCategory");
				Collection<CategoryItem> ci = new ArrayList<CategoryItem>();
				Iterator<CategoryItem> it = cmf.iterator();
				while (it.hasNext()) {
						ci.add(it.next());
				}
				assertEquals(0, ci.size());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns a collection with one element if the category contains one element.
		 */
		@Test
		void testOneElementCategory() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "OneElementCategory");
				Collection<CategoryItem> ci = new ArrayList<CategoryItem>();
				Iterator<CategoryItem> it = cmf.iterator();
				while (it.hasNext()) {
						ci.add(it.next());
				}
				assertEquals(1, ci.size());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns a collection with two elements if the category contains two elements.
		 */
		@Test
		void testTwoElementsCategory() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "TwoElementsCategory");
				Collection<CategoryItem> ci = new ArrayList<CategoryItem>();
				Iterator<CategoryItem> it = cmf.iterator();
				while (it.hasNext()) {
						ci.add(it.next());
				}
				assertEquals(2, ci.size());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns a collection with three elements if the category contains three elements.
		 */
		@Test
		void testThreeElementsCategory() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "ThreeElementsCategory");
				Collection<CategoryItem> ci = new ArrayList<CategoryItem>();
				Iterator<CategoryItem> it = cmf.iterator();
				while (it.hasNext()) {
						ci.add(it.next());
				}
				assertEquals(3, ci.size());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns a collection with four elements if the category contains four elements.
		 */
		@Test
		void testFourElementsCategory() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "FourElementsCategory");
				Collection<CategoryItem> ci = new ArrayList<CategoryItem>();
				Iterator<CategoryItem> it = cmf.iterator();
				while (it.hasNext()) {
						ci.add(it.next());
				}
				assertEquals(4, ci.size());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns a collection with five elements if the category contains five elements.
		 */
		@Test
		void testFiveElementsCategory() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "FiveElementsCategory");
				Collection<CategoryItem> ci = new ArrayList<CategoryItem>();
				Iterator<CategoryItem> it = cmf.iterator();
				while (it.hasNext()) {
						ci.add(it.next());
				}
				assertEquals(5, ci.size());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns a collection with six elements if the category contains six elements.
		 */
		@Test
		void testSixElementsCategory() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "SixElementsCategory");
				Collection<CategoryItem> ci = new ArrayList<CategoryItem>();
				Iterator<CategoryItem> it = cmf.iterator();
				while (it.hasNext()) {
						ci.add(it.next());
				}
				assertEquals(6, ci.size());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns a collection with seven elements if the category contains seven elements.
		 */
		@Test
		void testSevenElementsCategory() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "SevenElementsCategory");
				Collection<CategoryItem> ci = new ArrayList<CategoryItem>();
				Iterator<CategoryItem> it = cmf.iterator();
				while (it.hasNext()) {
						ci.add(it.next());
				}
				assertEquals(7, ci.size());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns a collection with eight elements if the category contains eight elements.
		 */
		@Test
		void testEightElementsCategory() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "EightElementsCategory");
				Collection<CategoryItem> ci = new ArrayList<CategoryItem>();
				Iterator<CategoryItem> it = cmf.iterator();
				while (it.hasNext()) {
						ci.add(it.next());
				}
				assertEquals(8, ci.size());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns a collection with nine elements if the category contains nine elements.
		 */
		@Test
		void testNineElementsCategory() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "NineElementsCategory");
				Collection<CategoryItem> ci = new ArrayList<CategoryItem>();
				Iterator<CategoryItem> it = cm