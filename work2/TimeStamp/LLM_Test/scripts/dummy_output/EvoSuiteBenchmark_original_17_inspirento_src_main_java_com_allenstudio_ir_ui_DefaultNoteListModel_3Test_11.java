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
		
    @Test
	public void test() {
        DefaultNoteListModel model = new DefaultNoteListModel();
        HashMap<AbstractNote, Boolean> map = new HashMap<>();
        Iterator<AbstractNote> iterator = null;
        for (AbstractNote note : createVector()) {
            if(!map.containsKey(note)) {
                model.add(note);
                map.put(note, true);
                iterator = model.iterator();
                //System.out.println(iterator);
            }
        }
    }

    private List<AbstractNote> createVector() {
        List<AbstractNote> list = new LinkedList<>();
        Iterator<AbstractNote> iterator = list.iterator();
        for (int i = 0; iterator.hasNext(); i++) {
            iterator.next();
        }
        return list;
    }
} /* Test Class DefaultNoteListModel_3Test */