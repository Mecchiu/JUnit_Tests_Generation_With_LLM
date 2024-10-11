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
// Class under test

    /**
    * Test method for {@link DefaultNoteListModel#indexOf(AbstractNote)}.
    */
    @Test
    public void testIndexOf() {
        boolean bTrue = true;
        assertTrue(bTrue);
        AbstractNote aNote = null;
        assertEquals(-1, DefaultNoteListModel.indexOf(aNote));
        Object bNoteObject = aNote;
        assertEquals(-1, DefaultNoteListModel.indexOf(bNoteObject));
        bNoteObject = new AbstractNote();
        assertEquals(0, DefaultNoteListModel.indexOf(bNoteObject));
        assertEquals(1, DefaultNoteListModel.indexOf(bNoteObject));
        bNoteObject = null;
        assertTrue(DefaultNoteListModel.indexOf(bNoteObject) >= 0);
        bNoteObject = aNote;
        assertTrue(DefaultNoteListModel.indexOf(bNoteObject) >= 0);
        bNoteObject = aNote;
        assertTrue(DefaultNoteListModel.indexOf(bNoteObject) >= 0);
    }
    
}
// DefaultNoteListModel_4Test.java