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
* It contains ten unit test cases for the {@link CategoryMembersFull#next()} method.
*/
class CategoryMembersFull_2Test {

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Case: empty collection.
     */
    @Test
    void testNextEmpty() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        assertFalse(cmf.hasNext());
        assertThrows(NullPointerException.class, () -> cmf.next());
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Case: one element in collection.
     */
    @Test
    void testNextOneElement() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Test"));
        assertTrue(cmf.hasNext());
        assertEquals("Test", cmf.next().getTitle());
        assertFalse(cmf.hasNext());
        assertThrows(NullPointerException.class, () -> cmf.next());
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Case: multiple elements in collection.
     */
    @Test
    void testNextMultipleElements() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Test1"));
        cmf.add(new CategoryItem("Test2"));
        cmf.add(new CategoryItem("Test3"));
        assertTrue(cmf.hasNext());
        assertEquals("Test1", cmf.next().getTitle());
        assertTrue(cmf.hasNext());
        assertEquals("Test2", cmf.next().getTitle());
        assertTrue(cmf.hasNext());
        assertEquals("Test3", cmf.next().getTitle());
        assertFalse(cmf.hasNext());
        assertThrows(NullPointerException.class, () -> cmf.next());
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Case: collection modified after iterator creation.
     */
    @Test
    void testNextModifiedCollection() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Test1"));
        cmf.add(new CategoryItem("Test2"));
        Iterator<CategoryItem> it = cmf.iterator();
        assertTrue(it.hasNext());
        assertEquals("Test1", it.next().getTitle());
        cmf.add(new CategoryItem("Test3"));
        assertThrows(IllegalStateException.class, () -> it.next());
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Case: remove method called before next.
     */
    @Test
    void testNextRemoveBeforeNext() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Test1"));
        Iterator<CategoryItem> it = cmf.iterator();
        assertThrows(IllegalStateException.class, () -> it.remove());
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Case: remove method called twice in a row.
     */
    @Test
    void testNextRemoveTwice() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Test1"));
        Iterator<CategoryItem> it = cmf.iterator();
        assertTrue(it.hasNext());
        assertEquals("Test1", it.next().getTitle());
        it.remove();
        assertThrows(IllegalStateException.class, () -> it.remove());
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Case: remove method called after next.
     */
    @Test
    void testNextRemoveAfterNext() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Test1"));
        cmf.add(new CategoryItem("Test2"));
        Iterator<CategoryItem> it = cmf.iterator();
        assertTrue(it.hasNext());
        assertEquals("Test1", it.next().getTitle());
        it.remove();
        assertTrue(it.hasNext());
        assertEquals("Test2", it.next().getTitle());
        assertFalse(it.hasNext());
        assertThrows(NullPointerException.class, () -> it.next());
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Case: remove method called after all elements have been iterated.
     */
    @Test
    void testNextRemoveAfterLast() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Test1"));
        Iterator<CategoryItem> it = cmf.iterator();
        assertTrue(it.hasNext());
        assertEquals("Test1", it.next().getTitle());
        it.remove();
        assertFalse(it.hasNext());
        assertThrows(NullPointerException.class, () -> it.next());
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Case: remove method called twice after all elements have been iterated.
     */
    @Test
    void testNextRemoveTwiceAfterLast() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Test1"));
        Iterator<CategoryItem> it = cmf.iterator();
        assertTrue(it.hasNext());
        assertEquals("Test1", it.next().getTitle());
        it.remove();
        assertFalse(it.hasNext());
        assertThrows(NullPointerException.class, () -> it.next());
        assertThrows(IllegalStateException.class, () -> it.remove());
    }

    /**
     * Test method for {@link CategoryMembersFull#next()}.
     * Case: remove method called after iterator has been exhausted.
     */
    @Test
    void testNextRemoveAfterExhausted() {
        CategoryMembersFull cmf = new CategoryMembersFull();
        cmf.add(new CategoryItem("Test1"));
        Iterator<CategoryItem> it = cmf.iterator();
        assertTrue(it.hasNext());
        assertEquals("Test1", it.next().getTitle());
        assertFalse(it.hasNext());
        assertThrows(NullPointerException.class, () -> it.next());
        assertThrows(IllegalStateException.class, () -> it.remove());
    }
}