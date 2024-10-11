// CategoryMembersFull_2Test.java
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
class CategoryMembersFull_2Test {

		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the next() method returns the correct CategoryItem.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testNext() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
				CategoryItem ci = cmf.next();
				assertEquals("Test", ci.getTitle());
				assertEquals(0, ci.getPageId());
				assertEquals(0, ci.getNamespace());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the next() method returns the correct CategoryItem.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testNext2() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
				CategoryItem ci = cmf.next();
				ci = cmf.next();
				assertEquals("Test2", ci.getTitle());
				assertEquals(1, ci.getPageId());
				assertEquals(0, ci.getNamespace());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the next() method returns the correct CategoryItem.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testNext3() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
				CategoryItem ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				assertEquals("Test3", ci.getTitle());
				assertEquals(2, ci.getPageId());
				assertEquals(0, ci.getNamespace());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the next() method returns the correct CategoryItem.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testNext4() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
				CategoryItem ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				assertEquals("Test4", ci.getTitle());
				assertEquals(3, ci.getPageId());
				assertEquals(0, ci.getNamespace());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the next() method returns the correct CategoryItem.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testNext5() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
				CategoryItem ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				assertEquals("Test5", ci.getTitle());
				assertEquals(4, ci.getPageId());
				assertEquals(0, ci.getNamespace());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the next() method returns the correct CategoryItem.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testNext6() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
				CategoryItem ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				assertEquals("Test6", ci.getTitle());
				assertEquals(5, ci.getPageId());
				assertEquals(0, ci.getNamespace());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the next() method returns the correct CategoryItem.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testNext7() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
				CategoryItem ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				assertEquals("Test7", ci.getTitle());
				assertEquals(6, ci.getPageId());
				assertEquals(0, ci.getNamespace());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the next() method returns the correct CategoryItem.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testNext8() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test", 0);
				CategoryItem ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				ci = cmf.next();
				assertEquals("Test8", ci.getTitle());
				assertEquals(7, ci.getPageId());
				assertEquals(0, ci.getNamespace());
		}
		
	