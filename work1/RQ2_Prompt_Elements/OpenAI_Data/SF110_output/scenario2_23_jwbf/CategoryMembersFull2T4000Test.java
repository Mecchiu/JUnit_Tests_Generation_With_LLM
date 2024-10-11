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
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext2() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext3() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assertEquals("Test3", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext4() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assertEquals("Test3", cmf.next().getTitle());
		assertEquals("Test4", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext5() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assertEquals("Test3", cmf.next().getTitle());
		assertEquals("Test4", cmf.next().getTitle());
		assertEquals("Test5", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext6() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assertEquals("Test3", cmf.next().getTitle());
		assertEquals("Test4", cmf.next().getTitle());
		assertEquals("Test5", cmf.next().getTitle());
		assertEquals("Test6", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext7() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assertEquals("Test3", cmf.next().getTitle());
		assertEquals("Test4", cmf.next().getTitle());
		assertEquals("Test5", cmf.next().getTitle());
		assertEquals("Test6", cmf.next().getTitle());
		assertEquals("Test7", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext8() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assertEquals("Test3", cmf.next().getTitle());
		assertEquals("Test4", cmf.next().getTitle());
		assertEquals("Test5", cmf.next().getTitle());
		assertEquals("Test6", cmf.next().getTitle());
		assertEquals("Test7", cmf.next().getTitle());
		assertEquals("Test8", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext9() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assertEquals("Test3", cmf.next().getTitle());
		assertEquals("Test4", cmf.next().getTitle());
		assertEquals("Test5", cmf.next().getTitle());
		assertEquals("Test6", cmf.next().getTitle());
		assertEquals("Test7", cmf.next().getTitle());
		assertEquals("Test8", cmf.next().getTitle());
		assertEquals("Test9", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext10() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assertEquals("Test3", cmf.next().getTitle());
		assertEquals("Test4", cmf.next().getTitle());
		assertEquals("Test5", cmf.next().getTitle());
		assertEquals("Test6", cmf.next().getTitle());
		assertEquals("Test7", cmf.next().getTitle());
		assertEquals("Test8", cmf.next().getTitle());
		assertEquals("Test9", cmf.next().getTitle());
		assertEquals("Test10", cmf.next().getTitle());
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
    public CategoryItem next() {
        prepareCollection();
        return titleIterator.next();
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
* Test class of {@link CategoryMembersFull}.
* It contains ten unit test cases for the {@link CategoryMembersFull#next()} method.
*/
class CategoryMembersFullTest {
		
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext2() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext3() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assertEquals("Test3", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext4() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assertEquals("Test3", cmf.next().getTitle());
		assertEquals("Test4", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext5() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assertEquals("Test3", cmf.next().getTitle());
		assertEquals("Test4", cmf.next().getTitle());
		assertEquals("Test5", cmf.next().getTitle());
	}
	
	/**
	 * Test method for {@link CategoryMembersFull#next()}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testNext6() throws ProcessException, ActionException {
		MediaWikiBot bot = new MediaWikiBot("http://localhost/w/index.php");
		CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:Test");
		assertEquals("Test", cmf.next().getTitle());
		assertEquals("Test2", cmf.next().getTitle());
		assert