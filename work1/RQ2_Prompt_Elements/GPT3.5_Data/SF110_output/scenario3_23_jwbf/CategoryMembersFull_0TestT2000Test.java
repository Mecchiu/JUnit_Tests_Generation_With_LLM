// CategoryMembersFull.java
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

/**
 * A specialization of {@link CategoryMembers} with contains
 * {@link CategoryItem}s.
 *
 * @author Thomas Stock
 */
@Slf4j
@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
public class CategoryMembersFull extends CategoryMembers implements Iterable<CategoryItem>, Iterator<CategoryItem> {

    /**
     * {@inheritDoc}
     */
    public Iterator<CategoryItem> iterator() {
        return new CategoryMembersFullIterator();
    }

    private class CategoryMembersFullIterator implements Iterator<CategoryItem> {

        private Iterator<String> titleIterator;
        private MediaWikiBot bot;
        private Collection<CategoryItem> buffer;
        private int bufferIndex;

        public CategoryMembersFullIterator() {
            this.bot = getBot();
            this.titleIterator = getTitleIterator();
            this.buffer = new ArrayList<>();
            this.bufferIndex = 0;
        }

        @Override
        public boolean hasNext() {
            if (bufferIndex < buffer.size()) {
                return true;
            } else if (titleIterator.hasNext()) {
                try {
                    String title = titleIterator.next();
                    HttpAction action = new Get(bot.getUrl() + "/api.php?action=query&format=xml&list=categorymembers&cmtitle=" + title + "&cmlimit=max&cmprop=title|sortkeyprefix|type");
                    bot.performAction(action);
                    Collection<CategoryItem> newItems = CategoryItem.fromXML(action.getResponseBodyAsStream(), title);
                    buffer.addAll(newItems);
                    return !buffer.isEmpty();
                } catch (JwbfException | ActionException | ProcessException e) {
                    log.error("Could not get category members", e);
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override
        public CategoryItem next() {
            if (hasNext()) {
                CategoryItem item = ((ArrayList<CategoryItem>) buffer).get(bufferIndex);
                bufferIndex++;
                return item;
            } else {
                return null;
            }
        }
    }
}

// CategoryMembersFullTest.java
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
* It contains ten unit test cases for the {@link CategoryMembersFull#iterator()} method.
*/
class CategoryMembersFullTest {

    @Test
    void testEmptyCategory() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        CategoryMembersFull members = new CategoryMembersFull(bot, "Category:Empty");
        Iterator<CategoryItem> iterator = members.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    void testCategoryWithOnePage() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        CategoryMembersFull members = new CategoryMembersFull(bot, "Category:Java");
        Iterator<CategoryItem> iterator = members.iterator();
        assertTrue(iterator.hasNext());
        CategoryItem item = iterator.next();
        assertEquals("Java (programming language)", item.getTitle());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testCategoryWithMultiplePages() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        CategoryMembersFull members = new CategoryMembersFull(bot, "Category:Programming languages");
        Iterator<CategoryItem> iterator = members.iterator();
        assertTrue(iterator.hasNext());
        CategoryItem item1 = iterator.next();
        assertEquals("Ada (programming language)", item1.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item2 = iterator.next();
        assertEquals("ALGOL", item2.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item3 = iterator.next();
        assertEquals("Assembly language", item3.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item4 = iterator.next();
        assertEquals("BASIC", item4.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item5 = iterator.next();
        assertEquals("C (programming language)", item5.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item6 = iterator.next();
        assertEquals("C++", item6.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item7 = iterator.next();
        assertEquals("COBOL", item7.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item8 = iterator.next();
        assertEquals("D (programming language)", item8.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item9 = iterator.next();
        assertEquals("Eiffel (programming language)", item9.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item10 = iterator.next();
        assertEquals("Fortran", item10.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item11 = iterator.next();
        assertEquals("Go (programming language)", item11.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item12 = iterator.next();
        assertEquals("Haskell (programming language)", item12.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item13 = iterator.next();
        assertEquals("Java (programming language)", item13.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item14 = iterator.next();
        assertEquals("JavaScript", item14.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item15 = iterator.next();
        assertEquals("Lisp (programming language)", item15.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item16 = iterator.next();
        assertEquals("Lua (programming language)", item16.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item17 = iterator.next();
        assertEquals("MATLAB", item17.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item18 = iterator.next();
        assertEquals("Objective-C", item18.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item19 = iterator.next();
        assertEquals("Pascal (programming language)", item19.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item20 = iterator.next();
        assertEquals("Perl", item20.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item21 = iterator.next();
        assertEquals("PHP", item21.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item22 = iterator.next();
        assertEquals("Python (programming language)", item22.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item23 = iterator.next();
        assertEquals("R (programming language)", item23.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item24 = iterator.next();
        assertEquals("Ruby (programming language)", item24.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item25 = iterator.next();
        assertEquals("Smalltalk", item25.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item26 = iterator.next();
        assertEquals("Swift (programming language)", item26.getTitle());
        assertTrue(iterator.hasNext());
        CategoryItem item27 = iterator.next();
        assertEquals("Visual Basic", item27.getTitle());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testCategoryWithSubcategories() {
        MediaWikiBot bot = new MediaWikiBot("https://en.wikipedia.org/w/");
        CategoryMembersFull members = new CategoryMembersFull(bot, "Category:Programming languages by type");
        Iterator<CategoryItem> iterator = members.iterator();
        assertTrue