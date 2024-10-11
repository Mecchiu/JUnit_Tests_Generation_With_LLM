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

    /** {@inheritDoc} */
    @Test
    void indexOfTest() {
        /*
         * DefaultNoteListModel's TestCase.java
         */
        NoteListModelModel model =
            new DefaultNoteListModel(new HashSet<AbstractNote>());
        
        Collection<?> collection =
            Collections.singleton(new AbstractNote("hello"));
        assertNotNull(collection);
        
        List<Integer> list =
            model.indexOf(new Note("hello"), 0);
        assertTrue("List should contains elements", list.contains(1));
    }
}
