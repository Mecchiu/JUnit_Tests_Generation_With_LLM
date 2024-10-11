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
private MediaWikiBot wikiBot;
		private MediaWikiBot wiki2Bot;
		private ArrayList<CategoryItem> items;
		private String pageName;
		
		/**
		 * Constructor for {@link CategoryMembersFull_0Test}.
		 *
		 * @throws ProcessException If some problem occurs
		 */
		@Test
		public void runSimpleConstructor() throws ProcessException {
			wikiBot = new MediaWikiBot("wikiBot", "Bot", supportedBy(SupportedBy.ALL));
			wiki2Bot = new MediaWikiBot("wiki2Bot", "Bot", supportedBy(supportedBy(SupportedBy.ALL)));
			items = new ArrayList<CategoryItem>();
			pageName = "testPage";
			
			// Set up the items
			CategoryItem categoryItem1 = new CategoryItem(pageName, "-", "Title");
			CategoryItem categoryItem2 = new CategoryItem(pageName, "-", "Subtitle");
			CategoryItem categoryItem3 = new CategoryItem(pageName, "foo", "/foo");
			CategoryItem categoryItem4 = new CategoryItem(pageName, "bar", "/bar");
			CategoryItem categoryItem5 = new CategoryItem(pageName, "baz", "/baz");
			
			// Set up the content
			CategoryItem contentItem1 = new CategoryItem("Content", pageName, "[wiki.wikis.wikipedia.com/wiki/Title]");
			CategoryItem contentItem2 = new CategoryItem("Content", pageName, "[wiki.wikis.wikipedia.com/Title/Title]");
			CategoryItem contentItem3 = new CategoryItem("Content", pageName, "[wiki.wikis.w3catalog.org/Title]");
			CategoryItem contentItem4 = new CategoryItem("Content", pageName, "[wiki.wikis.wikipedia.org/]");
			CategoryItem contentItem5 = new CategoryItem("Content", pageName, "[wiki.wikis.wikipedia.org/]");
			CategoryItem contentItem6 = new CategoryItem("Content", pageName, "[wiki.wikis.wikipedia.org/]");
			CategoryItem contentItem7 = new CategoryItem("Content", pageName, "[wiki.wikis.wikipedia.org/]");
			CategoryItem contentItem8 = new CategoryItem("Content", pageName,
					"[wiki.wikis.wikipedia.org/]");
			
			// Set up the wiki
			wikiBot.preprocessPage(contentItem1, wikiBot.getWikiContent());
			wiki2Bot.preprocessPage(contentItem2, wikiBot.getWikiContent());
			wiki2Bot.preprocessPage(contentItem3, wikiBot.getWikiContent());
			wiki2Bot.preprocessPage(contentItem4, wikiBot.getWikiContent());
			wiki2Bot.preprocessPage(contentItem5, wikiBot.getWikiContent());
			wiki2Bot.preprocessPage(contentItem6, wikiBot.getWikiContent());
			wiki2Bot.preprocessPage(contentItem7, wikiBot.getWikiContent());
			wiki2Bot.preprocessPage(contentItem8, wikiBot.getWikiContent());
			
			// Create the mock objects for the content.
			CategoryItem mockContentItem1 = wikiBot.getWikiContent();
			CategoryItem mockContentItem2 = wiki2Bot.getWikiContent();
			
			// First make sure we have the needed data
			assertNotNull(mockContentItem1);
			assertNotNull(mockContentItem2);
			
			// Make sure there is some text in it
			assertTrue(mockContentItem1.hasText());
			assertTrue(mockContentItem2.hasText());
			
			// Make sure the content items were generated correctly
			assertEquals(contentItem1.getName(), mockContentItem1.getName());
			assertUtfEquals(contentItem2.getName(), mockContentItem2.getName());
			
			// Create the category items.
			CategoryItemCategory category1 = new CategoryItemCategory(mockContentItem1, wikiBot.getWikiContent());
			CategoryItemCategory category2 = new CategoryItemCategory(mockContentItem2, wiki2Bot.getWikiContent());
			
			// Create a new category.
			CategoryItemCategory category = new CategoryItemCategory(contentItem1, contentItem2, wikiBot.getWikiContent());
			
			// Make sure they are both created
			assertTrue(category1.equals(category));
			assertTrue(category2.equals(category));
			assertTrue(category.equals(category