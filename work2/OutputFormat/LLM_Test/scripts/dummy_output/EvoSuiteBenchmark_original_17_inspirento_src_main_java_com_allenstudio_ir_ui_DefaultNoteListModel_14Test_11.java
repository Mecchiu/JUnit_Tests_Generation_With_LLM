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
		/**
		 * test remove method for this class
		 */
		@Test
		public void testRemove() {
			TestObject test1 = new TestObject();
			Collection<AbstractNote> testCollection = Collections.singleton(test1).iterator().next();
			AbstractNote note = testCollection.iterator().next();
			DefaultNoteListModel model = new DefaultNoteListModel();
			Collection<AbstractNote> removed = model.remove(test1.getIndex());
			assertEquals(model.size(), removed.size());
			for(AbstractNote entry : removed) {
				assertEquals(test1.getIndex(), entry.getIndex());
				assertEquals(test1.getTitle(), entry.getTitle());
			}
		}
	}

// class of TestObject
class TestObject{
	public TestObject(){
		event = new NoteListDataEvent<TestObject>(new DefaultNoteListModel());
		event.addNoteListDataListener(new TestListDataListener());
	}
	int getIndex(){
		return 5;
	}
	String getTitle(){
		return "Test Title";
	}

	public void setTitle(String title){}
	/**
	 * a list data data listener
	 * <p><strong>Note:</strong> this listener needs to be implemented in
	 * all NoteListData objects in order to be notified of data change in the
	 * list.
	 * @author Allen Chue
	 */
	public class TestListDataListener implements NoteListDataListener {
		/**
		 * the list data event
		 */
		NoteListDataEvent<TestObject> event;

		/**
		 * Constructor
		 * @throws Exception
		 */
		public TestListDataListener(){
			event = new NoteListDataEvent<TestObject>(this);
		}

		@Override
		public void noteListDataChanged(NoteListDataEvent ev) {
			event = ev;
			// do stuff
		}
	}
}

// class of NoteListData
class NoteListDataEvent{
	public NoteListDataEvent(NoteListModel model) {
		this.model = model;
	}

	public NoteListModel getModel(){
		return model;
	}

	private NoteListModel model;
}