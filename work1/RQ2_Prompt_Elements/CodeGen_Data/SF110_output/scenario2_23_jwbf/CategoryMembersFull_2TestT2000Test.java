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
private final MediaWikiBot bot = new MediaWikiBot();
        
    /**
     * This single test case will prepare the CategoryMembersFull
     * object and test if all the
     * {@link CategoryItem}s are properly prepared.
     *
     * @throws ProcessException a problem is found inside
     * the code.
     */
    @Test
    public void test_1_prepareCollection() throws ProcessException, JwbfException {
        // prepare CategoryMembersCollection
        
        CategoryItemsCollection collection = new CategoryItemsCollection(bot, (short)1);
        
        // add CategoryItem with 0 parent id
        collection.add(new CategoryItem("t",0, false, true));
        
        // add CategoryItem 1 and 4 again, with 5 parents
        collection.add(new CategoryItem("t4", 5, false, true));
        collection.add(new CategoryItem("t4", 5, false, true));
        collection.add(new CategoryItem("t4", 5, false, true));
        collection.add(new CategoryItem("t4", 5, false, true));
        
        // test if Collection is correctly prepared
        assertEquals(5, collection.getCardinality());
    }
        
    private static class CategoryItemsCollection extends CategoryItems {
            private ArrayList<CategoryItem> items = new ArrayList<CategoryItem>();

            public CategoryItemsCollection(MediaWikiBot bot, short count) {
                super(bot, count);
            }

            /**
             * Adds several CategoryItems
             *
             * @param item The {@link CategoryItem}
             */
            @Override
            public void add(CategoryItem item) {
                items.add(item);
            }

            /**
             * @inheritDoc
             */
            @Override
            public void add(Collection<CategoryItem> collection) {
                items.addAll(collection);
                Collections.sort(items);
            }
        }
        
        private final Short count = new Short((short)2);
        private MediaWikiBot bot;

            public CategoryItemsCollection(MediaWikiBot bot, short count) {
                this.bot = bot;
                init(count);
            }

            /**
             * Initializes this categories iterator to a clean Collection.
             */
            public void init(short count) {
                setCardinality(count);
                items.clear();
                log.debug("count={}", count);
            }

            /**
             * Returns all the {@link CategoryItem}s.
             *
             * @return The {@link CategoryItem} collection
             */
            @Override
            public CategoryItemsCollection getCollection() {
                return new CategoryItemsCollection(bot, count);
            }
        }
}
