// DefaultNoteListModel_12Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModel_12Test {
		
	/**
	 * It contains one unit test case for the {@link DefaultNoteListModel#toArray()} method.
	 */
    @Test
    public void testToArray(){
        // DefaultNoteListModel with no data
        DefaultNoteListModel model = new DefaultNoteListModel();
        assertNull(model.toArray());
        // DefaultNoteListModel with no elements 
        model = new DefaultNoteListModel(new HashSet());
        assertNull(model.toArray());
        // DefaultNoteListModel with one element 
        model = new DefaultNoteListModel(new ArrayList());
        model.addDataChangeListener(this);
        assertNotNull(model.toArray());                         // It should not crash
        // DefaultNoteListModel with many elements 
        model = new DefaultNoteListModel(new HashMap());      // Each element should be assigned a different key
        model.addDataChangeListener(this);
        try{ model.toArray(); } catch(Exception e){
        }
        assertNotNull(model.toArray());                         // It should not crash
    }
        
}