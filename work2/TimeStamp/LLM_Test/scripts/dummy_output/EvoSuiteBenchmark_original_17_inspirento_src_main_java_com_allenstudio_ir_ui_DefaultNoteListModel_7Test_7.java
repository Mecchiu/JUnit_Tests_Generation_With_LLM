// DefaultNoteListModel_7Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_7Test {
		
    @Test
    void shouldSearchToEndOfListForNewItems_withNullObject_returnsLastIndexOf() {
		// given
        DefaultNoteListModel model = new DefaultNoteListModel();
        
        // when
        int expected = model.lastIndexOf(null, 1);
        
        //then
        assertEquals (expected, model.lastIndexOf(new AbstractNote(), 1));
    }
}