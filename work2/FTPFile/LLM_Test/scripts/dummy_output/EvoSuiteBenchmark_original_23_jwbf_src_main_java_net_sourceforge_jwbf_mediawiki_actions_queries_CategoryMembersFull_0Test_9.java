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
		private final String test_link = "qp2";
		private final MediaWikiBot bot;

		/**
		 * Initializes this test class.
		 *
		 * @param bot        the MediaWiki bot
		 */
		public CategoryMembersFull_0Test(MediaWikiBot bot) {
			this.bot = bot;
		}

		@Test
		@Slf4j
		public void testIterator() {
			try(Action<? super Iterator<CategoryItem>> action = bot.getQuery("qi")) {
				assertNotNull(action);
				Collection<CategoryItem> list = action
					.stream()
					.map(Iterator::next)
				
					.collect(lombok.ValueNames.convert(ArrayList.class));
				log.debug("{}", list);
				assertEquals(new ArrayList<>(list),
					new ArrayList<>(
						new CategoryMembersFully(bot)
				));
			}
		}
		
		@Test
		@Slf4j
		public void testEmpty() {
			try(Get.Result action = bot.getQuery("qi")) {
				assertNotNull(action);
				assertTrue(action.isEmpty());
			}				
		}
		
		@Test
		@Slf4j
		public void testNullItemAndList() {
			try(Get.Result action = bot.getQuery("qi")) {
				assertNotNull(action);
				ActionException ex = assertThrows(ActionException.class, () -> { 
					List<?> listItems = action.getList();
				});
				
				assertTrue(ex.getCause() instanceof IllegalStateException);
			}
		}

		@Test
		@Slf4j
		public void testNullItem() {
			try(Get.Result action = bot.getQuery(null)) {
				assertNotNull(action);
				Object list = action.getList();
				ActionException ex = assertThrows(ActionException.class, () -> { 
					Collection<CategoryItem> listItems = action.getList();
				});
				
				assertTrue(ex.getCause() instanceof IllegalStateException);
				
				Collection<CategoryItem> list = listItems == null? null : (Collection) list;
			}			
		}

		@Test
		@Slf4j
		public void testMoreNull() {
			try(Get.Result action = bot.getQuery(test_link)) {
				assertNotNull(action);
				assertTrue(action.isMoreAvailable(test_link));
			}
		}

		@Test
		@Slf4j
		public void testMoreMoreNull() {
			try(Get.Result action = bot.getQuery(test_link)) {
				
				assertNotNull(action);
				action.more(test_link, "more");
				assertTrue(action.isMoreAvailable(test_link));
				action.more(test_link, "more".getBytes());
				assertTrue(action.isMoreAvailable(test_link));
			}
		}
		
		@Test
		@Slf4j
		public void testMoreMore() {
			try(Get.Result action = bot.getQuery(test_link)) {
				
				assertNotNull(action);
				
				Collection<CategoryItem> list = action.getList();
				action.more(test_link, (byte) 1);
				
				CategoryItem item = list.iterator()
				.next();
				
				assertEquals(item.getCategoryItem().getCategoryItem().getTitle().trim(), test_link);;
			}				
		}
		
		@Test
		@Slf4j
		public void testInvalidParameter() {
}
}