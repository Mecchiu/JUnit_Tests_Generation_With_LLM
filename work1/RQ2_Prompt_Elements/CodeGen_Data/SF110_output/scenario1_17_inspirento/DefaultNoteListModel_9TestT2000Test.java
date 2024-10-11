// DefaultNoteListModel_9Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#firstElement()} method.
*/
class DefaultNoteListModel_9Test {

	/**
	 * This test case creates and executes a simple {@link AbstractNote} and then checks its
	 * presence in the list of note data.
	 */
	@Test
	void testModelBehaviour() {
		final AbstractNote firstElement_a = delegate.firstElement();
		assertNotNull(firstElement_a);
		
		assertTrue(firstElement_a.isComplete());
		assertTrue(firstElement_a.isCompleteText());
		
		assertTrue(firstElement_a.isCompleteText()); // If text is not complete then the node should've been removed
	}
	
	
	/**
	 * This test case creates and executes the following two simple {@link AbstractNote} instances:
	 *
	 * {@link DefaultNoteListModel_9Test#createNote(String)}
	 * 
	 * First Note will contain the complete text "text". This note will be empty if the complete text is invalid.
	 * 
	 * Second Note contains the incomplete text "incorrect" if the complete text is invalid.
	 */
	public Iterable<AbstractNote> testCreation() {
		// Create first element
		final AbstractNote firstElement_1 = new DefaultNote(null, "text").addTo(this.delegate.firstElement());
		assertNotNull(firstElement_1);
				
		// Create second element
		final String incorrect = "incorrect";
		final AbstractNote secondElement_1 = new DefaultNote(firstElement_1, incorrect).addTo(this.delegate.firstElement());
		assertNotNull(secondElement_1);

		// Insert second element into list of note data
		assertTrue(this.delegate.insert(secondElement_1, this.firstElement()););
		
		return new AbstractNote[] { lastElement(), secondElement_1 };
	}
}
