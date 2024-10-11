// DefaultNoteListModel_2Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_2Test {
		
    /**
     * JUnit suite to check the operation of DefaultNoteListModel's {@link #elements()}
     * method under particular JUnit conditions.
     */
    @Test
    public void testElementsMethod() {
        AbstractNote n[] = new AbstractNote[4];

        // First element should be the first note
        assertNotNull(n = (AbstractNote)elements().nextElement());
        assertEquals(2, n.length);

        // Second element should be two notes, one of which is a 'root'
        n = (AbstractNote)elements().nextElement();
        assertNotNull(n);
        assertEquals(3, n.length);
    }
	
}