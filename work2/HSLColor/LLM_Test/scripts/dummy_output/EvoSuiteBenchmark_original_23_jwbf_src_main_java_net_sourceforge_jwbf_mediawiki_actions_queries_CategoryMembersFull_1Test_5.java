// CategoryMembersFull_1Test.java
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
* It contains one unit test case for the {@link CategoryMembersFull#hasNext()} method.
*/
class CategoryMembersFull_1Test {
		
	/**
	 * Test case for {@link CategoryMembersFull#hasNext()}.
	 * @throws JwbfException
	*/
	@Test
	public void testHasNext_1() throws JwbfException {
		final MediaWikiBot me = new MediaWikiBot(new MediaWikiBotInit());
		for (SupportedBy i : supportedBots()) {
			me.add(new CategoryMember(i));
		}

		// prepare a user with access
		me.add(new CategoryMember(supportedBy[0]));

		// wait for hasNext
        try {
            assertTrue(hasNext(me));
        } catch (ActionException e) {
            fail("an ActionException should not have been thrown by this method");
        }
		
		// wait for first category
        try {
            assertTrue(me.get(supportedBy[0]) instanceof Collection);
        } catch (ActionException e)
        {
        }
		
		// wait until there is no more category
        try
        {
            assertFalse(me.get(supportedBy[0]) instanceof Collection);
        } catch (ActionException e)
        {
        }

		// test that the first entry of the user's category is not yet included
		Collection<CategoryItem> cats = me.get(supportedBy[0]);
		assertFalse(cats.iterator().next().isLeafCollection(supportedBy[0])); // ensure we don't include any leaves

		// test that the next entry of the user's category is the first entry of the collection
		cats = me.get(supportedBy[0]);
		assertTrue(cats.iterator().next().isLeafCollection(supportedBy[0]));
	}

		/**
	 * Generate all supportedBots.
	 * @return
	 */
	private Collection<SupportedBy> supportedBots() {
		Collection<SupportedBy> result = new ArrayList<>();
		// add support for this category
		result.add(supportedBy[0]);
		for (int v : versionRange(0,3)) {
			result.add(new SupportedBy(v));
		}
		return result;
	}

		/**
	 * Generate each supportedBots.
	 * @return
	 */
	private Collection<SupportedBy> versionRange(int start, int end) {
		Collection<SupportedBy> result = new ArrayList<>();
		// add support for this category
		for (int v : versionRange(start, end)) {
			result.add(new SupportedBy(v));
		}
		return result;
	}

	/**
	 * Test case for the {@link CategoryMember#process()} method.
	 * @throws JwbfException
	 */
	@Test
	public void testProcess() throws ActionException, ProcessException,
			JwbfException {
		assertNotNull(get(supportedBy[0]));
		// test that one is complete without error
		process();
		assertNotNull(get(supportedBy[0]));

		// add a new category
		CategoryItem category = new CategoryItem(0);
		category.setId(1);
		category.setName("mw1");
		category.setDescription("Description 1");

		assertNotNull(me.get(supportedBy[0]));
		Collection<CategoryItem> cats = me.get(supportedBy[0]);
		assertNotNull(cats);
		
		cats.add(category);

		assertNotNull(me.get(supportedBy[0]));
		cats.add(category);
		
		// test that all categories are complete without error
		process();
		// test that a missing category has a null collection
		process();

   }
}