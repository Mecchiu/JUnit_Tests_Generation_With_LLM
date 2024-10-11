// DefaultNoteListModel_13Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#get(int)} method.
*/
class DefaultNoteListModel_13Test {
		
  @Test
  void testGet_1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
  
		// create a new DataEvent, listen to it, populate the model,
		// and then listen to the created event.
		final DefaultNoteListModel.DefaultNoteListDataListener ndL1 = new DefaultNoteListModel.DefaultNoteListDataListener() {
			
			@Override
			public void noteChanged(NoteListDataEvent ne) {
				assertNotNull(ne);
				assertTrue(ne instanceof NoteListData);
				final NoteListData nd = (NoteListData) ne;
				
				// test get
				assertNotNull(nd.getNote());
				
				// test notify()
				assertNull(nd.notify());
				
				// test remove()
				model.remove(nd.getNote());
				Collection<AbstractNote> notes = model.get(nd.getIndex());
				assertFalse("There should be nothing left in the model.", notes.isEmpty());
				// check that the notes are null
				assertTrue("There should be one empty collection.", notes.size() == 0);
			}
		};
		
		// create a new default listener and populate the model.
		final NoteListDataListener ndL = new NoteListDataListener() {
			
			@Override
			public void noteChanged(NoteListDataEvent ne) {
				
				NoteListData nd = (NoteListData) ne;
				System.out.println("The DefaultNoteListModel.DefaultNoteListModel.defaultNoteChanged(NoteListDataEvent) event:" + ne);
				assertNotNull(nd.getNote());
				
				// test notify()
				System.out.println("The DefaultNoteListModel.DefaultNoteListModel.defaultNoteChanged(NoteListDataEvent) notifiy");
				try {
					nd.notify();
					fail ("Should not have been able to notify.");
				} catch (Exception ex) {
					// expect
				}
				
				// test remove()
				model.remove(nd.getNote());
				Collection<AbstractNote> notes = model.get(nd.getIndex());
				assertFalse("There should be one empty collection.", notes.isEmpty());
				// check that the notes are null
				assertTrue("There should be one empty collection.", notes.size() == 0);
			}
		};
		
		// create the model and populate it.
		model.add(new DefaultNote("Note 1", 1));
		model.add(new DefaultNote("Note 2", 2));
		model.add(new DefaultNote("Note 3", 3));
		Collection<AbstractNote> notes = model.get(0);
		assertNotNull(notes);
		assertTrue(notes.isEmpty());
		
		// create a new listener and populate the model after it has been populated.
		ndl.n = nd;
		model.add(new DefaultNote("Note 4", 4));
		
	  	try {
	  		model.add(new DefaultNote("Note 5", 5));
	  		fail ("Exception should have been thrown.");
	  	} catch (Exception x) {
	  		// success.
	  	}
 	}
}