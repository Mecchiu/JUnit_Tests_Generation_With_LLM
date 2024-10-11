// DefaultNoteListModel_0Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_0Test {

    /**
     * Test case for <code>capacity()</code> method.
     */
	@Test
    void testCapacity() {
        DefaultNoteListModel m = new DefaultNoteListModel();
		
        int oldCapacity = m.capacity();
        m.add(new AbstractNote("a"));
		
        // No change the capacity of m.
        assertEquals(m.capacity(), oldCapacity+1);

        // Reset the capacity to the old value
        m.reset();
        assertEquals(m.capacity(), oldCapacity);
    }
}