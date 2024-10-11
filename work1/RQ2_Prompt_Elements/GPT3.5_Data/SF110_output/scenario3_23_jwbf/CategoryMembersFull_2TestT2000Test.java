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
     * Returns the next {@link CategoryItem} in the iteration.
     *
     * @return the next {@link CategoryItem} in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    public CategoryItem next() {
        return null;
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
* It contains ten unit test cases for the {@link CategoryMembersFull#next()} method.
*/
class CategoryMembersFullTest {

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Test case: empty collection.
     */
    @Test
    void testNextEmpty() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        assertFalse(cmf.hasNext());
        assertThrows(NoSuchElementException.class, cmf::next);
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Test case: collection with one element.
     */
    @Test
    void testNextOneElement() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        CategoryItem item = new CategoryItem("Test");
        cmf.add(item);
        assertTrue(cmf.hasNext());
        assertEquals(item, cmf.next());
        assertFalse(cmf.hasNext());
        assertThrows(NoSuchElementException.class, cmf::next);
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Test case: collection with multiple elements.
     */
    @Test
    void testNextMultipleElements() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        CategoryItem item1 = new CategoryItem("Test1");
        CategoryItem item2 = new CategoryItem("Test2");
        CategoryItem item3 = new CategoryItem("Test3");
        cmf.add(item1);
        cmf.add(item2);
        cmf.add(item3);
        assertTrue(cmf.hasNext());
        assertEquals(item1, cmf.next());
        assertTrue(cmf.hasNext());
        assertEquals(item2, cmf.next());
        assertTrue(cmf.hasNext());
        assertEquals(item3, cmf.next());
        assertFalse(cmf.hasNext());
        assertThrows(NoSuchElementException.class, cmf::next);
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Test case: remove an element from the collection.
     */
    @Test
    void testNextRemoveElement() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        CategoryItem item1 = new CategoryItem("Test1");
        CategoryItem item2 = new CategoryItem("Test2");
        CategoryItem item3 = new CategoryItem("Test3");
        cmf.add(item1);
        cmf.add(item2);
        cmf.add(item3);
        assertTrue(cmf.hasNext());
        assertEquals(item1, cmf.next());
        cmf.remove();
        assertTrue(cmf.hasNext());
        assertEquals(item2, cmf.next());
        assertTrue(cmf.hasNext());
        assertEquals(item3, cmf.next());
        assertFalse(cmf.hasNext());
        assertThrows(NoSuchElementException.class, cmf::next);
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Test case: remove the last element from the collection.
     */
    @Test
    void testNextRemoveLastElement() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        CategoryItem item1 = new CategoryItem("Test1");
        CategoryItem item2 = new CategoryItem("Test2");
        CategoryItem item3 = new CategoryItem("Test3");
        cmf.add(item1);
        cmf.add(item2);
        cmf.add(item3);
        assertTrue(cmf.hasNext());
        assertEquals(item1, cmf.next());
        assertTrue(cmf.hasNext());
        assertEquals(item2, cmf.next());
        assertTrue(cmf.hasNext());
        assertEquals(item3, cmf.next());
        cmf.remove();
        assertFalse(cmf.hasNext());
        assertThrows(NoSuchElementException.class, cmf::next);
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Test case: remove all elements from the collection.
     */
    @Test
    void testNextRemoveAllElements() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        CategoryItem item1 = new CategoryItem("Test1");
        CategoryItem item2 = new CategoryItem("Test2");
        CategoryItem item3 = new CategoryItem("Test3");
        cmf.add(item1);
        cmf.add(item2);
        cmf.add(item3);
        assertTrue(cmf.hasNext());
        assertEquals(item1, cmf.next());
        cmf.remove();
        assertTrue(cmf.hasNext());
        assertEquals(item2, cmf.next());
        cmf.remove();
        assertTrue(cmf.hasNext());
        assertEquals(item3, cmf.next());
        cmf.remove();
        assertFalse(cmf.hasNext());
        assertThrows(NoSuchElementException.class, cmf::next);
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Test case: remove an element before calling next().
     */
    @Test
    void testNextRemoveBeforeNext() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        CategoryItem item1 = new CategoryItem("Test1");
        CategoryItem item2 = new CategoryItem("Test2");
        CategoryItem item3 = new CategoryItem("Test3");
        cmf.add(item1);
        cmf.add(item2);
        cmf.add(item3);
        cmf.remove();
        assertTrue(cmf.hasNext());
        assertEquals(item1, cmf.next());
        assertTrue(cmf.hasNext());
        assertEquals(item2, cmf.next());
        assertTrue(cmf.hasNext());
        assertEquals(item3, cmf.next());
        assertFalse(cmf.hasNext());
        assertThrows(NoSuchElementException.class, cmf::next);
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Test case: remove an element after calling next() multiple times.
     */
    @Test
    void testNextRemoveAfterNext() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        CategoryItem item1 = new CategoryItem("Test1");
        CategoryItem item2 = new CategoryItem("Test2");
        CategoryItem item3 = new CategoryItem("Test3");
        cmf.add(item1);
        cmf.add(item2);
        cmf.add(item3);
        assertTrue(cmf.hasNext());
        assertEquals(item1, cmf.next());
        assertTrue(cmf