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
		cmf.next();
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
		cmf.next();
		assertEquals("Test", cmf.next().getTitle());
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
		cmf.next();
		assertEquals("Test", cmf.next().getTitle());
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
		cmf.next();
		assertEquals("Test", cmf.next().getTitle());
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
		cmf.next();
		assertEquals("Test", cmf.next().getTitle());
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
		cmf.next();
		assertEquals("Test", cmf.next().getTitle());
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
		cmf.next();
		assertEquals("Test", cmf.next().getTitle());
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
		cmf.next();
		assertEquals("Test", cmf.next().getTitle());
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
		cmf.next();
		assertEquals("Test", cmf.next().getTitle());
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
		cmf.next();
		assertEquals("Test", cmf.next().getTitle());
	}
}