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
    public void lastIndexOf_1() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        int i = 0;
        int j = 20;
        AbstractNote a = createDefaultNote("abcd", i, j, i+j);
        model.addNote(a.getInstance());
        HashSet<AbstractNote> result = model.getNotes();
        assertEquals(10, result.size());
    }

    @Test
    public void lastIndexOf_2() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        int i = 10;
        int j = 0;
        AbstractNote a = createDefaultNote("abc", i, j, i+j);
        model.addNote(a);
        HashSet<AbstractNote> result = model.getNotes();
        assertEquals(1, result.size());
    }

    @Test
    public void lastIndexOf_3() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        int i = 10;
        int j = 20;
        AbstractNote a = createDefaultNote("abc", i, j, i+j);
        model.addNote(a);
        model.addNote(a);
        HashSet<AbstractNote> result = model.getNotes();
        assertEquals(2, result.size());
    }

}