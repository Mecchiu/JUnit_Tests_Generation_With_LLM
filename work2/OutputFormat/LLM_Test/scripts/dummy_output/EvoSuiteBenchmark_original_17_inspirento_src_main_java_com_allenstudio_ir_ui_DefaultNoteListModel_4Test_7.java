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
		
//	SimpleListItemIterator<String> itemIterator;
//    AbstractNote lastNote;
//    int lastIndex = 10;

    /**
     * Test constructor
     * 
     * @throws Throwable
     */
    @Test
    void testConstructor() throws Throwable {
//        
//        itemIterator = new SimpleListItemIterator<String>();
//        
//        noteListModel = new DefaultNoteListModel();
        
//        noteListModel = new DefaultNoteListModel(null);
    }

//    /**
//     * Test adding and removing notes
//     */
//    @Test
//    void testAddingAndRemoving() {
//        
//        NoteListModel listModel = new DefaultNoteListModel();
//        
////        AbstractNote firstNote = new DefaultNote("first");
//        AbstractNote firstNote = new DefaultNote("first");
//        firstNote.addNote(new DefaultNote("first", new HashMap<String, Object>() {
//            {
//                put("message", "first message");
//            }
//        }));
//        firstNote.addNote(new DefaultNote("second", new HashMap<String, Object>() {
//            {
//                put("message", "second message");
//            }
//        }));
//
//        assertEquals(null,listModel.get(new String[] { "first" }));
//        
//        AbstractNote secondNote = listModel.register(firstNote);
//    }

//    /**
//     * Test checking uniqueness of each note (when no duplicates are encountered).
//     */
//    @Test
//    void testUniqueNoteList() {
//        
//        NoteListModel listModel = new DefaultNoteListModel();
//        for (int k=0;k<100;k++) {
//           AbstractNote note = new DefaultNote("note-"+k);
//           AbstractNote note2 = note2 = null;
//           
//            AbstractNote note3 = note3 = new DefaultNote("note-"+k+".a", new HashMap<String, Object>() {
//    
//                {
//                    put("message", "note-"+k+".a"+".message");
//                }
//    
//                {
//                    put("a", "a"+".a"+".a");
//    
//                }
//            });
//            
//            AbstractNote note4 = note4 = new DefaultNote("note-"+k+".b", new HashMap<String, Object>() {
//    
//                {
//                    put("message", "note-"+k+".b"+".message");
//                }
//    
//                {
//                    put("b", "b"+".b"+".b");
//    
//                }
//            });
//           AbstractNote note5 = note5 = null;
//        }
//     }
}