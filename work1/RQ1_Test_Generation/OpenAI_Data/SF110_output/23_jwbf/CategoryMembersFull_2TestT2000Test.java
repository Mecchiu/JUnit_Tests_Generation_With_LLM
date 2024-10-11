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
* It contains ten unit test cases for the {@link CategoryMembersFull#hasNext()} method.
*/
class CategoryMembersFull_2Test {

		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests the case when the category has more than 500 members.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testHasNext_1() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://en.wikipedia.org/w/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Physics", 0);
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertTrue(count &gt; 500);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests the case when the category has less than 500 members.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testHasNext_2() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://en.wikipedia.org/w/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Physics", 0);
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertTrue(count &lt; 500);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests the case when the category has more than 500 members.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testHasNext_3() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://en.wikipedia.org/w/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Physics", 0);
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertTrue(count &gt; 500);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests the case when the category has less than 500 members.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testHasNext_4() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://en.wikipedia.org/w/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Physics", 0);
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertTrue(count &lt; 500);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests the case when the category has more than 500 members.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testHasNext_5() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://en.wikipedia.org/w/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Physics", 0);
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertTrue(count &gt; 500);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests the case when the category has less than 500 members.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testHasNext_6() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://en.wikipedia.org/w/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Physics", 0);
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertTrue(count &lt; 500);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests the case when the category has more than 500 members.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testHasNext_7() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://en.wikipedia.org/w/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Physics", 0);
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertTrue(count &gt; 500);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests the case when the category has less than 500 members.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testHasNext_8() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://en.wikipedia.org/w/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Physics", 0);
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertTrue(count &lt; 500);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests the case when the category has more than 500 members.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testHasNext_9() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://en.wikipedia.org/w/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Physics", 0);
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertTrue(count &gt; 500);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests the case when the category has less than 500 members.
		 * @throws ActionException
		 * @throws ProcessException
		 */
		@Test
		void testHasNext_10() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://en.wikipedia.org/w/");
				CategoryMembersFull