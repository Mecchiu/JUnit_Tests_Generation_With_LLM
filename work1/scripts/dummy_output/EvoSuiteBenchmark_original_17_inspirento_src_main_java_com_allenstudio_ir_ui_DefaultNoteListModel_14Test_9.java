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
		
	/** Test cases for the <code>remove</code> method. */
	@Test
	public void testRemove() {
        Set<AbstractNote> notes = new HashSet<>();
        notes.add(new DefaultNote("A note", "description", "author", "email", "author_name", true, false));
        DefaultNoteListModel model = new DefaultNoteListModel(notes);
        model.remove(0);
        assertTrue(!model.contains(notes.iterator().next()));
		for (int l = 0; l < 100; l++) {
			try {
				model.remove(l);
				throw new RuntimeException();
			} catch (CollectionSizeException cse) {
				// expected
			}
		}
	}

	@Test
	public void testRemoveFromListener() {
		Set<AbstractNote> notes = new HashSet<>();
		notes.add(new DefaultNote("A note", "description", "author", "email", "author_name", true, false));
		DefaultNoteListModel model = new DefaultNoteListModel(notes);
		ModelChangeListener listener = mock(ModelChangeListener.class);
		model.addChangeListener(listener);
		model.remove(0);
		verify(listener).fireNoteListDataChanged(eq(notes), anySet());
		verifyNoMoreInteractions(listener);
	}
}