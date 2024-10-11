// DefaultNoteListModel_14Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {
Test
                DEFAULT_NAME = DefaultNoteListModel_14Test.class.getName() + "test";
    /**
     * Basic sanity checks.
     */
    @Test
    void basicSanityChecks() {
        AbstractNoteModel aom1    = new DefaultNoteListModel();
        Collection<AbstractNote> am1      = aom1.getAll();

        assertEquals(AbstractNoteModel.NOTES.size(), am1.size());
        for (AbstractNote an : AbstractNoteModel.NOTES) {
            assertTrue("Should be at least one existing element.", an.getNumber() > 0);
            assertTrue("Should not be deleted as it is referenced", am1.remove(an) == null);
        }

        aom1.setAll(Collections.singleton(AbstractNoteModel.NOTES.get(0)));

        assertEquals(
                CollectionUtilities.unorderedSet("1", "2",  "3",  "4"),
                aom1.getAll());
    }

    @Test
    void testRemove_GivenElementAt() {
        AbstractNoteModel aom1    = new DefaultNoteListModel();
        Collection<AbstractNote> am1      = aom1.getAll();

        AbstractNote an = new DefaultNote(2, 3,4,  "hello");
        am1.add(an);

        aom1.remove(an);

        assertFalse("Should not be updated as it became null.", an.getNumber() > 0);
    }

    @Test
    void testRemove_GivenIterator() {
        AbstractNoteModel aom1    = new DefaultNoteListModel();
        Collection<AbstractNote> am1      = aom1.getAll();

        Iterator<AbstractNote> anIt  = am1.iterator();
        Iterator<AbstractNote> anItEnd = am1.iterator();
        Collection<AbstractNote> amEnd   = new DefaultNoteListModel();


        while (anIt.hasNext()) {
            anIt.next();
        }

        anItEnd.next();

        aom1.remove(anIt);

        Map<AbstractNote, AbstractNote> em1  = new HashMap<AbstractNote, AbstractNote>();

        while (anItEnd.hasNext()) {
            anItEnd.next();
            em1.put(anIt.next().getNote(), anIt.next());
        }

        aendEqualsElements(new ArrayList<AbstractNote>(), em1);

        aom1.setAll(amEnd);

        aendEqualsElements(amEnd, em1);
    }

    @Test
    void testRemove_GivenCollection() {
        AbstractNoteModel aom1    = new DefaultNoteListModel();
        Collection<AbstractNote> am1      = aom1.getAll();

        Collection<AbstractNote> am = new ArrayList<AbstractNote>();

        am.add(new DefaultNote(1, 2, 3, "abcdef"));
        am.add(new DefaultNote(3, 4, 5, "hgkjl"));

        aom1.remove(am);

        Collection<AbstractNote> am1b = aom1.getAll();
        for (int i = 0; i < am.size(); i++) {
            if (am.get(i).getNumber()!= am1b.get(i).getNumber()) {
                fail(String.format("The remaining elements of a sequence should all have same numbers", am1b));
            }
        }
    }

    private void aendEqualsElements(List<AbstractNote> an, Set<AbstractNote> em) {
        for (int i = 0; i < an.size(); i++) {
            assertTrue(em.contains(an.get(i)));
        }
    }

    @Test
    void testGetAll_givenCollection() {
        AbstractNoteModel aom1    = new DefaultNoteListModel();
        Collection<AbstractNote> am1      = aom1.getAll();

        AbstractNote an = new DefaultNote(1, 2,3, "abcdef");
        am1.add(an);
        Collection<AbstractNote> amend = new ArrayList<AbstractNote>();

        amend.add(an);

        // aendEqualsElements(a, am);

        getAll(aom1.getAll(), amend);

        getAll(amend, am);
    }

    /**
     * Returns the number of elements currently in this <code>noteListModel</code>.
     * This version only tracks number of elements that exist in a <code>set</code>
     * element, does not keep track of existing elements.
     *
     * @param an an <code>AbstractNote</code> to check for existance
     *
     * @return the number of elements currently in this note list model
     */
    public Integer getAllSize(AbstractNote an) {
        return aom1.getAllSize(an);
    }

    public AbstractNote getFirstElement(AbstractNote eo) {
        return AbstractNoteModel.getFirstElement(aom1.getAll(), eo);
    }
}
