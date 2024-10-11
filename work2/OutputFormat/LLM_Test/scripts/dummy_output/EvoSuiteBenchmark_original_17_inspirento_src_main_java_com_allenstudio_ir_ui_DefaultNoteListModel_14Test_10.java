// DefaultNoteListModel_14Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {
		
	int[] elements; // TODO: Uncommenting this Array
	
	// Create an empty default note list
	static AbstractNote[] emptyArray = new AbstractNote[0];
	static final ArrayList<AbstractNote> emptyList = Collections.unmodifiableList(
            new LinkedList<AbstractNote>());
    static final ArrayList<AbstractNote> emptyList2 = Collections.unmodifiableList(
            new LinkedList<AbstractNote>());
    static final ArrayList<AbstractNote> emptyList3 = Collections.unmodifiableList(
            new LinkedList<AbstractNote>());
    
	// Add all elements of an array
    static void addElements(AbstractNote[] arr) {
        for (AbstractNote elem : arr) {
            arr[elem.getNoteName()] = elem;
        }
    }
    
    /**
     * Unit test constructor
     */
    DefaultNoteListModel_14Test() {
    }
    
	/**
	 * Creates a default note list
	 */
     @Test
     public void testCreate() {
         // Create default array
         array = new ArrayList<AbstractNote>()
               .add(new AbstractNote().setNoteName("Echo"))
               .add(null)
               .add(new AbstractNote())
               .add(new AbstractNote());
         // Check for correct size
         assertEquals(6, array.size());
         // Create empty and check first element
         array = new ArrayList<AbstractNote>()
               .add(new AbstractNote().setNoteName(""))
               .add(new AbstractNote().setNoteName(null));
         assertEquals(6, array.size());
         
         array = new ArrayList<AbstractNote>()
               .add(new AbstractNote().setNoteName("Echo"))
               .add(new AbstractNote())
               .add(new AbstractNote().setNoteName("Echo2"));
         addElements(array.toArray());
         assertEquals(7, array.size());
     }
}