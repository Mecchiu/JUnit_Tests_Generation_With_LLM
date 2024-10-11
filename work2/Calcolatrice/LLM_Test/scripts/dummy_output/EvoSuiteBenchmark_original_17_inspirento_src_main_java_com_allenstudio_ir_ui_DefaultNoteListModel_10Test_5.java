// DefaultNoteListModel_10Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastElement()} method.
*/
class DefaultNoteListModel_10Test {
		
	/**
	* Returns the last component of the list.
	* @return the last component of the list
	* @throws TimeoutException if no new Component is added to the list
	*/
    @Test
    public void test() throws TimeoutException {
        DefaultNoteListModel model = new DefaultNoteListModel();

        DefaultNote last = new Note_1();
        setNote(last);

        // Try to add a new note
	boolean hasAdded = model.replace(last, last);
	assertTrue(hasAdded);

	// Should be no longer empty
        assertEquals(1, model.size());

	// Add other notes
	final Set<Note> notesSet = setNotes(model);
	assertEquals(1, model.size());
	final Set<Note> otherNotesSet = setNotes(model);
	assertTrue(otherNotesSet.contains(last) == false);
	assertTrue(model.replace(last, last) == true);

	// Try to append another Note
	final Note note2 = new Note_2();
	setNote(note2);

	boolean otherAdded = model.replace(note2, note2);

	boolean anotherFound = model.replace(last, note2);
	assertFalse("OtherNote should not be appended yet", otherAdd);

	System.out.print("Appending"); 

	if (otherAdded == true) {
	  assertTrue("Both components of the model should not be at the index 0.",
	         hasAdded == false);
	}
	System.out.print("New");	  

	if (hasAdded == true) {
	  assertFalse("The new component should not be at the index 0.",
	         otherAdded == false);
	}

    }
	
    /** Returns the current set of components in the NoteListModel. */
    public Set<Note> setNotes(DefaultNoteListModel model) {
	return model.getNotes();
    }
}