// CategoryMembersFull_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.contentRep.CategoryItem;

/**
 * Test class of {@link CategoryMembersFull}.
 * It contains ten unit test cases for the {@link CategoryMembersFull#hasNext()} method.
 */
@Slf4j
@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
class CategoryMembersFull_1Test {

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: empty category
     */
    @Test
    void testHasNextEmpty() throws ActionException, ProcessException, JwbfException {
        // GIVEN
        CategoryMembersFull categoryMembersFull = new CategoryMembersFull();
        categoryMembersFull.setBot(new MediaWikiBot("/api.php"));
        categoryMembersFull.setTitle("EmptyCategory");

        // WHEN
        boolean hasNext = categoryMembersFull.hasNext();

        // THEN
        assertFalse(hasNext);
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: category with one item
     */
    @Test
    void testHasNextOneItem() throws ActionException, ProcessException, JwbfException {
        // GIVEN
        CategoryMembersFull categoryMembersFull = new CategoryMembersFull();
        categoryMembersFull.setBot(new MediaWikiBot("/api.php"));
        categoryMembersFull.setTitle("CategoryWithOneItem");

        // WHEN
        boolean hasNext = categoryMembersFull.hasNext();

        // THEN
        assertTrue(hasNext);
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: category with multiple items
     */
    @Test
    void testHasNextMultipleItems() throws ActionException, ProcessException, JwbfException {
        // GIVEN
        CategoryMembersFull categoryMembersFull = new CategoryMembersFull();
        categoryMembersFull.setBot(new MediaWikiBot("/api.php"));
        categoryMembersFull.setTitle("CategoryWithMultipleItems");

        // WHEN
        boolean hasNext = categoryMembersFull.hasNext();

        // THEN
        assertTrue(hasNext);
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: category with subcategories
     */
    @Test
    void testHasNextSubcategories() throws ActionException, ProcessException, JwbfException {
        // GIVEN
        CategoryMembersFull categoryMembersFull = new CategoryMembersFull();
        categoryMembersFull.setBot(new MediaWikiBot("/api.php"));
        categoryMembersFull.setTitle("CategoryWithSubcategories");

        // WHEN
        boolean hasNext = categoryMembersFull.hasNext();

        // THEN
        assertTrue(hasNext);
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: category with pages and subcategories
     */
    @Test
    void testHasNextPagesAndSubcategories() throws ActionException, ProcessException, JwbfException {
        // GIVEN
        CategoryMembersFull categoryMembersFull = new CategoryMembersFull();
        categoryMembersFull.setBot(new MediaWikiBot("/api.php"));
        categoryMembersFull.setTitle("CategoryWithPagesAndSubcategories");

        // WHEN
        boolean hasNext = categoryMembersFull.hasNext();

        // THEN
        assertTrue(hasNext);
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: category with hidden items
     */
    @Test
    void testHasNextHiddenItems() throws ActionException, ProcessException, JwbfException {
        // GIVEN
        CategoryMembersFull categoryMembersFull = new CategoryMembersFull();
        categoryMembersFull.setBot(new MediaWikiBot("/api.php"));
        categoryMembersFull.setTitle("CategoryWithHiddenItems");

        // WHEN
        boolean hasNext = categoryMembersFull.hasNext();

        // THEN
        assertTrue(hasNext);
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: category with redirect
     */
    @Test
    void testHasNextRedirect() throws ActionException, ProcessException, JwbfException {
        // GIVEN
        CategoryMembersFull categoryMembersFull = new CategoryMembersFull();
        categoryMembersFull.setBot(new MediaWikiBot("/api.php"));
        categoryMembersFull.setTitle("CategoryWithRedirect");

        // WHEN
        boolean hasNext = categoryMembersFull.hasNext();

        // THEN
        assertTrue(hasNext);
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: category with invalid title
     */
    @Test
    void testHasNextInvalidTitle() throws ActionException, ProcessException, JwbfException {
        // GIVEN
        CategoryMembersFull categoryMembersFull = new CategoryMembersFull();
        categoryMembersFull.setBot(new MediaWikiBot("/api.php"));
        categoryMembersFull.setTitle("InvalidCategoryTitle");

        // WHEN
        boolean hasNext = categoryMembersFull.hasNext();

        // THEN
        assertFalse(hasNext);
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: category with missing title
     */
    @Test
    void testHasNextMissingTitle() throws ActionException, ProcessException, JwbfException {
        // GIVEN
        CategoryMembersFull categoryMembersFull = new CategoryMembersFull();
        categoryMembersFull.setBot(new MediaWikiBot("/api.php"));
        categoryMembersFull.setTitle("MissingCategoryTitle");

        // WHEN
        boolean hasNext = categoryMembersFull.hasNext();

        // THEN
        assertFalse(hasNext);
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: category with invalid response
     */
    @Test
    void testHasNextInvalidResponse() throws ActionException, ProcessException, JwbfException {
        // GIVEN
        CategoryMembersFull categoryMembersFull = new CategoryMembersFull();
        categoryMembersFull.setBot(new MediaWikiBot("/api.php"));
        categoryMembersFull.setTitle("InvalidCategoryResponse");

        // WHEN
        boolean hasNext = categoryMembersFull.hasNext();

        // THEN
        assertFalse(hasNext);
    }

    /**
     * Test method for {@link CategoryMembersFull#hasNext()}.
     * Test case: category with exception
     */
    @Test
    void testHasNextException() throws ActionException, ProcessException, JwbfException {
        // GIVEN
        CategoryMembersFull categoryMembersFull = new CategoryMembersFull();
        categoryMembersFull.setBot(new MediaWikiBot("/api.php"));
        categoryMembersFull.setTitle("ExceptionCategory");

        // WHEN
        boolean hasNext = categoryMembersFull.hasNext();

        // THEN
        assertFalse(hasNext);
    }
}