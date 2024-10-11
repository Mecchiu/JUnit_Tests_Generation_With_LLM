// DefaultNoteListModel_5Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {

	/**
	 * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote)}.
	 * @throws Exception 
	 */
	@Test
	void testIndexOf() throws Exception {
		Map<String, List<AbstractNote>> notes = new HashMap<>();
		
		
		// DefaultNoteModel_1_5.java (unused)
		AbstractNote noteUnused = new DefaultNoteModel_1_5(DEFAULT_NOTE).makeDefaultNote();
		
		noteUnused.setData("0123456789"); // Default "0123456789"
		notes.put(DEFAULT_NOTE_DATA, new ArrayList<>());// new ArrayList<>()); // Used in tests
		
		// DefaultNoteModel_2.java (unused)
		noteUnused.setData("3456789"); // Default "3456789"
		List<AbstractNote> notesUnused = notes.get(DEFAULT_NOTE);
		notesUnused.add(DEFAULT_NOTE);
		
		assertEquals(DEFAULT_LEN, notes.size());
		assertEquals(DEFAULT_LEN, notesUnused.size());
		
		// DefaultNoteModel_2.java
		noteUnused.setData("34567");
		List<AbstractNote> notesUnused2 = notes.get(DEFAULT_NOTE);
		
		assertEquals(0, notes.size());
		assertEquals(0, notesUnused.size());
		
		
		// DefaultNoteModel_4.java
		noteUnused.setData("0123456789");
		List<AbstractNote> notesUnused4 = notes.get(DEFAULT_NOTE);
		
		assertEquals(DEFAULT_LEN, notes.size());
		assertEquals(DEFAULT_LEN, notesUnused4.size());
		
		// DefaultNoteModel_4.java
		noteUnused2.add(noteUnused); // Unused notes have an index 0
		
		assertEquals(0, notes.size());
		assertEquals(DEFAULT_LEN, notesUnused4.size());
		
		// DefaultNoteModel_4.java
		noteUnused2.add(noteUnused); // Unused notes have an index 1
		
		assertEquals(DEFAULT_LEN + 1, notes.size());
		
		for (Map.Entry<String, List<AbstractNote>> entry : notes.entrySet()) {
			assertEquals(DEFAULT_LEN, entry.getKey().length());
			assertFalse(entry.getValue().isEmpty()); // Default note "0123456789" should be empty
			List<AbstractNote> notesInModel = entry.getValue();
			assertEquals(2, notesInModel.size());
			assertTrue(notesInModel.contains(DEFAULT_NOTE));
			assertTrue(notesInModel.contains(DEFAULT_WORD));
		}
		
	}
	
	/**
	 * Test class of {@link DefaultNoteListModel#get(String)}.
	 * @author AllenChue
	 */
	public static class DefaultNoteModel_5_8 extends DefaultNoteModel_7 implements NoteListDataListener {
		
		public DefaultNoteModel_5_8() {
		}
		
		
		/* (non-Javadoc)
		 * @see com.allenstudio.ir.core.plugins.NotelistDataListener#notificationOfNoteListDataEvent(javax.swing.event.Notification)
		 */
		@Override
		public void notificationOfNoteListDataEvent(NoteListDataEvent ne) {
			if (ne.type == NoteListDataEvent.Type.EVENT_CALLED_BY_PROPERTY || ne.type == NoteListDataEvent.Type.EVENT_CALLED_BY_PROPERTY_2) {
				throw new IllegalArgumentException("Called by the property list");
			}
			
			// Note that the default NoteListModel will not invoke a
			// notification of a new or changed NoteListDataEvent based on
			// this parameter.
		}
	}
}