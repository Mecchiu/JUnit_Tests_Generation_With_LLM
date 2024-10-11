// DefaultNoteListModel_6Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_6Test {

    @Test
    public void test() {
    	AbstractNote a = new AbstractNote();
    	a.setTitle("This is the test");
    	assertEquals(0, DefaultNoteListModel.lastIndexOf(a));
    }
    
}

// DefaultNoteListModel$Test$a1_6Test.java
