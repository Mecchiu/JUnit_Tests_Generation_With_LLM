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
	 * Test method for {@link DefaultNoteListModel#DefaultNoteListModel()}.
	 */
    @Test
    public void testCreate() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertEquals("size()", 0, model.size());
	}
	
	/**
	 * Test method for {@link DefaultNoteListModel#add(AbstractNote)}.
	 */
    @Test
    public void testAdd() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertTrue("add", true);
        List<AbstractNote> list = new ArrayList<>();
        list.add(new Note("a"));
        list.add(new Note("b"));
        model.add(new NoteListDataModel.TextData(list));
        assertEquals("size()", 1, model.size());
        list.remove(0);
        assertEquals("size()", 0, model.size());
        assertFalse("add", model.add(new Note("a")));
	}
	
	/**
	 * Test method for {@link DefaultNoteListModel#add(AbstractNote)}.
	 */
    @Test
    public void testAddBack() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertTrue("add", true);
        List<AbstractNote> list = new ArrayList<>();
        list.add(new Note("a"));
        list.add(new Note("b"));
        model.add(new NoteListDataModel.TextData(list));
        assertEquals("size()", 1, model.size());
        list.remove(0);
        assertEquals("size()", 0, model.size());
        assertFalse("add", model.add(new Note("a")));
	}
	
	/**
	 * Test method for {@link DefaultNoteListModel#remove(AbstractNote)}.
	 */
    @Test
    public void testRemove() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertTrue("add", true);
        List<AbstractNote> list = new ArrayList<>();
        list.add(new Note("a"));
        list.add(new Note("b"));
        model.add(new NoteListDataModel.TextData(list));
        assertEquals("size()", 2, model.size());
        model.remove(new Note("a"));
        assertEquals("size()", 1, model.size());
        assertFalse("add", model.add(new Note("b")));
	}
	
	/**
	 * Test method for {@link DefaultNoteListModel#remove(AbstractNote)}.
	 */
    @Test
    public void testRemoveBack() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertTrue("add", true);
        List<AbstractNote> list = new ArrayList<>();
        list.add(new Note("a"));
        list.add(new Note("b"));
        model.add(new NoteListDataModel.TextData(list));
        assertEquals("size()", 2, model.size());
        model.remove(new Note("b"));
        assertEquals("size()", 1, model.size());
        assertFalse("add", model.add(new Note("a")));
	}
}