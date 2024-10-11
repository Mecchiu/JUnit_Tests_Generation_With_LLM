// DefaultNoteListModel_2Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_2Test {
		
    @Test
    public void testElements() throws Exception {
        Collection<AbstractNoteListModel<AbstractNote>> c = new HashSet<>();
        for (int i = 20; i <= 20; i++) {
            AbstractNoteListModel<AbstractNote> list = new DefaultNoteListModel(i);
            c.add(list);
        }

        // test the return value of the enumeration.  This works OK
        assertEquals("size", 20, c.size());
        
        // Now remove the oldest list and verify no elements were removed.
        c.clear();
        
        list = new DefaultNoteListModel(20);
        assertFalse("remove list, size=1!", c.remove(list));
        
        list = new DefaultNoteListModel(10);
        
        assertTrue("list size", c.remove(list));
        assertFalse("list size", c.remove(list));
        
        list.clear();
        assertTrue("list size", c.remove(list));
    }

    @Test
    public void testRemove() throws Exception {
        AbstractNoteListModel<AbstractNote> list = new DefaultNoteListModel(20);
        list.add(null);
        Collection<AbstractNoteListModel<AbstractNote>> c = new ArrayList<>();
        assertFalse("List is empty", c.iterator().hasNext());
        list.remove(list.iterator().next());
        assertFalse("has next", c.iterator().hasNext());
    }

    /**
     * Test of fire event method, of class
     * com.allenstudio.ir.ui.DefaultNoteListModel.
     */
    @Test
    public void testFireEvent() {
        DefaultNoteListModel<AbstractNote> list = new DefaultNoteListModel(20);
        assertFalse("List is empty", list.iterator().hasNext());
        list.fireEvent(null, new NoteListDataEvent(0, 0, null, null));
        assertTrue("list size", list.iterator().hasNext());
        list.fireEvent(null, new NoteListDataEvent(1, 0, null, null));
        assertTrue("list size", list.iterator().hasNext());
        list.fireEvent(null, new NoteListDataEvent(10, 0, null, null));
        assertFalse("list size", list.iterator().hasNext());
        NoteListDataListener l1 = new NoteListDataListener();
        list.addListener((NoteListDataListener) l1);
        list.fireEvent(NoteListDataEvent.REMOVE_EVENT, null);
        assertFalse("list size", list.iterator().hasNext());
        list.fireEvent(null, new NoteListDataEvent(0, 0, null, null));
        assertTrue("list size", list.iterator().hasNext());
    }

    /**
     * Test of addNote method, of class
     * com.allenstudio.ir.ui.DefaultNoteListModel.
     */
    @Test
    public void testAddNote() throws Exception {
        DefaultNoteListModel<AbstractNote> list = new DefaultNoteListModel(20);
        
        // test add the new value to the list
        list.addNote(new Note.Note(0));
        list.addNote(new Note.Note(1));
        list.addNote(new Note.Note(2));
        list.addNote(new Note.Note(3));
        assertTrue(list.iterator().hasNext());
        System.out.println("list: " + list);
    }

    /**
     * Test of removeNotes method, of class
     * com.allenstudio.ir.ui.DefaultNoteListModel.
     */
    @Test
    public void testRemoveNotes() throws Exception {
        DefaultNoteListModel<AbstractNote> list = new DefaultNoteListModel(20);

        // test removing all the notes from the list
        list.clearNotes();
        list.removeNotes(list.iterator().next());
        assertFalse(list.iterator().hasNext());
        
        //test only removing from one list
        AbstractNote newNote = new Note.Note(2);
        list.addNote(newNote);
        newNote.setNote(2);
        list.removeNotes(1);
        assertTrue(list.iterator().hasNext());
        System.out.println("list: " + list);
    }

    /**
     * Test of addNote method, of class
     * com.allenstudio.ir.ui.DefaultNoteListModel.
     */
    @Test
    public void testRemoveNote() throws Exception {
        DefaultNoteListModel<AbstractNote> list = new DefaultNoteListModel(20);
        list.fireEvent(new NoteListDataEvent(0, 0, null, null));
        
        // test remove the note from the list in the correct index
        list.removeNote((AbstractNote)(list.iterator().next())
           .toString());
        assertFalse("list size", list.iterator().hasNext());
    }
    
}