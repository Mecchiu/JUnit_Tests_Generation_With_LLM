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
* It contains ten unit test cases for the {@link CategoryMembersFull#next()} method.
*/
class CategoryMembersFullTest {

		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext2() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext3() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext4() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext5() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext6() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext7() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext8() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext9() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext10() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				int count = 0;
				while (cmf.hasNext()) {
						cmf.next();
						count++;
				}
				assertEquals(10, count);
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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CategoryMembers}.
* It contains ten unit test cases for the {@link CategoryMembers#next()} method.
*/
class CategoryMembersTest {
		
		/**
		 * Test case for {@link CategoryMembers#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembers cm = new CategoryMembers(bot, "Category:Test");
				int count = 0;
				while (cm.hasNext()) {
						cm.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembers#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext2() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembers cm = new CategoryMembers(bot, "Category:Test");
				int count = 0;
				while (cm.hasNext()) {
						cm.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembers#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext3() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembers cm = new CategoryMembers(bot, "Category:Test");
				int count = 0;
				while (cm.hasNext()) {
						cm.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembers#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext4() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembers cm = new CategoryMembers(bot, "Category:Test");
				int count = 0;
				while (cm.hasNext()) {
						cm.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembers#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext5() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembers cm = new CategoryMembers(bot, "Category:Test");
				int count = 0;
				while (cm.hasNext()) {
						cm.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembers#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext6() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembers cm = new CategoryMembers(bot, "Category:Test");
				int count = 0;
				while (cm.hasNext()) {
						cm.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembers#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext7() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembers cm = new CategoryMembers(bot, "Category:Test");
				int count = 0;
				while (cm.hasNext()) {
						cm.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembers#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext8() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembers cm = new CategoryMembers(bot, "Category:Test");
				int count = 0;
				while (cm.hasNext()) {
						cm.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembers#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext9() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembers cm = new CategoryMembers(bot, "Category:Test");
				int count = 0;
				while (cm.hasNext()) {
						cm.next();
						count++;
				}
				assertEquals(10, count);
		}
		
		/**
		 * Test case for {@link CategoryMembers#next()} method.
		 * It tests if the method returns the correct number of category members.
		 */
		@Test
		void testNext10() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				CategoryMembers cm = new CategoryMembers(bot, "Category:Test");
				int count = 0;
				while (cm.hasNext()) {
						cm.next();
						count++;
				}
				assertEquals(10, count);
		}
}

// CategoryTree.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_