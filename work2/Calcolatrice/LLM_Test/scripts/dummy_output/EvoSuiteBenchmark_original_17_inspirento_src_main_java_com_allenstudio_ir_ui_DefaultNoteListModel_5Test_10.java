// DefaultNoteListModel_5Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {
		
	/** Test a simple check to see if a particular element was
    * @tested $elem instanceof AbstractNote && element instanceof AbstractNote;*/
    @Test
    public void testIndexOf() {
		AbstractNote elem = new DefaultNote("a", 0);

        int index= 0;

        assertNotNull("no event", new DefaultNoteListModel().indexOf(elem, index));
        else assertEquals("correct index for element (elem)", index, indexOf(elem, index));
    }

		
	/** Tests the {@link DefaultNoteListModel#indexOf(AbstractNote, int)}
                methods. */
    @Test
    public void testIndexOf_notNull() {
		Collection<AbstractNote> items = new HashSet<AbstractNote>();

		AbstractNote elem = new DefaultNote("a", 0);

        assertNotNull("no event", new DefaultNoteListModel().indexOf(elem, 1));
        else assertNotSame("correct index for element (elem)", 1, indexOf(elem, 1));

        items.add(elem);

        AbstractNote elem2 = new DefaultNote("b", 2);

        assertEquals("correct index for elements(elem2)", 1, indexOf(elem2, 1));
        assertEquals("correct index for element (elem2)", 2, indexOf(elem2, 2));
        assertNotSame("wrong index for element (elem2)", 1, indexOf(elem2, 3));
        assertEquals("correct index for element (elem2)", 2, indexOf(elem2, 4));
        assertNotSame("wrong index for element (elem2)", 3, indexOf(elem2, 5));
        assertNull("wrong index for element (elem2)", indexOf(elem2, 6));

        items.add(elem);
      
        final Collection<AbstractNote> resultItems = new HashSet<AbstractNote>(items);
        int index= 0;
        
        for (AbstractNote item : resultItems) {
        	assertNotNull("no event", new DefaultNoteListModel().indexOf(item, index));
        	else assertEquals("correct index for element (item)", index, indexOf(item, index));
        }
    }
}