// DefaultNoteListModel_11Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModel_11Test {
		/**
		* Tests that this class doesn't crash if not called.
		*/
    @Test
    void notcrash() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addNote(new Note("Title", "Foo", "1", "Title", "Title"));
        model.addNote(new Note("Title", "Foo", "1", "Title", "Title"));
        assertTrue("Not crash: empty", false);
    }

    /**
     * Tests that the removeElement() method rejects null components as there are at least
     * one component with no notes registered with this model.
     */
    @Test
    void removeWithNull() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addNote(new Note("Title", "Foo", "1", "Title", "Title"));
        assertEquals("No notes removed: ", 1, model.removeElement(java.sql.Date.valueOf("2009-06-06")).size()); // 1 element
        assertEquals("No notes removed: ", 0, model.removeElement(java.sql.Date.valueOf("2009-06-06")).size()); // 1 element
        assertEquals("No notes removed:", 0, model.removeElement(null).size());
    }

    /**
     * Tests that {@link DefaultNoteListModel#removeElement(AbstractNote)} rejects null objects as
     * there are at least one component with no notes registered with this model.
     */
    @Test
    public void removeWithNull_1() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertEquals("Size of the vector returned: ", 0, model.removeElement(java.sql.Date.valueOf("2009-06-06")).size()); // 1 element
        assertEquals("Size of the vector returned: ", 0, model.removeElement(null).size()); // 1 element
    }

    /**
     * Tests creating, querying, deleting and re-adding the element using the removeElement() method.
     */
    @Test
    void removeElement_2() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertEquals("No notes added: ", 0, model.getNotes().size());
        model.addNote(new Note("Title", "Foo", "1", "Title", "Title"));
        model.addNote(new Note("Not Modified", "Foo", "1", "Title", "Not Modified"));
        AbstractNote element = model.removeElement(new Note("Not Modified", "Foo", "1", "Title", "Not Modified"));
        assertEquals("Removed note not added: ", 1, model.getNotes().size());
        assertEquals("Not added: ", 0, model.getNotes().indexOf(element));
        assertEquals("Removed: ", "Not Modified", element.getTitle());
        assertNotNull("Added note not null: ", element);
        assertEquals("No more notes: ", 0, model.removeElement(new Note("Not Modified", "Foo", "1", "Title", "Not Modified"))); // 1 element
        assertEquals("No more notes: ", 1, model.removeElement(new Note("Not Modified", "Foo", "1", "Title", "Not Modified"))); // 1 element
        assertEquals("No more notes: ", 0, model.removeElement(new Note("Not Modified", "Foo", "1", "Title", "Not Modified"))); // 1 element
        assertEquals("No more notes: ", 0, model.removeElement(new Note("Not Modified", "Foo", "1", "Title", "Not Modified"))); // 1 element
    }
    /**
     * Create the model.
     */
    public static void main(String[] args) {
        System.out.println("Test of DefaultNoteListModel (with a test case not tested at this time yet)");
    }
}