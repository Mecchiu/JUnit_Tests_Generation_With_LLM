// DefaultNoteListModel_8Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elementAt(int)} method.
*/
class DefaultNoteListModel_8Test {
		
	/** A note to simulate */
    private AbstractNote someNote = null;
    
    /** The model to use */
    private DefaultNoteListModel listener;
    
    /** Adds an AbstractNote at testing time to trigger construction*/
    public void add(AbstractNote note) {
        someNote = note;
    }
    
    /** Gets the total number of elements in the model */
    protected int getSize() {
        return listener.getSize();
    }
    
    /** Adds a new note */
    public void addNewNote(AbstractNote note) {
        listener.addNewNote(note);
    }
    
    /** Remove a given note */
    public void remove(AbstractNote note) {
        listener.remove(note);
    }
    
    /** Test of containsElement() method, of class DefaultNoteListModel. */
    @Test
    public void testContainsElement() {
        assertNotNull("The listener should not be null", listener);
        
        // Test case 1: Element should exist.
        AbstractNote old = someNote;
        
        // Adding an element.
        listener.addNewNote(old);
        
        assertTrue("There should be at least one element", someNote!= null);
        
        // Removing an element
        listener.remove(old);
        
        assertTrue("There should be no more than one element", someNote == null);
    }
    
    @Test
    public void testGetElementAt() {
        // Test case 1
        AbstractNote old = someNote;
        
        Hashtable table = new Hashtable();
        Arraytable<AbstractNote> arraytable = new Arraytable(table);
        
        // Adding elements, this will make them visible
        table.put(old, old);
        
        // Test case 1: getting an element at the beginning
        String key = "First";
        AbstractNote newOne = newNoteOne(key);
        arraytable.put(newOne, key);
        
        Hashtable tableAfter = (Hashtable)table.clone();
        
        // Test case 3.
        assertEquals("Should be same element", old, newOne);
        
        // Now testing adding elements in the middle
        // this test will show all the other elements not being in the table,
        // but only the ones in the table,
        int i = 7;
        Arraytable<AbstractNote> newArrayTABLE = new Arraytable(table);
        newArrayTABLE.put(old, newOne);
        Hashtable newTable = new Arraytable(newArrayTABLE);
        newTable.put(old, newOne);
        
        assertEquals("Should have both elements", arraytable.size(), table.size());
        assertFalse("There should be no elements after adding elements", arraytable.contains(old));
        
        assertEquals("The value should be same", old, ((AbstractNote)tableAfter.get(key)).getKey());
        assertFalse("There should be no more elements", arraytable.get(key).getNote() == null);
        
        assertEquals("The value should be same", newOne, ((AbstractNote)tableAfter.get(key)).getNote());
        assertTrue("There should be at least two more elements", arraytable.get(key).getNote() instanceof AbstractNote);
        assertFalse("There should be no more than one additional element", arraytable.areAdditionalElementsMoreThanOne());
        
        // Test case 2
        newOne = arraytable.remove(old);
        
        // This will make all the other keys equal
        assertEquals("Should be the second element", old, newOne);
        
        // Adding elements again, this will make everything equal
        old = arraytable.get(key);
        tableAfter.put(old, old);
        
        // This will make the following table equal to the original one
        tableAfter = arraytable;
        
        // This will make the following key equals to the original key
        newArrayTABLE = newArrayTABLE;
        
        // Test case 4.
        assertFalse("There should be no more than one elements", arraytable.get(key).getNote() instanceof AbstractNote);
        assertTrue("There should be at least two more elements", arraytable.areAdditionalElementsMoreThanOne());
        assertEquals("Should have the last element", old, arraytable
                   .remove(arraytable.remove(old)));
        
        assertEquals("Should be equal", newOne, arraytable.remove(newOne));
        assertEquals("Should be equal", arraytable.remove(newOne), newOne);
        
        assertFalse("There should be no more than one elements", arraytable
                   .remove(arraytable.remove(old)));
    }
    
    /**
     * Default list data listener
     * 
     * @author Allen Chiu
     */
    private class TestDataListener implements NoteListDataListener {
        private Hashtable<String, AbstractHtmlElement> data = new Hashtable<String, AbstractHtmlElement>();
        
        public void dataAdded(NoteListDataEvent t) {
//            AbstractHtmlElement current = null;
        };

//        public void dataRemoved(NoteListDataEvent t) {
//            if (t.getSource() instanceof AbstractHtmlElement) {
//                current = (AbstractHtmlElement)t.getSource();
//            }
//        }
        
        public void dataUpdated() {
//            for (Iterator iter = data.keySet().iterator(); iter.hasNext(); ) {
//                String ch = (String)iter.next();
//                System.out.println(ch + " = " + (AbstractHtmlElement)data.get(ch));
//            }
        }
        
        public void dataSet(final String key, final String tag, final String value) {
            data.put(key, new HtmlElement(tag, value));
        }
    }
    
    private AbstractNote newNoteOne(String name) {
        return new Note(name);
    }

}