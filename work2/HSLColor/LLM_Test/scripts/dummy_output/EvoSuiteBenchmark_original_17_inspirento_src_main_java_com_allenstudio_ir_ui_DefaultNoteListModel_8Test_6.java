// DefaultNoteListModel_8Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elementAt(int)} method.
*/
class DefaultNoteListModel_8Test {
		
    @javax.annotation.ParametersAreNonnullByDefault
    @java.beans.ConstructorProperties({"listModel"})
    public DefaultNoteListModel(NoteListModel listModel) {
        assertNotNull(listModel);
    }

    
    //Test Methods

    @Test
    void testNoNote() {
        final DefaultNoteListModel listModel = new DefaultNoteListModel(null);
        checkFalse(listModel.contains(new Note()));
        assertFalse(listModel.isEmpty());
    }

    @Test
    void testOneItem() {
        final DefaultNoteListModel listModel = new DefaultNoteListModel(null);
        final List<AbstractNote> list = Collections.singletonList(new Note());
        assertTrue(listModel.contains(list.get(0)));
        assertFalse(listModel.contains(new Note()));
        assertTrue(list.isEmpty());
    }

    @Test
    void testMultiItem() {
        final DefaultNoteListModel listModel = new DefaultNoteListModel(null);
        final List<AbstractNote> list = new ArrayList<AbstractNote>();
        list.add(new Note());
        list.add(new Note());
        assertTrue(listModel.contains(new Note()));
        assertTrue(listModel.contains(new Note()));
        assertTrue(listModel.contains(new Note()));
        assertFalse(listModel.contains(new Note()));
        assertTrue(listModel.isEmpty());
    }

    @Test
    void testRemoveAt() {
        final DefaultNoteListModel listModel = new DefaultNoteListModel(null);
        final List<AbstractNote> list = new ArrayList<AbstractNote>();
        list.add(new Note());
        listModel.add(list);
        assertTrue(listModel.contains(new Note()));
        assertTrue(listModel.contains(new Note()));
        assertTrue(listModel.contains(new Note()));
        assertFalse(listModel.contains(new Note()));
        assertTrue(list.isEmpty());
        listModel.remove(1);
        listModel.remove(1);
        listModel.remove(1);
        assertTrue(listModel.contains(new Note()));
        listModel.add(new Note().setNoteId("XXX"));
        listModel.add(new Note().setNoteId("YYY"));
        listModel.add(new Note());
        list.add(new Note());
        assertFalse(listModel.contains(new Note()));
        assertTrue(listModel.contains(new Note()));
        assertTrue(listModel.contains(new Note()));
        assertFalse(listModel.contains(new Note()));
        assertTrue(list.isEmpty());
    }
}