// DefaultNoteListModel_13Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#get(int)} method.
*/
class DefaultNoteListModel_13Test {
		
    /**
     * Unit test for {@link DefaultNoteListModel#get(int)}.
     */
    @Test
	public void testNonEmptyClass() {
		DefaultNoteListModel model = new DefaultNoteListModel();

		model.addDataMapping(Model.class, AbstractNote.class);

		for (int i = 0; i < 10; i++) {
			assertFalse(model.hasItem(i));
		}

        assertEquals(model, model.get(0));
    }

    /**
     * Unit test for {@link DefaultNoteListModel#get(int)}.
     */
    @Test
	public void testNonEmptyArray_GetNonEmpty() {
		DefaultNoteListModel model = new DefaultNoteListModel();

		for (int i = 0; i < 10; i++) {
			assertNotNull(model.get(i));
		}
    }

}