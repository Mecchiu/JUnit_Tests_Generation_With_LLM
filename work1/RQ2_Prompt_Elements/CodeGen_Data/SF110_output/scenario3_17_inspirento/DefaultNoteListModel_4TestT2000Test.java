// DefaultNoteListModel_4Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_4Test {

    /**
     * Empty private constructor to force the class construction.
     */
     private DefaultNoteListModel_4Test() {
    }

    @Test
    public void emptyDefaultNoteList_5Test() {
        String noteString =  "TBD", noteString2 = "TBD2";

		final DefaultNoteListModel listModel = new DefaultNoteListModel();

        listModel.add(new DefaultNote("NOTE"));
        listModel.add(new DefaultNote("NOTE"));

		final Collection resultCollection = listModel.get(0);

		assertEquals(3, resultCollection.size());    
        assertEquals(noteString, resultCollection.iterator().next());
        assertEquals(noteString2, resultCollection.iterator().next());
        assertFalse(listModel.isEmpty());
    }
}


