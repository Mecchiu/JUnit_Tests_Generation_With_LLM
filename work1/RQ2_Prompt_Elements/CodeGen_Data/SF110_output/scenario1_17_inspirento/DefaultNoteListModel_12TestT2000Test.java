// DefaultNoteListModel_12Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModel_12Test {

    @Test
    void itShouldNotConstructWhenModelIsEmpty() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote[] anArray = null;
        model.addAll(new AbstractNote[]{
            new AbstractNote("id", "1_2_3_4"),
            new AbstractNote("id", "5_6_7_8"),
        });
        assertEquals(anArray, model.toArray());
        assertNull(model.getAll());
        assertNull(model.get(new Integer(0)));
        assertTrue(model.delete(new Integer(0)));
        assertFalse(model.contains(new Integer(0)));
        assertFalse(model.remove(new Integer(0)));
    }
    
    @Test
    void itShouldNotAddNullToIt() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote[] anArray = null;
        model.addAll(anArray.clone());
        assertEquals(anArray, model.toArray());
    }
    
    @Test
    void itShouldNotAddEmptyToIt() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote[] anArray = new AbstractNote[]{
            new AbstractNote("id", "1_2_3_4"),
        };
        assertEquals(8, model.size());        
        model.addAll(anArray);
        assertEquals(8, model.size());
        assertTrue(model.delete(9));
        assertFalse(model.contains(9));
        assertTrue(model.add("id", "1_2_3_5"));
        assertEquals(7, model.size());
        assertEquals(anArray.length + 1, model.size());
    }
    
    @Test
    void itShouldNotAddOtherModelException() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addAll(new AbstractNote[]{new AbstractNote("id", "1_2_3_4")});
        
		// the error has been detected by calling add().
        Exception e = null;
        try {
            model.addAll(new AbstractNote[]{new AbstractNote("id2", "4_1_2_3")});
        } catch (Exception ee) {
            e = ee;
        }
        assertNotNull(e);
		// add also throws exception if the other model has been modified concurrently.
        model = new DefaultNoteListModel();
        try {
            model.addAll(new AbstractNote[]{new AbstractNote("id2", "4_1_2_3")});
        } catch (Exception ee) {
            e = ee;
        }
        assertNull(e);
        assertFalse(model.delete(new Integer(0)));
        assertTrue(model.delete(model.get(new Integer(1))));
        assertTrue(model.delete(model.get(new Integer(0))));
    }
    
    @Test
    void itShouldNotCreateNullObjectsWhenInitialize() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        AbstractNote anArray[] = null;
        model.addAll(new MyArrayArray<>());
        assertEquals(anArray, model.toArray());
    }
    
    private final class MyArrayArray<T extends AbstractNote> extends AbstractNoteArray<T> {
        private boolean deleted = false;
        MyArrayArray(Collection<T> collection, List<T> items) {
            super(collection, items);
            assertFalse(deleted);
        }
        @Override
        public boolean remove(NoteListDataEvent e) {
            deleted = true;
            return super.remove(e);
        }
    }

    private final class MyNoteListDataListener implements NoteListDataListener<T> {
    
        public boolean isNoteListDataChanged() {
            return!deleted;
        }
        
        /**
         * It should be called when the event is about to be fired at {@link NoteListDataModel}
         * listener.
         * @param e An object representing a event that it is about to be fired.
         */
        @Override
        public void fireNoteListData(NoteListDataEvent e) {
            if (!isNoteListDataChanged()) {
                System.err.println("An incorrect case occured!");
            }
        }
    }
    
}
