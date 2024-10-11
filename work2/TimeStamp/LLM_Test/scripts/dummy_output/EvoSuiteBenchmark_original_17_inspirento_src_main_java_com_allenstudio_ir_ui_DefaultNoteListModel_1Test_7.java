// DefaultNoteListModel_1Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#size()} method.
*/
class DefaultNoteListModel_1Test {
		private DefaultNoteListModel model;
		private NoteListDataListener listenerFoo = new NoteListDataAdapter() {
                        @Override
                        public void noteListDataUpdated(NoteListDataEvent event) {
                                System.out.println("foo.noteListDataUpdated() event");
                        }
		};
		private NoteListDataListener listenerBar = new NoteListDataAdapter() {
                        @Override
                        public void noteListDataUpdated(NoteListDataEvent event) {
                               
                                System.out.println("foo.noteListDataUpdated() event");
                                int noteCount = event.getNoteListData().size();
                                assertTrue("noteListDataUpdated() event size mismatch.", noteCount > 0);
                        }
		};

		/**
	 * Constructs a new <code>NoteListModel</code> using the specified
	 * data model. The list is initialized to have one note containing three
	 * columns whose values are all integers from 0 to n-1, 
	 * where n represents the number of notes in the model.
	 * @param model a <code>Vector</code> whose contents is to be initialized
	 *           to contain the note content values of the specified model
	 */
	DefaultNoteListModel(Vector<AbstractNote> model){
			model.add(new AbstractNote(1, "a", 1, true, null));
			model.add(new AbstractNote(3, "b", 3, true, null));
			model.add(new AbstractNote(5, "c", 5, true, new Vector<Integer>() {
		    	{
		    		add(0);
		    		add("1");
		    		add("2");
		    		add("3");
		    		add("4");
		    	}
		    }));
			model.add(new AbstractNote(7, "d", 7, true, new Vector<Integer>() {
		    	{
		    		add("1");
		    		add("2");
		    		add("3");
		    		add("4");
		    		add("6");
		    	}
		    }));
		}

		private void checkModelWithOneElement(){

                assertEquals("getCount", 1,  model.size());

                assertTrue("has element", model.contains(new AbstractNote(1, "a", 1, true, null)));

                assertTrue("has element", model.contains(new AbstractNote(3, "b", 3, true, null)));

                assertTrue("has element", model.contains(new AbstractNote(5, "c", 5, true, new Vector<Integer>() {
                	{
                		add(0);
                		add("1");
                		add("2");
                		add("3");
                		add("4");
                	}
                })));

                assertTrue("has element", model.contains(new AbstractNote(7, "d", 7, true, new Vector<Integer>() {
                	{
                		add("1");
                		add("2");
                		add("3");
                		add("4");
                		add("6");
                	}
                })));
            }
}