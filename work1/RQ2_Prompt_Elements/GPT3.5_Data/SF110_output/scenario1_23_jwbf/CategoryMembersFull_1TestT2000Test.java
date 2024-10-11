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
     * Returns true if there are more {@link CategoryItem}s to iterate over.
     *
     * @return true if there are more {@link CategoryItem}s to iterate over
     * @throws JwbfException if a problem occurs while retrieving the next {@link CategoryItem}
     */
    public boolean hasNext() throws JwbfException {
        prepareCollection();
        return titleIterator.hasNext();
    }
}

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
* It contains ten unit test cases for the {@link CategoryMembersFull#hasNext()} method.
*/
class CategoryMembersFull_1Test {

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: empty collection.
     */
    @Test
    void testHasNextEmpty() throws JwbfException {
        CategoryMembersFull cmf = new CategoryMembersFull();
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: collection with one element.
     */
    @Test
    void testHasNextOneElement() throws JwbfException {
        CategoryMembersFull cmf = new CategoryMembersFull();
        Collection<String> titles = new ArrayList<>();
        titles.add("Element 1");
        cmf.setTitles(titles);
        assertTrue(cmf.hasNext());
        cmf.next();
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: collection with multiple elements.
     */
    @Test
    void testHasNextMultipleElements() throws JwbfException {
        CategoryMembersFull cmf = new CategoryMembersFull();
        Collection<String> titles = new ArrayList<>();
        titles.add("Element 1");
        titles.add("Element 2");
        titles.add("Element 3");
        cmf.setTitles(titles);
        assertTrue(cmf.hasNext());
        cmf.next();
        assertTrue(cmf.hasNext());
        cmf.next();
        assertTrue(cmf.hasNext());
        cmf.next();
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: collection with null element.
     */
    @Test
    void testHasNextNullElement() throws JwbfException {
        CategoryMembersFull cmf = new CategoryMembersFull();
        Collection<String> titles = new ArrayList<>();
        titles.add(null);
        cmf.setTitles(titles);
        assertTrue(cmf.hasNext());
        cmf.next();
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: collection with empty element.
     */
    @Test
    void testHasNextEmptyElement() throws JwbfException {
        CategoryMembersFull cmf = new CategoryMembersFull();
        Collection<String> titles = new ArrayList<>();
        titles.add("");
        cmf.setTitles(titles);
        assertTrue(cmf.hasNext());
        cmf.next();
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: collection with whitespace element.
     */
    @Test
    void testHasNextWhitespaceElement() throws JwbfException {
        CategoryMembersFull cmf = new CategoryMembersFull();
        Collection<String> titles = new ArrayList<>();
        titles.add(" ");
        cmf.setTitles(titles);
        assertTrue(cmf.hasNext());
        cmf.next();
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: collection with multiple null elements.
     */
    @Test
    void testHasNextMultipleNullElements() throws JwbfException {
        CategoryMembersFull cmf = new CategoryMembersFull();
        Collection<String> titles = new ArrayList<>();
        titles.add(null);
        titles.add(null);
        cmf.setTitles(titles);
        assertTrue(cmf.hasNext());
        cmf.next();
        assertTrue(cmf.hasNext());
        cmf.next();
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: collection with multiple empty elements.
     */
    @Test
    void testHasNextMultipleEmptyElements() throws JwbfException {
        CategoryMembersFull cmf = new CategoryMembersFull();
        Collection<String> titles = new ArrayList<>();
        titles.add("");
        titles.add("");
        cmf.setTitles(titles);
        assertTrue(cmf.hasNext());
        cmf.next();
        assertTrue(cmf.hasNext());
        cmf.next();
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: collection with multiple whitespace elements.
     */
    @Test
    void testHasNextMultipleWhitespaceElements() throws JwbfException {
        CategoryMembersFull cmf = new CategoryMembersFull();
        Collection<String> titles = new ArrayList<>();
        titles.add(" ");
        titles.add(" ");
        cmf.setTitles(titles);
        assertTrue(cmf.hasNext());
        cmf.next();
        assertTrue(cmf.hasNext());
        cmf.next();
        assertFalse(cmf.hasNext());
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: collection with mixed elements.
     */
    @Test
    void testHasNextMixedElements() throws JwbfException {
        CategoryMembersFull cmf = new CategoryMembersFull();
        Collection<String> titles = new ArrayList<>();
        titles.add("Element 1");
        titles.add(null);
        titles.add("");
        titles.add(" ");
        cmf.setTitles(titles);
        assertTrue(cmf.hasNext());
        cmf.next();
        assertTrue(cmf.hasNext());
        cmf.next();
        assertTrue(cmf.hasNext());
        cmf.next();
        assertTrue(cmf.hasNext());
        cmf.next();
        assertFalse(cmf.hasNext());
    }
}