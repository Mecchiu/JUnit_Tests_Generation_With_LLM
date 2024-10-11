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
		
// default notes
    private static final String[] FOO = new String[]{"bar"};
    private static final String[] NOTE1_REST = new String[]{"boo"};
    private static final String[] NOTE2_REST = new String[]{"boo: bar"};


    private static final Set<Object> NO_ELEMENTS = Collections.emptySet();
    
    /**
     * @throws java.lang.Exception if the test fails to run correctly
     */
    @Test
    public void testAddAll() throws Exception {

        /*
         *  1. Make a list containing 10 items
         */

        // Create an empty set
//        Set<NoteListElementModel> notesListModel = createEmptySet();
        Set<NoteListModel> notesListModel = Collections.emptySet();
        
        // Set up listener
        ListDataListener eventListener = new ListDataListener();
       
        // Register listener
        NotesDataEventAdapter eventAdapter = new NotesDataEventAdapter(eventListener, 0);

        DefaultNoteListEventAdapter noteListAdapter = new DefaultNoteListEventAdapter(eventAdapter);
        DefaultNoteListModelAdapter noteListModelAdapter = new DefaultNoteListModelAdapter(noteListAdapter, 0);
        
        noteListModelAdapter.addAll(NO_ELEMENTS);

    }

    /**
     * Test case for {@link DefaultNoteListModel#remove(String)} method.
     */

    // [1] Create an empty set containing 10 items
    @Test 
    public void testRemoveAll()  {
        // Set up listener
        NotesListDataListener eventListener = new NotesListDataListener();
    	NotesDataEventAdapter eventAdapter = new NotesDataEventAdapter(eventListener, 1);
        DefaultNoteListModelAdapter noteListAdapter = new DefaultNoteListModelAdapter(eventAdapter);

        // Default note list model:
        noteListAdapter.addAll(FooListModel_14Test.FOO);

     // [1] Register listener

        DefaultNoteListModelAdapter noteListModelAdapter = new DefaultNoteListModelAdapter(noteListAdapter);
     
        // Remove all
        noteListModelAdapter.removeAll();

        // Check result
        assertFalse("DefaultNoteListModel#removeAll()", noteListAdapter.isChanged());

    }

    /**
     * Test case for {@link DefaultNoteListModel#remove(Object)} method.
     */

    // [1] Create an empty set containing 10 items
    @Test
    public void testRemoveAllWithObject()  {
        // Set up listener
        NotesListDataListener eventListener = new NotesListDataListener();
    	NotesDataEventAdapter eventAdapter = new NotesDataEventAdapter(eventListener, 1);
        DefaultNoteListModelAdapter noteListAdapter = new DefaultNoteListModelAdapter(eventAdapter);

        // Default note list model:
        noteListAdapter.addAll(FOO);

     // [1] Register listener

        DefaultNoteListModelAdapter noteListModelAdapter = new DefaultNoteListModelAdapter(noteListAdapter);
     
        // Remove all
        noteListModelAdapter.removeAll();

        // Check result
        assertTrue("DefaultNoteListModel#removeAll()", noteListAdapter.isChanged());
    }

    /**
     * Test case for {@link DefaultNoteListModel#add(String)} method.
     */

    // [1] Create an empty set containing 10 items
    @Test
    public void testAddAllWithString()  {
        Set<String> noElements = Collections.emptySet();
    	notesListModel = createEmptySet();
    	DefaultNoteListModelAdapter noteListAdapter = new DefaultNoteListModelAdapter(notesListModel, 0);

    	// Remove all
        noteListAdapter.addAll(noElements);

        // Check set
        assertEquals("DefaultNoteListModel#add(String)", NO_ELEMENTS, noteListAdapter.getElementByTagName("FOO"));

    }

    /**
     * Register listener for the test data event and check results.
     */
    private static Set<Object> createSet(){
        Set<Object> noElements = Collections.emptySet();
        DefaultNoteListDataModel noteListModel = new DefaultNoteListModelAdapter(createEmptySet());
        DefaultNoteListModelAdapter noteListModelAdapter = new DefaultNoteListModelAdapter(noteListModel);
        DefaultNoteListModelAdapter noteListAdapter = new DefaultNoteListModelAdapter(noteListModelAdapter, 1);
        DefaultNoteListModelAdapter noteListModelAdapter1 = new DefaultNoteListModelAdapter(noteListModelAdapter);
        DefaultNoteListModelAdapter noteListModelAdapter2 = new DefaultNoteListModelAdapter(noteListModelAdapter);
        notesListModel = new DefaultNoteListModelAdapter(createSet());
        notesListModel.addAll(FooListModel_14Test.FOO);
        return noteListModelAdapter1.removeAll();
    };

}