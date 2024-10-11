// CategoryMembersFull_0Test.java
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
class CategoryMembersFull_0Test {

		/**
		 * Test case for {@link CategoryMembersFull#iterator()}
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator() throws ActionException, ProcessException {
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
			CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
			Iterator<CategoryItem> it = cmf.iterator();
			assertNotNull(it);
			assertTrue(it.hasNext());
			assertNotNull(it.next());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()}
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator2() throws ActionException, ProcessException {
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
			CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
			Iterator<CategoryItem> it = cmf.iterator();
			assertNotNull(it);
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()}
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator3() throws ActionException, ProcessException {
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
			CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
			Iterator<CategoryItem> it = cmf.iterator();
			assertNotNull(it);
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()}
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator4() throws ActionException, ProcessException {
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
			CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
			Iterator<CategoryItem> it = cmf.iterator();
			assertNotNull(it);
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()}
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator5() throws ActionException, ProcessException {
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
			CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
			Iterator<CategoryItem> it = cmf.iterator();
			assertNotNull(it);
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()}
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator6() throws ActionException, ProcessException {
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
			CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
			Iterator<CategoryItem> it = cmf.iterator();
			assertNotNull(it);
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()}
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator7() throws ActionException, ProcessException {
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
			CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
			Iterator<CategoryItem> it = cmf.iterator();
			assertNotNull(it);
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#iterator()}
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator8() throws ActionException, ProcessException {
			MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
			CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
			Iterator<CategoryItem> it = cmf.iterator();
			assertNotNull(it);
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			assertNotNull(it.next());
			assertTrue(it.hasNext());
			