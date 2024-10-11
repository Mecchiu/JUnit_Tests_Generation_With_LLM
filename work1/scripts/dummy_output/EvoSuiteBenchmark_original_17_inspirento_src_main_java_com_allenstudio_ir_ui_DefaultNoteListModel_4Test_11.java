// DefaultNoteListModel_4Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_4Test {
		
        @Test
		public void test() {
                Collection<AbstractNote> m1 = new ArrayList<>();
                final AbstractNote elem = new DefaultNote("elem");
                m1.add(elem);
                final DefaultNoteListModel m2 = new DefaultNoteListModel();
                
                // add one element
                elem.setData(new NoteListDataEvent<>());
                
                // add one other element
                AbstractNote elem2 = new DefaultNote("elem2");
                if (false) {
                            m2.add(elem2);
                }
                
						DefaultNoteListModel.indexOf(m2).forEach(i -> assertEquals(m1, m2.findAllItems(elem)));
        }
		}