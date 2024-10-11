// DefaultNoteListModel_12Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModel_12Test {
		
    /**
     * Test method for {@link com.allenstudio.ir.ui.DefaultNoteListModel#toArray()}.
     * 
     * @throws Exception if an error occurs
     */
    @Test
    public void testToArray() throws Exception {
        DefaultNoteListModel object = new DefaultNoteListModel();
        object.add(new AbstractNote("0"));
        object.add(new AbstractNote("1"));
        object.add(new AbstractNote("02"));
        object.add(new AbstractNote("10"));
        object.add(new AbstractNote("11"));
        object.add(new AbstractNote("012"));
        object.add(new AbstractNote("1112"));
        object.add(new AbstractNote("09"));
        object.add(new AbstractNote("13"));
        object.add(new AbstractNote("14"));
        object.add(new AbstractNote("15"));
        object.add(new AbstractNote("1512"));
        object.add(new AbstractNote("3"));
        object.add(new AbstractNote("4"));
        object.add(new AbstractNote("5"));
        object.add(new AbstractNote("6"));
        Collection<?> result = new DefaultNoteListModel().toArray();
        assertEquals(7, result.size());
    }

    /**
     * Test method for {@link com.allenstudio.ir.ui.DefaultNoteListModel#add(java.lang.Object)}.
     *
     * @throws Exception if an error occurs
     */
	@Test
	public void testAdd() throws Exception {
		DefaultNoteListModel object = new DefaultNoteListModel();
		List<? extends AbstractNote> list = new ArrayList<AbstractNote>();
		object.add(list);
    }
}