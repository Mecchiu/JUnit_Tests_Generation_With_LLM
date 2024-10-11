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
		
    private class TestListModel {

        ArrayList<AbstractNote> nodes = new ArrayList<>();


        public void add(AbstractNote note) {
            nodes.add(note);
        }


        public AbstractNote getItem(int index) {
            return nodes.get(index);
        }

        public int getSize() {
            return nodes.size();
        }

    }
    
    @Test
    public void testAdd() {
        
        // Create an empty list model with one item
        DefaultListModel model = new DefaultListModel();
        DefaultListModel_14Test.TestListModel tm = new DefaultListModel_14Test.TestListModel();
        tm.add(ModelTest.newNote(ModelTest.TEXT));
        assertEquals(0, tm.getSize());
        
        // Add new list model and check the size
        tm = new DefaultListModel_14Test.TestListModel();
        tm.add(ModelTest.newNote(ModelTest.TEXT));
        assertEquals(1, tm.getSize());
        
        try {
            tm.getItem(1000);
            return;
        } catch(IndexOutOfBoundsException e){
            return;
        }
        
    }
    
    @Test
    public void testRemove() {
        
        // Create the list with three elements
        DefaultListModel model = new DefaultListModel();
        DefaultListModel_14Test.TestListModel tm = new DefaultListModel_14Test.TestListModel();
        tm.add(ModelTest.newNote(ModelTest.TEXT));
        tm.add(ModelTest.newNote(ModelTest.TEXT));
        tm.add(ModelTest.newNote(ModelTest.TEXT));
        
        // Add in the new array list elements
        model.add(tm);
        
        // Remove the first element
        tm.remove(0);
        assertEquals(2, model.size());
        
        // Add a new element again
        tm.add(ModelTest.newNote(ModelTest.TEXT));
        assertEquals(3, model.size());
        
        // Remove the last added element
        tm.remove(tm.getSize() - 1);
        assertEquals(2, model.size());
        
        // Add the two removed elements
        tm.add(ModelTest.newNote(ModelTest.TEXT));
        tm.add(ModelTest.newNote(ModelTest.TEXT));
        
        // Add the empty list again
        model.add(tm);
        assertEquals(2, model.size());
        
        tm.add(new Note(ModelTest.TEXT));
        
        // Add a null list as well
        try {
            model.add(tm);
            return;
        } catch(NullPointerException e){
            assertEquals(1, tm.size());
            return;
        }
        
        
    }
}