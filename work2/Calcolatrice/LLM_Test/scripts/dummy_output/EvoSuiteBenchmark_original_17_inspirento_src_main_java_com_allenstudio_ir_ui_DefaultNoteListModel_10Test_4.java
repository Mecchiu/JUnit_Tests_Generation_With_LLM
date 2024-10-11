// DefaultNoteListModel_10Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastElement()} method.
*/
class DefaultNoteListModel_10Test {
		/**
		* Returns the last component of the list.
		*
		* @return the last component of the list
		* @see Vector#lastElement()
		*/
    @Test
    public void lastComponent() {
        AbstractNote a1 = new AbstractNote();
        a1.setUserId("usera");
        a1.setUserName("foo");
        List<AbstractNote> list = new ArrayList<>();
        list.add(a1);
        DefaultNoteListModel v = new DefaultNoteListModel(list);
        assertEquals(v.lastElement(), a1);
    }

    /**
     * Returns the last component of the list.
     *
     * @param <T> the data type of the list returned by the method
     * @return the last component of the list
     * @see Vector#lastElement()
     */
	@Test
	public <T extends AbstractNote> void lastElement() {
        DefaultNoteListModel v = new DefaultNoteListModel();
        assertNull(v.lastElement());
	}
}