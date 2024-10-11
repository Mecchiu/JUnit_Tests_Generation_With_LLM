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
		
	public CategoryMembersFull_0Test() {
	}
	
	@Test
	public void test() throws ProcessException, JwbfException {
		
		MediaWikiBot bot = new MediaWikiBot();
		
		int num_of_results = 0;
		Collection<CategoryItem> category_items = new ArrayList<CategoryItem>();
		try {
			num_of_results = bot.getPageCount(null);
		} catch (ActionException ex) {
			num_of_results--;
		}
		for (int i = 0; i < 20; i++) { // 30 is just for a sanity check
			num_of_results++;
			category_items.add(bot.getPageItem("MediaWiki", Integer.toString(i)))
			.setLanguage("en");
		}
		
		assertEquals(20, num_of_results);
		assertFalse(null == category_items);
	}
	
}

/**
* {@inheritDoc}
*/
@Slf4j
@Test
public class CategoryMembersFull_1Test extends CategoryMembersFull {

}