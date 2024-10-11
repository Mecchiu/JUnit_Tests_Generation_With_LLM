// DefaultNoteListModel_7Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_7Test {
		
    private @org.junit.jupiter.api.Test void lastIndexOf(@SuppressWarnings("unused") AbstractNote expected) {
        final DefaultNoteListModel model = new DefaultNoteListModel();
        final AbstractNote note = null;
        assertFalse(model.lastIndexOf(note, -1) == -1);
        assertEquals(note, model.lastIndexOf(note, 0));
        assertTrue(model.lastIndexOf(note, 1) == null);
        assertTrue(model.lastIndexOf(note, 0) == 0);
        assertEquals(0, model.lastIndexOf(note));
    }
	
}