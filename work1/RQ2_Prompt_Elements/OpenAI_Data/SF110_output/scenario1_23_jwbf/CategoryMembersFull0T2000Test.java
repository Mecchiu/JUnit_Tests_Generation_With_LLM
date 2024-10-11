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
		 * It tests if the method returns an iterator.
		 */
		@Test
		void testIterator() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				assertNotNull(it);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator2() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(count, cmf.getNumberOfElements());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator3() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(count, cmf.getNumberOfElements());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator4() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(count, cmf.getNumberOfElements());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator5() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(count, cmf.getNumberOfElements());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator6() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(count, cmf.getNumberOfElements());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator7() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(count, cmf.getNumberOfElements());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator8() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(count, cmf.getNumberOfElements());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator9() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(count, cmf.getNumberOfElements());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator10() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(count, cmf.getNumberOfElements());
		}
}

// CategoryMembersTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
