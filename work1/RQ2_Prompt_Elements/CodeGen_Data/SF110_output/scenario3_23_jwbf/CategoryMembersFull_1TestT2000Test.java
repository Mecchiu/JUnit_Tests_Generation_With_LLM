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
     * Test {@link CategoryMembersFull#hasNext()} method for case number 1.
     */
    @Test
    void testNextNonMember() {
        assertFalse(CategoryMembersFull.hasNext());
    }

    /**
     * Test {@link CategoryMembersFull#hasNext()} method for cases of cases 2-4.
     */
    @Test
    void testNextAndHasNextWithOnlyNonMember() {
        final MediaWikiBot me = new MediaWikiBot("<mediawiki><edit?id=Foo>" +
                "<category_id>Foo</category_id>" +
                "<title>Foo</title>" +
                "<title>Bar</title>" +
                "</edit></mediawiki>");
        assertFalse(me.hasNext());
    }

    /**
     * Test {@link CategoryMembersFuture#hasNext()} method for case number 1.
     */
    @Test
    public void testNextHasNext() {
        final MediaWikiBot result = new MediaWikiBot("<mediawiki><edit?id=Foo>" +
                "<title>Foo</title>" +
                "</edit><category_id>Foo</category_id>" +
                "</mediawiki>");

        final MediaWikiFuture mf = result.get("Foo", MW1_11);

        final MediaWikiBot me = new MediaWikiBot("<mediawiki><edit?id=Foo>" +
                "<title>Foo</title>" +
                "</edit>" +
                "");

        try {
            me.hasNext().get("Foo");
            fail("should fail");
        } catch (ProcessException e) {
            checkException(e, ProcessException.class, CategoryMembersFuture.class);
        }
        assertTrue(mf == me.call().hasNext().call());
    }

    /**
     * Test {@link CategoryMembersFuture#call()} for case number 1,
     * but the {@link CategoryMembersFuture#hasNext()} method returns a
     * boolean and the method returns false
     */
    @Test
    public void testCall1() throws JwbfException {
        assertFalse(mw.call().hasNext().call());
    }

    /**
     * Test {@link CategoryMembersFuture#call()} for case number 2,
     * but the {@link CategoryMembersFuture#hasNext()} method returns a
     * boolean and the method returns true
     */
    @Test
    public void testCall2() throws JwbfException {
        final boolean result = new MediaWikiTask(mw).hasNext().call().hasNext().call();
        assertTrue(result);
    }

    /**
     * Test {@link CategoryMembersFuture#call()} for cases 2-4.
     * In case 2, both members are returned. In case 3, both members are returned.
     */
    @Test
    public void testCall3() throws JwbfException {
        final Collection<Collection<CategoryItem>> result = new MediaWikiTask(mw).call()
               .call();
        final Collection<CategoryItem> members = result.iterator().next();
        assertNotNull(members);
        assertEquals(new ArrayList<>(), members);
    }

    /**
     * Test that calling the iterator throws an expection for cases 5-6,
     * in which the {@link CategoryMembersFuture#hasNext()} has returned false.
     */
    @Test
    public void testRetryFalse() throws JwbfException {
        final MediaWikiFuture mf = new MediaWikiFuture(mw);

        final CategoryMembersFuture mfNoMember = mf.call();

        assertFalse(mfNoMember.hasNext().call());
    }

    /**
     * Test that calling the iterator throws an expection for cases 7 to 11,
     * in which the {@link MediaWikiFuture#get()} has returned false.
     */
    @Test
    public void testRetryTrue() throws JwbfException {
        final MediaWikiFuture mf = new MediaWikiFuture(mw);

        final MediaWikiFuture mfNoMember = mf.call();
        assertFalse(mf.call().get().call());
    }

    /**
     * Test that calling the iterator throws an exception for cases 14-15.
     */
    @Test(expected = ActionException.class)
    @Slf4j
    public void testRetryThrowsException() throws JwbfException {