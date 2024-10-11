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
		
	/**
	* Defines several test cases for the {@link DefaultNoteListModel#contains(AbstractNote)} method.
	*/
    @Test
    public void testContains() {
        Collection<AbstractNote> collection = new ArrayList<>();
        collection.add(new DefaultNote("Test Name"));
        collection.add(new DefaultNote("Test Description"));
		
        assertTrue(collection.contains(new DefaultNote("Test Name 0")));
        assertTrue(collection.contains(new DefaultNote("Test Description 1")));
        assertTrue(collection.contains(new DefaultNote("Test Description 2")));
        
        assertFalse(collection.contains(new DefaultNote("Test Name 0")));
        assertFalse(collection.contains(new DefaultNote("Test Description 3")));
        assertFalse(collection.contains(new DefaultNote("Test Description 4")));
    }
    
	/**
	* Defines several test cases for the {@link DefaultNoteListModel#contains(AbstractNote)} method.
	*/
    @Test
    public void testContains_2List() {
        Collection<AbstractNote> collection = new LinkedList<>();
        collection.add(new DefaultNote("Test Name"));
        collection.add(new DefaultNote("Test Description"));
        assertTrue(collection.contains(new DefaultNote("Test Name 0")));
        assertTrue(collection.contains(new DefaultNote("Test Description 1")));
        
        assertFalse(collection.contains(new DefaultNote("Test Name 0")));
        assertFalse(collection.contains(new DefaultNote("Test Description 3")));
        assertFalse(collection.contains(new DefaultNote("Test Description 4")));
    }
	
	/**
	* Defines several test cases for the {@link DefaultNoteListModel#iterateAll(AbstractNote)} method.
	*/
    @Test
    public void testIteratorAll() {
        int i = 0;
    	while(collection.iterator().hasNext()) {
    		assertTrue(collection.contains(collection.iterator().next()));
    		++i;
	    }
    	assertEquals(collection.size(), i);

        assertFails(collection, "iterator() that returns a ListIterator is not stable");
        
        iterateAll(collection);
        assertFails(collection, "iterator() that returns a ListIterator from the List can't");
    }
	
	/**
	 * Iterate all methods of {@link NoteListDataListener}.
	 */
	private void iterateAll(NoteListDataListener<AbstractNote> collection) {

        collection.addDataListener(new NoteListDataListener<>() {
			
			@Override
			public void noteAdded(NoteListDataEvent<AbstractNote> event) {
				
			}

			@Override
			public void noteRemoved(NoteListDataEvent<AbstractNote> event) {
				
			}
		});
		
		iterateAll(collection.iterateAll(collection.getFirstItem()));
		
		collection.removeDataListener(collection);
	}
}