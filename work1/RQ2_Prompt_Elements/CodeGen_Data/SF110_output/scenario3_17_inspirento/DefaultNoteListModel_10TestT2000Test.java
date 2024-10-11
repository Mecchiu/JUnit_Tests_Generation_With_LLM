// DefaultNoteListModel_10Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastElement()} method.
*/
class DefaultNoteListModel_10Test {

    @Test
    public void testLastElementWithNullList(){
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addListener(new NotestrackingListener(null));
        assertSame(null, model.lastElement(null));

        model.addListener(new NotestrackingListener(null));
        assertSame(null, model.lastElement(null));    	
    }
     
    @Test
    public void testLastElementOnEmptyList(){
        DefaultNoteListModel model = new DefaultNoteListModel();
        model.addListener(new NotestrackingListener(new ArrayList<AbstractNote>(0)));
        assertEquals(null, model.lastElement(null));

        model.addListener(new NotestrackingListener(new ArrayList<AbstractNote>(0)));
        assertEquals(null, model.lastElement(null));
    }
     
    private abstract class NotestrackingListener implements NoteListDataListener {
    	
        protected final List<AbstractNote> list;
        
        public NotestrackingListener(List<AbstractNote> listToTrack) {
            this.list = listToTrack;
        }
        
        public List<AbstractNote> getList() {
            return list;
        }
       		
        @Override
        public void noteListChanged(NoteListDataEvent event) {
            AbstractNote note = event.getAbstractNote();
            if (list.contains(note)) {
                assertNotNull(event.getAbstractNote());
                assertNull(event.getDescription());
            } 
            else {
                fail("Note list did not contain item " + note.getAbstractNote().getClass().getName() + ".");
            }
       		
        }
        
    } 
	
}
