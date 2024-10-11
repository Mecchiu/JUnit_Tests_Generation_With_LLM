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
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests if the method returns true if there are more elements.
		 */
		@Test
		void testHasNextTrue() {
				CategoryMembersFull cmf = new CategoryMembersFull(new MediaWikiBot("http://localhost/mediawiki"), "Test");
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests if the method returns false if there are no more elements.
		 */
		@Test
		void testHasNextFalse() {
				CategoryMembersFull cmf = new CategoryMembersFull(new MediaWikiBot("http://localhost/mediawiki"), "Test");
				while(cmf.hasNext()) {
						cmf.next();
				}
				assertFalse(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests if the method returns false if there are no more elements.
		 */
		@Test
		void testHasNextFalse2() {
				CategoryMembersFull cmf = new CategoryMembersFull(new MediaWikiBot("http://localhost/mediawiki"), "Test");
				while(cmf.hasNext()) {
						cmf.next();
				}
				assertFalse(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests if the method returns false if there are no more elements.
		 */
		@Test
		void testHasNextFalse3() {
				CategoryMembersFull cmf = new CategoryMembersFull(new MediaWikiBot("http://localhost/mediawiki"), "Test");
				while(cmf.hasNext()) {
						cmf.next();
				}
				assertFalse(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests if the method returns false if there are no more elements.
		 */
		@Test
		void testHasNextFalse4() {
				CategoryMembersFull cmf = new CategoryMembersFull(new MediaWikiBot("http://localhost/mediawiki"), "Test");
				while(cmf.hasNext()) {
						cmf.next();
				}
				assertFalse(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests if the method returns false if there are no more elements.
		 */
		@Test
		void testHasNextFalse5() {
				CategoryMembersFull cmf = new CategoryMembersFull(new MediaWikiBot("http://localhost/mediawiki"), "Test");
				while(cmf.hasNext()) {
						cmf.next();
				}
				assertFalse(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests if the method returns false if there are no more elements.
		 */
		@Test
		void testHasNextFalse6() {
				CategoryMembersFull cmf = new CategoryMembersFull(new MediaWikiBot("http://localhost/mediawiki"), "Test");
				while(cmf.hasNext()) {
						cmf.next();
				}
				assertFalse(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests if the method returns false if there are no more elements.
		 */
		@Test
		void testHasNextFalse7() {
				CategoryMembersFull cmf = new CategoryMembersFull(new MediaWikiBot("http://localhost/mediawiki"), "Test");
				while(cmf.hasNext()) {
						cmf.next();
				}
				assertFalse(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests if the method returns false if there are no more elements.
		 */
		@Test
		void testHasNextFalse8() {
				CategoryMembersFull cmf = new CategoryMembersFull(new MediaWikiBot("http://localhost/mediawiki"), "Test");
				while(cmf.hasNext()) {
						cmf.next();
				}
				assertFalse(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests if the method returns false if there are no more elements.
		 */
		@Test
		void testHasNextFalse9() {
				CategoryMembersFull cmf = new CategoryMembersFull(new MediaWikiBot("http://localhost/mediawiki"), "Test");
				while(cmf.hasNext()) {
						cmf.next();
				}
				assertFalse(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * It tests if the method returns false if there are no more elements.
		 */
		@Test
		void testHasNextFalse10() {
				CategoryMembersFull cmf = new CategoryMembersFull(new MediaWikiBot("http://localhost/mediawiki"), "Test");
				while(cmf.hasNext()) {
						cmf.next();
				}
				assertFalse(cmf.hasNext());
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
