// CategoryMembersFull_1Test.java
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
* It contains one unit test case for the {@link CategoryMembersFull#hasNext()} method.
*/
class CategoryMembersFull_1Test {
		/**
		 * Check the methods of {@link CategoryMemberFull} returning
		 * {@link Collection} and {@link Iterator}
		 */
		@Test
		public void checkFullClass() throws Exception {
			final Collection<CategoryItem> collection = new ArrayList<CategoryItem>();
			try {
				collection.add(new CategoryItem(1, "test/page_one.png", null));
				collection.add(new CategoryItem(2, "test/page_two.png", null));
				collection.add(new CategoryItem(3, "test/page_three.png", null));
			}
			catch (final ProcessException e) {
				assert (Error.class == e.getClass());
			}
			final Iterator<CategoryItem> iter = collection.iterator();
            final Collection<CategoryItem> members_1 = new ArrayList<CategoryItem>();
            do {
                members_1.add(iter.next());
            } while (iter.hasNext());
            assert (members_1.size() == 2);
            assert (true == members_1.contains(new CategoryItem(1, "test/page_one.png", null)));
        	final Collection<CategoryItem> members_2 = new ArrayList<CategoryItem>();
			do {
				members_2.add(iter.next());
			} while (iter.hasNext());
			assert (members_2.size() == 3);
			assert (true == members_2.contains(new CategoryItem(2, "test/page_two.png", null)));
		}


}