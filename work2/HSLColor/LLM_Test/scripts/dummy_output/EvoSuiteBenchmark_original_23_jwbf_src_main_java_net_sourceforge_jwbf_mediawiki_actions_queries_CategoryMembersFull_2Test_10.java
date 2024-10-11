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
		void shouldFindCategoryItems() throws JwbfException {
			final MediaWikiBot mockBot = new MediaWikiBot("localhost", TestConfigurationImpl.getInstance().getUserName(), TestConfigurationImpl.getInstance().getPassword());
			this.log.info("Sending HTTP GET request to MediaWiki at url {}", MediaWikiBotFactory.MB_MEDIAWIKI_ROOT);
			mockBot.httpAction = new HttpAction() {
				@Override
				public void execute() throws ProcessException {
					super.execute();
					log.debug("Fetching category: httpAction");
					Get.get(fetch("/api/category/?f="));
				}
			};
			fetch("f=")
				.withQuery("&lt;f+&gt;+%24/&#22;+%21/") //
				.using(() -> mockBot)
				.log().and(new MediaWikiBot.HttpActionCallback() {
					@Override
					public boolean isDone() {
						return true;
					}

					@Override
					public String getResult() throws JwbfException {
						return "category";
					}

				}).onSuccess(true, true).and(((Response) o).getStatus());
			mockBot.fetch("category");
		}

		@Test
		void shouldGetFilteredCategories() throws JwbfException {
			final MediaWikiBot mockBot = new MediaWikiBot("localhost", TestConfigurationImpl.getInstance().getUserName(), TestConfigurationImpl.getInstance().getPassword());
			this.log.info("Sending HTTP GET request to MediaWiki at url {}", MediaWikiBotFactory.MB_MEDIAWIKI_ROOT);
			mockBot.httpAction = new HttpAction() {
				@Override
				public void execute() throws ProcessException {
					super.execute();
					log.debug("Fetching category: httpAction");
					Get.get(fetch("/api/category/?f="));
				}
			};
			this.log.info("fetch(): {}", mockBot.fetch("category"));
			mockBot.fetch("category");
			fetch("f=")
				.using(() -> mockBot)
				.afterFirst(() -> test(fetch("category"), 2))
				.and(((Response) o).getStatus());
		}

		private String fetch(final String basePath) throws ProcessException {
			return fetch("f=" + basePath);
		}

		@Test
		public void shouldFindCategoriesAsCollection() throws JwbfException {
			final MediaWikiBot mockBot = new MediaWikiBot("localhost", TestConfigurationImpl.getInstance().getUserName(), TestConfigurationImpl.getInstance().getPassword());
			this.log.info("Sending HTTP GET request to MediaWiki at url {}", MediaWikiBotFactory.MB_MEDIAWIKI_ROOT);
			Collection<CategoryItem> result = fetch("f=")
				.using(() -> mockBot)
				.and(((Response) o).getStatus());
			Collection<CategoryItem> expected = new ArrayList<>(2);
			expected.add(new CategoryItem(null, null, "http://mediawiki.org/wiki/MediaWiki", null, null));
			expected.add(new CategoryItem(null, null, "http://mediawiki.org/wiki/MediaWiki", null, null));
			assertTrue(expected.contains(result.get(0)));
			assertTrue(expected.contains(result.get(1)));
		}

		@Test
		public void shouldFetchCategoryItems() throws JwbfException {
			final MediaWikiBot mockBot = new MediaWikiBot("localhost", TestConfigurationImpl.getInstance().getUserName(), TestConfigurationImpl.getInstance().getPassword());
			this.log.info("Sending HTTP GET request to MediaWiki at url {}", MediaWikiBotFactory.MB_MEDIAWIKI_ROOT);
			Collection<CategoryItem> result = fetch("f=http://mediawiki.org/wiki/MediaWiki?f=c&lt;f+label;+%21label+%24&#88;+test+%22&#964;+%23")
				.using(() -> mockBot)
				.and(((Response) o).getStatus());
			CategoryItem expected = new CategoryItem(null, "MediaWiki", "http://mediawiki.org/wiki/MediaWiki", null, null);
			expected.setTitle("MediaWiki");
}
}