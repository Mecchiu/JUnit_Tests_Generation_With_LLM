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
* It contains one unit test case for the {@link CategoryMembersFull#next()} method.
*/
class CategoryMembersFull_2Test {
		
    /**
     * Creates a new instance of {@link CategoryMembersFull}.
     * It initializes the instance with the parameters specified in the constructor.
     */
	@Test
    public void testConstructor() {
		// Test: The parameters are set.
		assertNotNull(new CategoryMembersFull());
		
		// Test: The constructor's parameters are set.
		assertEquals(new MediaWikiBot(), MediaWikiBot.DEFAULT);
		
		// Test: The constructor's parameters are not overridden.
		CategoryMembersFull mc = new CategoryMembersFull();
		//assertEquals(mc, null);
		assertEquals(mc, new MediaWikiBot());
	}

	/**
	 * Initializes the {@link CategoryMember} with
	 * a {@link MediaWikiBot} and a {@link MediaWikiBot}.
	 */
	@Test
    public void test_defaultInitialization() {
		CategoryMember mc = new MediaWikiBot();
		assertNotNull(mc);
		assertEquals(mc, MediaWikiBot.DEFAULT);
	}
	
	/**
	 * Creates an instance of CategoryMembersFull filled with
	 * the elements, which must correspond to the elements in CategoryItem.
	 * A {@link Collection} with members represents the list of instances
	 * as members of the category.
	 */
	@Test
    public void testCollectionCreation() {
		Collection c = new ArrayList<CategoryItem>();
		assertNotNull(c);
		
		for (int i=0;i<10;i++) {
			c.add(new CategoryItem());
		}
		assertTrue(c.containsAll(new ArrayList<CategoryItem>()));
	}

	/**
	 * Returns an iterator for the members of CategoryItems.
	 */
	@Test
    public void testIteratorCreation() {
		Collection c = new ArrayList<CategoryItem>();
		for (int i=0;i<10;i++) {
			c.add(new CategoryItem());
		}
		@SuppressWarnings("unchecked")
		Iterator<CategoryItem> it = c.iterator();
		assertTrue(c.containsAll(new ArrayList<CategoryItem>()));
		assertTrue(it.hasNext());
		assertNotNull(it.next());
	}
	
	/**
	 * The parameters of the {@link CategoryMember} are not null.
	 */
	@Test(expected=ActionException.class)
	public void testNestedValidation() throws ActionException {
		// Fails on the parameter of a {@link MediaWikiBot} and {@link Collection} instance.
		new MediaWikiBot();
	}
	
	/**
	 * Does nothing if we set an empty parameters.
	 */
	@Test
    public void testInitEmptyParameters() {
		Collection c = new ArrayList<CategoryItem>();
		new MediaWikiBot(null);
		assertEquals(c, MediaWikiBot.DEFAULT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

	/**
	 * Represents a generic error handling mechanism in case of failed execution.
	 */
	static class ActionException extends ProcessException {
		public ActionException(String message) {
			super(new ActionException("Unknown error."), message);
		}
	}
}