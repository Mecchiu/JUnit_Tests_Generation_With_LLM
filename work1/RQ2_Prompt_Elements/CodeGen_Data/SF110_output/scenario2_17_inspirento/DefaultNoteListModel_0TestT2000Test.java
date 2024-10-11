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
     * DefaultNoteListModel_0Test will create empty note list.
     * We will test the following for example:
     *   - the list is initially empty
     *   - if there are more values than the default capacity the list is truncated
     */
//    @Test
    public void testNoChanges_1() {
        DelegateListModel model = new DelegateListModel();
        model.addListener(new NoteListDataListener());
        model.addModelListener(new NoteListDataModelListener());
        
        model.add(new AbstractNote("this is a test note", null) {
            @Override
			public boolean remove(Object o) {
            	
            	return false;
            }

            @Override
			public void valueChanged(Event e) {
                notifyNoteListDataChanged();
            }
        });
    }
    
    @Test
    public void testNoChanges_2() {
        DelegateListModel model = new DelegateListModel();
        model.addModelListener(new NoteListDataListener());
        model.addListener(new NoteListDataDataEvent() {
            @Override
			public void start() {
            	
            	synchronized(this) {
                	notify = false;
                }
            }

            void notifyNoteListDataChanged() {
            	notify = true;
            }

            @Override
			public void end() {
            	notify();
            }

            @Override
			public void error(Exception e) {
            	notify();
            }

            @Override
			public void valueChanged(Event e) {
            	notifyNoteListDataChanged();
            }
        });
    }
}
