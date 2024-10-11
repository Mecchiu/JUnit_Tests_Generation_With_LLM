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
     * Tests a {@link DefaultNoteListModel#toArray()} call in the
		 * <code>addDataListener()</code> method.
		 */
    @Test
    public void test_addDataListener() {
		final NoteListModel noteList = new DefaultNoteListModel();
	        final boolean[] expected = {false, false, true, true};
	        final boolean[] actual = new boolean[2];
	        noteList.addDataListener(actual, new NoteListDataListener() {

                        @Override
public void noteListDataChanged(NoteListDataEvent event, AbstractNote note) {
                            System.out.println("Expected data change");
                            System.out.println(event);
                            System.out.println(note);
                            System.out.println(expected);
                            System.out.println(actual);
                        }
	
            });
	        assertEquals(expected.toArray(new boolean[2]), actual.toArray(new boolean[2]));
	} // End test_addDataListener() method.
    @Test
    public void test_getData() {
		final boolean[] expected = {false, false, true, true};
		final boolean[] actual = new boolean[2];
	        final boolean[] expected_expected = {true, true, true, true};
		final boolean[] actual_actual = new boolean[2];
	        final NoteListModel mock = mock();
	        //final boolean[] expected_expected = {true, true, true, true};
	        
	        mock.addDataListener(actual_actual, new NoteListDataListener() {

                        @Override
public void noteListDataChanged(NoteListDataEvent event, AbstractNote note) {
                            System.out.println("Expected data change");
                            System.out.println(event);
                            System.out.println(note);
                            System.out.println(expected_expected);
                            System.out.println(actual_actual);
                        }
	
            });
	        final AbstractNote actual = mock().getData();
	        assertEquals(actual, actual_actual[actual_actual.ordinal()]);
	} // End test_getData() method. 
    
    final interface NoteListModel_12 {
            AbstractNote getData();

            boolean isEmpty();

            void removeDataListener(int listener);
    };

} // End class of DefaultNoteListModel_12Test class. 