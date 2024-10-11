// DefaultNoteListModel_3Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#contains(AbstractNote)} method.
*/
class DefaultNoteListModel_3Test {
		
    @Test
    public void testFindByModel() {
        AbstractNote abstractNote = new AbstractNote();
        AbstractNote abstractNotFound = new AbstractNote();
        AbstractNote newNote = new AbstractNote();
        List list = new LinkedList();
        assertNotNull("getList() returned a null list", list);
        list = new ArrayList();
        noteListModel = new DefaultNoteListModel();
        
        noteListModel.removeAll();
        noteListModel.add(abstractNote);
        noteListModel.add(abstractNotFound);
        
        NoteListModelListener notifyListener = new NoteListModelListener();
        
        // The AbstractNote should be removed from the list
        noteListModel.add(newNote);
        noteListModel.setContents(list);
        assertEquals("getList() returns the List list",list,list);
        assertTrue("removeAll() method return true",notifyListener.removeOne(null, abstractNote));
        assertEquals("the AbstractNote can be found",abstractNotFound,noteListModel.contains(notifyListener));
    }
	
}