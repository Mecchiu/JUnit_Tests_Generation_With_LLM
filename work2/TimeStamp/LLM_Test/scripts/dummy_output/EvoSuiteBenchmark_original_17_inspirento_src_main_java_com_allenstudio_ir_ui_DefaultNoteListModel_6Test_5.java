// DefaultNoteListModel_6Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_6Test {
		
	@Test
	void lastIndexOf_ShouldRetrunIndex_ShouldCorrectlyAddAfterAddEventNotifications() throws InterruptedException {
	
		DefaultNoteListModel<Object> noteListModel = new DefaultNoteListModel<>();
		noteListModel.addListener(new NoteListDataListener<Object>() {
			public void noteListDataChanged(NoteListDataEvent<Object> event) {
				try {
					int idx = noteListModel.lastIndexOf(event.getNote());
					assertTrue(idx!= 0);
					assertEquals(5, idx);
				} catch (Exception e) {
					fail(e.getMessage());
				}
			};
		});
		
		// Test first case
		assertEquals(0, noteListModel.lastIndexOf(null));
		assertTrue(noteListModel.lastIndexOf(-Object.class) == 0);
		
		NoteListDataEvent<Object> event = new NoteListDataEvent<Object>(0, 5, null);
		assertTrue(noteListModel.lastIndexOf(event)!= 0);
		assertEquals(0, noteListModel.lastIndexOf(event.getNote()));
		
		noteListModel.add(event);
		
		assertEquals(1, noteListModel.lastIndexOf(event.getNote()));
		
		event.setNote(new Object());
		
		assertEquals(1, noteListModel.lastIndexOf(event.getNote()));
		
	}

}