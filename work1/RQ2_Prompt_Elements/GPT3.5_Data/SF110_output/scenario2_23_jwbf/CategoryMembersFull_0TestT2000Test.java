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
        return this;
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

    /**
     * Test method for {@link CategoryMembersFull#iterator()}.
     * Case: empty category
     */
    @Test
    public void testIteratorEmpty() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#iterator()}.
     * Case: category with one item
     */
    @Test
    public void testIteratorOneItem() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Item1"));
        assertTrue(cmf.hasNext());
        assertEquals("Item1", cmf.next().getTitle());
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#iterator()}.
     * Case: category with multiple items
     */
    @Test
    public void testIteratorMultipleItems() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Item1"));
        cmf.add(new CategoryItem("Item2"));
        cmf.add(new CategoryItem("Item3"));
        assertTrue(cmf.hasNext());
        assertEquals("Item1", cmf.next().getTitle());
        assertTrue(cmf.hasNext());
        assertEquals("Item2", cmf.next().getTitle());
        assertTrue(cmf.hasNext());
        assertEquals("Item3", cmf.next().getTitle());
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#iterator()}.
     * Case: category with duplicate items
     */
    @Test
    public void testIteratorDuplicateItems() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Item1"));
        cmf.add(new CategoryItem("Item2"));
        cmf.add(new CategoryItem("Item1"));
        assertTrue(cmf.hasNext());
        assertEquals("Item1", cmf.next().getTitle());
        assertTrue(cmf.hasNext());
        assertEquals("Item2", cmf.next().getTitle());
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#iterator()}.
     * Case: category with null item
     */
    @Test
    public void testIteratorNullItem() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(null);
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#iterator()}.
     * Case: category with empty item
     */
    @Test
    public void testIteratorEmptyItem() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem(""));
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#iterator()}.
     * Case: category with whitespace item
     */
    @Test
    public void testIteratorWhitespaceItem() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("  "));
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#iterator()}.
     * Case: category with mixed items
     */
    @Test
    public void testIteratorMixedItems() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Item1"));
        cmf.add(null);
        cmf.add(new CategoryItem(""));
        cmf.add(new CategoryItem("Item2"));
        cmf.add(new CategoryItem("  "));
        cmf.add(new CategoryItem("Item3"));
        assertTrue(cmf.hasNext());
        assertEquals("Item1", cmf.next().getTitle());
        assertTrue(cmf.hasNext());
        assertEquals("Item2", cmf.next().getTitle());
        assertTrue(cmf.hasNext());
        assertEquals("Item3", cmf.next().getTitle());
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#iterator()}.
     * Case: category with remove operation
     */
    @Test
    public void testIteratorRemove() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Item1"));
        cmf.add(new CategoryItem("Item2"));
        cmf.add(new CategoryItem("Item3"));
        Iterator<CategoryItem> it = cmf.iterator();
        assertTrue(it.hasNext());
        assertEquals("Item1", it.next().getTitle());
        it.remove();
        assertTrue(it.hasNext());
        assertEquals("Item2", it.next().getTitle());
        assertTrue(it.hasNext());
        assertEquals("Item3", it.next().getTitle());
        assertFalse(it.hasNext());
        assertFalse(cmf.contains(new CategoryItem("Item1")));
        assertTrue(cmf.contains(new CategoryItem("Item2")));
        assertTrue(cmf.contains(new CategoryItem("Item3")));
    }

    /**
     * Test method for {@link CategoryMembersFull#iterator()}.
     * Case: category with remove operation on empty category
     */
    @Test
    public void testIteratorRemoveEmpty() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        Iterator<CategoryItem> it = cmf.iterator();
        assertFalse(it.hasNext());
        assertThrows(IllegalStateException.class, () -> it.remove());
    }
}