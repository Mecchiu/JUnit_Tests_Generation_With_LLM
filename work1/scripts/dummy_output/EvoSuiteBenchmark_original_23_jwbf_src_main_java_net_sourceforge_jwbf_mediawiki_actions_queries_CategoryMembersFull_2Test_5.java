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
		
	@Slf4j
	private static final MediaWikiBot mediaWikiBot = MediaWikiBot.getInstance();
	
	@Slf4j
	@Test
	public void test_next_without_a_category_has_no_entries() throws Exception {
	
		int count = 0;
		Collection<CategoryItem> items;
		
		// Create a new instance of the bot and make it available for the
		// test object to access with
		Collection<CategoryItem> categories = new ArrayList<>();
		MediaWikiBot.getInstance().createNewInstanceAndMakeItAvailableForActions(categories);
				
		// Iterate through all the categories in order to fill them up
		for (Iterator<CategoryItem> iterator = categories.iterator(); iterator.hasNext();) {
			CategoryItem item = iterator.next();
			if (item instanceof CategoryItem_Full) {
				categories.add(item);
			}
		}
		
		// Iterate through all the category items and see that they start
		// with CategoryItem_Fulls
		for (CategoryItem item : categories) {
			count++;
			log.info("{} has {} category entries", item.toString(), count);
			if (item instanceof CategoryItem_Full) {
				continue;
			}
			StringBuilder sb = new StringBuilder();
			sb.append("First Category entry of type ").append(item.toString()).append(" is of type ").append(item.getType().name());
			boolean first_item = true;
			for (Iterator<CategoryItem> iterator1 = categories.iterator(); iterator1.hasNext();) {
				CategoryItem item1 = iterator1.next();
				if (item1 instanceof CategoryItem_Full) {
					boolean is_first_item = true;
					Iterator<CategoryItem> iterator2 = categories.iterator();
					while (iterator2.hasNext()) {
						CategoryItem item2 = iterator2.next();
						if (item2 instanceof CategoryItem_Full) {
							log.info("  Testing \"{} {}\"", item2.toString()); 
							if (first_item) {
								first_item = false;
							} else {
								sb.append(" AND ");
							}
							sb.append("{}={").append(item1.toString()).append(" }");
							Iterator<Object> objects = MediaWikiBot.getInstance().queryPage(sb.toString(), item1.getData());
							if (!objects.hasNext()) {
								log.error(sb.toString());
							} else {
								object = objects.next();
								if (object instanceof CategoryItem_Full) {
									is_first_item = false;
								} else {
									log.info(object.toString());
									if (is_first_item) {
										first_item = true;
										break;
									}
								}
							}
						}
						log.info(". ");
						/*
						 * Iterator iterator2 = items.iterator(); while (iterator2.hasNext() ) {
						 * log.info("{} is found ", object.toString(), iterator2.next()); if
						 * (iterator2.hasNext()) { log.info("{}, found {}.", object.toString(),
						 * iterator2.next().toString()); } else { log.info("{}, doesn't exist.",
						 * object.toString()); }
						 */
					}
					iterator1 = iterator2;
					break;
				}
			}
		}
		if (first_item) {
			first_item = false;
		} else {
			sb.append(" OR ");
		}
		sb.append("NOT(not (item.title='New Category')) LIMIT 1");
		for (Iterator<CategoryItem> iterator = categories.iterator(); iterator.hasNext();) {
			CategoryItem item = iterator.next();
			sb.append(" AND ").append(item.toString()).append("={").append(item.getType().name()).append(" }");
		}
		String result = mediaWikiBot.getPageContent(sb.toString());
		
		assertTrue("Returned wrong result!", result.toLowerCase().contains("new category"));
		assertTrue("Has no entries found!",!result.contains("new category"));
		assertTrue("New category has entries!", result.indexOf("New category") >= 0);
	}
}