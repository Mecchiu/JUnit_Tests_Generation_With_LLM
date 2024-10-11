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
* It contains one unit test case for the {@link CategoryMembersFull#iterator()} method.
*/
class CategoryMembersFull_0Test {

	/**
	 * Constructor.
	*/
	public CategoryMembersFull_0Test() {
		super();
	}

	/**
	 * Test method for
	{@link net.sourceforge.jwbf.core.actions.MediaWiki#iterator()}
	with a null-argument.
	*/
	@Test(expected = NullPointerException.class)
	public void testIteratorWithNullArgument() {
		CategoryMembersFull instance = new CategoryMembersFull();
		instance.iterator().next();
	}

	/**
	 * Test method for
	* {@link net.sourceforge.jwbf.core.actions.MediaWiki#iterator()}
	* with a collection of nulls.
	*/
	@Test(expected = ActionException.class)
	public void testIteratorWithCollectionOfNulls() {
		CategoryMembersFull instance = new CategoryMembersFull();
		Collection<CategoryItem> c = new ArrayList<CategoryItem>();
	      instance.iterator().next(c);
	      instance.iterator().next(c);
	}


	@Test
	public void testGetIterator() {
		CategoryRep repo = CategoryRepFactory.createCategory();
		try {
			// Test method: set().
			boolean flag = false;
			Iterator<CategoryItem> res = new MediaWikiBot().getIterator(new CategoryRepImpl(repo), new MediaWikiBot.PropertyList());
			assertTrue(res.hasNext());
			CategoryItem item = null;
			do {
				item = res.next();
			} while(res.hasNext() &&!flag);
			res.close();
			flag = true;
			res = CategoryRepFactory.createCategory().iterator();
			res.forEachRemaining(resr -> {
      String itemName = "" + resr._id;
			assertNotEquals(itemName, "");
				if (resr.getName().toLowerCase().startsWith("category")) {
					assertNotNull("Categories must be found!", resr);
					assertNotNull(resr.getName());
				}
			});
		} catch (ActionException ex) {
			ex.printStackTrace();
		}
	}
	
	
 

	@Test
	@Slf4j
	public void testGetIteratorWithException() {
		CategoryRep repo = CategoryRepFactory.createCategory();
		try {
			Iterator<CategoryItem> res = new MediaWikiBot().getIterator(new CategoryRepImpl(repo), new MediaWikiBot.PropertyList());
			res.forEachRemaining( resr -> {
      String itemName = "" + resr._id;
			assertNotEquals(itemName, "");
				if (resr.getName().toLowerCase().startsWith("category")) {
					assertNotNull("Categories must be found!", resr);
					assertNotNull(resr.getName());
				}
			});
		} catch (ActionException ex) {
			ex.printStackTrace();
		}
	}

	
}
