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
		@Test
		void testCategorizationFullEmptyList() {
				// GIVEN
				MediaWikiBot bot = new MediaWikiBot();
				ActionException exception = assertThrows(Exception.class, () ->
						initMediaWikiBot(bot, "categorization-full.html")
				);
				// WHEN
				List<CategoryItem> collection = null;
				// THEN
				assertNull(collection);
		}

		@Test
		void testCategorizationEmptyList() {
				// GIVEN
				MediaWikiBot bot = new MediaWikiBot();
				Collection<CategoryItem> collection = new ArrayList<CategoryItem>();
				// WHEN
				int index = 0;
				try {
						next(bot, collection);
						log.info("Success in test {}!", index++);
				} catch (Exception e) {
						log.error("Failed in test {}!", index++, e);
						e.printStackTrace();
				}
				// THEN
		}

		@Test
		@Slf4j
		void testCategorizationFull() throws jwbf.core.bots.util.JwbfException {
				// GIVEN
				MediaWikiBot bot = new MediaWikiBot();
				ActionException exception = assertThrows(Exception.class, () ->
						initMediaWikiBot(bot, "categorization-full.html")
				);
				// WHEN
				Collection<CategoryItem> collection = null;
				collection = getCategoryItemsFull(bot);
				// THEN
				assertEmpty(collection);
		}
}