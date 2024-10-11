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
		 * This test case tests the {@link CategoryMembersFull#hasNext()} method for the case that the next element exists.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasNextTrue() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the {@link CategoryMembersFull#hasNext()} method for the case that the next element does not exist.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasNextFalse() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				while(cmf.hasNext()) {
						cmf.next();
				}
				assertFalse(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the {@link CategoryMembersFull#hasNext()} method for the case that the next element exists.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasNextTrue2() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				cmf.next();
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the {@link CategoryMembersFull#hasNext()} method for the case that the next element exists.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasNextTrue3() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				cmf.next();
				cmf.next();
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the {@link CategoryMembersFull#hasNext()} method for the case that the next element exists.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasNextTrue4() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				cmf.next();
				cmf.next();
				cmf.next();
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the {@link CategoryMembersFull#hasNext()} method for the case that the next element exists.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasNextTrue5() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the {@link CategoryMembersFull#hasNext()} method for the case that the next element exists.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasNextTrue6() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the {@link CategoryMembersFull#hasNext()} method for the case that the next element exists.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasNextTrue7() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the {@link CategoryMembersFull#hasNext()} method for the case that the next element exists.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasNextTrue8() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the {@link CategoryMembersFull#hasNext()} method for the case that the next element exists.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasNextTrue9() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the {@link CategoryMembersFull#hasNext()} method for the case that the next element exists.
		 * @throws ActionException 
		 * @throws ProcessException 
		 */
		@Test
		void testHasNextTrue10() throws ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				cmf.next();
				assertTrue(cmf.hasNext());
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
    public boolean hasNext();
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
    public boolean hasNext();
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
    public boolean hasNext();
}

// CategoryMembersTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions