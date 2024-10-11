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
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator2() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5);
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator3() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5, CategoryMembers.CM_SUBCATS);
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator4() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5, CategoryMembers.CM_PAGES);
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator5() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5, CategoryMembers.CM_FILES);
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator6() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5, CategoryMembers.CM_PAGES | CategoryMembers.CM_SUBCATS);
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator7() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5, CategoryMembers.CM_PAGES | CategoryMembers.CM_FILES);
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator8() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5, CategoryMembers.CM_SUBCATS | CategoryMembers.CM_FILES);
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator9() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5, CategoryMembers.CM_PAGES | CategoryMembers.CM_SUBCATS | CategoryMembers.CM_FILES);
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator10() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5, CategoryMembers.CM_PAGES | CategoryMembers.CM_SUBCATS | CategoryMembers.CM_FILES, "Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
}

// CategoryMembersTest.java
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

/**
 * A specialization of {@link CategoryMembers} with contains
 * {@link CategoryItem}s.
 *
 * @author Thomas Stock
 */
@Slf4j
@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
public class CategoryMembersFull extends CategoryMembers implements Iterable<CategoryItem>, Iterator<CategoryItem> {

    /**
     * {@inheritDoc}
     */
    public Iterator<CategoryItem> iterator();
}

// CategoryMembersTest.java
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
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator2() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5);
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator3() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5, CategoryMembers.CM_SUBCATS);
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator4() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5, CategoryMembers.CM_PAGES);
				Iterator<CategoryItem> it = cmf.iterator();
				int count = 0;
				while (it.hasNext()) {
						it.next();
						count++;
				}
				assertEquals(5, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()} method.
		 * It tests if the method returns an iterator with the correct number of elements.
		 */
		@Test
		void testIterator5() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 5, CategoryMembers.CM_FILES);
	