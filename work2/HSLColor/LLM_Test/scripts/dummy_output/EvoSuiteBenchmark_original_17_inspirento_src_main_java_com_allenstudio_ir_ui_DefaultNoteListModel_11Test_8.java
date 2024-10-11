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
     * @throws Exception in case of error.
     */
    @Test
    public void testRemoveElement() throws Exception {
        // No test case
    }

    /**
     * @throws Exception in case of error.
     */
    @Test
    public void testRemoveElementNotFound() throws Exception {
        NoteListModel listModel = new DefaultNoteListModel();
        assertNotExists(listModel, "no-nest");
        
        AbstractNote note = new DefaultNote();
        assertNotExists(listModel, note);
        // add the note
        assertTrue(listModel.addElement(note));
        assertNotExists(listModel, note);
        
        // remove the note
        removeElement(note);
        assertNotExists(listModel, note);
        
        // check the default list model after the remove
        AbstractNote notExists = listModel.getElementAt(0);
        assertNull(notExists);
    }

    /**
     * @throws Exception in case of error.
     */
    @Test
    public void testRemoveAllEntries() throws Exception {
        // No test case
    }

    /**
     * @throws Exception in case of error.
     */
    @Test
    public void testGetSize() throws Exception {
        // No test case
    }
}