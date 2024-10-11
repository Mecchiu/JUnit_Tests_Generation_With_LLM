// DefaultNoteListModel_7Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_7Test {
DefaultNoteListModel_7Test() {
        }
		@Test
    void testFindAllOfType_1arg() {
        AbstractNote elem = new AbstractNote();
		DefaultNoteListModel_7Test.LastNote n1 = new DefaultNoteListModel_7Test.LastNote(elem, 1);
		DefaultNoteListModel_7Test.LastNote n2 = new DefaultNoteListModel_7Test.LastNote(elem, 2);
		DefaultNoteListModel_7Test.LastNote n3 = new DefaultNoteListModel_7Test.LastNote(elem, 3);
        List<LastNote> l = new ArrayList<>();
		l.add(n1);
		l.add(n2);
		l.add(n3);
        Set<LastNote> s = new HashSet();
		for (LastNote n : l) {
             if (n!= n3) throw new AssertionError("Error found when a match to the object was found");
        }
        assertEquals(3, s.size());
        assertAllOfAreEqual(s,n1, n2);
        assertLastElementInList(l, n3);
        assertEquals(l.size(), n1.getDepth());
        assertEquals(l.size(), n2.getDepth());
        assertEquals(l.size(), n3.getDepth());
        assertAllOfAreEqual(l,n1);
        assertAllOfAreEqual(l,n2);
        assertAllOfAreEqual(l,n3);
                   }
     @Test
    void testLastIndexOfElementOfCollectionSearchForLastElement() {
        final int maxNbOfElements = 20;
        final List<Integer> nbElements = new ArrayList<>();
        for (int i = 0; i < 10; i++){
             nbElements.add(i);
        }
        final DefaultNoteListModel model = new DefaultNoteListModel.DefaultNoteListModelDelegate();
        Iterator<Integer> iter = nbElements.iterator();
        for (int i = nbElements.size() - 1; i >= 0; i--){
            model.lastIndexOfElementOfCollection(iter.next(), model.lastIndexOfElementOfCollection(iter.next(), i), i % maxNbOfElements);
        }
    }

    // DefaultNoteListModel_8Test.java
    public static class LastNote {
        String text;
        final int index;
        final AbstractNote note;

        /**
         * Creates a new <code>LastNote</code> object.
         */
        public LastNote() {
            this(null, -1);
        }

        /**
         * Creates a new <code>LastNote</code> object.
         */
        public LastNote(AbstractNote n, int index) {
            if (n == null) {
                text = null;
            } else {
                text = n.getBody().get(index);
            }
            this.index = index;
            note = n;
        }

        /**
         * Gets an array in the specified index.
         * @param index The index in the array
         * @return an array
         */
        public String[] getBody(int index) {
            String[] array = new String[index];
            if (text!= null) array[index - 1] = text;
            return array;
        }

        /**
         * Gets an array in the specified index, starting with the specified value.
         * @param index The index in the array
         * @param start The starting value
         * @return an array
         */
        public String[] getBody(int index, String start) {
            Arrays.fill(index, index + 1, Integer.MAX_VALUE, (char) -1);
            if (index >= start.length() - 1) return null;
            String tmp = start;
            if (tmp.charAt (0)!= (char) -1) tmp = tmp.substring (1);
            if (tmp.length() < index) return null;
            return new String[]{tmp};
        }
    }
}

class DefaultNoteListModel_7Test_2 {
    /**
     * Finds all of the objects in the specified list until <code>elem</code>.
     * First the given <code>elem</code> with the appropriate last-index first
     * position in the list is found and the contents of the list are passed
     * to the <code>delegate</code> object. Next, if necessary, the matching
     * <code>obj.first()</code> method is called on the found node recursively
     * up until the parent in the way provided by the value returned by
     * <code>obj.last()</code>.
     * The <code>delegate</code> is modified in place so that
     * <code>delegate</code> is passed on the event.
     * @param objects a list of objects to inspect
     * @param elem the object to match
     * @param delegate the delegator
     * @return a list of objects (if found) or <code>null</code>
     */
    public List<AbstractNote> findAllOfType(final List<AbstractNote> objects, AbstractNote elem, final UndoRedoDelegate delegate) {
        List<Object> l = new ArrayList<>();
        for (final AbstractNote obj : objects) {
            if (obj.getType().equals(elem.getType())) l.add(obj);
        }
        LinkedList<AbstractNote> list = new LinkedList<>();
        list.addAll(l);
        list.addLast(elem);
        return list;
    }
}
