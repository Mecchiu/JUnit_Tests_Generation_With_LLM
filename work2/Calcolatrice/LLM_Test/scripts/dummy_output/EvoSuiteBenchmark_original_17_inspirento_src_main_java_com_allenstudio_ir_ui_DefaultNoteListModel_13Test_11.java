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
		static final int DEFAULT = 0;

    /**
     * Test method for {@link com.allenstudio.ir.ui.#!DefaultNoteListModel#get(int)}.
     */
	@Test
    public void testGet() {
        DefaultNoteListModel lm = new DefaultNoteListModel();

        lm.removeAll();
        lm.addAll(Arrays.asList(0, 0, 3, 2, 1, 4, 5));

        assertTrue("No element was added", lm.size() > 0);
        assertTrue("Element 3 became unpersistent", lm.hasUnpersistentElement(3));
        lm.size(DEFAULT);
        assertEquals("Element 3 has not been dropped", DEFAULT, lm.get(3));
	}   

    @Test
    public void testRemoveAll() {
        DefaultNoteListModel lm = new DefaultNoteListModel();
        lm.size(3);
        lm.removeAll();
        assertTrue("Element 3 was removed", lm.size() < 3);
    }

    @Test
    public void testClear() {
        DefaultNoteListModel lm = new DefaultNoteListModel();
        lm.size(3);
        lm.clear();
        assertTrue("No element was removed", lm.size() > 0);
        lm.removeAll();
        assertEquals("Element 3 was not removed", 0, lm.size());
    }

    @Test
    public void testClearAll() {
        DefaultNoteListModel lm = new DefaultNoteListModel();
        lm.size(3);
        lm.removeAll();
        assertTrue("Removed all the elements", lm.size() < 3);
        lm.clear();
        assertTrue("Element were removed", lm.size() == 0);
    }
}