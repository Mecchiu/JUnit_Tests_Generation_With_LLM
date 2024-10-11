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
@Test
		@Slf4j
		public void testIterator() throws Get, ProcessException, ActionException, JwbfException {
			MediaWikiBot bot = new MediaWikiBot(new MediaWikiBotConfig(TestConstants.CONFIG_FILE, TestConstants.CONFIG_LOCATION_NAME, TestConstants.CONFIG_LOCATION_NAME));
			// MediaWikiBot bot = new MediaWikiBot(new MediaWikiBotConfig());
			// bot.start();

			// List<Article>
			// List<Category>
			// MediaWikiBot bot = new MediaWikiBot(new MediaWikiBotConfig(TestConstants.CONFIG_FILE, TestConstants.CONFIG_LOCATION_NAME, TestConstants.CONFIG_LOCATION_NAME));
			// bot.start();

			// get full category from MediaWiki 0.10 - 0.12
			String page = testGet();
			//List<Article>
			Collection<CategoryItem> cats = bot.getArticles(page, MW1_10, MW1_11);
			assertTrue(cats.isEmpty());
			//List<Category>
			cats = bot.getAllCategories(page, MW1_10);
			assertTrue(cats.isEmpty());

		}
}
