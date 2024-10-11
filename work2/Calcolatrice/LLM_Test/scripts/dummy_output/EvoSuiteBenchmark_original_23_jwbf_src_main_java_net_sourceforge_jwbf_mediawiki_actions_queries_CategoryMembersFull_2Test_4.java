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
		
		private MediaWikiFixture base = new MediaWikiFixture("MediaWikiFixture/CategoryMembersFull_2");
		private CategoryItemsFull category = (CategoryItemsFull) base.getInstance();
		private CategoryItemsEmptyTest case1 = (CategoryItemsEmptyTest) base.getInstance_Twice("CategoryWithOnlyOneEntry");
		private CategoryItem item;
		private CategoryItemsFull members;
		private MediaWikiBot bot = category.bot;

		@Before
		public void setup() throws JwbfException {
			bot.addCategoryItem(base.getWiki(), "category");
			// We have to put a bunch of items inside
			category.items = new CategoryItems[10];
			category.items[0] = case1.item;
			for (int i = 1; i < 10; ++i) {
				category.items[i] = new CategoryItem("item" + i);
			}
		}

		@Test
		public void testHasMore() throws ProcessException {
			assertTrue("Should have more than 0 entries", members.all().hasMore());
			// We can't test using the next() method itself since it
			// does not return any CategoryInfo objects and it can
			// change the order of entries returned.
			// assertTrue("Should have entries", members.all().hasMore());
		}

		@Test
		public void testNext_twice() throws ProcessException {
			assertEquals("Should have all 5 entries", 5, members.all().hasMore()? 0 : members.all().next().number() - members.all().next().number());
			assertEquals("Should have entries", 5, members.all().hasMore()? 0 : members.all().next().number() - members.all().next().number());
		}

		@Test
		public void testFirstInGroup() throws ProcessException, ProcessException {
			// We can also use the first category Item in the first list
			// in case it's not empty
			for (CategoryItem i : members.all()) {
				assertNotNull("Should have item:", i);
				assertEquals("Should have number", i.number(), case1.number - 1);
				assertNotSame("Should not have more", members.all(), members.all().before(i));
			}
		}

		@Test
		public void testAllEntries() throws ProcessException, ProcessException {
			// We add the first category item in the first list.
			// But it has another category item as an "element" too.
			// So we add it several times.
			// And we test all category Items without entries.
			// Also, we test if it's done.
			String c = base.getWiki().getCategory("category").name();
			base.addAllWikibase(c, case1.before() + " CategoryItems");
			// The MediaWikiFixture.addAllWikibase is executed before the
			// MediaWikiBot.addCategoryItem is executed.
			// The MediaWikiBot creates the MediaWikiFixture.
			// The MediaWikiBot then gets the ContentRep object which
			// is passed as a parameter to MediaWikiBot.addCategoryItem.
			// Then we use ContentRep to access the MediaWikiFixture.
			// Now MediaWikiBot.addAllWikibase is executed by MediaWikiFixture.
			// The CategoryItem list of MediaWikiBot is passed as a parameter
			// to CategoryItem.
			// The CategoryItem list of MediaWikiFixture is passed as a parameter
			// to CategoryItemsEmptyTest.
			// Each Entry of the entries in the category contains two CategoryItem
			// objects: CategoryItem-1 and CategoryItem-2
			Collection expected = new ArrayList();
			expected.add(case1.before() + " CategoryItems");
			expected.addAll(members.all());
			assertEquals("Should have entries", case1.number + 1, case1.number - 1);
			expected.add(case1.before() + " CategoryItems");
			expected.addAll(members.all());
			assertTrue("Should have no entries", members.all().hasMore());
			assertNull("Should not have more entries", members.all().next());
			assertTrue("Should return the expected result", expected.equals(members.all().all()));
			assertTrue("Should return true", members.all().hasMore());
		}

		private static class CategoryItemsFull extends CategoryItems{
			
			private boolean addBefore;
			private Collection all;

			public Collection getAll(){
				return all;
			}

}
}