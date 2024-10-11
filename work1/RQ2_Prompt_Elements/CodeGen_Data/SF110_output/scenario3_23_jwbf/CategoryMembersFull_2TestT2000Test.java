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
	 * {@inheritDoc}
	 */
	public CategoryItem next();
	
	/**
	 * {@inheritDoc}
	 */
	public MediaWikiBot createBot() {
		@SuppressWarnings("unused")
		MediaWikiBot bot = MediaWikiBot.parse(this);
		return null;
	}
	
	/**
	 * Tests reading of {@link CategoryMembersFull} results.
	 */
	@Test
	public void read_test() {
		final CategoryMembersFull category = new CategoryMembersFull_7();
		assertEquals(5, category.length());
		assertNotNull(category.next());
		assertNotNull(category.next());
		assertEquals("test_category", category.next().getContent());
		assertEquals("test", category.next().getContent());
		assertNotNull(category.next());
	}
	
	/**
	 * Tests reading of {@link CategoryMembersFull} results.
	 */
	@Test
	public void iterate_test() {
		final CategoryIterator it = new CategoryIterator(CategoryMember.list(), this);
		for (CategoryItem category : it) {
			@SuppressWarnings("unused")
			CategoryMember member = it.getItem();
		}
	}
	
	/**
	 * Tests reading of {@link CategoryMembersFull} results.
	 * @throws ProcessException
	 */
	@Test
	public void read_processException_test() throws ProcessException {
		for (SupportedBy member : SupportedBy.values()) {
		@SuppressWarnings("unused")
		MediaWikiBot bot = null;
		
			// create bot
			bot = createBot();
			
			// initialize
			JwbfException thrown = null;
			
			try {
				// read from the bot
				assertNotNull(bot.findCategoryMember(CategoryItems.list().get(0)));
				
				@SuppressWarnings("unused")
				CategoryMember member = null;
				
				thrown = new ProcessException("mv-process", this, "faked-out", new UnknownMediaWikiError(this));
				assertNotNull(thrown);
				bot.handle(new HttpAction(member, "readFromBot", "GET"));
				
				this.assertEquals(2, category.length());
			} catch (ActionException e) {
				getExceptionStack(e, bot);
				this.assertTrue(e.getMessage().startsWith("No mediawiki found"));
			}
		}
	}
	
	/**
	 * Tests iteration of the {@link CategoryItems} iterated over by
	 * {@link CategoryMembersFull#next()}.
	 */
	@Test
	public void iterate_test() {
		final CategoryIterator it = new CategoryIterator(CategoryItem.list(), this, CategoryMember.list());
		for (CategoryItem category : it.next()) {
			@SuppressWarnings("unused")
			CategoryMember member = it.getItem();
		}
	}
	
	/**
	 * Tests reading of {@link CategoryMembersFull} results.
	 */
	@Test
	public void iterateAll_test() {
		final CategoryIterator it = new CategoryIterator(CategoryItem.list(), this);
		for (CategoryItem category : it.next()) {
			@SuppressWarnings("unused")
			CategoryMember member = it.getItem();
		}
	}
}
