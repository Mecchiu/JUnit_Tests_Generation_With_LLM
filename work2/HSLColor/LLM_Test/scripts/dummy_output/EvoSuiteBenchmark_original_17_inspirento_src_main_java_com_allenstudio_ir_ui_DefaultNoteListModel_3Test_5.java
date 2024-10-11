// DefaultNoteListModel_3Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#contains(AbstractNote)} method.
*/
class DefaultNoteListModel_3Test {
		
    AbstractNote base1;
    AbstractNote base2;
    AbstractNote base3;
    
    @Test
    public void testContains_1() {
        DefaultNoteListModel model = new DefaultNoteListModel(base1);
        assertTrue(model.contains(base1));
    }

    @Test
    public void testContains_2() {
        DefaultNoteListModel model = new DefaultNoteListModel(base2);
        assertTrue(model.contains(base2));
    }
    @Test
    public void testContains_3() {
        DefaultNoteListModel model = new DefaultNoteListModel(base3);
        assertTrue(model.contains(base3));
    }
}